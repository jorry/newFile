package com.puhuiopenline.view.activity;

import com.modle.response.EntityBO;

/**
 * Created by jorryLiu on 2016/1/15.
 * liujiawei@puhuifinance.com
 */
public class DemoModel extends EntityBO{
    public DemoModel(int mode){
        this.mode = mode;
    }
    public int mode;
}
