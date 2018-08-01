package ru.ivmiit.repositories;

import ru.ivmiit.models.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UsersRepositoryInMemory implements UsersReposiroty {

    private List<User> users;

    public UsersRepositoryInMemory() {
        this.users = new ArrayList<>();
        User user = new User("And", "123456q", LocalDate.parse("1996-05-05"));
        User user1 = new User("Mic", "123456e", LocalDate.parse("1998-05-05"));
        User user2 = new User("Fis", "123456w", LocalDate.parse("1992-05-05"));

        users.add(user);
        users.add(user1);
        users.add(user2);

    }

    public List<User> findAll() {
        return this.users;
    }

    @Override
    public void save(User user) {
        users.add(user);
    }

}
