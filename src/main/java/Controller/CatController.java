package Controller;

import Model.Cat;
import Model.Persian;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.persistence.ConstructorResult;

@Controller
@RequestMapping(value = "cat")
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
