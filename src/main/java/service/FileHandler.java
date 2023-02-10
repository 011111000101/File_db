package service;

import java.util.List;

public interface FileHandler {
    void createFile(String path, String name);
    List<String> fileToList(String path);
    void addListOfStringToEnd(String path, List<String> lines);
    void addLineOfTextToEnd(String path, String line);
}
