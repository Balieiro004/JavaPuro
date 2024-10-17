package adapter;

import interfaces.HDMI;
import model.OldMonitor;

public class HDMIToOldMonitorAdapter extends OldMonitor implements HDMI {

    public HDMIToOldMonitorAdapter() {
        super();
        System.out.println("Envolvendo o vga do antigo monitor");
    }

    @Override
    public void setSound(String sound) {
        System.out.println("Desculpe, não trabalhamos com som");
    }
}
