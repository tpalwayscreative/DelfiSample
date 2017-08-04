package delfi.com.vn.newsample.ui.gridview;

import android.view.View;

import delfi.com.vn.tpcreative.ui.recycleview.DPRecyclerView;

/**
 * Created by PC on 8/4/2017.
 */

public interface GridViewCustomView extends DPRecyclerView.ListenerRecycleView{
    @Override
    void onSetView(View view);

    @Override
    void onShowPosition(int i);

    @Override
    void onShowData(Object o);

    void onGridViewCustomView(int i);
}
