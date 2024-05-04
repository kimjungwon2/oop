package org.example.chapter2;

public class FlowController {

    private String fileName;

    public void process(){
        FileDataReader reader = new FileDataReader(fileName);
        byte[] plainBytes = reader.read();

        ByteEncryptor encryptor = new ByteEncryptor();
        byte[] encryptedBytes = encryptor.encrypt(plainBytes);

        FileDataWriter writer = new FileDataWriter();
        writer.write(encryptedBytes);
    }
}
