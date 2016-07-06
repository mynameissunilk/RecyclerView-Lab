package example.com.recyclerviewlab;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by sunil on 7/5/16.
 */
public class ShirtViewHolder extends RecyclerView.ViewHolder {

    TextView mTextTop, mTextBot;

    public ShirtViewHolder(View itemView){

        super(itemView);

        mTextTop = (TextView) itemView.findViewById(R.id.textview1_top);
        mTextBot = (TextView) itemView.findViewById(R.id.textview1_bot);
    }
}
