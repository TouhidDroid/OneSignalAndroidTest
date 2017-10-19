package com.durbinlabs.onesignaltest;

import android.content.Intent;
import android.util.Log;

import com.onesignal.NotificationExtenderService;
import com.onesignal.OSNotificationReceivedResult;

/**
 * Created by touhid on 10/19/2017.
 * bismillah :)
 */

public class NotifExtenderService extends NotificationExtenderService {
    private static final String TAG = NotifExtenderService.class.getSimpleName();

    @Override
    protected boolean onNotificationProcessing(OSNotificationReceivedResult receivedResult) {
        // Read properties from result.
        Log.d(TAG, "onNotificationProcessing : receivedResult = " + receivedResult);
        Intent intent = new Intent(this, NotifyActivity.class);
        intent.putExtra("result", receivedResult.payload.body);
        startActivity(intent);

        // Return true to stop the notification from displaying.
        return true;
    }
}
