package dao;

import model.Cat;
import org.springframework.stereotype.Repository;

@Repository
public class CatDao extends GenericDao<Cat,String>{
    @Override
    public Cat get(String id) {
        return super.get(id);
    }
}
/**
 * @program: cat
 * @description:
 * @author: Dainy33
 * @create: 2018-09-29 14:36
 **/
