package core.activities;

import android.content.Intent;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import core.Invokable;
import core.Traceable;

public class SecondaryActivity extends TraceableActivity implements Invokable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondary);

        LinearLayout root = findViewById(R.id.centerRoot);
        root.addView(getTextView());

        Button goToButton = findViewById(R.id.goToMainButton);
        goToButton.setOnClickListener(self -> finish());
    }

    protected TextView getTextView() {
        TextView textView = new TextView(this);
        textView.setText(getTag() + ": Some activity with custom action." +
                "\n\nAction is: " + getIntent().getAction() +
                "\n\nParams are: " + getParamsInfo(getIntent()));
        return textView;
    }

    protected String getParamsInfo(Intent intent) {
        String[] params = new String[]{
                intent.getStringExtra(ActivitiesConstants.SOME_PARAM),
                intent.getStringExtra(ActivitiesConstants.ANOTHER_PARAM),
        };
        return String.join(", ", params);
    }

}