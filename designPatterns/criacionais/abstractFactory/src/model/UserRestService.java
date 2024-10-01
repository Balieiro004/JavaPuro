package model;

import interfacee.UserService;

public class UserRestService implements UserService {
    @Override
    public void save(String name) {
        System.out.println("Savando " + name + " na interface Rest");
    }

    @Override
    public boolean delete(Integer id) {
        System.out.println("Removendo usuario com id: " + id);
        return true;
    }
}
