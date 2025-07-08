package cafeteria.service;

import cafeteria.model.Produto;
import cafeteria.model.SubSalgado;
import java.util.HashMap;
import java.util.Map;

public class CatalogoSalgados {
    public Map<Integer, Produto> mostrarSalgadosERetornarOpcoes() {
        String todosOsSalgados = """
        --- Salgados ---
        1 - Coxinha
        2 - Risole
        3 - Pastel
        4 - Empada
        5 - Esfiha
        6 - Kibe
        7 - Mini Pizza
        """;
        System.out.println(todosOsSalgados);

        Map<Integer, Produto> opcoesSalgados = new HashMap<>();
        opcoesSalgados.put(1, new SubSalgado("Coxinha", 7.00));
        opcoesSalgados.put(2, new SubSalgado("Risole", 6.50));
        opcoesSalgados.put(3, new SubSalgado("Pastel", 8.00));
        opcoesSalgados.put(4, new SubSalgado("Empada", 7.50));
        opcoesSalgados.put(5, new SubSalgado("Esfiha", 6.00));
        opcoesSalgados.put(6, new SubSalgado("Kibe", 7.00));
        opcoesSalgados.put(7, new SubSalgado("Mini Pizza", 9.00));

        return opcoesSalgados;
    }
}