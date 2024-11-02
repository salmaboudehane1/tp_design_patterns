public class Main {
    public static void main(String[] args) {
        // Tentative de création de plusieurs connexions
        System.out.println("Tentative de connexion 1 :");
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        System.out.println("Temps de création de la connexion 1 : " + db1.getConnectionCreationTime());

        System.out.println("\nTentative de connexion 2 :");
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        System.out.println("Temps de création de la connexion 2 : " + db2.getConnectionCreationTime());

        // Vérification que db1 et db2 pointent vers la même instance
        if (db1 == db2) {
            System.out.println("\nLa même instance de connexion est utilisée.");
        } else {
            System.out.println("\nDes instances différentes ont été créées, ce qui n'est pas correct.");
        }

        // Exécution de requêtes simples
        db1.executeQuery("SELECT * FROM users");
        db2.executeQuery("INSERT INTO users (name) VALUES ('John Doe')");
    }
}
