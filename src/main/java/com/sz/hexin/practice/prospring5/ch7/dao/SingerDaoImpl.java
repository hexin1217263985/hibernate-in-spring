package com.sz.hexin.practice.prospring5.ch7.dao;
/**
 * @(#) 2018/7/14
 */

import com.sz.hexin.practice.prospring5.ch7.entities.Singer;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hexin
 * @version 1.0 2018/7/14
 */
@Transactional
@Repository("singerDao")
public class SingerDaoImpl implements SingerDao {
    private SessionFactory sessionFactory;
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    @Resource(name = "sessionFactory")
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional(readOnly = true)
    public List<Singer> findAll() {
        return sessionFactory.getCurrentSession().createQuery("from Singer s").list();
    }

    public List<Singer> findAllWithAlbum() {
        return null;
    }

    public Singer findById(Long id) {
        return null;
    }

    public Singer save(Singer contact) {
        return null;
    }

    public void delete(Singer contact) {

    }
}
