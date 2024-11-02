public class Main {
    public static void main(String[] args) {
        DocumentFactory factory = new DocumentFactory();

        // Création de documents via la Factory
        Document report = factory.createDocument("report", "Rapport Annuel", "salma", "Contenu du rapport annuel.");
        Document contract = factory.createDocument("contract", "Contrat de Vente", "doaa", "Contenu du contrat de vente.");
        Document invoice = factory.createDocument("invoice", "Facture 001", "siham", "Contenu de la facture.");

        // Affichage des documents créés
        System.out.println("Documents créés :");
        report.display();
        System.out.println();
        contract.display();
        System.out.println();
        invoice.display();
        System.out.println("====================================\n");

        Document clonedReport = report.clone();
        Document clonedContract = contract.clone();

        // Modification du clone pour vérifier que le clonage est indépendant
        clonedReport.title = "Rapport Annuel (Copie)";
        clonedReport.content = "Contenu modifié du rapport annuel.";

        System.out.println("Documents clonés :");
        System.out.println("Clonage du rapport :");
        clonedReport.display();
        System.out.println();

        System.out.println("Clonage du contrat :");
        clonedContract.display();
        System.out.println("====================================\n");

        // Affichage de l'original pour vérifier l'indépendance
        System.out.println("Vérification de l'original (invariant) après clonage :");
        report.display();
        System.out.println();
    }
}