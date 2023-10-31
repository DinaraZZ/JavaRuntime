package search_server;

import java.util.*;

public class SearchServer {
    private List<Document> documents;

    public SearchServer() {
        documents = new ArrayList<>();
    }

    public void add(Document document) {
        documents.add(document);
    }

    public List<Document> findDocumentByContent(String text) {
        String[] words = text.split("\\s+");
        List<Document> documentList = new ArrayList<>();
        List<Integer> ids = new ArrayList<>();
        int size = words.length;
        for (Document d : documents) {
            int count = 0;
            String[] docWords = d.getContent();
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < docWords.length; j++) {
                    if (words[i].equals(docWords[j])) {
                        count++;
//                        break;
                    }
                }
            }
            if (count > 0) {
                documentList.add(d);
                ids.add(count);
            }
        }
        if (documentList.size() > 0) {
            int size2 = documentList.size();
            for (int i = 0; i < size2; i++) {
                for (int j = size2 - 1; j > i; j--) {
                    if (ids.get(j) > ids.get(j - 1)) {
                        Integer id = ids.get(j);
                        ids.set(j, ids.get(j - 1));
                        ids.set(j - 1, id);

                        Document doc = documentList.get(j);
                        documentList.set(j, documentList.get(j - 1));
                        documentList.set(j - 1, doc);
                    }
                }
            }
        }
        return documentList;
    }

    public List<Document> getDocuments() {
        return documents;
    }
}