package org.example.chapter3.polymorphism;

import org.example.chapter2.ByteEncryptor;
import org.example.chapter2.FileDataReader;
import org.example.chapter2.FileDataWriter;

public class FileController {
    public void process(){
        FileDataReader reader = new FileDataReader();
        byte[] data = reader.read();

        ByteEncryptor encryptor = new ByteEncryptor();
        byte[] encryptedData = encryptor.encrypt(data);

        FileDataWriter writer = new FileDataWriter();
        writer.write(encryptedData);

    }
}
