package controller;

import model.Cat;
import model.Persian;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/cat")
public class CatController {

    @Resource
    CatController catController;

    @RequestMapping(value = "/buyNewCat")
    @ResponseBody
    public String buyNewCat(){
        Cat persian = new Persian();
        persian.setAge(2);
        persian.setName("lily");
        catController.buyNewCat();
        return null;
    }
}
/**
 * @program: cat
 * @description:
 * @author: Dainy33
 * @create: 2018-09-29 09:51
 **/
