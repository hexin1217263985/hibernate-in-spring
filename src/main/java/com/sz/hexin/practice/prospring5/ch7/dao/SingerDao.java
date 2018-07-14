package com.sz.hexin.practice.prospring5.ch7.dao;
/**
 * @(#) 2018/7/14
 */

import com.sz.hexin.practice.prospring5.ch7.entities.Singer;

import java.util.List;

/**
 * @author hexin
 * @version 1.0 2018/7/14
 */
public interface SingerDao {
    List<Singer> findAll();
    List<Singer> findAllWithAlbum();
    Singer findById(Long id);
    Singer save(Singer contact);
    void delete(Singer contact);
}
