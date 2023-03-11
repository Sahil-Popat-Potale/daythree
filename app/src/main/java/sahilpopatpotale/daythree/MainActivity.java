package sahilpopatpotale.daythree;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button_play;
    Button button_stop;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_play=findViewById(R.id.button_play);
        button_stop=findViewById(R.id.button_stop);

        mediaPlayer=MediaPlayer.create(MainActivity.this,R.raw.sasa);

        button_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        button_play.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                mediaPlayer.start();
                Toast.makeText(MainActivity.this, "Starting", Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        button_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Stopped", Toast.LENGTH_SHORT).show();
                mediaPlayer.stop();
            }
        });
    }
}