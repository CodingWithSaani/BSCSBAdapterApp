package com.tutorials180.bscsbadapterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.tutorials180.bscsbadapterapp.AdapterClasses.MyAdapter;
import com.tutorials180.bscsbadapterapp.ModelClasses.ContactModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView objectListView;
    private ArrayList<ContactModel> objectArrayList;
    private MyAdapter objectMyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeObjects();
        createObjects();
    }

    private void createObjects()
    {
        try
        {
            objectArrayList.add(new ContactModel("Nova","n@yahoo.com"
                    ,R.drawable.m_one));
            objectArrayList.add(new ContactModel("Julia","j@yahoo.com"
                    ,R.drawable.fm_one));
            objectArrayList.add(new ContactModel("Hamza","H@yahoo.com"
                    ,R.drawable.m_two));

            objectArrayList.add(new ContactModel("Ali","a@yahoo.com"
                    ,R.drawable.m_three));
            objectArrayList.add(new ContactModel("Nova","n@yahoo.com"
                    ,R.drawable.m_four));
            objectArrayList.add(new ContactModel("Nova","n@yahoo.com"
                    ,R.drawable.m_five));

            objectMyAdapter=new MyAdapter(this,objectArrayList);
            objectListView.setAdapter(objectMyAdapter);
        }
        catch (Exception e)
        {
            Toast.makeText(this, "createObjects:"
                    +
                    e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    private void initializeObjects()
    {
        try
        {
            objectListView=findViewById(R.id.LV);
            objectArrayList=new ArrayList<>();
        }
        catch (Exception e)
        {
            Toast.makeText(this, "initializeObjects:"
                    +e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}
