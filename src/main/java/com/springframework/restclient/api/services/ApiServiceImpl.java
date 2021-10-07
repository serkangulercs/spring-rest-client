package com.springframework.restclient.api.services;

import com.springframework.restclient.api.domain.User;
import com.springframework.restclient.api.domain.UserData;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {

    private final RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<User> getUsers(Integer limit) {
        String baseUrl = "http://apifaketory.com/api/user?limit=";
        UserData userData = restTemplate.getForObject(baseUrl + limit, UserData.class);
        return userData.getData();
    }
}
