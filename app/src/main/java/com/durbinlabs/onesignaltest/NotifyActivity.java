package com.durbinlabs.onesignaltest;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.durbinlabs.onesignaltest.databinding.ActivityNotifyBinding;

public class NotifyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityNotifyBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_notify);

        String result = getIntent().getStringExtra("result");
        binding.tvDetails.setText(result);
    }
}
