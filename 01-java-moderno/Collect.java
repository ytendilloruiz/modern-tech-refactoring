void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    record Log(String nivel, String mensaje){}

    List<Log> mensajes = List.of(
            new Log("INFO", "Todo ok"),
            new Log("WARNING", "Faltan datos de salida"),
            new Log("WARNING", "Faltan datos de salida 2"),
            new Log("ERROR", "Fallo en la red"),
            new Log("ERROR", null)
    );

    List<Log> mensajes2 = null;

    Map<String, Long> agrupados = mensajes
             .stream()
             .collect(Collectors.groupingBy(Log::nivel, Collectors.counting()));

    Map<String, Long> segura = Optional.ofNullable(mensajes2)
            .orElse(List.of())
            .stream()
            .collect(Collectors.groupingBy(Log::nivel, Collectors.counting()));

    System.out.println(agrupados);
    System.out.println(segura);

}