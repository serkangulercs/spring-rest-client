package com.springframework.restclient.api.services;

import com.springframework.restclient.api.domain.User;

import java.util.List;

public interface ApiService {

    List<User> getUsers(Integer limit);
}
