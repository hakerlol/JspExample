package ru.ivmiit.repositories;

import ru.ivmiit.fake.FakeStorage;
import ru.ivmiit.models.User;

import java.util.List;

public interface UsersReposiroty {
    List<User> findAll();

    void save(User user);

    public boolean isExist(String name, String password);
}

