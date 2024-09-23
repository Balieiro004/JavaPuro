package factory;

import interfacee.CarService;
import interfacee.UserService;
import model.CarRestService;
import model.UserRestService;

public class RestAbstractFactory implements ServiceAbstractFactory{
    @Override
    public UserService getUserService() {
        return new UserRestService();
    }

    @Override
    public CarService getCarService() {
        return new CarRestService();
    }
}
