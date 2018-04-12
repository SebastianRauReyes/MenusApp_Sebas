package com.sebastian.menusapp_sebas;


import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment3Activity extends Fragment {

    // Nombre de parámetro declarado como constante
    private static final String ARG_PARAM1 = "param1";

    // Atributo param1
    private String param1;

    public Fragment3Activity() {

    }

    // Como buena práctica definimos un método fáctory 'newInstance' que reciba los parámetros requeridos 'param1'
    public static Fragment3Activity newInstance(String param1) {

        Fragment3Activity fragment = new Fragment3Activity();

        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);

        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            param1 = getArguments().getString(ARG_PARAM1);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_third, container, false);

        TextView textView = (TextView)view.findViewById(R.id.textview);
        textView.setText(textView.getText() + "\nParam1: " + param1);

        return view;
    }

}
