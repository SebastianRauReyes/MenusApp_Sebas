package com.sebastian.menusapp_sebas;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment1Activity extends Fragment {

    private static final String TAG = Fragment1Activity.class.getSimpleName();

    public Fragment1Activity() {
    }

    //----------------------------------------------------------------------------------------------------------------------------
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate");
    }

    //----------------------------------------------------------------------------------------------------------------------------
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView");
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        return view;
    }

    //----------------------------------------------------------------------------------------------------------------------------
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(TAG, "onCreateView");
    }

 //----------------------------------------------------------------------------------------------------------------------------
    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(TAG, "onCreateView");
    }

}
