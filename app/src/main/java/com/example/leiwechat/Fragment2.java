package com.example.leiwechat;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;


public class Fragment2 extends Fragment {


    private RecyclerView recyclerView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view;
        view=inflater.inflate(R.layout.fragment_2,container,false);
        recyclerView=view.findViewById(R.id.rec);
        List<String> list=new ArrayList<>();
        for(int i=1;i<21;i++)
        {
            list.add("这是第"+i+" 个列表");
        }
        Context context=getContext();
        Myadapter adapter =new Myadapter(context,list);
        LinearLayoutManager layoutManager =new LinearLayoutManager(context);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        return view;
    }
    
}