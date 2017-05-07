package Model;

/**
 * Created by ryan_gross on 5/7/17.
 */
// Magic or Trap Card
public class MTCard extends Card implements Effect {

    Enum magicOrTrap;
    Enum magicOrTrapType;

    public MTCard(String name, String serialId, String description, Enum magicOrTrap, Enum magicOrTrapType) {
        super(name, serialId, description);
        this.magicOrTrap = magicOrTrap;
        this.magicOrTrapType = magicOrTrapType;
    }

    public Enum getMagicOrTrap() {
        return magicOrTrap;
    }

    public void setMagicOrTrap(Enum magicOrTrap) {
        this.magicOrTrap = magicOrTrap;
    }

    public Enum getMagicOrTrapType() {
        return magicOrTrapType;
    }

    public void setMagicOrTrapType(Enum magicOrTrapType) {
        this.magicOrTrapType = magicOrTrapType;
    }

    public void executeEffect() {};
}
