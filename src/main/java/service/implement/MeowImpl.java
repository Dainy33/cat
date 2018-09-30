package service.implement;

import model.Cat;
import service.Meow;

import static model.CatType.*;

public class MeowImpl implements Meow {

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
 * @create: 2018-09-29 09:26
 **/
