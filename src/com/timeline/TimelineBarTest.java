package com.timeline;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TimelineBarTest extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
    
}
