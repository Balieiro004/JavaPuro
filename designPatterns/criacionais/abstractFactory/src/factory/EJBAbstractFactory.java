package factory;

import interfacee.CarService;
import interfacee.UserService;
import model.CarEJBService;
import model.UserEJBService;

public class EJBAbstractFactory implements ServiceAbstractFactory{
    @Override
    public UserService getUserService() {
        return new UserEJBService();
    }

    @Override
    public CarService getCarService() {
        return new CarEJBService();
    }
}
