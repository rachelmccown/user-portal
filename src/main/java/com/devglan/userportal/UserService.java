package com.devglan.userportal;

import java.util.List;

public interface UserService {

    User create(User user);

    User delete(Integer id);

    List<User> findAll();

    User findById(Integer id);

    User update(User user);
}