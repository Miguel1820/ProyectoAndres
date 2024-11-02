import javax.swing.JOptionPane;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        GestorPrestamos gestor = new GestorPrestamos();
        int opcion;

        do {
            String menu = "1. ESTUDIANTES DE INGENIERIA.\n" +
                          "2. ESTUDIANTES DE DISEÑO.\n" +
                          "3. IMPRIMIR INVENTARIO TOTAL.\n" +
                          "4. SALIR DEL PROGRAMA.";
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                case 1:
                    menuEstudiantesIngenieria(gestor);
                    break;
                case 2:
                    menuEstudiantesDiseno(gestor);
                    break;
                case 3:
                    gestor.imprimirInventarioTotal();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Gracias por utilizar el programa.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        } while (opcion != 4);
    }

    private static void menuEstudiantesIngenieria(GestorPrestamos gestor) {
        int opcion;
        do {
            String menuIngenieria = "1.1 Registrar préstamo de equipo.\n" +
                                    "1.2 Modificar préstamo de equipo.\n" +
                                    "1.3 Devolución de equipo.\n" +
                                    "1.4 Buscar equipo.\n" +
                                    "1.5 Volver al menú principal.";
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menuIngenieria));

            switch (opcion) {
                case 1:
                    gestor.registrarPrestamoIngenieria();
                    break;
                case 2:
                    gestor.modificarPrestamoIngenieria();
                    break;
                case 3:
                    gestor.eliminarPrestamoIngenieria();
                    break;
                case 4:
                    gestor.buscarPrestamoIngenieria();
                    break;
                case 5:
                    // Volver al menú principal
                    JOptionPane.showMessageDialog(null, "Regresando al menú principal.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        } while (opcion != 5);
    }

    private static void menuEstudiantesDiseno(GestorPrestamos gestor) {
        int opcion;
        do {
            String menuDiseno = "2.1 Registrar préstamo de equipo.\n" +
                                "2.2 Modificar préstamo de equipo.\n" +
                                "2.3 Devolución de equipo.\n" +
                                "2.4 Buscar equipo.\n" +
                                "2.5 Volver al menú principal.";
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menuDiseno));

            switch (opcion) {
                case 1:
                    gestor.registrarPrestamoDiseno();
                    break;
                case 2:
                    gestor.modificarPrestamoDiseno();
                    break;
                case 3:
                    gestor.eliminarPrestamoDiseno();
                    break;
                case 4:
                    gestor.buscarPrestamoDiseno();
                    break;
                case 5:
                    // Volver al menú principal
                    JOptionPane.showMessageDialog(null, "Regresando al menú principal.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        } while (opcion != 5);
    }
}