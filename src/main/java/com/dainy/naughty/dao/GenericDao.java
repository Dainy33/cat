package com.dainy.naughty.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.io.Serializable;

@Repository
public class GenericDao<T extends Serializable, PK> {

    //.xml Beans使用@Resource
    @Resource(name = "sessionFactory")
    private  SessionFactory sessionFactory;


/*    error in Constructor
      private Session session = sessionFactory.getCurrentSession();*/

/*    注意：我这里写的session产生是调用的SessionFactory的openSession（）这个方法。
      之前使用getCurrentSession()一直报错，后来百度了一下才知道，
      hibernate3版本可以使用getCurrentSession()来创建session，而hibernate4版本则不行。
      新的注意:个体currentSession不行是因为没有配事务管理(transactionManager)和事务驱动
      而且openSession是需要手动close Session的
*/

    public void save(T object) {
        Session session = sessionFactory.getCurrentSession();
        session.save(object);

    }

    public void update(T object) {
        Session session = sessionFactory.getCurrentSession();
        session.update(object);
    }

    public void remove(T object) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(object);
    }

    public T get(PK id) {
        return null;
    }
}
/**
 * @program: cat
 * @description:
 * @author: Dainy33
 * @create: 2018-09-29 17:38
 **/
