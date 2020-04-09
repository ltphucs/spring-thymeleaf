package com.cg.maven.tutorial.service;

import net.bytebuddy.dynamic.DynamicType;

import java.util.List;
import java.util.Optional;

public interface IService<T> {
    List<T> findAll();
    void save(T object);
    Optional<T> findById(long id);
    void update(T object);
    void delete(long id);

}
