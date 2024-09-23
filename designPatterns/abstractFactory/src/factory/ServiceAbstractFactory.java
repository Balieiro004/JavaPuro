package factory;

import interfacee.CarService;
import interfacee.UserService;

public interface ServiceAbstractFactory {
    public UserService getUserService();
    public CarService getCarService();
}
