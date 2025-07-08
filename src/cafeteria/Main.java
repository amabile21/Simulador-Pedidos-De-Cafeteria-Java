package cafeteria;
import cafeteria.model.Carrinho;
import cafeteria.model.Produto;
import cafeteria.service.*;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MenuInicial listagemMenu = new MenuInicial();
        Carrinho meuCarrinho = new Carrinho();
        CatalogoCafes listagemDosCafes = new CatalogoCafes();
        CatalogoOutrasBebidas listagemDasBebidas = new CatalogoOutrasBebidas();
        CatalogoDoces listaCatalogoDoces = new CatalogoDoces();
        CatalogoBolos listagemCatalogoBolos = new CatalogoBolos();
        CatalogoTortas listagemCatalogoTortas = new CatalogoTortas();
        CatalogoLanches listagemDosLanches = new CatalogoLanches();
        CatalogoSalgados listagemDosCatalogoSalgados = new CatalogoSalgados();
        CatalogoSaladas listagemDasCatalogoSaladas = new CatalogoSaladas();

        System.out.println("Olá, qual seu nome?");
        String nome = input.nextLine();
        System.out.println("Bem-vindo "+ nome +"!");

        boolean continuarPedido = true;

        while (continuarPedido) {
            listagemMenu.mostrarCategorias();

            int escolhaCategoria = input.nextInt();

            if (escolhaCategoria == 0) { // para o pedido e mostra o total
                meuCarrinho.exibirCarrinho();
                System.out.println("Obrigado por pedir na nossa cafeteria, " + nome + "!");
                break;
            }

            Map<Integer, Produto> opcoesAtuais = null;
            String categoriaEscolhidaNome = "";

            switch (escolhaCategoria) {
                case 1:
                    opcoesAtuais = listagemDosCafes.mostrarCafesERetornarOpcoes();
                    categoriaEscolhidaNome = "cafe";
                    break;
                case 2:
                    opcoesAtuais = listagemDasBebidas.mostrarOutrasBebidas();
                    categoriaEscolhidaNome = "bebida";
                    break;
                case 3:
                    opcoesAtuais = listaCatalogoDoces.mostrarDocesERetornarOpcoes();
                    categoriaEscolhidaNome = "doce";
                    break;
                case 4:
                    opcoesAtuais = listagemCatalogoBolos.mostrarBolosERetornarOpcoes();
                    categoriaEscolhidaNome = "bolo";
                    break;
                case 5:
                    opcoesAtuais = listagemCatalogoTortas.mostrarTortasERetornarOpcoes();
                    categoriaEscolhidaNome = "bolo";
                    break;
                case 6:
                    opcoesAtuais = listagemDosLanches.mostrarLanchesERetornarOpcoes();
                    categoriaEscolhidaNome = "lanche";
                    break;
                case 7:
                    opcoesAtuais = listagemDosCatalogoSalgados.mostrarSalgadosERetornarOpcoes();
                    categoriaEscolhidaNome = "salgado";
                    break;
                case 8:
                    opcoesAtuais = listagemDasCatalogoSaladas.mostrarSaladasERetornarOpcoes();
                    categoriaEscolhidaNome = "salada";
                    break;
                default:
                    System.out.println("Opção inválida.");
                    continue;
            }

            input.nextLine();

            if (opcoesAtuais != null) {
                System.out.print("Digite o número do item que deseja ou 0 para voltar ao menu principal: ");
                int escolhaItem = input.nextInt();

                input.nextLine();

                if (escolhaItem == 0) {
                    System.out.println("Voltando ao menu de categorias...");
                } else {
                    Produto produtoSelecionado = opcoesAtuais.get(escolhaItem);

                    if (produtoSelecionado != null) {
                        meuCarrinho.adicionarItem(produtoSelecionado);
                        System.out.printf("'%s' R$ %.2f adicionado ao seu carrinho!\n\n", produtoSelecionado.getNome(),
                                produtoSelecionado.getPreco());
                    } else {
                        System.out.println("Opção de " + categoriaEscolhidaNome + " inválida. Escolha um número da lista.");
                    }
                }
            }
        }
        input.close();

    }
}