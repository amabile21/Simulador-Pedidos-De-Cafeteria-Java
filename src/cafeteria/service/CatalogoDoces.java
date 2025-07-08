package cafeteria.service;

import cafeteria.model.Produto;
import cafeteria.model.SubDoce;
import java.util.HashMap;
import java.util.Map;

public class CatalogoDoces {

    public Map<Integer, Produto> mostrarDocesERetornarOpcoes() {
        String todosOsDoces= """
        --- Doces ---
        1 - Brigadeiro
        2 - Beijinho
        3 - Pudim
        4 - Mousse de Chocolate
        5 - Churros
        6 - Cupcake
        """;
        System.out.println(todosOsDoces);

        Map<Integer, Produto> opcoesDoces = new HashMap<>();

        opcoesDoces.put(1, new SubDoce("Brigadeiro", 3.50));
        opcoesDoces.put(2, new SubDoce("Beijinho", 3.00));
        opcoesDoces.put(3, new SubDoce("Pudim", 6.50));
        opcoesDoces.put(4, new SubDoce("Mousse de Chocolate", 6.00));
        opcoesDoces.put(5, new SubDoce("Churros", 3.00));
        opcoesDoces.put(6, new SubDoce("Cupcake", 5.50));

        return opcoesDoces;
    }
}
