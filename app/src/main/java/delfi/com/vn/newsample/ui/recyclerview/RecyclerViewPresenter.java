package delfi.com.vn.newsample.ui.recyclerview;
import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

import delfi.com.vn.newsample.model.CProduct;
import delfi.com.vn.tpcreative.common.presenter.Presenter;

/**
 * Created by PC on 8/4/2017.
 */

public class RecyclerViewPresenter extends Presenter<RecyclerViewRemote> {

    private Activity context ;
    private List<CProduct>list;
    public RecyclerViewPresenter(Activity context){
        this.context = context;
        list = new ArrayList<>();
    }

    public void setData(){
        RecyclerViewRemote viewRemote = view();
        list.add(new CProduct("\"'A' - You're Adorable\" (Sid Lippman, Buddy Kaye and Fred Wise)"));
        list.add(new CProduct("\"A Hard Rain's a-Gonna Fall\" (Bob Dylan)"));
        list.add(new CProduct("\"A Little Priest\" (Stephen Sondheim and Hugh Wheeler From Sweeney Todd: The Demon Barber of Fleet Street)"));
        list.add(new CProduct("\"A Little Something Refreshing\" (Eric Stefani), performed by No Doubt"));
        list.add(new CProduct("list.add(new CProduct(\"\"Area Codes\" (Ludacris)));\n"));
        list.add(new CProduct("\"Around the World\" (Red Hot Chili Peppers)"));
        list.add(new CProduct("\"A Well-Dressed Hobbit\" (Rie Sheridan Rose, Marc Gunn)"));
        list.add(new CProduct("\"All My Ex's Live in Texas\" (George Strait and Whitey Shafer)"));
        viewRemote.onShowDataLocal(list);
    }


}
