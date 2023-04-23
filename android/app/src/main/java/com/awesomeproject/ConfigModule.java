package com.awesomeproject;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import java.util.HashMap;
import java.util.Map;

public class ConfigModule extends ReactContextBaseJavaModule {
    String baseUrl;
    String env;
    ConfigModule(ReactApplicationContext context){
        super(context);
        baseUrl = context.getResources().getString(R.string.base_url);
        env = context.getResources().getString(R.string.BUILD_ENV);
    }

    @Nullable
    @Override
    public Map<String, Object> getConstants() {
       final Map<String,Object> obj = new HashMap<>();
       obj.put("BASE_URL",baseUrl);
       obj.put("BUILD_ENV",env);
       return obj;
    }

    @NonNull
    @Override
    public String getName() {
        return "ConfigModule";
    }
}
