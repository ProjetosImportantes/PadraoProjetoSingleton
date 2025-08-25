package singleton;

public class DatabaseConnection {
    private static DatabaseConnection instance;
    private boolean connected;

    private DatabaseConnection() {
        this.connected = false;
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void connect() {
        if (!connected) {
            System.out.println("Conectando ao banco de dados...");
            connected = true;
        } else {
            System.out.println("Já conectado ao banco de dados!");
        }
    }

    public void disconnect() {
        if (connected) {
            System.out.println("Desconectando do banco de dados...");
            connected = false;
        } else {
            System.out.println("Não há conexão ativa!");
        }
    }

    public boolean isConnected() {
        return connected;
    }
}
