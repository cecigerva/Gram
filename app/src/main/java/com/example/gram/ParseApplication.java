package com.example.gram;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("AZoZgcN3HMimihtMe1eyojkw6kqv55BLLRhEEjTF")
                .clientKey("gcIt9bgkE0EjfR18Lvw5CytiXunUnKVEu7PEG9xW")
                .server("https://parseapi.back4app.com")
                .build()
        );

    }
}
