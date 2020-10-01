package edu.eci.ieti.services.impl;

import edu.eci.ieti.model.User;
import edu.eci.ieti.services.UserService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private List<User> usuarios = Arrays.asList(
            new User("1","sergio","sergio@hotmail.com","1234"),
            new User("2","juan","juan@hotmail.com","0000"),
            new User("3","carlos","carlos@hotmail.com","1111")
    );

    @Override
    public List<User> getAll() {
        return usuarios;
    }

    @Override
    public User getById(String userId) {
        User answ = null;
        for (User cli:usuarios){
            if (cli.getId() == userId){
                answ = cli;
            }
        }
        return answ;
    }

    @Override
    public User create(User user) {
        if (user != null){
            usuarios.add(user);
        }
        return user;
    }

    @Override
    public User update(User user) {
        User answ = null;
        for (User cli:usuarios){
            if (cli.getEmail() == user.getEmail()){
                cli.setId(user.getId());
                cli.setName(user.getName());
                cli.setEmail(user.getEmail());
                cli.setPassword(user.getPassword());
                answ = cli;
            }
        }
        return answ;
    }

    @Override
    public void remove(String userId) {
        int position = -1;
        for (User cli:usuarios) {
            if (cli.getId() == userId) {
                position = usuarios.indexOf(cli);
            }
        }
        if (position >=0){
            usuarios.remove(position);
        }
    }

}
