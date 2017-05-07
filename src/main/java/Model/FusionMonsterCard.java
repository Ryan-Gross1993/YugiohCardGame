package Model;

/**
 * Created by ryan_gross on 5/7/17.
 */
public class FusionMonsterCard extends MonsterCard {

    MonsterCard requiredMonsterOne;
    MonsterCard requiredMonsterTwo;

    public FusionMonsterCard(String name, String serialId, String description, int attackPoints,
                             int defensePoints, int monsterLevel, Enum type, Enum attribute, MonsterCard requiredMonsterOne,
                             MonsterCard requiredMonsterTwo) {
        super(name, serialId, description, attackPoints, defensePoints, monsterLevel, type, attribute);
        this.requiredMonsterOne = requiredMonsterOne;
        this.requiredMonsterTwo = requiredMonsterTwo;
    }

    public MonsterCard getRequiredMonsterOne() {
        return requiredMonsterOne;
    }

    public void setRequiredMonsterOne(MonsterCard requiredMonsterOne) {
        this.requiredMonsterOne = requiredMonsterOne;
    }

    public MonsterCard getRequiredMonsterTwo() {
        return requiredMonsterTwo;
    }

    public void setRequiredMonsterTwo(MonsterCard requiredMonsterTwo) {
        this.requiredMonsterTwo = requiredMonsterTwo;
    }


}
