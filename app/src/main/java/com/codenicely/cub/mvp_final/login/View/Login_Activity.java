package com.codenicely.cub.mvp_final.login.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.codenicely.cub.mvp_final.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Login_Activity extends AppCompatActivity implements Login_View {




    @BindView(R.id.username)
    EditText username;

    @BindView(R.id.password)
    EditText password;

    @BindView(R.id.progressBar)
    ProgressBar progressBar;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activity);
        ButterKnife.bind(this);
    }





    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void setUsernameError() {

    }

    @Override
    public void setPasswordError() {

    }

    @Override
    public void navigateToMain() {

    }

    @Override
    public void showAlert(String message) {

    }
}
