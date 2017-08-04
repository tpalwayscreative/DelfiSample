package delfi.com.vn.newsample.common.utils;

import android.content.Context;
import android.content.Intent;

import delfi.com.vn.newsample.ui.gridview.GridViewActivity;
import delfi.com.vn.newsample.ui.recyclerview.RecyclerViewActivity;

/**
 * Created by PC on 8/3/2017.
 */

public class Navigator {


    public static void moveToRecyclerViewActivity(Context context){
        Intent intent = new Intent(context, RecyclerViewActivity.class);
        context.startActivity(intent);
    }
    public static void moveToGridView(Context context){
        Intent intent = new Intent(context, GridViewActivity.class);
        context.startActivity(intent);
    }

}
