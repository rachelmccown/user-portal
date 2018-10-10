package com.devglan.userportal;

import org.springframework.data.repository.Repository;

import java.util.List;

public interface UserRepository extends Repository<User,Integer> {

    void delete(User user);

    List<User> findAll();

    User findById(Integer id);

    User save(User user);
}