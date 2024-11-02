import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Importar {
    public ArrayList<EstudianteDiseno> leerEstudianteDiseño() {
        String rutaArchivo = "EstDiseño.txt";
        ArrayList<EstudianteDiseno> listaDiseño = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String line;
            EstudianteDiseno obj = null;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("Cedula: ")) {
                    if (obj != null) {
                        listaDiseño.add(obj);
                    }
                    obj = new EstudianteDiseno();
                    obj.setCedula(line.substring(8));
                } else if (line.startsWith("nombre: ")) {
                    if (obj != null) {
                        obj.setNombre(line.substring(8));
                    }
                } else if (line.startsWith("apellido: ")) {
                    if (obj != null) {
                        obj.setApellido(line.substring(10));
                    }
                } else if (line.startsWith("telefono: ")) {
                    if (obj != null) {
                        obj.setTelefono(line.substring(10));
                    }
                } else if (line.startsWith("modalidadEstudio: ")) {
                    if (obj != null) {
                        obj.setModalidadEstudio(line.substring(18));
                    }
                } else if (line.startsWith("cantidadAsignaturas: ")) {
                    if (obj != null) {
                        obj.setCantidadAsignaturas(Integer.parseInt(line.substring(21)));
                    }
                } else if (line.startsWith("serial: ")) {
                    if (obj != null) {
                        obj.setSerial(line.substring(10));
                        listaDiseño.add(obj);
                        obj = null; // Reiniciar para el siguiente producto
                    }
                }
            }

            System.out.println("Archivo importado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listaDiseño;
    }
}