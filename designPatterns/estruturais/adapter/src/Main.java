import adapter.HDMIToOldMonitorAdapter;
import adapter.HDMIToVGAAdapter;
import model.Computer;
import model.OldMonitor;
import model.TV;

public class Main {
    public static void main(String[] args) {

        Computer pc = new Computer();
        TV tv = new TV();
        pc.connectPort(tv);
        pc.sendImageAndSound("Gato e arco iris", "Barulho de gato");

        System.out.println("------Monitor------");

        Computer pc2 = new Computer();
        OldMonitor monitor = new OldMonitor();
        pc2.connectPort(new HDMIToVGAAdapter(monitor));
        pc2.sendImageAndSound("Gato e arco iris", "Barulho de gato");

        Computer pc3 = new Computer();
        HDMIToOldMonitorAdapter monitorAdapter = new HDMIToOldMonitorAdapter();
        pc3.connectPort(monitorAdapter);
        pc.sendImageAndSound("Gato e arco iris", "Barulho de gato");
    }
}