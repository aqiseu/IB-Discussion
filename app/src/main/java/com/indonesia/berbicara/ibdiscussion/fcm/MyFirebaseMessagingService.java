package com.indonesia.berbicara.ibdiscussion.fcm;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by aqiseu on 11/26/2017.
 */

public class MyFirebaseMessagingService extends FirebaseMessagingService

    {

            private static final String TAG = "MyFMService";

            @Override
            public void onMessageReceived(RemoteMessage remoteMessage) {
                    // Handle data payload of FCM messages.
                    Log.d(TAG, "FCM Message Id: " + remoteMessage.getMessageId());
                    Log.d(TAG, "FCM Notification Message: " +
                    remoteMessage.getNotification());
                    Log.d(TAG, "FCM Data Message: " + remoteMessage.getData());
                    }
        }