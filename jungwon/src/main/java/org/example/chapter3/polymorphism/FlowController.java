package org.example.chapter3.polymorphism;

import org.example.chapter2.ByteEncryptor;
import org.example.chapter2.FileDataReader;
import org.example.chapter2.FileDataWriter;

public class FlowController {

    private boolean useFile;
    public FlowController(boolean useFile){
        this.useFile = useFile;
    }

    public void process(){

//        byte[] data = null;
        ByteSource source = ByteSourceFactory.getInstance().create();
        byte[] data = source.read();

//        if (useFile) {
////            FileDataReader fileReader = new FileDataReader();
////            data = fileReader.read();
//            source = new FileDataReader();
//        }else{
////            SocketDataReader socketReader = new SocketDataReader();
////            data = socketReader.read();
//            source = new SocketDataReader();
//        }

        ByteEncryptor encryptor = new ByteEncryptor();
        byte[] encryptedData = encryptor.encrypt(data);

        FileDataWriter writer = new FileDataWriter();
        writer.write(encryptedData);

    }
}
