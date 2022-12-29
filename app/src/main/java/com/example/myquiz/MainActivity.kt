package com.example.myquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // return super.onCreateOptionsMenu(menu)
       // getmenuInflater().inflate(R.menu.main_menu,menu)
       // return true
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        //
        getMenuInflater().inflate(R.menu,main_menu,menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        int id = item.getItemId()
        if (id==R.id.item_done){
            Toast.makeText(getApplicationContext(),text: "done",Toast.Length_Short).show()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main)
    }
}