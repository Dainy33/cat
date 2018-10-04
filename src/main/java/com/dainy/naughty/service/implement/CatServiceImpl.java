package com.dainy.naughty.service.implement;

import com.dainy.naughty.dao.CatDao;
import com.dainy.naughty.model.Cat;
import com.dainy.naughty.service.iCatService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import static com.dainy.naughty.utils.CatType.*;


@Service
public class CatServiceImpl implements iCatService {
    @Resource
    private CatDao catDao;

    @Transactional
    public void buy(Cat cat) {
        catDao.save(cat);
    }

    public String eating(Cat cat) {
        return cat.getType() + "Eating!";
    }

    public String drinking(Cat cat) {
        return cat.getType() + "Drinking!";
    }

    public String meow(Cat cat) {
        String meowByType = null;
        if (Birman.equals(cat.getType())) {
            meowByType = "Birman喵 喵 喵！";

        } else if (Persian.equals(cat.getType())) {
            meowByType = "Persian喵 喵 喵！";

        } else if (Ragdoll.equals(cat.getType())) {
            meowByType = "Ragdoll喵 喵 喵！";

        } else {
            meowByType = "遇到你真是太幸运了";
        }
        return meowByType;
    }
}
/**
 * @program: cat
 * @description:
 * @author: Dainy33
 * @create: 2018-09-29 14:40
 **/
