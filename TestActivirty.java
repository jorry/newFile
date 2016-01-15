package com.puhuiopenline.view.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.puhuiopenline.BaseActivity;
import com.puhuiopenline.R;
import com.puhuiopenline.view.adapter.recycler.CommonRcvAdapter;
import com.puhuiopenline.view.adapter.util.AdapterItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jorryLiu on 2016/1/15.
 * liujiawei@puhuifinance.com
 */
public class TestActivirty extends BaseActivity {

    private RecyclerView recyclerView;

    List<DemoModel> modelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false);
        layoutManager.setRecycleChildrenOnDetach(true);
        recyclerView.setLayoutManager(layoutManager);

        DividerLine dividerLine = new DividerLine(DividerLine.VERTICAL);
        dividerLine.setSize(2);
        dividerLine.setColor(0xFFDDDDDD);


        recyclerView.addItemDecoration(dividerLine);


        modelList = new ArrayList<DemoModel>();
        modelList.add(new DemoModel(1));
        modelList.add(new DemoModel(1));

        modelList.add(new DemoModel(2));

        modelList.add(new DemoModel(1));
        modelList.add(new DemoModel(1));
        modelList.add(new DemoModel(1));

        recyclerView.setAdapter(new CommonRcvAdapter<DemoModel>(modelList) {

            @Override
            public Object getItemViewType(DemoModel item) {
                return item.mode;
            }

            @NonNull
            @Override
            public AdapterItem<DemoModel> getItemView(Object type) {
                return initItem2(type);
            }
        });
    }

    public AdapterItem<DemoModel> initItem2(Object type) {
        switch (Integer.parseInt(type.toString())){
            case 1:
                return new DemoModel1();
            case 2:
                return new DemoMode2();
        }
        return  null;
    }

    @Override
    public void bindTitleBar() {

    }
}
