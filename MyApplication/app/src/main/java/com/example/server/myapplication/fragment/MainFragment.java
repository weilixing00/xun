package com.example.server.myapplication.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.server.myapplication.R;

import me.yokeyword.fragmentation.SupportFragment;

/**
 * Created by server on 2017/4/25.
 */

public class MainFragment extends SupportFragment {

    public static SupportFragment newInstance() {
        MainFragment fragment=new MainFragment();

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_main,container,false);
        return view;

    }
}
