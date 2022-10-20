package com.example.leiwechat;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {
    private TextView textView;
    private Button button ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_2);
        textView=findViewById(R.id.textView2bottom);
        button=findViewById(R.id.buttonck);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Activity2.this,ActivityForResult.class);
                test.launch(intent);
            }
        });

    }
    public ActivityResultLauncher test=registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                   if(result.getResultCode()==66){
                       Log.d("jqk","onActivityResult有返回值");
                       textView.setText(result.getData().getStringExtra("data"));
                   }
                }
            });

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("jqk","activity2 is onstart");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("jqk","activity2 is onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("jqk","activity2 is onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("jqk","activity2 is onDestroy");
    }
    @Override
    public void finish(){
        super.finish();
        Log.d("jqk","activity2 is finish");
    }
    public  void finishActivity(int requestCode){
        super.finishActivity(requestCode);
        Log.d("jqk","finishActivity...");
    }
}