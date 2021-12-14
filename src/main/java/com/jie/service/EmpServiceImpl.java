package com.jie.service;

import com.github.pagehelper.PageHelper;
import com.jie.dao.EmpMapper;
import com.jie.pojo.Emp;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class EmpServiceImpl implements EmpService {

    private EmpMapper empMapper;

    public void setEmpMapper(EmpMapper empMapper) {
        this.empMapper = empMapper;
    }

    @Override
    public List<Emp> getAllEmp() {
        return empMapper.getAllEmp();
    }

    @Override
    public List<Emp> getEmpByName(String name) {
        return empMapper.getEmpByName(name);
    }

    @Override
    public int addEmp(Emp emp) {
        return empMapper.addEmp(emp);
    }

    @Override
    public int updateEmp(Emp emp) {
        return empMapper.updateEmp(emp);
    }

    @Override
    public int deleteEmp(int id) {
        return empMapper.deleteEmp(id);
    }
}
