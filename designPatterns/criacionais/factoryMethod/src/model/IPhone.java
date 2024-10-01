package model;

public abstract class IPhone {
    public abstract void getHardware();

    public void assemble(){
        System.out.println("Montando todos os hardware");
    }

    public void certificades(){
        System.out.println("Testando dos os certificados");
    }

    public void pack(){
        System.out.println("Embalando o dispositivo");
    }
}
