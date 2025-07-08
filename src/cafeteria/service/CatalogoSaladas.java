package cafeteria.service;

import cafeteria.model.Produto;
import cafeteria.model.SubSalada;
import java.util.HashMap;
import java.util.Map;

public class CatalogoSaladas {
    public Map<Integer, Produto> mostrarSaladasERetornarOpcoes() {
        String todasAsSaladas = """
        --- Saladas ---
        1 - Salada Caesar
        2 - Salada Grega
        3 - Salada Caprese
        4 - Salada de Frutas
        5 - Salada Verde com Frango
        """;
        System.out.println(todasAsSaladas);

        Map<Integer, Produto> opcoesSaladas = new HashMap<>();
        opcoesSaladas.put(1, new SubSalada("Salada Caesar", 22.00));
        opcoesSaladas.put(2, new SubSalada("Salada Grega", 20.00));
        opcoesSaladas.put(3, new SubSalada("Salada Caprese", 18.00));
        opcoesSaladas.put(4, new SubSalada("Salada de Frutas", 15.00));
        opcoesSaladas.put(5, new SubSalada("Salada Verde com Frango", 25.00));

        return opcoesSaladas;
    }
}