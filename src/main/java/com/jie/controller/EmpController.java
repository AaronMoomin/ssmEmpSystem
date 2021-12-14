package com.jie.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jie.pojo.Dept;
import com.jie.pojo.Emp;
import com.jie.service.EmpService;
import com.jie.service.EmpServiceImpl;
import jdk.nashorn.internal.parser.JSONParser;
import org.apache.ibatis.annotations.Param;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    @Qualifier("empServiceImpl")
    private EmpService empService;

    @RequestMapping("/allEmp/{pageNo}")
    public String allEmp(@PathVariable int pageNo, Model model) throws JsonProcessingException {
        PageHelper.startPage(pageNo,5);
        List<Emp> allEmp = empService.getAllEmp();
        PageInfo pageInfo = new PageInfo(allEmp, 5);
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(pageInfo);
    }

    @RequestMapping("/empById/{name}")
    public String getEmpById(@PathVariable("name") String name) throws JsonProcessingException {
        System.out.println(name);
        List<Emp> empList = empService.getEmpByName(name);
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(empList);
    }

    @RequestMapping( "/addEmp")
    public String addEmp(@RequestBody Emp emp) throws JsonProcessingException {
        System.out.println("addEmp====>");
        System.out.println(emp);
        empService.addEmp(emp);
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString("add success");
    }

    @RequestMapping("/updateEmp")
    public String updateEmp(@RequestBody Emp emp) throws JsonProcessingException {
        System.out.println("updateEmp====>");
        empService.updateEmp(emp);
        System.out.println(emp);
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString("update success");
    }

    @RequestMapping("/deleteEmp")
    public String deleteEmp(@RequestBody String id) throws JsonProcessingException {
        System.out.println(id);
        empService.deleteEmp(Integer.parseInt(id));
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString("delete success");
    }

    @Test
    public void test(){
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String now = format.format(date);
        Dept dept = new Dept(1, "前端开发部");
        System.out.println(System.currentTimeMillis());
        Emp emp = new Emp(1,"jack",now,now,"aaa",1000.0,"wuwuwu",dept);
        System.out.println(emp);
    }

}
