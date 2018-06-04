package com.example.shivam.bboutique;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

public class FacebookActivity extends AppCompatActivity {
    private LoginButton loginButton;
    private TextView textView;
    private CallbackManager callbackManager;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);
        FacebookSdk.getApplicationContext();
        callbackManager = CallbackManager.Factory.create();
        loginButton= (LoginButton) findViewById(R.id.login_button);
        textView=(TextView) findViewById(R.id.result);
        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                String username=loginResult.getAccessToken().getUserId();
                Intent intent = new Intent(FacebookActivity.this, Home.class);
                intent.putExtra("UserName", username);
                startActivity(intent);
            }

            @Override
            public void onCancel() {
                textView.setText("Login Canceled");
            }

            @Override
            public void onError(FacebookException error) {
                textView.setText("Login Failed");
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        callbackManager.onActivityResult(requestCode, resultCode, data);
    }

    public void secondAct(View view) {
        button= (Button) findViewById(R.id.Skip);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FacebookActivity.this, Home.class);
                startActivity(intent);
            }
        });
    }
}
