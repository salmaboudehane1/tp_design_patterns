public class Main {
    public static void main(String[] args) {
        // Créer un stock
        Stock stock = new Stock("Produit A", 10);

        // Créer des observateurs
        EmailAlertObserver emailObserver = new EmailAlertObserver();
        UIUpdateObserver uiObserver = new UIUpdateObserver();
        DailyReportObserver reportObserver = new DailyReportObserver();

        // Ajouter les observateurs au stock
        stock.addObserver(emailObserver);
        stock.addObserver(uiObserver);
        stock.addObserver(reportObserver);

        // Changer la quantité de stock
        stock.setQuantity(4); // Devrait envoyer un email d'alerte et mettre à jour l'UI
        stock.setQuantity(7); // Devrait mettre à jour l'UI mais pas d'alerte par email
        stock.setQuantity(2); // Devrait envoyer un email d'alerte

        // Générer un rapport quotidien
        reportObserver.generateReport();
    }
}
