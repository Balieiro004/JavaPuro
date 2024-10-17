package model;

import interfaces.VGA;

public class OldMonitor implements VGA {
    @Override
    public void setImage(String image) {
        System.out.println("Este é o seu video: " + image);
    }
}
