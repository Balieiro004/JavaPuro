import factory.EJBAbstractFactory;
import factory.RestAbstractFactory;
import factory.ServiceAbstractFactory;
import interfacee.CarService;
import interfacee.UserService;

public class Main {
    public static void main(String[] args) {
//         ServiceAbstractFactory factory = new EJBAbstractFactory();
       ServiceAbstractFactory factory = new RestAbstractFactory();

        UserService userService = factory.getUserService();
        userService.save("Balieiro");
        userService.delete(5);

        CarService carService = factory.getCarService();
        carService.save("Honda");
        carService.updade("Tesla X");
    }
}