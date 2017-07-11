package me.gavin.mvvm.inject.component;

import android.app.Application;
import android.support.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Component;
import me.gavin.mvvm.app.demo.base.BaseViewModel;
import me.gavin.mvvm.base.BaseActivity;
import me.gavin.mvvm.base.BaseBottomSheetDialog;
import me.gavin.mvvm.base.BaseFragment;
import me.gavin.mvvm.inject.module.ApplicationModule;
import me.gavin.mvvm.service.base.BaseManager;

/**
 * ApplicationComponent
 *
 * @author gavin.xiong 2017/4/28
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(BaseActivity activity);

    void inject(BaseFragment fragment);

    void inject(BaseBottomSheetDialog dialogFragment);

    void inject(BaseManager manager);

    void inject(BaseViewModel viewModel);

    // 可以获取 ApplicationModule 及其 includes 的所有 Module 提供的对象（方法名随意）
    Application getApplication();

    class Instance {

        private static ApplicationComponent sComponent;

        public static void init(@NonNull ApplicationComponent component) {
            sComponent = component;
        }

        public static ApplicationComponent get() {
            return sComponent;
        }
    }
}
