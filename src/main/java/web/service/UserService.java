package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
   public List<User> listUsers();
   public User getUser(int id);
    void update(int id, User user);
    void delete(int id);
    void add(User user);
}
