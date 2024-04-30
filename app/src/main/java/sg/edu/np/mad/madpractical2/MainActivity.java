package sg.edu.np.mad.madpractical2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.Header), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        User userJohn = new User("John Doe","MAD Developer",1, false);

        //display user info (name and desc) in labels
        TextView headerTextView = findViewById(R.id.Header);
        headerTextView.setText(userJohn.name);

        TextView bodyTextView = findViewById(R.id.BodyText);
        bodyTextView.setText(userJohn.description);

        //get buttons and define listeners
        Button followBtn = findViewById(R.id.FollowBtn);
        followBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userJohn.followed = (!userJohn.followed);
                if (userJohn.followed){
                    followBtn.setText("UNFOLLOW");
                } else {
                    followBtn.setText("FOLLOW");
                }
            }
        });

    }



}