package service;

import dao.UserDao;
import model.User;

public class UserRest extends UserService{

    public UserRest(UserDao dao){
        super(dao);
    }

    @Override
    public void save(User user) {
        System.out.println("Salvando a operação no protocolo Rest");
        dao.save(user);
    }


}
