package service.implement;

import Model.Cat;
import Model.CatType;
import com.sun.org.apache.bcel.internal.generic.SWITCH;
import service.Meow;

import static Model.CatType.*;

public class MeowImpl implements Meow {

    public String meow(Cat cat) {
        String meowByType = null;
        switch (cat.getType()) {
            case Birman:
                meowByType = "喵 喵 喵！";
                break;
            case Persian:
                meowByType = "喵喵 喵喵 喵喵！";
                break;
            case Ragdoll:
                meowByType = "喵喵喵 喵喵喵 喵喵喵";
                break;
            default:
                meowByType = "遇到你真是太幸运了";
        }
        return meowByType;
    }
}
/**
 * @program: cat
 * @description:
 * @author: Dainy33
 * @create: 2018-09-29 09:26
 **/
