package com.baizhi.util;

import java.util.List;

public interface IDAO<T> {
    void save(T t);

    void delete(Integer id);

    void update(T t);

    T queryNamePwd(T t);

    T queryById(Integer id);

    List<T> queryAll();

}
