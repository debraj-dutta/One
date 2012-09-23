package com.simple.one;

import android.app.Activity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {
String MSG ="";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void btn1Clk(View v){
    	
    	createDB("one.db");
//    	createTBL("one");
//    	insertValue();

   Toast.makeText(getApplicationContext(),  MSG, Toast.LENGTH_LONG).show();
    }
    
    public void createDB(String DBNAME){
    	
    Context c;
    c = this.getApplicationContext();
    	SQLiteDatabase db = c.openOrCreateDatabase(DBNAME, Context.MODE_PRIVATE,null);
    	MSG = MSG + "DB created/opened.";
    }
}
