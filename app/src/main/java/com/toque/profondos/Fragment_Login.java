package com.toque.profondos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.socks.library.KLog;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_Login extends Fragment {

    private static final String LOG_MSG = "KLog is a so cool Log Tool!!!!!!";
    private String JSON = "{\"primero\":{\"dato\"}}";

    Button btn_signup, btn_singin;
    View v;

    public Fragment_Login() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_login, container, false);

//        btn_signup = (Button)v.findViewById(R.id.btn_i_have_count);
//        btn_singin = (Button)v.findViewById(R.id.btn_signin);
//
//        btn_signup.setOnClickListener(onClickListener);
//        btn_singin.setOnClickListener(onClickListener);
//

        return v;
    }

    public void Metodoblabla() {
        KLog.v(null);
        KLog.d(null);
        KLog.i(null);
        KLog.w(LOG_MSG);
        KLog.e(LOG_MSG);
        KLog.a(LOG_MSG);
        KLog.json("12345");
        KLog.json(JSON);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Metodoblabla();

//        MainActivity.setShowToolBar(false, "");

    }



}
