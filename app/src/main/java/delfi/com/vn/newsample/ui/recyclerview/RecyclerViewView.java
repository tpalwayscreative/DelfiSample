package delfi.com.vn.newsample.ui.recyclerview;

import java.util.List;

import delfi.com.vn.newsample.model.CProduct;
import delfi.com.vn.tpcreative.common.presenter.BaseView;

/**
 * Created by PC on 8/4/2017.
 */

public interface RecyclerViewView extends BaseView {
    void onShowDataLocal(List<CProduct>list);
}
