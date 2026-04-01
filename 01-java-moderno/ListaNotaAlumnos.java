record Alumno(String nombre, List<Integer> notas) {}

List<Alumno> alumno = List.of(
    new Alumno("Pepe", List.of(7, 4, 8, 6)),
    new Alumno("María", List.of(9, 7, 4, 9))
);

List<Integer> notas = alumno
                      .stream()
                      .flatMap(a -> a.notas().stream())
                      .filter( nota -> nota >= 5)
                      .toList();