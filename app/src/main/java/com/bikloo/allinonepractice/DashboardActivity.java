package com.bikloo.allinonepractice;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DashboardActivity extends AppCompatActivity {

    ActionBar ab;
    public static void startActivity(Context context)
    {
        Intent i = new Intent(context, DashboardActivity.class);
        context.startActivity(i);
    }
    public static void startActivity(Context context, Bundle bundle)
    {
        Intent i = new Intent(context, DashboardActivity.class);

        i.putExtras(bundle);
        context.startActivity(i);
    }
    ListView lv;
    private String[] valuesForList = {"First Item","Second Item","Using This Strategy","You can have any number of items"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        ab = getSupportActionBar();
        ab.setTitle("Dashboard");
        ab.setDisplayHomeAsUpEnabled(true);
        ab.setDisplayShowHomeEnabled(true);
        ((TextView)findViewById(R.id.txtWelcome)).setText("Welcome, "+getIntent().getStringExtra("email"));

        lv = (ListView) findViewById(R.id.listForItems);

        ListAdapter adapter = new ArrayAdapter<String>(DashboardActivity.this, android.R.layout.simple_list_item_1, valuesForList);

        lv.setAdapter(adapter);
    }
}
