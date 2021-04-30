package myAPP;

import java.util.List;

public interface Consumer extends Node {

    void register(Broker broker, String user);
    void disconnect(Broker broker, String user);
    void playData(String data, Value value);

    @Override
    void init();

    @Override
    List<Broker> getBrokers();

    @Override
    void connect();

    @Override
    void disconnect();

    @Override
    void updateNodes();
}
