package delfi.com.vn.newsample.ui.recyclerview.activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;
import delfi.com.vn.newsample.common.utils.Navigator;
import delfi.com.vn.newsample.model.CProduct;
import delfi.com.vn.newsample.R;
import delfi.com.vn.newsample.ui.gridview.activity.GridViewActivity;
import delfi.com.vn.tpcreative.common.activity.BaseActivity;
import delfi.com.vn.tpcreative.ui.recycleview.DPRecyclerView;
import delfi.com.vn.tpcreative.ui.recycleview.RecyclerViewAdapter;

public class RecyclerViewActivity extends BaseActivity implements DPRecyclerView.ListenerRecycleView {

    @BindView(R.id.rlHome)
    RecyclerView recyclerView;
    List<CProduct> list;
    DPRecyclerView customRecycleView ;
    RecyclerViewAdapter adapter ;
    private ViewHolder viewHolder ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);
        list = new ArrayList<>();
        list.add(new CProduct("\"'A' - You're Adorable\" (Sid Lippman, Buddy Kaye and Fred Wise)"));
        list.add(new CProduct("\"A Hard Rain's a-Gonna Fall\" (Bob Dylan)"));
        list.add(new CProduct("\"A Little Priest\" (Stephen Sondheim and Hugh Wheeler From Sweeney Todd: The Demon Barber of Fleet Street)"));
        list.add(new CProduct("\"A Little Something Refreshing\" (Eric Stefani), performed by No Doubt"));
        list.add(new CProduct("list.add(new CProduct(\"\"Area Codes\" (Ludacris)));\n"));
        list.add(new CProduct("\"Around the World\" (Red Hot Chili Peppers)"));
        list.add(new CProduct("\"A Well-Dressed Hobbit\" (Rie Sheridan Rose, Marc Gunn)"));
        list.add(new CProduct("\"All My Ex's Live in Texas\" (George Strait and Whitey Shafer)"));
        adapter = DPRecyclerView.instance(this,recyclerView,R.layout.home_cell_recyclerview,this).adapterRecycleView();
        adapter.setDataSource(new ArrayList(list));
    }

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
    }

    @Override
    public void onShowPosition(int position) {
        Toast.makeText(getApplicationContext(),"Show position now : " + position,Toast.LENGTH_SHORT).show();
        Navigator.moveToGridView(this);
    }

    protected class ViewHolder {
        @BindView(R.id.tvHomeCell)
        TextView textView ;
        @BindView(R.id.llHomeCell)
        LinearLayout llHomeCell;
        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}

