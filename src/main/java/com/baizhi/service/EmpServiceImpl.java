package com.baizhi.service;

import com.baizhi.dao.EmpDAO;
import com.baizhi.entity.Emp;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class EmpServiceImpl implements EmpService {
    @Resource
    EmpDAO empDAO;

    @Override
    public void add(Emp emp) {
        empDAO.save(emp);
        System.out.println("sskdn");
    }

    @Override
    public void remove(Integer id) {
        empDAO.delete(id);
    }

    @Override
    public void update(Emp emp) {
        empDAO.update(emp);
    }

    @Override
    public Emp findNamePwd(Emp emp) {
        return null;
    }

    @Override
    public Emp findById(Integer id) {
        return empDAO.queryById(id);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Emp> findAll() {
        return empDAO.queryAll();
    }
}
