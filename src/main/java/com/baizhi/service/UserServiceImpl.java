package com.baizhi.service;

import com.baizhi.dao.UserDAO;
import com.baizhi.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Resource
    UserDAO userDAO;

    @Override
    public void add(User user) {
        userDAO.save(user);
    }

    @Override
    public void remove(Integer id) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public User findNamePwd(User user) {
        return userDAO.queryNamePwd(user);
    }

    @Override
    public User findById(Integer id) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
