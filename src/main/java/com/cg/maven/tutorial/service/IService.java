package com.cg.maven.tutorial.service;

import java.util.List;

public interface IService<T> {
    List<T> findAll();
    void save(T object);
    T findById(long id);
    void update(T object);
    void delete(long id);

}
