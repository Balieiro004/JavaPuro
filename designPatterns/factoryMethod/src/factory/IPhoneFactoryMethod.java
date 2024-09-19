package factory;

import model.*;

public class IPhoneFactoryMethod {

    public static IPhone orderIPhone(String generation, String level){

        IPhone device = null;

        if ("X".equalsIgnoreCase(generation)){
            if ("standard".equalsIgnoreCase(level)){
                device = new IPhoneX();
            } else if ("highEnd".equalsIgnoreCase(level)) {
                device = new IPhoneXSMax();
            }
        } else if ("16".equalsIgnoreCase(generation)) {
            if ("standard".equalsIgnoreCase(level)){
                device = new IPhone16();
            } else if ("highEnd".equalsIgnoreCase(level)) {
                device = new IPhone16Pro();
            }
        }

        if (device != null){
            device.assemble();
            device.certificades();
            device.pack();
        }
        return device;
    }
}
