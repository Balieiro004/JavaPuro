package model;

import interfacee.CarService;

public class CarEJBService implements CarService {
    @Override
    public void save(String model) {
        System.out.println("Savando carro " + model + " na interface EJB");
    }

    @Override
    public void updade(String newModel) {
        System.out.println("Updade do carro " + newModel + " na interface EJB");
    }
}
