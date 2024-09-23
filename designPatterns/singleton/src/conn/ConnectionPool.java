package conn;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
    private static final ConnectionPool singleton = new ConnectionPool();
    public  final static int POOL_SIZE = 2;
    private List<Connection> connectionsPool;

    public static ConnectionPool getInstance(){
        return singleton;
    }

    private ConnectionPool(){
        System.out.println("Criando conexão de poll");
        connectionsPool = new ArrayList<Connection>();
        for (int i = 0; i < POOL_SIZE; i++){
            connectionsPool.add(new Connection());
        }
    }

    public Connection getConnection(){
        Connection avaiable = null;
        for (Connection conn : connectionsPool){
            if(!conn.isInUse()){
                avaiable = conn;
                break;
            }
        }
        if (avaiable == null){
            System.out.println("Nenhuma conexão disposnivél");
            return null;
        }
        avaiable.setInUse(true);
        return avaiable;
    }

    public void leaveConnection(Connection conn){
        conn.setInUse(false);
    }
}
