package com.ansen.jnitest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JNITest jniTest=new JNITest();

        TextView tvResult= (TextView) findViewById(R.id.tv_result);
        tvResult.setText("运行结果:"+jniTest.plus(100,10));
    }

    static {
        //libname就是我们在app/build.gradle中moduleName的值
        System.loadLibrary("mylib");
    }
}
