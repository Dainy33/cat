package Model;


public class Birman extends Cat {
    public Birman() {
        this.setType(CatType.Birman);
    }

    public Birman(String id, Integer age, String name, String type) {
        super(id, age, name, type);
    }
}
/**
 * @program: cat
 * @description:
 * @author: Dainy33
 * @create: 2018-09-28 18:15
 **/
