package delfi.com.vn.newsample.ui.gridview;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

import delfi.com.vn.tpcreative.common.presenter.BaseView;

/**
 * Created by PC on 8/3/2017.
 */

public interface GridViewView extends BaseView {
    TextView tvName();
    LinearLayout llName();
}
