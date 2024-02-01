package org.example;

import java.io.File;
import java.io.FileWriter;

public class UrlToFile {
    private String url;
    private String fileName;

    public UrlToFile(String url, String fileName) {
        this.url = url;
        this.fileName = fileName;
    }

    public void writeToFile() {
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File already exists");
            }

            FileWriter myWriter = new FileWriter(fileName);
            myWriter.write(url);
            myWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
