package Model;

public class Birman extends Cat {
    public Birman() {
        this.setType(CatType.Birman);
    }

    public Birman(Integer id, Integer age, String name, CatType type) {
        super(id, age, name, CatType.Birman);
    }
}
/**
 * @program: cat
 * @description:
 * @author: Dainy33
 * @create: 2018-09-28 18:15
 **/
