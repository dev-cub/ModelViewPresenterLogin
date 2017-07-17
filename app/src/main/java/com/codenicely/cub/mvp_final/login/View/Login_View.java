package com.codenicely.cub.mvp_final.login.View;

/**
 * Created by cub on 17/7/17.
 */

public interface Login_View {

    void showProgress();
    void hideProgress();

    void setUsernameError();
    void setPasswordError();

    void navigateToMain();

    void showAlert(String message);

}
