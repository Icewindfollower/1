package lv.ressel.testapp.domain;


import java.util.HashMap;

/**
 * Created by nikolay.ressel on 05.11.14.
 */
public class SlotInfo {
    private Creature creature;
    private Integer slotNumber;
    private String url;

    public String getUrl(Creature creature) {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(Integer slotNumber) {
        this.slotNumber = slotNumber;
    }

    public Creature getCreature() {

        return creature;
    }

    public void setCreature(Creature creature) {
        this.creature = creature;
    }
}
