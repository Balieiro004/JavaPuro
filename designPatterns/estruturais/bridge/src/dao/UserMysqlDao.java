package dao;

import model.User;

public class UserMysqlDao implements UserDao{

    @Override
    public void save(User user) {
        System.out.println("Salvando o usuario no Msql Database!");
    }
}
