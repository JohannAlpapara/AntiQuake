package ph.edu.apc.antiquakeprototype;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Welcomeactivity extends AppCompatActivity implements View.OnClickListener
{
    LinearLayout layout1;
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        layout1 = (LinearLayout) findViewById(R.id.layout1);
        layout1.setOnClickListener(this);
    }
    public void onClick(View v){
        Toast.makeText(this,"Switching to main",
                Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,AntiquakeMainActivity.class);
        startActivity(intent);
        //finish(); end activity
        //id for the button
    }
}

