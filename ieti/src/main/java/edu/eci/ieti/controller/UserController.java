package edu.eci.ieti.controller;

import edu.eci.ieti.model.User;
import edu.eci.ieti.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/usuarios")
    public List<User> getAllUsers() {
        List<User> lista = userService.getAll();
        return lista;
    }

    @GetMapping("/usuarios/{id}")
    public User updateUser(@PathVariable String id) {
        return userService.getById(id);
    }
}
