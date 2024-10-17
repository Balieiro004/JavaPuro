package model;

import interfaces.HDMI;

public class TV implements HDMI {
    @Override
    public void setImage(String image) {
        System.out.println("Este é o seu video: " + image);
    }

    @Override
    public void setSound(String sound) {
        System.out.println("Este é o seu som: " + sound);
    }
}
