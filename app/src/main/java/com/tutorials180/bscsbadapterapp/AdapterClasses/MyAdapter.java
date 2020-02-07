package com.tutorials180.bscsbadapterapp.AdapterClasses;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.tutorials180.bscsbadapterapp.ModelClasses.ContactModel;
import com.tutorials180.bscsbadapterapp.R;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter<ContactModel> {

    private Context context;
    private ArrayList<ContactModel> objectArrayList;

    public MyAdapter(@NonNull Context context, ArrayList<ContactModel> objectArrayList) {
        super(context, R.layout.single_row,objectArrayList);
        this.context=context;

        this.objectArrayList=objectArrayList;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //Step 1-- Get Layout from xml to java
        View singleRow=LayoutInflater.from(parent.getContext())
                .inflate(R.layout.single_row,parent,false);

        //Step 2- Creating Java Views for XML views
        TextView nameTV,emailTV;
        ImageView avatarLink;

        nameTV=singleRow.findViewById(R.id.singleRow_nameTV);
        emailTV=singleRow.findViewById(R.id.singleRow_emailTV);

        avatarLink=singleRow.findViewById(R.id.singleRow_IV);

        //Step 3 Map data to Java Views
        nameTV.setText(objectArrayList.get(position).getNameOfUser());
        emailTV.setText(objectArrayList.get(position).getEmailOfUser());

        avatarLink.setImageResource(objectArrayList.get(position).getLinkToAvatar());
        return singleRow;
    }
}
