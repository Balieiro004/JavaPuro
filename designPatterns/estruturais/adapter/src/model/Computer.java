package model;

import interfaces.HDMI;

public class Computer {
    private HDMI port;

    public void connectPort(HDMI port) {
        System.out.println("Conectando o hdmi...");
        this.port = port;
    }

    public void sendImageAndSound(String image, String sound){
        if (port == null){
            System.out.println("Conecte o cabo HDMI primeiro");
        }else {
            port.setImage(image);
            port.setSound(sound);
        }
    }
}
