package com.g5.tms.repository;

import com.g5.tms.entities.User;

public interface IUserRepository {
public  User addNewUser(User user);
public User signIn(User user);
public User signOut(User user);
}
