import conn.Connection;
import conn.ConnectionPool;

public class Main {
    public static void doQuery1(){
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection conn = pool.getConnection();
        if (conn != null)
            conn.query("Select * from A1");

        //Libera a conexão
       // pool.leaveConnection(conn);
    }

    public static void doQuery2(){
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection conn = pool.getConnection();
        if (conn != null)
            conn.query("Select * from A2");
    }

    public static void doQuery3(){
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection conn = pool.getConnection();
        if (conn != null)
            conn.query("Select * from A3");
    }
    public static void main(String[] args) {
        System.out.println("Tamanho da conexão poll " + ConnectionPool.POOL_SIZE);
        int pool = ConnectionPool.POOL_SIZE;
        System.out.println(pool);
        doQuery1();;
        doQuery2();;
        doQuery3();;
    }
}