package Model;

/**
 * Created by ryan_gross on 5/7/17.
 */
public abstract class Card {

    String name;
    String serialId;
    String description;
    // PENDING
    /* Image image */

    public Card(String name, String serialId, String description) {
        this.name = name;
        this.serialId = serialId;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerialId() {
        return serialId;
    }

    public void setSerialId(String serialId) {
        this.serialId = serialId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
