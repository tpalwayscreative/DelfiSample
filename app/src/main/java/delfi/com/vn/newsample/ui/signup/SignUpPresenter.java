package delfi.com.vn.newsample.ui.signup;

import android.app.Activity;
import delfi.com.vn.newsample.R;
import delfi.com.vn.tpcreative.common.presenter.Presenter;

/**
 * Created by PC on 8/3/2017.
 */

public class SignUpPresenter extends Presenter<SignUpView> {
    private Activity activity ;
    public SignUpPresenter(Activity activity){
        this.activity = activity ;
    }
    public void signUpUser(){
        SignUpView view = view();
        String userName  = view.onGetUsername();
        String passWord = view.onGetPassword();
        if (userName.isEmpty()){
            view.onShowUsernameError(R.string.username_error);
            return;
        }
        if (passWord.isEmpty()){
            view.onShowPasswordError(R.string.password_error);
            return;
        }
        view.onResponseRegister(true);
    }
}
