package com.dainy.naughty.controller;

import com.dainy.naughty.model.Cat;
import com.dainy.naughty.model.Persian;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.dainy.naughty.service.iCatService;
import com.dainy.naughty.utils.ResponseInfo;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "catController")
public class CatController {

    @Resource
    private iCatService iBuy;

    @RequestMapping(value = "/buyNewCat",method = RequestMethod.GET)
    @ResponseBody
    public ResponseInfo buyNewCat(){
        ResponseInfo responseInfo = ResponseInfo.createFailedResponse("");

        Cat persian = new Persian();
        persian.setAge(2);
        persian.setName("lily");
        iBuy.buy(persian);

        responseInfo = ResponseInfo.createSuccessResponse("Please Get It!");
        return responseInfo;
    }
}
/**
 * @program: cat
 * @description:
 * @author: Dainy33
 * @create: 2018-09-29 09:51
 **/
