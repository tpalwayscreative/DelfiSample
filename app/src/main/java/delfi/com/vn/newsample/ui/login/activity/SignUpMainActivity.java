package delfi.com.vn.newsample.ui.login.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.OnClick;
import delfi.com.vn.newsample.R;
import delfi.com.vn.newsample.common.utils.Navigator;
import delfi.com.vn.newsample.ui.login.presenter.SignUpPresenter;
import delfi.com.vn.newsample.ui.login.view.SignUpView;
import delfi.com.vn.tpcreative.common.activity.BaseActivity;

public class SignUpMainActivity extends BaseActivity implements SignUpView {

    @BindView(R.id.edtUsername)
    EditText edtUsername;
    @BindView(R.id.edtPassword)
    EditText edtPassword ;
    private SignUpPresenter presenter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_main);
        presenter = new SignUpPresenter(this);
        presenter.bindView(this);
    }

    @Override
    public void onShowLoading() {

    }

    @Override
    public void onHideLoading() {

    }

    @Override
    public void onResponseRegister(boolean check) {
        Toast.makeText(getApplicationContext(),check ? getResources().getString(R.string.success_message):"???",Toast.LENGTH_SHORT).show();
        Navigator.moveToRecyclerViewActivity(this);
    }

    @Override
    public String onGetPassword() {
        return edtPassword.getText().toString();
    }

    @Override
    public void onShowPasswordError(int resId) {
        edtPassword.setError(getString(resId));
    }

    @Override
    public String onGetUsername() {
        return  edtUsername.getText().toString();
    }

    @Override
    public void onShowUsernameError(int resId) {
        edtUsername.setError(getString(resId));
    }

    @Override
    public Context getContext() {
        return getApplicationContext();
    }

    @OnClick(R.id.btnSignUp)
    public void onSignUp(){
        presenter.signUpUser();
    }

    @Override
    protected void onResume() {
        super.onResume();
        edtUsername.requestFocus();
        edtUsername.setText("");
        edtPassword.setText("");
    }
}
