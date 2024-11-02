import java.util.concurrent.TimeUnit;

public class DatabaseConnection {

    private static DatabaseConnection instance;

    private long connectionCreationTime;

    private DatabaseConnection() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.connectionCreationTime = System.currentTimeMillis();
        System.out.println("Connexion à la base de données établie.");
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        } else {
            System.out.println("Utilisation de la connexion existante.");
        }
        return instance;
    }

    public void executeQuery(String query) {
        System.out.println("Exécution de la requête : " + query);
    }

    public long getConnectionCreationTime() {
        return this.connectionCreationTime;
    }
}
