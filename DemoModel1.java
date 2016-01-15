package com.puhuiopenline.view.activity;

import android.view.View;

import com.puhuiopenline.R;
import com.puhuiopenline.view.adapter.util.AdapterItem;

/**
 * Created by jorryLiu on 2016/1/15.
 * liujiawei@puhuifinance.com
 */
public class DemoModel1 implements AdapterItem<DemoModel> {

    @Override
    public int getLayoutResId() {
        return R.layout.item_detailed;
    }

    @Override
    public void onBindViews(View root) {

    }

    @Override
    public void onSetViews() {

    }

    @Override
    public void onUpdateViews(DemoModel model, int position) {

    }
}
