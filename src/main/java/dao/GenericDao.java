package dao;

import java.io.Serializable;

public class GenericDao<T extends Serializable,PK> {
    public void save(T object){}
    public void update(T object){}
    public void remove(T object){}
    public T get(PK id){
        return null;
    }
}
/**
 * @program: cat
 * @description:
 * @author: Dainy33
 * @create: 2018-09-29 17:38
 **/
