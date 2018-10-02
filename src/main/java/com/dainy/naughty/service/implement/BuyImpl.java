package com.dainy.naughty.service.implement;

import com.dainy.naughty.dao.CatDao;
import com.dainy.naughty.model.Cat;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.dainy.naughty.service.Buy;

import javax.annotation.Resource;

@Service
@Transactional
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
