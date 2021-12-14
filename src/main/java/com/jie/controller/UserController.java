package com.jie.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jie.pojo.User;
import com.jie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;

    @RequestMapping("/login")
    public String login(User user) throws JsonProcessingException {
        System.out.println(user);
        User userSql = userService.login(user);
        ObjectMapper mapper = new ObjectMapper();
        if (userSql!=null){
            if (user.getUsername().equals(userSql.getUsername())
                    && user.getPassword().equals(userSql.getPassword())){
                System.out.println("��¼�ɹ�");
                return mapper.writeValueAsString("success");
            }else if (user.getUsername().equals(userSql.getUsername())){
                System.out.println("�������");
                return mapper.writeValueAsString("�������");
            }else {
                System.out.println("�û������������");
                return mapper.writeValueAsString("�û������������");
            }
        }else {
            System.out.println("û�д��û�");
            return mapper.writeValueAsString("û�д��û�");
        }
    }
}
