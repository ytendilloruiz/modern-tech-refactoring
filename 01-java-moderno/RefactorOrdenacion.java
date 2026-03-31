// Lo que hacías en Java 5
Collections.sort(empleados, new Comparator() {
    public int compare(Object o1, Object o2) {
        Empleado e1 = (Empleado) o1;
        Empleado e2 = (Empleado) o2;
        return e1.getEdad() - e2.getEdad();
    }
});


// OPCIÓN A: Lambda básica (Sustituye a la clase anónima)
// "A los empleados e1 y e2, compáralos por su edad"
empleados.sort((e1, e2) -> e1.getEdad() - e2.getEdad());

// OPCIÓN B: Usando el Comparator que tú creaste (Muy limpio)
Comparator<Empleado> porEdad = Comparator.comparingInt(Empleado::getEdad);
empleados.sort(porEdad);

// OPCIÓN C: Todo en una línea (La que verás en empresas modernas)
empleados.sort(Comparator.comparingInt(Empleado::getEdad));