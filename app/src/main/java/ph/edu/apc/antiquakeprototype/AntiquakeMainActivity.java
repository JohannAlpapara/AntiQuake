package ph.edu.apc.antiquakeprototype;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class AntiquakeMainActivity extends AppCompatActivity implements View.OnClickListener{

    Button button;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_antiquake_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);

    }
    public void onClick(View v){
        Toast.makeText(this,"Switching to content",
                Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,ContentActivity.class);
        startActivity(intent);
        //finish(); end activity
        //id for the button
    }
}
