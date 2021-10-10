// ReactNativeToastyModule.java

package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import android.widget.Toast;

public class ReactNativeToastyModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    private int duration = Toast.LENGTH_SHORT;

    public ReactNativeToastyModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "Toasty";
    }

    @ReactMethod
    public void sampleMethod(String stringArgument, int numberArgument, Callback callback) {
        // TODO: Implement some actually useful functionality
        callback.invoke("Received numberArgument: " + numberArgument + " stringArgument: " + stringArgument);
    }

    @ReactMethod
    public void toast(String message){
        Toast.makeText(reactContext, message, duration).show();
    }

    @ReactMethod
    public void setDuration(int duration) {
        this.duration = duration;
    }
}
