package Model;

public class Ragdoll extends Cat{
    public Ragdoll() {
        this.setType(CatType.Ragdoll);
    }

    public Ragdoll(Integer id, Integer age, String name, CatType type) {
        super(id, age, name, CatType.Ragdoll);
    }
}
/**
 * @program: cat
 * @description:
 * @author: Dainy33
 * @create: 2018-09-28 18:14
 **/
