package com.sebastian.menusapp_sebas;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment2Activity extends Fragment {

    private static final String TAG = Fragment2Activity.class.getSimpleName();

    private String Contenido;

    public Fragment2Activity() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Get argument param1 if exists
        if (getArguments() != null) {
            this.Contenido = getArguments().getString("Contenido");
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView");
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        TextView textView = (TextView)view.findViewById(R.id.textview);
        textView.setText(textView.getText() + "\nContenido : " + Contenido);
        return view;
    }


}
