package com.springframework.restclient.api.services;

import com.springframework.restclient.api.domain.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ApiServiceImplTest {

    @Autowired
    ApiService apiService;

    @BeforeEach
    void setUp() {
    }

    @Test
    public void testGetUsers() {
        List<User> users = apiService.getUsers(3);
        assertEquals(3, users.size());
    }
}