package example.com.recyclerviewlab;

/**
 * Created by sunil on 7/5/16.
 */

public class Shirt {
//... shirts because shirts.
    String mTitle, mDescription, mColor;

    public Shirt(){
        mTitle = "Shirt";
        mDescription = "For upper torso.";
        mColor = "black";
    }

    public Shirt(String title, String desc, String colo){
        mTitle = title;
        mDescription = desc;
        mColor = colo;
    }

    public String getTitle(){return mTitle;}
    public String getDescription(){return mDescription;}
    public String getColor(){return mColor;}
    public void setTitle(String s){mTitle = s;}
    public void setDescription(String s ){mDescription = s;}
    public void setColor(String s){mColor = s;}

}
