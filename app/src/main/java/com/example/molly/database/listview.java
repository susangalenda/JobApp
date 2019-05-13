package com.example.molly.database;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class listview extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        String[] foods = {"muduwa joanina", "galenda suzan", "mad joseylin", "movie emmanuel", "mad ivan", "mad robert"};
        ListAdapter buckysAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, foods);
        ListView madandasListView = (ListView) findViewById(R.id.madandasListview);
        madandasListView.setAdapter(buckysAdapter);

        madandasListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String food = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(listview.this, food, Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

}

