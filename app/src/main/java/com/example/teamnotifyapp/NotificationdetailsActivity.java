package com.example.teamnotifyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.teamnotifyapp.databinding.ActivityNotificationdetailsBinding;

public class NotificationdetailsActivity extends AppCompatActivity {
    ActivityNotificationdetailsBinding detailsBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_notificationdetails);
        detailsBinding = ActivityNotificationdetailsBinding.inflate(getLayoutInflater());
        View view = detailsBinding.getRoot();
        setContentView(view);
        init();
    }

    private void init(){
        Log.i("info","In init");
        Intent notificationIntent = getIntent();
        String attendees = notificationIntent.getStringExtra("ATTENDEES");
        String location = notificationIntent.getStringExtra("LOCATION");
        Log.i("info",attendees);
        detailsBinding.txtAttendees.setText(attendees);
        detailsBinding.txtLocation.setText(location);
    }
}