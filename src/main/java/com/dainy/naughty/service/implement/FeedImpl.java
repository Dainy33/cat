package com.dainy.naughty.service.implement;

import com.dainy.naughty.model.Cat;
import com.dainy.naughty.service.Feed;

public class FeedImpl implements Feed {
    public String eating(Cat cat) {
        return cat.getType() + "Eating!";
    }

    public String drinking(Cat cat) {
        return cat.getType() + "Drinking!";
    }
}
/**
 * @program: cat
 * @description:
 * @author: Dainy33
 * @create: 2018-09-29 09:42
 **/
