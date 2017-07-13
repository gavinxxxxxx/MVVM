package me.gavin.mvvm.app.demo.base;

import android.content.Context;
import android.databinding.ViewDataBinding;

/**
 * 这里是萌萌哒注释君
 *
 * @author gavin.xiong 2017/7/12
 */
public abstract class BaseFragmentViewModel extends BaseViewModel {

    public BaseFragmentViewModel(Context context, ViewDataBinding binding) {
        super(context, binding);
    }
}
