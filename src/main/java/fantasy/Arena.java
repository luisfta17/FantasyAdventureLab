package fantasy;

import fantasy.items.treasures.Treasure;
import fantasy.characters.Character;

public class Arena{

    protected Character player1;
    protected Character player2;
    protected Treasure treasure;

    public Arena(Character player1, Character player2, Treasure treasure){
        this.player1 = player1;
        this.player2 = player2;
        this.treasure = treasure;
    }

    public void checkWinner(){
        if (this.player2.isAlive() && !player1.isAlive()){
            player2.collectTreasure(this.treasure);
        } else if (this.player1.isAlive() && !player2.isAlive()){
            player1.collectTreasure(this.treasure);
        }
    }

}
