package example.com.recyclerviewlab;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by sunil on 7/5/16.
 */
public class ShirtViewAdapter extends RecyclerView.Adapter<ShirtViewHolder> {

    List<Shirt> mShirtList;

    public ShirtViewAdapter(List<Shirt> shirtlist){
        mShirtList = shirtlist;
    }

    @Override
    public ShirtViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View parentView = inflater.inflate(R.layout.activity_main,parent, false);
        ShirtViewHolder viewHolder = new ShirtViewHolder(parentView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ShirtViewHolder holder, int position) {
        Shirt shirtRef = mShirtList.get(position);
        holder.mTextTop.setText(shirtRef.mTitle);
        holder.mTextBot.setText(shirtRef.mDescription);
    }

    @Override
    public int getItemCount() {
        return mShirtList.size();
    }
}
