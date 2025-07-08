package cafeteria.service;

import cafeteria.model.Produto;
import cafeteria.model.SubBolo;
import java.util.HashMap;
import java.util.Map;

public class CatalogoBolos {

    public Map<Integer, Produto> mostrarBolosERetornarOpcoes() {
        String todosOsBolos = """
        --- Bolos (Fatia média)---
        1 - Bolo de Chocolate
        2 - Bolo de Cenoura com Cobertura
        3 - Bolo Red Velvet
        4 - Bolo de Fubá
        5 - Bolo de Coco
        6 - Bolo de Banana
        7 - Bolo Floresta Negra
        8 - Bolo de Maracujá
        9 - Bolo de Nozes
        10 - Bolo de Laranja
        """;
        System.out.println(todosOsBolos);

        Map<Integer, Produto> opcoesBolos = new HashMap<>();

        opcoesBolos.put(1, new SubBolo("Bolo de Chocolate", 8.00));
        opcoesBolos.put(2, new SubBolo("Bolo de Cenoura com Cobertura", 9.50));
        opcoesBolos.put(3, new SubBolo("Bolo Red Velvet", 12.00));
        opcoesBolos.put(4, new SubBolo("Bolo de Fubá", 7.00));
        opcoesBolos.put(5, new SubBolo("Bolo de Coco", 8.00));
        opcoesBolos.put(6, new SubBolo("Bolo de Banana", 9.00));
        opcoesBolos.put(7, new SubBolo("Bolo Floresta Negra", 16.50));
        opcoesBolos.put(8, new SubBolo("Bolo de Maracujá", 11.00));
        opcoesBolos.put(9, new SubBolo("Bolo de Nozes", 14.00));
        opcoesBolos.put(10, new SubBolo("Bolo de Laranja", 8.50));

        return opcoesBolos;
    }
}