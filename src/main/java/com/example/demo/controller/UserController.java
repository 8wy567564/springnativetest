package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.entity.UserInfo;
import com.example.demo.mapper.UserMapper;
import com.example.demo.session.SessionData;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserMapper userMapper;

  @Autowired
  private SessionData sessionData;

  @Autowired
  private RestTemplate restTemplate;

  @GetMapping
  public ResponseEntity<List<User>> getUser() {

    List<User> users = userMapper.getUser();
    sessionData.setName(users.get(0).getUserName());

    return new ResponseEntity<>(users, HttpStatus.OK);
  }

  @GetMapping("/test")
  public ResponseEntity<List<UserInfo>> test() {
    String url = "http://localhost:8081/api/management/users";
    ResponseEntity<List<UserInfo>> response = restTemplate.exchange(url, HttpMethod.GET, null,
        new ParameterizedTypeReference<List<UserInfo>>() {});
    return response;
  }



}
