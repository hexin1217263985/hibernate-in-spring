package com.sz.hexin.practice.prospring5.ch7;
/**
 * @(#) 2018/7/14
 */

import com.sz.hexin.practice.prospring5.ch7.dao.SingerDao;
import com.sz.hexin.practice.prospring5.ch7.entities.Singer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import java.util.List;

/**
 * @author hexin
 * @version 1.0 2018/7/14
 */
public class SpringHibernateDemo {
    private final static Logger log = LoggerFactory.getLogger(SpringHibernateDemo.class);
    public static void main(String[] args) {
        GenericApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppConfig.class);

        SingerDao singerDao = ctx.getBean("singerDao", SingerDao.class);
        listSingers(singerDao.findAll());

        ctx.close();

    }
    private static void listSingers(List<Singer> singers) {
        log.info("---- Listing singers:");
        singers.forEach(singer -> log.info(singer.toString()));
    }
}
