import factory.IPhoneFactoryMethod;
import model.IPhone;

public class Client {
    public static void main(String[] args) {

        System.out.println("Encomendando um Iphone X");
        IPhone iphone = IPhoneFactoryMethod.orderIPhone("X", "standard");
        System.out.println(iphone);


        System.out.println("\n\nEncomendando um Iphone 11 HighEnd");
        IPhone iphone1 = IPhoneFactoryMethod.orderIPhone("16", "highEnd");
        System.out.println(iphone1);
    }
}