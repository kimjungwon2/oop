package org.example.chapter3.polymorphism;

public class SocketDataReader implements ByteSource {

    private String fileName;

    public SocketDataReader() {
    }

    public SocketDataReader(String fileName) {
        this.fileName = fileName;
    }

    public byte[] read(){
        return fileName.getBytes();
    }

}
