package com.codenicely.cub.mvp_final.login.Presenter;

/**
 * Created by cub on 17/7/17.
 */

public interface Login_Presenter {

    void validateCredentials(String username, String password);

    void onDestroy();


}
