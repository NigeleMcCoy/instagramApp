package com.example.instagramapp;

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
                .applicationId("XZMfYUCMBbIUGHtoqvmRxFKeAFUAbV1E1gDgAshn")
                .clientKey("SMQynLrv5RHQlnK0phVyozRzulpvZDfsUwsZtXa6")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
