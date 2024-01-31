package oop_prac20_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UrlParser {
    private final String path;
    private String protocol;
    private String host;
    private String uri;

    public UrlParser(String path) {
        this.path = path;
        Pattern pattern = Pattern.compile("(https?)://([a-z\\d-]+\\.com)((/[a-z\\d-]+)*)");
        Matcher matcher = pattern.matcher(path);
        if (matcher.find()) {
            protocol = matcher.group(1);
            host = matcher.group(2);
            uri = matcher.group(3);
        }
    }

    public String getProtocol() {
        return protocol;
    }

    public String getHost() {
        return host;
    }

    public String getUri() {
        return uri;
    }

    public String getPath() {
        return path;
    }
}
