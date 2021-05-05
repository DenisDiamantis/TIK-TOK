package myAPP;

import java.io.IOException;
import java.net.Socket;

public class PublisherThread extends Thread {
    AppNode app;
    Socket requestSocket = null;
    public PublisherThread(AppNode app){
        this.app=app;
        app.init();
        app.connect();
    }

    public void run() {
        try {
            System.out.println("inside");
            Message key =(Message) app.in.readObject();
            app.push(key.getKey(),null);
            app.playData(null,null);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
