package fantasy.characters;

public abstract class Pet {
    protected int attackPower;

    public Pet(int attackPower){
        this.attackPower = attackPower;
    }

    public int getAttackPower() {
        return this.attackPower;
    }
}
