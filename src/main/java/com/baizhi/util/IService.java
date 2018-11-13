package com.baizhi.util;

import java.util.List;

public interface IService<T> {
    void add(T t);

    void remove(Integer id);

    void update(T t);

    T findNamePwd(T t);

    T findById(Integer id);

    List<T> findAll();
}
