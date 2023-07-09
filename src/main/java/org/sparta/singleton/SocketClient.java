package org.sparta.singleton;

public class SocketClient {

    private static SocketClient socketClient;

    private SocketClient(){} // 기본생성자를 private으로 막아준다.

    public static SocketClient getInstance(){
        if(socketClient == null){
           socketClient = new SocketClient();
        }
        return socketClient;
    }

    public void connet(){
        System.out.println("connect");
    }
}
