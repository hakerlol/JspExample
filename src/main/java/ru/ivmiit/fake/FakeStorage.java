package ru.ivmiit.fake;

import ru.ivmiit.models.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FakeStorage {
    private static final FakeStorage storage;

    static {
        storage = new FakeStorage();
    }

    private List<User> users;

    private FakeStorage() {
        this.users = new ArrayList<>();
        User user = new User("And", "123456q", LocalDate.parse("1996-05-05"));
        User user1 = new User("Mic", "123456e", LocalDate.parse("1998-05-05"));
        User user2 = new User("Fis", "123456w", LocalDate.parse("1992-05-05"));

        users.add(user);
        users.add(user1);
        users.add(user2);
    }

    public static FakeStorage storage() {
        return storage;
    }

    public List<User> users(){
        return users;
    }
}
