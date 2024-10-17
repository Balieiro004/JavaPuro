package service;

import dao.UserDao;
import model.User;

public class UserSoap extends UserService{

    public UserSoap(UserDao dao) {
        super(dao);
    }

    @Override
    public void save(User user) {
        System.out.println("Salvando a operação no protocolo Soap");
        dao.save(user);
    }
}
