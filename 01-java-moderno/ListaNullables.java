record Log(String nivel, String mensaje){}

    List<Log> mensajes = List.of(
            new Log("INFO", "Todo ok"),
            new Log("WARNING", "Faltan datos de salida"),
            new Log("ERROR", "Fallo en la red"),
            new Log("ERROR", null)
    );

    List<String> errores = mensajes
                            .stream()
                            .filter(e -> e.nivel().equals("ERROR"))
                            .map(e -> Optional.ofNullable(e.mensaje())
                                .map(String::toUpperCase).orElse("ERROR DESCONOCIDO"))
                            .toList();

    System.out.println(errores);