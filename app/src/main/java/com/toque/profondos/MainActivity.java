package com.toque.profondos;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.socks.library.KLog;

import rx.Observable;
import rx.functions.Action1;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";
    public static Context mContext;
    public static Activity mActivity;
    public static Toolbar mToolbar;

    FragmentManager fm;
    FragmentTransaction ft;
    Context ctx;
    Activity act;
    Fragment login, signup, signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fm = getSupportFragmentManager();
        ctx = getApplicationContext();
        mActivity = MainActivity.this;

        login = new Fragment_Login();
        signup = new Fragment_signup();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, login)
                    .commit();
        }

        /*Initialize control*/
        initToolbar();

        hello("Ben", "George");

    }

    public static void hello(String... names) {
        Observable.from(names).subscribe(new Action1<String>() {
            @Override
            public void call(String s) {

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    //<editor-fold desc="METHODS">
//    public static void setShowToolBar(boolean b, CharSequence s) {
//        mActivity.setTitle(s);
//        mToolbar.setTitleTextColor(mActivity.getResources().getColor(android.R.color.white));
//        if (b) {
//            mToolbar.setVisibility(View.VISIBLE);
//        } else {
//            mToolbar.setVisibility(View.GONE);
//        }
//    }

    private void initToolbar() {
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
    }
    //</editor-fold>

}
