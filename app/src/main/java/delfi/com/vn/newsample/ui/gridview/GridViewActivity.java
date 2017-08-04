package delfi.com.vn.newsample.ui.gridview;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;
import delfi.com.vn.newsample.model.CProduct;
import delfi.com.vn.newsample.R;
import delfi.com.vn.tpcreative.common.activity.BaseActivity;
import delfi.com.vn.tpcreative.ui.gridview.DPGridView;
import delfi.com.vn.tpcreative.ui.gridview.GridViewAdapter;

public class GridViewActivity extends BaseActivity implements DPGridView.ListenerGridView,GridViewView {

    @BindView(R.id.gridview)
    GridView gridView;
    private GridViewAdapter adapter ;
    List<CProduct> list;
    private ViewHolder viewHolder ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        list = new ArrayList<>();
        list.add(new CProduct("\"'A' - You're Adorable\" (Sid Lippman, Buddy Kaye and Fred Wise)"));
        list.add(new CProduct("\"A Hard Rain's a-Gonna Fall\" (Bob Dylan)"));
        list.add(new CProduct("\"A Little Priest\" (Stephen Sondheim and Hugh Wheeler From Sweeney Todd: The Demon Barber of Fleet Street)"));
        list.add(new CProduct("\"A Little Something Refreshing\" (Eric Stefani), performed by No Doubt"));
        list.add(new CProduct("list.add(new CProduct(\"\"Area Codes\" (Ludacris)));\n"));
        list.add(new CProduct("\"Around the World\" (Red Hot Chili Peppers)"));
        list.add(new CProduct("\"A Well-Dressed Hobbit\" (Rie Sheridan Rose, Marc Gunn)"));
        list.add(new CProduct("\"All My Ex's Live in Texas\" (George Strait and Whitey Shafer)"));
        adapter = DPGridView.instance(this,gridView,R.layout.home_cell_gridview, this,new ArrayList(list)).gridViewAdapter();
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onShowData(Object object) {
        CProduct product = (CProduct)object;
        viewHolder.textView.setText(product.name);
    }

    @Override
    public void onShowPosition(int position) {
        Toast.makeText(getApplicationContext(),"Show position now : " + position,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSetView(View view) {
        viewHolder = new ViewHolder(view) ;
        view.setTag(viewHolder);
    }

    @Override
    public TextView tvName() {
        return viewHolder.textView;
    }

    @Override
    public LinearLayout llName() {
        return viewHolder.llHomeCell;
    }

    @Override
    public void onShowLoading() {

    }

    @Override
    public void onHideLoading() {

    }

    @Override
    public Context getContext() {
        return getApplicationContext();
    }

    protected class ViewHolder {
        @BindView(R.id.tvHomeCell)
        TextView textView ;
        @BindView(R.id.llHomeCell)
        LinearLayout llHomeCell ;
        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
