package org.example.chapter2;

import org.example.chapter3.polymorphism.ByteSource;

public class FileDataReader implements ByteSource {
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
