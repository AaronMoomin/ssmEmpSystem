package com.jie.dao;

import com.jie.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {
    public List<Emp> getAllEmp();

    public List<Emp> getEmpByName(@Param("name") String name);

    public int addEmp(Emp emp);

    public int updateEmp(Emp emp);

    public int deleteEmp(@Param("id") int id);
}
