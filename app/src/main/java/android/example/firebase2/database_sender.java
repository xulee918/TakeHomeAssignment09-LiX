package android.example.firebase2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Date;

public class database_sender extends AppCompatActivity {

    private FirebaseDatabase database=FirebaseDatabase.getInstance();
    private DatabaseReference pokemonRef=database.getReference("Pokemon");
    private DatabaseReference pokemonsRef=database.getReference("Multiple pokemon");
    private DatabaseReference dateReference=database.getReference("date");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database_sender);

            }

            public void set(View view){pokemonRef.setValue(new Pokemon("Charmander",2,false));}

            public void add(View view){pokemonsRef.push().setValue(new Pokemon("Charizard",8,true));}

}
