List<String> ciudades = Arrays.asList("madrid", "barcelona", "valencia");

List<String> ciudadesFinales = ciudades.stream()
.filter (c -> c.length() > 7)
.map(String::toUpperCase)
.toList(); // java 16+

//.collect(Collectors.toList()) // Java 8

// Java 5

String encontrada = null;
for (String c : ciudades) {
    if (c.startsWith("v")) {
        encontrada = c;
        break; 
    }
}
if (encontrada != null) {
    System.out.println(encontrada);
}


ciudades.stream()
        .filter(c -> c.startsWith("v"))
        .findFirst()
        .ifPresent(System.out::println);

String resultado = encontrada.orElse("No hay ciudades con V");
// String resultado = encontrada.orElseThrow(() -> new RuntimeException("¡Falta la ciudad!"));

// Ejercicio final

List<String> numerosSucios = Arrays.asList("10", "20", "cinco", "30", "40");

Integer sumaNumerosTotales = numerosSucios.stream()
                                            .filter( n -> n.length() < 3)
                                            .map(Integer::valueOf)
                                            .filter( n -> n > 25)
                                            .mapToInt(n -> n).sum();