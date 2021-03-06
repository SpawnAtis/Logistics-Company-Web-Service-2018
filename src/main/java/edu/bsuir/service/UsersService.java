package edu.bsuir.service;

import edu.bsuir.model.Users;

import java.util.List;

public interface UsersService {
    Users addUser(Users user);
    void delete(int id);
    Users editUser(Users user);
    Users getUser(int id);
    List<Users> getAll();

    Users getUserByLoginAndPassword(String login, String password);
}
