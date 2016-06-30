package com.bradbumbalough.twilioipmessaging;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class RCTTwilioIPMessaging implements ReactPackage {
    @Override
    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.emptyList();
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }

    @Override
    public List<NativeModule> createNativeModules(
            ReactApplicationContext reactContext) {
        List<NativeModule> modules = new ArrayList<>();

        modules.add(new RCTTwilioAccessManager(reactContext));
        modules.add(new RCTTwilioIPMessagingClient(reactContext));
        modules.add(new RCTTwilioIPMessagingChannels(reactContext));
        modules.add(new RCTTwilioIPMessagingMembers(reactContext));
        modules.add(new RCTTwilioIPMessagingMessages(reactContext));

        return modules;
    }
}
