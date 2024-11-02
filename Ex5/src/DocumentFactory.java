public class DocumentFactory {

    // Méthode pour créer un document selon le type spécifié
    public Document createDocument(String type, String title, String author, String content) {
        switch (type.toLowerCase()) {
            case "report":
                return new Report(title, author, content);
            case "contract":
                return new Contract(title, author, content);
            case "invoice":
                return new InVoice(title, author, content);
            default:
                throw new IllegalArgumentException("Type de document inconnu : " + type);
        }
    }
}
