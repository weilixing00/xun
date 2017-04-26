package com.example.server.myapplication.base;

import android.app.Application;

import me.yokeyword.fragmentation.Fragmentation;

/**
 * Created by server on 2017/4/25.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //         栈视图功能，大大降低Fragment的开发难度，建议在Application里初始化
        Fragmentation.builder()
                // 显示悬浮球 ; 其他Mode:SHAKE: 摇一摇唤出   NONE：隐藏
                .stackViewMode(Fragmentation.BUBBLE)
                .install();
    }
}
