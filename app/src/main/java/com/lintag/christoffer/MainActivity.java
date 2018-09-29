package com.lintag.christoffer;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4ITH","onCreate() successfully executed");
    }

    protected void onStart(){
        super.onStart();
        Log.d("4ITH","onStart() successfully executed");
    }

    protected void onResume(){
        super.onResume();
        Log.d("4ITH","onResume() successfully executed");
    }

    protected void onPause(){
        super.onPause();
        Log.d("4ITH","onPause() successfully executed");
    }

    protected void onRestart(){
        super.onRestart();
        Log.d("4ITH","onRestart() successfully executed");
    }

    protected void onStop(){
        super.onStop();
        Log.d("4ITH","onStop() successfully executed");
    }

    protected void onDestory(){
        super.onDestroy();
        Log.d("4ITH","onDestroy() successfully executed");
    }

    public void toastMsg(View v){
        Toast.makeText(this,"Hello 4ith", Toast.LENGTH_LONG).show();
    }

    public void snackbarMsg(View v){
        Snackbar.make(v, "Hello again...",Snackbar.LENGTH_LONG).show();
    }
}
