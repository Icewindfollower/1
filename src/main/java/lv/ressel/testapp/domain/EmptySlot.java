package lv.ressel.testapp.domain;

/**
 * Created by nikolay.ressel on 13.11.14.
 */
public class EmptySlot extends Creature {
    /*public  EmptySlot() {
        this.url ="/test-mvn-app/resources/images/Enchanter.jpg";
    }*/
    private String url="/test-mvn-app/resources/images/EmptySlot.jpg";

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
