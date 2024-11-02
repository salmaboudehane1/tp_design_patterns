public class InVoice extends Document {
    public InVoice(String title, String author, String content) {
        super(title, author, content);
    }

    @Override
    public InVoice clone() {
        return new InVoice(this.title, this.author, this.content);
    }
}
