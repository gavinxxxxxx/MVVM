package me.gavin.mvvm.inject.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import me.gavin.mvvm.service.DailyManager;
import me.gavin.mvvm.service.base.DataLayer;

/**
 * DataLayerModule
 *
 * @author gavin.xiong 2017/4/28
 */
@Module
public class DataLayerModule {

    @Singleton
    @Provides
    public DailyManager provideDailyManager() {
        return new DailyManager();
    }

    @Singleton
    @Provides
    public DataLayer provideDataLayer(DailyManager dailyManager) {
        return new DataLayer(dailyManager);
    }
}
