package com.jie.service;

import com.jie.pojo.Emp;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmpService {
    public List<Emp> getAllEmp();

    public List<Emp> getEmpByName(String name);

    public int addEmp(Emp emp);

    public int updateEmp(Emp emp);

    public int deleteEmp(int id);
}
