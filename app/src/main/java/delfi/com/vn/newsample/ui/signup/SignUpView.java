package delfi.com.vn.newsample.ui.signup;

import delfi.com.vn.tpcreative.common.presenter.BaseView;

/**
 * Created by PC on 8/3/2017.
 */

public interface SignUpView extends BaseView {
    void onResponseRegister(boolean check);
    String onGetUsername();
    void onShowUsernameError(int resId);
    void onShowPasswordError(int resId);
    String onGetPassword();
}
