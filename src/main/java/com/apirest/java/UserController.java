package com.apirest.java;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UserController {
    private List<User> users = new ArrayList<>();

    @PostMapping
    public String registerUser(@RequestBody User user) {
        if (user.getNombre() == null || user.getCorreo() == null || user.getEdad() <= 0 || !user.getCorreo().matches("\\S+@\\S+\\.\\S+")) {
            return "Datos inválidos";
        }
        users.add(user);
        return "Usuario registrado.";
    }

    @GetMapping
    public List<User> getAllUsers() {
        return users;
    }
}
