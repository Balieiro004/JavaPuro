package dao;

import model.User;

public class UserMongoDao implements UserDao{
    @Override
    public void save(User user) {
        System.out.println("Salvando o usuario no Mongo Database!");
    }
}
