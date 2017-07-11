package me.gavin.mvvm.app.demo;

import android.os.Bundle;
import android.support.annotation.Nullable;

import me.gavin.mvvm.R;
import me.gavin.mvvm.base.BindingFragment;
import me.gavin.mvvm.databinding.FragTestBinding;

/**
 * 这里是萌萌哒注释君
 *
 * @author gavin.xiong 2017/7/10
 */
public class TestFragment extends BindingFragment<FragTestBinding> {

    TestViewModel viewModel;

    public static TestFragment newInstance() {
        return new TestFragment();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.frag_test;
    }

    @Override
    protected void afterCreate(@Nullable Bundle savedInstanceState) {
        viewModel = new TestViewModel(_mActivity, binding);
        binding.setViewModel(viewModel);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        viewModel.onDestroy();
    }
}
