package com.codenicely.cub.mvp_final.login.Model;

/**
 * Created by cub on 17/7/17.
 */

public interface Login_Model_Implementor {

    interface onLoginFinishedListener{

        void onUsernameError();
        void onPasswordError();

        void onSuccess();
        void onFailure(String message);


    }

    void login(String username, String password, onLoginFinishedListener listener);


}
