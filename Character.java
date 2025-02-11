// Character class with Strategy Pattern applied
public class Character {
    private AttackStrategy attackStrategy;
    private DefenseStrategy defenseStrategy;
    private String type;

    public Character(String type, AttackStrategy attackStrategy, DefenseStrategy defenseStrategy) {
        this.type = type;
        this.attackStrategy = attackStrategy;
        this.defenseStrategy = defenseStrategy;
    }

    public void performAttack() {
        attackStrategy.attack();
    }

    public void performDefend() {
        defenseStrategy.defend();
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void setDefenseStrategy(DefenseStrategy defenseStrategy) {
        this.defenseStrategy = defenseStrategy;
    }
}
