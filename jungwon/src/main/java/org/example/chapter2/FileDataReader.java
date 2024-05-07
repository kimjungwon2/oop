package org.example.chapter2;

public class FileDataReader {
    private String fileName;

    public FileDataReader() {
    }

    public FileDataReader(String fileName) {
        this.fileName = fileName;
    }

    public byte[] read(){
        return fileName.getBytes();
    }

}
