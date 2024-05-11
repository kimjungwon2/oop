package org.example.chapter5;

public class ZippedResponseSender extends ResponseSender{
    public ZippedResponseSender(Data data) {
        super(data);
    }

    @Override
    protected void sendBody() {
        //텍스트로 데이터 전송
    }
}
