package Model;

/**
 * Created by ryan_gross on 5/7/17.
 */
public class MonsterCard extends Card{

    int attackPoints;
    int defensePoints;
    int monsterLevel;
    Enum monsterType;
    Enum monsterAttribute;

    public MonsterCard(String name, String serialID, String description, int attackPoints, int defensePoints,
                       int monsterLevel, Enum monsterType, Enum monsterAttribute) {
        super(name, serialID, description);
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
        this.monsterLevel = monsterLevel;
        this.monsterAttribute = monsterAttribute;
        this.monsterType = monsterType;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    public int getDefensePoints() {
        return defensePoints;
    }

    public void setDefensePoints(int defensePoints) {
        this.defensePoints = defensePoints;
    }

    public int getMonsterLevel() {
        return monsterLevel;
    }

    public void setMonsterLevel(int monsterLevel) {
        this.monsterLevel = monsterLevel;
    }

    public Enum getMonsterType() {
        return monsterType;
    }

    public void setMonsterType(Enum monsterType) {
        this.monsterType = monsterType;
    }

    public Enum getMonsterAttribute() {
        return monsterAttribute;
    }

    public void setMonsterAttribute(Enum monsterAttribute) {
        this.monsterAttribute = monsterAttribute;
    }
}
