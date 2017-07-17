package com.codenicely.cub.mvp_final.login.Model;

/**
 * Created by cub on 17/7/17.
 */

public class Login_Model implements Login_Model_Implementor, Login_Model_Implementor.onLoginFinishedListener {


    @Override
    public void onUsernameError() {

    }

    @Override
    public void onPasswordError() {

    }

    @Override
    public void onSuccess() {

    }

    @Override
    public void onFailure(String message) {

    }

    @Override
    public void login(String username, String password, onLoginFinishedListener listener) {

    }
}
