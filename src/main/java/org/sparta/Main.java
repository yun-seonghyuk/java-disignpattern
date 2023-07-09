package org.sparta;

import org.sparta.adapter.*;
import org.sparta.singleton.Aclazz;
import org.sparta.singleton.Bclazz;
import org.sparta.singleton.SocketClient;

public class Main {
    public static void main(String[] args) {

//        Aclazz aclazz = new Aclazz();
//
//        Bclazz bclazz = new Bclazz();
//
//        SocketClient aClient = aclazz.getSocketClient();
//        SocketClient bClient = bclazz.getSocketClient();
//
//        System.out.println("두개의 객체가 동일한가?");
//        System.out.println(aClient.equals(bClient));
//        System.out.println("aClient = "+aClient);
//        System.out.println("bClient = "+bClient);

        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();
        Electronic110V cleanerAdapter = new SocketAdapter(cleaner);
        connect(cleanerAdapter);

        AirConditioner airConditioner = new AirConditioner();
        Electronic110V airAdapter = new SocketAdapter(airConditioner);
        connect(airAdapter);

    }

    //콘센트
    public static void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }

}