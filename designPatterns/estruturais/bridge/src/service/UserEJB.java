package service;

import dao.UserDao;
import model.User;

public class UserEJB extends UserService{

    public UserEJB(UserDao dao) {
        super(dao);
    }

    @Override
    public void save(User user) {
        System.out.println("Salvando a operação no protocolo EJB");
        dao.save(user);
    }
}
