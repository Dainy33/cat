package Model;

public class Persian extends Cat{

    public Persian() {
        this.setType(CatType.Persian);
    }

    public Persian(Integer id, Integer age, String name, CatType type) {
        super(id, age, name, CatType.Persian);
    }
}
/**
 * @program: cat
 * @description:
 * @author: Dainy33
 * @create: 2018-09-28 17:58
 **/
