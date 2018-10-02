package service.implement;

import dao.CatDao;
import model.Cat;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.Buy;

import javax.annotation.Resource;

@Service
@Transactional(readOnly = true)
public class BuyImpl implements Buy {
    @Resource
    private CatDao catDao;

    public void buy(Cat cat) {
        catDao.save(cat);
    }
}
/**
 * @program: cat
 * @description:
 * @author: Dainy33
 * @create: 2018-09-29 14:40
 **/
