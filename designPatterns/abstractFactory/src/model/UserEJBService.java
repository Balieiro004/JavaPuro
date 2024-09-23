package model;

import interfacee.UserService;

public class UserEJBService implements UserService {
    @Override
    public void save(String name) {
        System.out.println("Savando " + name + " na interface EJB");
    }

    @Override
    public boolean delete(Integer id) {
        System.out.println("Removendo usuario com id: " + id);
        return true;
    }
}
