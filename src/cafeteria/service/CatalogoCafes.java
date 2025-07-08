package cafeteria.service;

import cafeteria.model.Produto;
import cafeteria.model.SubCafe;
import java.util.HashMap;
import java.util.Map;

public class CatalogoCafes {

    public Map<Integer, Produto> mostrarCafesERetornarOpcoes() {
        String todosOsCafes = """
        --- Cafés ---
        1 - Expresso
        2 - Cappuccino
        3 - Latte
        4 - Mocha
        5 - Americano
        6 - Macchiato
        7 - Frappuccino
        8 - Café Gelado
        """;
        System.out.println(todosOsCafes);

        Map<Integer, Produto> opcoesCafes = new HashMap<>();

        opcoesCafes.put(1, new SubCafe("Expresso", 5.00));
        opcoesCafes.put(2, new SubCafe("Cappuccino", 8.00));
        opcoesCafes.put(3, new SubCafe("Latte", 9.00));
        opcoesCafes.put(4, new SubCafe("Mocha", 10.50));
        opcoesCafes.put(5, new SubCafe("Americano", 7.00));
        opcoesCafes.put(6, new SubCafe("Macchiato", 8.50));
        opcoesCafes.put(7, new SubCafe("Frappuccino", 12.00));
        opcoesCafes.put(8, new SubCafe("Café Gelado", 9.50));

        return opcoesCafes;
    }
}