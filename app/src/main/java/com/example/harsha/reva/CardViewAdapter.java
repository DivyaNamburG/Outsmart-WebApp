package com.example.harsha.reva;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;



import java.util.ArrayList;


public class CardViewAdapter extends RecyclerView.Adapter<CardViewAdapter.ExampleViewHolder> {
    private Context mContext;
    private ArrayList<CardViewItems> CardViewList;

    public CardViewAdapter(Context context, ArrayList<CardViewItems> exampleList) {
        mContext = context;
        CardViewList = exampleList;
    }

    @Override
    public ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.cardview_ppt, parent, false);
        return new ExampleViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ExampleViewHolder holder, int position) {
        CardViewItems currentItem = CardViewList.get(position);

        String title = currentItem.getTitle();
        String creatorName = currentItem.getUploadBy();
        String uploadon = currentItem.getUploadOn();
        int uniton = currentItem.getUnitNo();

        holder.mTextViewCreator.setText("Uploaded By : "+creatorName);
        holder.munitNo.setText("Unit No: " + uniton);
        holder.mTitle.setText(title);
        holder.mUploadOn.setText("Uploaded On: "+uploadon);

    }

    @Override
    public int getItemCount() {
        return CardViewList.size();
    }

    public class ExampleViewHolder extends RecyclerView.ViewHolder {
        public TextView mTitle;
        public TextView mTextViewCreator;
        public TextView mUploadOn;
        public TextView munitNo;

        public ExampleViewHolder(View itemView) {
            super(itemView);
            mTitle = (TextView) itemView.findViewById(R.id.title_ppt);
            mTextViewCreator = (TextView) itemView.findViewById(R.id.upload_by_ppt);
            mUploadOn = (TextView) itemView.findViewById(R.id.upload_on_ppt);
            munitNo = (TextView) itemView.findViewById(R.id.unit_no_ppt);
        }
    }
}