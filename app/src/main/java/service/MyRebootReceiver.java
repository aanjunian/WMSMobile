package service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyRebootReceiver extends BroadcastReceiver{

	@Override
	public void onReceive(Context context, Intent intent) {
		Intent serviceIntentMyServiceNative = new Intent(context, WMSMobileService.class);
        context.startService(serviceIntentMyServiceNative);
	}
}
