package search_server;

import java.util.List;

public class SearchServerMain {
    public static void main(String[] args) {
        SearchServer s = new SearchServer();
        s.add(new Document(3, "java the best"));
        s.add(new Document(5, "python the best"));
        s.add(new Document(7, "java better than python"));

        List<Document> d = s.findDocumentByContent("java liquid better");

        for (Document document : d) {
            System.out.print(document.getId() + ": ");
            for (String str : document.getContent()) {
                System.out.print(str + " ");
            }
            System.out.println();
        }
    }
}