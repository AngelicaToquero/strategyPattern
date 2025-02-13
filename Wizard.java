import java.util.Arrays;

public class Wizard extends Character {
    public Wizard() {
        super(new CastSpell(), Arrays.asList(new CreateMagicBarrier()));
    }
}
