package cafeteria.service;

import cafeteria.model.Produto;
import cafeteria.model.SubLanche;
import java.util.HashMap;
import java.util.Map;

public class CatalogoLanches {

    public Map<Integer, Produto> mostrarLanchesERetornarOpcoes() {
        String todosOsLanches = """
        --- Lanches ---
        1 - Sanduíche Natural
        2 - Misto Quente
        3 - Pão de Queijo
        4 - Croissant
        """;
        System.out.println(todosOsLanches);

        Map<Integer, Produto> opcoesLanches = new HashMap<>();

        opcoesLanches.put(1, new SubLanche("Sanduíche Natural", 15.00));
        opcoesLanches.put(2, new SubLanche("Misto Quente", 12.00));
        opcoesLanches.put(3, new SubLanche("Pão de Queijo", 6.00));
        opcoesLanches.put(4, new SubLanche("Croissant", 10.00));

        return opcoesLanches;
    }
}