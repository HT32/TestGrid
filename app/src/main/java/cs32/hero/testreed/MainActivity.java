package cs32.hero.testreed;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private String[] mHueArray = {
            "0", "1", "2", "3",
            "4", "5", "6", "7"
    };

    private Integer[] mHueIdArray = {
            R.drawable.ringo0,
            R.drawable.ringo1,
            R.drawable.ringo2,
            R.drawable.ringo3,
            R.drawable.ringo4,
            R.drawable.ringo5,
            R.drawable.ringo6,
            R.drawable.ringo7,
            R.drawable.ringo8
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = (GridView) findViewById(R.id.gridview);
        gridView.setAdapter(new HueAdapter(this, mHueArray, mHueIdArray));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                Toast.makeText(MainActivity.this, "" + position, Toast.LENGTH_SHORT).show();
            }
        });

    }

}
