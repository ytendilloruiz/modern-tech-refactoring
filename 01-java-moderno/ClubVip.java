record Persona(String nombre, int edad) {}

List<Persona> personas = List.of(new Persona("ana", 17), new Persona("beto", 20), new Persona("carla", 25));

List<String> nombresVip = personas
                       .stream()
                       .filter(p -> p.edad() >= 18)
                       .map(p -> p.nombre().toUpperCase())
                       .toList();
