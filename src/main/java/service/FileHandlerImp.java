package service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandlerImp implements FileHandler {

    public FileHandlerImp() {
    }

    @Override
    public void createFile(String path, String name) {
        File file = new File(path + "/" + name);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<String> fileToList(String path) {
        List<String> lines = new ArrayList<>();
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lines;
    }

    @Override
    public void addListOfStringToEnd(String path, List<String> lines) {
        for(String line : lines) {
            addLineOfTextToEnd(path, line);
        }
    }

    @Override
    public void addLineOfTextToEnd(String path, String line) {
        try {
            File file = new File(path);

            if (!file.exists()) {
                System.out.println("File does not exist");
            }
            FileWriter fw = new FileWriter(file, true);
            fw.append("\n" + line);
            fw.close();

        } catch (IOException ioe) {
            System.out.println("Exception occurred:");
            ioe.printStackTrace();
        }
    }
}
