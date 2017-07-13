package me.gavin.mvvm.app.demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;

import me.gavin.mvvm.R;
import me.gavin.mvvm.app.demo.base.BaseViewModel;
import me.gavin.mvvm.base.BindingFragment;
import me.gavin.mvvm.databinding.FragTestBinding;

/**
 * 这里是萌萌哒注释君
 *
 * @author gavin.xiong 2017/7/10
 */
public class TestFragment extends BindingFragment<FragTestBinding> {

    public static TestFragment newInstance() {
        return new TestFragment();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.frag_test;
    }

    @Override
    protected BaseViewModel getViewModel() {
        return new TestViewModel(_mActivity, binding);
    }

    @Override
    protected void afterCreate(@Nullable Bundle savedInstanceState) {
        binding.toolbar.setNavigationOnClickListener(v ->
                Snackbar.make(binding.recycler, "显示点什么好呢~", Snackbar.LENGTH_LONG).show());
    }
}
