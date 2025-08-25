package singleton;

public class ConfigManager {
    // Instância privada estática
    private static ConfigManager instance;
    
    // Configurações de exemplo
    private String appName;
    private String version;

    // Construtor privado impede instanciamento externo
    private ConfigManager() {
        this.appName = "MySingletonApp";
        this.version = "1.0";
    }

    // Método público para obter a instância única
    public static ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    // Getters e setters
    public String getAppName() {
        return appName;
    }

    public String getVersion() {
        return version;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
