package me.gavin.mvvm.service.base;

import com.google.gson.Gson;

import javax.inject.Inject;

import me.gavin.mvvm.inject.component.ApplicationComponent;
import me.gavin.mvvm.net.ClientAPI;

/**
 * BaseManager
 *
 * @author gavin.xiong 2017/4/28
 */
public abstract class BaseManager {
    @Inject
    ClientAPI mApi;
    @Inject
    Gson mGson;

    public BaseManager() {
        ApplicationComponent.Instance.get().inject(this);
    }

    public ClientAPI getApi() {
        return mApi;
    }

    public Gson getGson() {
        return mGson;
    }
}
