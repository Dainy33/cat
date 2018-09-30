package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import utils.ResponseInfo;

import javax.annotation.PostConstruct;

@Controller
public class CatController {

    /*@Resource
    private Buy iBuy;*/

    @PostConstruct
    public void test(){
        System.out.println("aaaaaaaaaaaaa");
    }

    @RequestMapping(value = "/buyNewCat",method = RequestMethod.GET)
    @ResponseBody
    public ResponseInfo buyNewCat(){
        ResponseInfo responseInfo = ResponseInfo.createFailedResponse("");

        /*Cat persian = new Persian();
        persian.setAge(2);
        persian.setName("lily");
        iBuy.buy(persian);
*/
        responseInfo = ResponseInfo.createSuccessResponse("");
        return responseInfo;
    }
}
/**
 * @program: cat
 * @description:
 * @author: Dainy33
 * @create: 2018-09-29 09:51
 **/
