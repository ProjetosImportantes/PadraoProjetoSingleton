package singleton;

public class Main {
    public static void main(String[] args) {
        // Testando ConfigManager
        ConfigManager config = ConfigManager.getInstance();
        System.out.println("App Name: " + config.getAppName());
        System.out.println("Version: " + config.getVersion());

        // Alterando configuração
        config.setAppName("SuperApp");
        config.setVersion("2.0");

        // Obtendo nova instância (mesma instância)
        ConfigManager config2 = ConfigManager.getInstance();
        System.out.println("App Name from config2: " + config2.getAppName());
        System.out.println("Version from config2: " + config2.getVersion());

        // Testando Logger
        Logger logger = Logger.getInstance();
        logger.log("Sistema iniciado.");

        Logger logger2 = Logger.getInstance();
        logger2.log("Outro log usando a mesma instância.");

        // Testando DatabaseConnection
        DatabaseConnection db = DatabaseConnection.getInstance();
        db.connect();
        db.connect(); // Já conectado

        DatabaseConnection db2 = DatabaseConnection.getInstance();
        db2.disconnect();
    }
}
