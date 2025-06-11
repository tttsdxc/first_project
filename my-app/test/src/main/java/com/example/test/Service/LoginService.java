package com.example.test.Service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.test.model.UserName;
import com.example.test.repository.datarepository;;

@Service
public class LoginService {
    private final datarepository repo;
    public LoginService(datarepository repo){
        this.repo = repo;
    }

    public List<UserName> findAllUsersNative(){
        return repo.findAllUsersNative();
    }
}
