package com.example.test.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.Service.LoginService;
import com.example.test.model.UserName;
@RestController
public class TestController {
  
  private final LoginService loginService;
  public TestController(LoginService loginService) {
    this.loginService = loginService;
}


  @GetMapping("/hello/{name}")
  public String Hello(@PathVariable String name) {
    return name;
  }

  @GetMapping("/users")
  public List<UserName> findAllUsersNative() {
      return loginService.findAllUsersNative();
  }

  
}