public abstract class Document implements Cloneable {
    protected String title;
    protected String author;
    protected String content;

    public Document(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public abstract Document clone();

    // Méthode pour afficher les informations du document
    public void display() {
        System.out.println("Titre : " + title);
        System.out.println("Auteur : " + author);
        System.out.println("Contenu : " + content);
    }
}
