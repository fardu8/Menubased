package com.example.menubased;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);
        TextView textView1= findViewById(R.id.textView2);
        registerForContextMenu(textView1);
        registerForContextMenu(textView);
    }

    public void showpopup(View view)
    {
        PopupMenu popupMenu = new PopupMenu(this,view);
        popupMenu.setOnMenuItemClickListener(this);
        popupMenu.inflate(R.menu.popup_menu);
        popupMenu.show();
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        switch (v.getId())
        {
            case R.id.textView:
                getMenuInflater().inflate(R.menu.example1_menu,menu);
                break;
            case R.id.textView2:
                getMenuInflater().inflate(R.menu.example1_menu,menu);
                break;
        }

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.option1:
                Toast.makeText(this,"option 1 selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.option2:
                Toast.makeText(this,"option 2 selected",Toast.LENGTH_SHORT).show();
                return true;
                default:return super.onContextItemSelected(item);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater= getMenuInflater();
        inflater.inflate(R.menu.example_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.item1:
                Toast.makeText(this,"item 1 selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item2:
                Toast.makeText(this,"item 2 selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item3:
                Toast.makeText(this,"item 3 selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.subitem1:
                Toast.makeText(this,"subitem 1 selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.subitem2:
                Toast.makeText(this,"subitem 2 selected",Toast.LENGTH_SHORT).show();
                return true;
            default:return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId())
        {
            case R.id.popup1:
                Toast.makeText(this,"popup 1 clicked",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.popup2:
                Toast.makeText(this,"popup 2 clicked",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.popup3:
                Toast.makeText(this,"popup 3 clicked",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.popup4:
                Toast.makeText(this,"popup 4 clicked",Toast.LENGTH_SHORT).show();
                return true;
                default: return false;

        }
    }
}
