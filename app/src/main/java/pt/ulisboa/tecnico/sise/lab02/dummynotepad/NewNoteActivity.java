package pt.ulisboa.tecnico.sise.lab02.dummynotepad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class NewNoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_note);

        Log.d("NotePadApp", "This is my first message");

        final Button button = (Button) findViewById(R.id.ok_button);
        button.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                // modo como vamos buscar os vários elementos que necessitamos
                EditText editText = (EditText) findViewById(R.id.editText);
                //é equivalente ao sysout
                Log.d("NotePadApp", editText.getText().toString());

                TextView textView = (TextView) findViewById(R.id.textView);
                Log.d("NotePadApp", textView.getText().toString());

                //after creating a button we might want to change its name
                button.setText(editText.getText().toString());

                //small pop Up
                Toast.makeText(v.getContext(), "Hi!", Toast.LENGTH_SHORT).show();

            }
        });
    };
}


