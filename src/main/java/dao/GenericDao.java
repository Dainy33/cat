package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.annotation.Resource;
import java.io.Serializable;


public class GenericDao<T extends Serializable, PK> {

    //.xml Beans使用@Resource
    @Resource(name = "sessionFactory")
    private  SessionFactory sessionFactory;


/*    error in Constructor
    private Session session = sessionFactory.getCurrentSession();*/

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
