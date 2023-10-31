package search_server;

public class Document {
    private int id;
    private String[] content;

    public Document(int id, String content) {
        this.id = id;
        this.content = content.split("\\s+");
    }

    public int getId() {
        return id;
    }

    public String[] getContent() {
        return content;
    }
}