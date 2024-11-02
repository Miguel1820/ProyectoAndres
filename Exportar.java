import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Exportar {

    public void ExportarEstDiseño(ArrayList<EstudianteDiseno> list) {
        if (list.isEmpty()) {
            // LLenarLista ll = new LLenarLista();
            // productos = ll.llenarLista(productos);
        } else {
            try (FileWriter escriba = new FileWriter("EstDiseño.txt")) {
                for (EstudianteDiseno objest : list) {
                    escriba.write("Cedula: " + objest.getCedula() + "\n");
                    escriba.write("nombre: " + objest.getNombre() + "\n");
                    escriba.write("apellido: " + objest.getApellido() + "\n");
                    escriba.write("telefono: " + objest.getTelefono() + "\n");
                    escriba.write("modalidadEstudio: " + objest.getModalidadEstudio() + "\n");
                    escriba.write("cantidadAsignaturas: " + objest.getCantidadAsignaturas() + "\n");
                    escriba.write("serial: " + objest.getSerial() + "\n");
                    escriba.write("---------------------------------------\n");

                }

                System.out.println("Archivo exportado correctamente");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}