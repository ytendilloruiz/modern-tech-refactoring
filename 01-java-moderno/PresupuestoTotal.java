
void main() {
    record Carro(String producto, Integer precio){}

    List<Carro> productos = List.of(
            new Carro("Monitor", 300),
            new Carro("Teclado", 60),
            new Carro("Ratón", 40),
            new Carro("Auriculares", null)
    );

    double precioCarrito = productos
            .stream()
            //.mapToDouble(p -> p.precio)
             .mapToDouble(p -> Optional.ofNullable(p.precio).orElse(0))
            .sum();
    System.out.println(precioCarrito);
}