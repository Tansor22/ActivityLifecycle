package core.activities;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import core.Traceable;

public abstract class TraceableActivity extends AppCompatActivity implements Traceable {


    /**
     * Called once, during the activity creation.
     *
     * @param savedInstanceState Some initialization data.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        trace("%s has been created...", getTag());
    }

    /**
     * Called before user sees the activity.
     */
    @Override
    protected void onStart() {
        super.onStart();
        trace("%s has been started...", getTag());
    }

    /**
     * Called before user can interact with the activity.
     */
    @Override
    protected void onResume() {
        super.onResume();
        trace("%s has been resumed...", getTag());
    }

    /**
     * Called before {@link #onStart()}, if the activity is recovered from state <b>Stopped<b/>.
     */
    @Override
    protected void onRestart() {
        super.onRestart();
        trace("%s has been restarted...", getTag());
    }

    /**
     * Called before another activity is shown.
     */
    @Override
    protected void onPause() {
        super.onPause();
        trace("%s has been paused...", getTag());
    }

    /**
     * Called before the activity is unseen for user.
     */
    @Override
    protected void onStop() {
        super.onStop();
        trace("%s has been stopped...", getTag());
    }

    /**
     * Called before the activity is destroyed.
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        trace("%s has been destroyed...", getTag());
    }
}
