package com.albert.testrp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.qihoo360.replugin.RePlugin;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*启动插件的Activity*/
        RePlugin.startActivity(MainActivity.this, RePlugin.createIntent("plugin01", "com.fxj.replugintest01_plugin01.MainActivity"));
    }
}
