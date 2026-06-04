package resol.RossoA.ejercicio5;

import java.time.LocalDate;
import java.util.ArrayList;

public class Ejercicio5 {
    public static void ejecutar() {
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(new ClienteGeneral("Lucas", "11111111", LocalDate.of(2026, 5, 1), 100000, LocalDate.of(2026, 7, 1)));
        clientes.add(new Jubilado("Maria", "22222222", LocalDate.of(2026, 5, 1), 100000, LocalDate.of(2026, 7, 1)));
        clientes.add(new ServicioPublico("Carlos", "33333333", LocalDate.of(2026, 5, 1), 100000, LocalDate.of(2026, 7, 1)));

        System.out.println("\n===== PRESTAMOS BANCARIOS =====");
        for (Cliente c : clientes) {
            c.mostrarInformacion(LocalDate.of(2026, 7, 5), 2);
        }
    }
}
