public class LogLevels {
    
    public static String message(String logLine) {
        String[] partes = logLine.split(":");
        String mensajeLimpio = partes[1].trim();
        return mensajeLimpio;
    }

    public static String logLevel(String logLine) {
    String[] partes = logLine.split(":");
    String nivelLimpio = partes[0].replace("[", "").replace("]", "").trim().toLowerCase();
    return nivelLimpio;
}

    public static String reformat(String logLine) {
        String mensaje = message(logLine);
        String nivel = logLevel(logLine);
        return mensaje + " (" + nivel + ")";
    }    
}
