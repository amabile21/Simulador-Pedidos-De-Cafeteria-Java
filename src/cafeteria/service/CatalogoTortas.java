package cafeteria.service;

import cafeteria.model.Produto;
import cafeteria.model.SubTorta;
import java.util.HashMap;
import java.util.Map;

public class CatalogoTortas {

    public Map<Integer, Produto> mostrarTortasERetornarOpcoes() {
        String todasAsTortas = """
        --- Tortas (Fatia Média) ---
        1 - Torta de Limão
        2 - Torta de Morango
        3 - Torta Holandesa
        4 - Torta de Maçã
        5 - Torta de Chocolate
        6 - Torta de Maracujá
        7 - Torta de Banana
        8 - Torta de Ricota
        9 - Torta de Maracujá
        10 - Torta de Leite Ninho com Nutella
        """;
        System.out.println(todasAsTortas);

        Map<Integer, Produto> opcoesTortas = new HashMap<>();

        opcoesTortas.put(1, new SubTorta("Torta de Limão", 8.00));
        opcoesTortas.put(2, new SubTorta("Torta de Morango", 12.00));
        opcoesTortas.put(3, new SubTorta("Torta Holandesa", 9.50));
        opcoesTortas.put(4, new SubTorta("Torta de Maçã", 7.00));
        opcoesTortas.put(5, new SubTorta("Torta de Chocolate", 8.00));
        opcoesTortas.put(6, new SubTorta("Torta de Maracujá", 8.50));
        opcoesTortas.put(7, new SubTorta("Torta de Banana", 6.00));
        opcoesTortas.put(8, new SubTorta("Torta de Ricota", 7.50));
        opcoesTortas.put(9, new SubTorta("Torta de Maracujá", 9.00));
        opcoesTortas.put(10, new SubTorta("Torta de Leite Ninho com Nutella", 12.50));

        return opcoesTortas;
    }
}