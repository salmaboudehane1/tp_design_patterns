public class Contract extends Document{
    public Contract(String title, String author, String content) {
        super(title, author, content);
    }

    @Override
    public Contract clone() {
        return new Contract(this.title, this.author, this.content);
    }
}
