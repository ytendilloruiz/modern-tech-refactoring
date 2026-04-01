record Producto(String nombre, double precio, String categoria) {}

List<Producto> carrito = List.of(
    new Producto("Monitor 27p", 300, "Tecnología"),
    new Producto("Teclado RGB", 80, "Tecnología"),
    new Producto("Libro JS", 30, "Libros")
);

List <String> productos = carrito
                           .stream()
                           .filter(p -> p.categoria().equals("Tecnología"))
                           .map(p -> "El " + p.nombre() + " cuesta " + p.precio() + "€")
                           .toList();    