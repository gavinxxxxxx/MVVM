package me.gavin.mvvm.service.base;

import me.gavin.mvvm.app.demo.Daily;
import io.reactivex.Observable;

/**
 * DataLayer
 *
 * @author gavin.xiong 2017/4/28
 */
public class DataLayer {

    private DailyService mDailyService;

    public DataLayer(DailyService dailyService) {
        mDailyService = dailyService;
    }

    public DailyService getDailyService() {
        return mDailyService;
    }

    public interface DailyService {

        /**
         * 获取最新日报新闻列表
         *
         * @return Daily
         */
        Observable<Daily> getDaily(int dayDiff);
    }
}
