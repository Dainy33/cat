package Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.annotation.Resource;
import java.io.Serializable;

public class GenericDao<T extends Serializable, PK> {

    //.xml Beans使用@Resource
    @Resource(name = "sessionFactory")
    private static SessionFactory sessionFactory;

    private static Session session = sessionFactory.getCurrentSession();

    public void save(T object) {
        session.save(object);

    }

    public void update(T object) {
        session.update(object);
    }

    public void remove(T object) {
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
