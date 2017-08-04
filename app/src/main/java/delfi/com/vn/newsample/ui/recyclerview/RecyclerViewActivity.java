package delfi.com.vn.newsample.ui.recyclerview;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;
import delfi.com.vn.newsample.common.utils.Navigator;
import delfi.com.vn.newsample.model.CProduct;
import delfi.com.vn.newsample.R;
import delfi.com.vn.tpcreative.ui.recycleview.DPRecyclerView;
import delfi.com.vn.tpcreative.ui.recycleview.RecyclerViewAdapter;

public class RecyclerViewActivity extends RecyclerViewRemote  {

    @BindView(R.id.rlHome)
    RecyclerView recyclerView;
    List<CProduct> list;
    private RecyclerViewPresenter presenter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);
        presenter = new RecyclerViewPresenter(this);
        presenter.bindView(this);
        list = new ArrayList<>();
        adapter = DPRecyclerView.instance(this,recyclerView,R.layout.home_cell_recyclerview,this).adapterRecycleView();
        adapter.setDataSource(new ArrayList(list));
        presenter.setData();
    }



    @Override
    public void onShowDataLocal(List<CProduct> list) {
        super.onShowDataLocal(list);
        this.list = list;
        adapter.setDataSource(new ArrayList(list));
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        super.onCheckedChanged(compoundButton, b);
    }

    @Override
    public void onShowLoading() {

    }

    @Override
    public void onHideLoading() {

    }
}

