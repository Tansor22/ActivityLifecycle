package core;

import android.content.Context;
import android.content.Intent;

public interface Invokable {
     default Intent getIntent(Context context) {
        return new Intent(context, this.getClass());
    }
}
