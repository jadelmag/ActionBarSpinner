package tabbed.actionbarspinner.xu.com.actionbarspinner;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements ActionBar.OnNavigationListener {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.textView);

        ActionBar actionBar = getSupportActionBar();

        //crear el spinner
        SpinnerAdapter adapter = ArrayAdapter.createFromResource(this, R.array.list, android.R.layout.simple_spinner_dropdown_item);
        actionBar.setListNavigationCallbacks(adapter, this);

        //mostrar el spinner
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);
    }

    @Override
    public boolean onNavigationItemSelected(int i, long l) {
        switch (i) {
            case 0:
                text.setText("Option selected:\n\nMonday");
                break;
            case 1:
                text.setText("Option selected:\n\nTuesday");
                break;
            case 2:
                text.setText("Option selected:\n\nWednesday");
                break;
            case 3:
                text.setText("Option selected:\n\nThursday");
                break;
            case 4:
                text.setText("Option selected:\n\nFriday");
                break;
            case 5:
                text.setText("Option selected:\n\nSaturday");
                break;
            case 6:
                text.setText("Option selected:\n\nSunday");
                break;
        }
        return false;
    }
}
