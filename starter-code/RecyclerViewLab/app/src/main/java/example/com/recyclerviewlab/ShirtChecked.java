package example.com.recyclerviewlab;

/**
 * Created by sunil on 7/5/16.
 */
public class ShirtChecked {
    String mTitle, mDescription, mColor;
    boolean mIsSelected;

    public ShirtChecked(){
        mTitle = "Shirt";
        mDescription = "For upper torso.";
        mColor = "black";
        mIsSelected = false;
    }

    public ShirtChecked(String title, String desc, String colo, boolean b){
        mTitle = title;
        mDescription = desc;
        mColor = colo;
        mIsSelected = b;
    }

    public String getTitle(){return mTitle;}
    public String getDescription(){return mDescription;}
    public String getColor(){return mColor;}
    public boolean getIsSelected(){return mIsSelected;}
    public void setTitle(String s){mTitle = s;}
    public void setDescription(String s ){mDescription = s;}
    public void setColor(String s){mColor = s;}
    public void setisSelected(boolean b){mIsSelected = b;}
}
