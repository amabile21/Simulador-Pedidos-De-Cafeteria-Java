package cafeteria.service;

import cafeteria.model.Produto;
import cafeteria.model.SubBebida;
import java.util.HashMap;
import java.util.Map;

public class CatalogoOutrasBebidas {

    public Map<Integer, Produto> mostrarOutrasBebidas() {
        String todasAsBebidas= """
        --- Outras Opções ---
        1 - Suco de Laranja
        2 - Suco de Abacaxi
        3 - Suco de Limão
        4 - Coca-Cola
        5 - Coca-Cola Zero
        6 - Soda Limonada
        7 - Água Mineral sem Gás
        8 - Água Mineral com Gás;
        9 - Água Saborizada Limão
        """;
        System.out.println(todasAsBebidas);

        Map<Integer, Produto> opcoesBebidas = new HashMap<>();

        opcoesBebidas.put(1, new SubBebida("Suco de Laranja", 8.00));
        opcoesBebidas.put(2, new SubBebida("Suco de Abacaxi", 8.00));
        opcoesBebidas.put(3, new SubBebida("Suco de Limão", 7.50));
        opcoesBebidas.put(4, new SubBebida("Coca-Cola", 7.00));
        opcoesBebidas.put(5, new SubBebida("Coca-Cola Zero", 7.00));
        opcoesBebidas.put(6, new SubBebida("Soda Limonada", 6.50));
        opcoesBebidas.put(7, new SubBebida("Água Mineral sem Gás", 4.00));
        opcoesBebidas.put(8, new SubBebida("Água Mineral com Gás", 4.50));
        opcoesBebidas.put(9, new SubBebida("Água Saborizada Limão", 5.00));

        return opcoesBebidas;
    }
}