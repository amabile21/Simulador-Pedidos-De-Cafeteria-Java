package cafeteria.model;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produto> itensNoCarrinho;

    public Carrinho() {
        this.itensNoCarrinho = new ArrayList<>();
    }

    public void adicionarItem(Produto item) {
        this.itensNoCarrinho.add(item);
    }

    public void exibirCarrinho() {
        if (itensNoCarrinho.isEmpty()) {
            System.out.println("Seu carrinho está vazio.");
            return;
        }

        System.out.println("\n--- Resumo do seu Pedido ---");
        System.out.println("Itens:");
        double total = 0.0;

        for (int i = 0; i < itensNoCarrinho.size(); i++) {
            Produto item = itensNoCarrinho.get(i);

            System.out.printf("- %s (R$ %.2f)\n", item.getNome(), item.getPreco());
            total += item.getPreco();
        }

        System.out.printf("\nTotal do Pedido: R$ %.2f\n", total);
        System.out.println("Seu pedido ficará pronto em 20 minutos!");
        System.out.println("----------------------------");
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Produto item : itensNoCarrinho) {
            total += item.getPreco();
        }
        return total;
    }
}