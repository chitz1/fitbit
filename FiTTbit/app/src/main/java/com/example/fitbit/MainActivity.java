package com.example.fitbit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyListData[] myListData = new MyListData[] {
                new MyListData("Email", android.R.drawable.ic_dialog_email),
                new MyListData("Info", android.R.drawable.ic_dialog_info),
                new MyListData("Delete", android.R.drawable.ic_delete),
                new MyListData("Dialer", android.R.drawable.ic_dialog_dialer),
                new MyListData("Alert", android.R.drawable.ic_dialog_alert),

        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        MyListAdapter adapter = new MyListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
