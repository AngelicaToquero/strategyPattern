public class GameApp {
    public static void main(String[] args) {
        // Knight with Sword Attack and Shield Defense
        Character knight = new Character("Knight", new SwingSword(), new Shield());
        knight.performAttack();
        knight.performDefend();

        // Wizard with Spell Attack and Magic Barrier Defense
        Character wizard = new Character("Wizard", new CastSpell(), new CreateMagic());
        wizard.performAttack();
        wizard.performDefend();

        // Archer with Arrow Attack and Dodge Defense
        Character archer = new Character("Archer", new ShootArrow(), new Dodge());
        archer.performAttack();
        archer.performDefend();
    }
}
