package com.fearlessbear.jira.Editor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import com.fearlessbear.jira.R;

public class CancelTouchTargetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cancel_touch_target);
        final ViewGroup parent = (ViewGroup) findViewById(R.id.parent);
        findViewById(R.id.edittext).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                parent.removeView(v);
            }
        });
    }
}
