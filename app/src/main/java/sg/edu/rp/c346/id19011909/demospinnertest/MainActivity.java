package sg.edu.rp.c346.id19011909.demospinnertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Creating Variable,
    Spinner spnYesNo;
    TextView TV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Linking Variable,
        spnYesNo = findViewById(R.id.spinner);
        TV = findViewById(R.id.textView);

        //Setting Action,
        spnYesNo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        if(spnYesNo.getSelectedItem().equals("Yes"))
                        {
                            TV.setText("  Spinner Item, Yes Selected");
                        }
                        break;

                    case 1:
                        if(spnYesNo.getSelectedItem().equals("No"))
                        {
                            TV.setText("  Spinner Item, No Selected");
                        }
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}