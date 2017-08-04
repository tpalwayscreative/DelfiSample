package delfi.com.vn.newsample.ui.recyclerview;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import delfi.com.vn.newsample.R;
import delfi.com.vn.newsample.common.utils.Navigator;
import delfi.com.vn.newsample.model.CProduct;
import delfi.com.vn.tpcreative.common.activity.BaseActivity;
import delfi.com.vn.tpcreative.ui.recycleview.DPRecyclerView;
import delfi.com.vn.tpcreative.ui.recycleview.RecyclerViewAdapter;

/**
 * Created by PC on 8/4/2017.
 */

public abstract class RecyclerViewRemote extends BaseActivity implements CompoundButton.OnCheckedChangeListener,DPRecyclerView.ListenerRecycleView,RecyclerViewView{
    public static final String TAG = RecyclerViewRemote.class.getSimpleName();
    protected RecyclerViewAdapter adapter ;
    protected ViewHolder viewHolder ;

    @Override
    public void onShowData(Object anyObject) {
        CProduct product = (CProduct) anyObject;
        adapter.getAdapterRecycleViewHolder().onClick(viewHolder.llHomeCell);
        viewHolder.textView.setText(product.name);
    }

    @Override
    public void onSetView(View view) {
        viewHolder = new ViewHolder(view);
        view.setTag(viewHolder);
        viewHolder.swCell.setOnCheckedChangeListener(this);
    }

    @Override
    public void onShowPosition(int position) {
        Toast.makeText(getApplicationContext(),"Show position now : " + position,Toast.LENGTH_SHORT).show();
        Navigator.moveToGridView(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        Log.d(TAG,"Show checked : "+ b);
    }

    protected class ViewHolder {
        @BindView(R.id.tvHomeCell)
        TextView textView ;
        @BindView(R.id.llHomeCell)
        LinearLayout llHomeCell;
        @BindView(R.id.swCell)
        Switch swCell ;
        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }

    @Override
    public void onShowDataLocal(List<CProduct> list) {

    }

    @Override
    public Context getContext() {
        return getApplicationContext();
    }

}
