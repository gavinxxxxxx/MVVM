package me.gavin.mvvm.app.demo.base;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.ViewDataBinding;

import java.lang.ref.WeakReference;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import me.gavin.mvvm.inject.component.ApplicationComponent;
import me.gavin.mvvm.service.base.DataLayer;

/**
 * ViewModel 基类
 *
 * @author gavin.xiong 2017/7/11
 */
public abstract class BaseViewModel extends BaseObservable {

    @Inject
    DataLayer mDataLayer;

    @Inject
    protected CompositeDisposable mCompositeDisposable;

    protected WeakReference<Context> mContext;
    protected WeakReference<ViewDataBinding> mBinding;

    protected BaseViewModel(Context context, ViewDataBinding binding) {
        mContext = new WeakReference<>(context);
        mBinding = new WeakReference<>(binding);
        ApplicationComponent.Instance.get().inject(this);

        init();
        getData();
    }

    public DataLayer getDataLayer() {
        return mDataLayer;
    }

    public void onDestroy() {
        mCompositeDisposable.dispose();
    }

    protected abstract void init();

    protected void getData() {
    }
}
