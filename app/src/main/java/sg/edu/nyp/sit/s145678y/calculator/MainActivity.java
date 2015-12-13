package sg.edu.nyp.sit.s145678y.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    Menu myMenu = null;
    int subMenuBase = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.myMenu = menu;
        addRegularMenuItems(menu);

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    private void addRegularMenuItems(Menu menu) {
        int index = Menu.FIRST;
        menu.add(index, index, index, "About");
        menu.add(index, index + 1, index + 1, "Memory List");
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == 1) {
            //intent to about page
        }
        else if (id == 2) {
            //intent to memory page
        }

        return super.onOptionsItemSelected(item);
    }
}
