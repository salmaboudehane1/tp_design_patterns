public class Report extends Document{
    public Report(String title, String author, String content) {
        super(title, author, content);
    }
    @Override
    public Report clone() {
        return new Report(this.title, this.author, this.content);
    }
}
