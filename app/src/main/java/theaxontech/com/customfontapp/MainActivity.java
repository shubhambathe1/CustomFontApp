package theaxontech.com.customfontapp;

import android.graphics.Typeface;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textViewTemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    private void changeFonts(int fontResourceId) {

        textViewTemp = findViewById(R.id.textViewTemp);

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {

            Typeface typeface = getResources().getFont(fontResourceId);
            textViewTemp.setTypeface(typeface);

        } else {

            //For Backward Compatibility
            Typeface typeface = ResourcesCompat.getFont(getApplicationContext(), fontResourceId);
            textViewTemp.setTypeface(typeface);

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.font1:
                changeFonts(R.font.beautiful);
                Toast.makeText(this, "FONT BEAUTIFUL SELECTED", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.font2:
                changeFonts(R.font.cassandra);
                Toast.makeText(this, "FONT CASSANDRA SELECTED", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.font3:
                changeFonts(R.font.graceland);
                Toast.makeText(this, "FONT GRACELAND SELECTED", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.font4:
                changeFonts(R.font.greatday);
                Toast.makeText(this, "FONT GREAT-DAY SELECTED", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.font5:
                changeFonts(R.font.sfprodisplayregular);
                Toast.makeText(this, "FONT SAN-FRANCISCO SELECTED", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.font6:
                changeFonts(R.font.sensation);
                Toast.makeText(this, "FONT SENSATION SELECTED", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
