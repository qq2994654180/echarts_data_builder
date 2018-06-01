package splashes.impl;

import splashes.Splashes;

import java.util.*;

/**
 * @author liuguotao
 * @date 2018/5/31 003114:30
 */
public class SplashesImpl implements Splashes{

    private SplashesBean splashesBean;

    public SplashesImpl(Map<String,List<List<?>>> map) {
        this.splashesBean = SplashesBean.getSplashesBean(map);
    }

    @Override
    public List<String> getY(List<?> list, String symbol) {
        return splashesBean.getY(list,symbol);
    }

    @Override
    public List<String> getDateY(List<Date> dates, String format) {
        return splashesBean.getDateY(dates,format);
    }

    @Override
    public List<String> getY(List<?> list) {
        return splashesBean.getY(list);
    }

    @Override
    public Set<String> getLegend() {
        return splashesBean.getLegend();
    }

    @Override
    public List<String> getDateX(List<Date> dates, String format) {
        return splashesBean.getDateX(dates,format);
    }

    @Override
    public List<String> getX(List<?> objects) {
        return splashesBean.getX(objects);
    }

    @Override
    public List<String> getX(List<?> objects, String symbol) {
        return splashesBean.getX(objects,symbol);
    }

    @Override
    public Map<String, List<List<?>>> getDataList() {
        return splashesBean.getDataList();
    }

}
