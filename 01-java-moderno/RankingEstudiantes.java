import java.util.Comparator;
import java.util.List;

public class GestionEstudiantesRanking {
    
    record Estudiante(String nombre, double nota) {}

    public static void main(String[] args) {
        List<Estudiante> alumnos = List.of(
            new Estudiante("Clara", 8.0),
            new Estudiante("Lucas", 6.8),
            new Estudiante("Sofía", 5.9),
            new Estudiante("Diego", 4.5),
            new Estudiante("Nerea", 7.2)
        );

        List<Estudiante> mejoresEstudiantes = alumnos
            .stream()
            .filter(a -> a.nota() >= 5)
            .sorted(Comparator.comparingDouble(Estudiante::nota).reversed())
            .limit(2)
            .toList();

        System.out.println("El podio es: " + mejoresEstudiantes);
    }
}