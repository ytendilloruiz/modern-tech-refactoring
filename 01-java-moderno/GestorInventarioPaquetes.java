void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    record Paquete(String id, String categoria, Double peso){}

    List<Paquete> paquetes = List.of(
            new Paquete("P1", "Electrónica", 1.5),
            new Paquete("P2", "Ropa", 0.5),
            new Paquete("P3", "Electrónica", 2.0),
            new Paquete("P4", "Hogar", null),
            new Paquete("P5", "Ropa", 0.8),
            new Paquete("P6", "Hogar", 1.2)
    );

    Map<String, Long> listaTipoPaquetes = paquetes
            .stream()
            .filter(p -> !p.categoria().equals("Ropa"))
            .map(p -> {
                double pesoRelleno = Optional.ofNullable(p.peso).orElse(0.0);
                return pesoRelleno > 1.0 ? "PESADO" : "lIGERO";
            }
            )
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    System.out.println(listaTipoPaquetes);

}