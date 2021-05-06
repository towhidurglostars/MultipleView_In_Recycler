package com.towhid.multi_recycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter {
    private Context context;
    private ArrayList<Photo> mData;

    public RecyclerAdapter(Context context, ArrayList<Photo> mData) {
        this.context = context;
        this.mData = mData;
    }

    @Override
    public int getItemViewType(int position) {
        if (mData.get(position).getTitle() == null) {
            return 1;
        }
        return 2;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view;
        if (viewType == 1) {
            view = layoutInflater.inflate(R.layout.item_one, parent, false);
            return new ViewHolderOne(view);
        }
        view = layoutInflater.inflate(R.layout.item_two, parent, false);
        return new ViewHolderTwo(view);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (mData.get(position).getTitle() == null) {
            //bind view holder one
            ViewHolderOne viewHolderOne= (ViewHolderOne) holder;

            Picasso.get().load(mData.get(position).getPhotoUrl()).into(viewHolderOne.iv_photo);
        } else {
            //bind view holder two
            ViewHolderTwo viewHolderTwo= (ViewHolderTwo) holder;
            //viewHolderOne.iv_photo
            Picasso.get().load(mData.get(position).getPhotoUrl()).into(viewHolderTwo.iv_photo);
            viewHolderTwo.tv_title.setText(mData.get(position).getTitle());
        }
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    private class ViewHolderOne extends RecyclerView.ViewHolder {
        ImageView iv_photo;

        public ViewHolderOne(@NonNull View itemView) {
            super(itemView);
            iv_photo = (ImageView) itemView.findViewById(R.id.iv_photo);
        }
    }

    private class ViewHolderTwo extends RecyclerView.ViewHolder {
        ImageView iv_photo;
        TextView tv_title;

        public ViewHolderTwo(@NonNull View itemView) {
            super(itemView);
            iv_photo = (ImageView) itemView.findViewById(R.id.iv_photo);
            tv_title = (TextView) itemView.findViewById(R.id.tv_text);

        }
    }
}
