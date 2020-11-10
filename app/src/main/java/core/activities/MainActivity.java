package core.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import core.Invokable;
import core.Traceable;

public class MainActivity extends TraceableActivity implements Invokable {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // !IMPORTANT! This line should be first.
        setContentView(R.layout.main);

        Button goToButton = findViewById(R.id.goToSecondaryButton);
        goToButton.setOnClickListener(self -> startActivity(new SecondaryActivity().getIntent(this)));
        Button searchButton = findViewById(R.id.searchForActivities);
        // implicit activity invocation
        searchButton.setOnClickListener(self -> startActivity(
                new Intent(ActivitiesConstants.CUSTOM_ACTION)
                        .putExtra(ActivitiesConstants.SOME_PARAM, "Some param's value")
                        .putExtra(ActivitiesConstants.ANOTHER_PARAM, "Another param's value")
        ));

    }
}