package service.implement;

import dao.CatDao;
import model.Cat;
import org.springframework.stereotype.Service;
import service.Buy;

import javax.annotation.Resource;

@Service
public class BuyImpl implements Buy {
    //@Component 开始用的@Autowired才变紫,Resource不变
    //@Component 后来用@Resource也变紫
    @Resource
    CatDao catDao;

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
