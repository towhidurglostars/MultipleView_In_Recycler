package com.towhid.multi_recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerAdapter recyclerAdapter;
private RecyclerView rec_photo;
private ArrayList<Photo> photoArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rec_photo =(RecyclerView)findViewById(R.id.rec_photo);
        photoArrayList=new ArrayList<Photo>();
        recyclerAdapter=new RecyclerAdapter(this,photoArrayList);
        rec_photo.setLayoutManager(new LinearLayoutManager(this));
        rec_photo.setAdapter(recyclerAdapter);

        photoArrayList.add(new Photo("https://i.pinimg.com/736x/1e/21/33/1e21337b0b6bc39d5e0fedbccf9b76b9.jpg"));
        photoArrayList.add(new Photo("https://i.pinimg.com/originals/a7/91/5e/a7915ea590195829ed7e09160b4f4e45.jpg","Dollify"));
        photoArrayList.add(new Photo("https://i.pinimg.com/originals/a7/91/5e/a7915ea590195829ed7e09160b4f4e45.jpg","Dollify"));
        photoArrayList.add(new Photo("https://i.pinimg.com/736x/1e/21/33/1e21337b0b6bc39d5e0fedbccf9b76b9.jpg"));
        photoArrayList.add(new Photo("https://i.pinimg.com/originals/a7/91/5e/a7915ea590195829ed7e09160b4f4e45.jpg","Dollify"));
        photoArrayList.add(new Photo("https://i.pinimg.com/736x/1e/21/33/1e21337b0b6bc39d5e0fedbccf9b76b9.jpg"));
        photoArrayList.add(new Photo("https://i.pinimg.com/736x/1e/21/33/1e21337b0b6bc39d5e0fedbccf9b76b9.jpg"));
        photoArrayList.add(new Photo("https://i.pinimg.com/736x/1e/21/33/1e21337b0b6bc39d5e0fedbccf9b76b9.jpg"));
        recyclerAdapter.notifyDataSetChanged();
    }
}