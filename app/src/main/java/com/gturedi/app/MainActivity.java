package com.gturedi.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.gturedi.views.CustomStateOptions;
import com.gturedi.views.StatefulLayout;

/**
 * Created by gturedi on 17.02.2017.
 */
public class MainActivity
        extends AppCompatActivity {

    private StatefulLayout stateful;

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "click!", Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        stateful = (StatefulLayout) findViewById(R.id.stateful);
    }

    public void content(View view) {
        stateful.showContent();
    }

    public void loading(View view) {
        //stateful.showLoading();
        //stateful.showLoading(R.string.testMessage);
        stateful.showLoading(getString(R.string.testMessage));
    }

    public void empty(View view) {
        //stateful.showEmpty();
        //stateful.showEmpty(R.string.testMessage);
        stateful.showEmpty(getString(R.string.testMessage));
    }

    public void error(View view) {
        //stateful.showError(clickListener);
        //stateful.showError(R.string.testMessage, clickListener);
        stateful.showError(getString(R.string.testMessage), clickListener);
    }

    public void offline(View view) {
        //stateful.showOffline(clickListener);
        //stateful.showOffline(R.string.testMessage, clickListener);
        stateful.showOffline(getString(R.string.testMessage), clickListener);
    }

    public void locationOff(View view) {
        //stateful.showLocationOff(clickListener);
        //stateful.showLocationOff(R.string.testMessage, clickListener);
        stateful.showLocationOff(getString(R.string.testMessage), clickListener);
    }

    public void custom(View view) {
        //stateful.showCustom(new CustomStateOptions());
        //stateful.showCustom(new CustomStateOptions().image(R.drawable.ic_bluetooth_disabled_black_24dp));
        //stateful.showCustom(new CustomStateOptions().image(R.drawable.ic_bluetooth_disabled_black_24dp).message("please open bluetooth"));
        //stateful.showCustom(new CustomStateOptions().message("hey yow!"));
        //stateful.showCustom(new CustomStateOptions().message("hey yow!").buttonAction(clickListener));
        stateful.showCustom(new CustomStateOptions()
                .image(R.drawable.ic_bluetooth_disabled_black_24dp)
                .message("please open bluetooth")
                .buttonText("settings")
                .buttonClickListener(clickListener));
    }

}
