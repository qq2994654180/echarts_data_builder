package line_histogram.impl;

import line_histogram.LineHistogram;

import java.util.*;

/**
 * @author liuguotao
 * @date 2018/5/30 003016:14
 */
public class LineHistogramImpl implements LineHistogram {
    private LineBean lineBean;

   public LineHistogramImpl(Map<String,List<?>> map){
        lineBean=LineBean.getLineBean(map);
    }

    @Override
    public Map<String,List<?>> getDataList() {
        return lineBean.getDataList();
    }

    @Override
    public Set<String> getLegend() {
        return lineBean.getLegend();
    }

    @Override
    public List<String> getDateX(List<Date> dates, String format) {
        return lineBean.getDateX(dates,format);
    }

    @Override
    public List<String> getX(List<?> objects) {
        return lineBean.getX(objects);
    }

    @Override
    public List<String> getX(List<?> objects, String symbol) {
        return lineBean.getX(objects,symbol);
    }

    @Override
    public Map<String, Object> getMax() {
        Map<String, Object> map = new HashMap<>();
        for (String s : getLegend()) {
            String max = getMax(s);
            map.put(s,max);
        }
        return map;
    }

    @Override
    public Map<String, Object> getMin() {
        Map<String, Object> map = new HashMap<>();
        for (String s : getLegend()) {
            String min = getMin(s);
            map.put(s,min);
        }
        return map;
    }

    @Override
    public Map<String, Object> getAverage() {
        Map<String, Object> map = new HashMap<>();
        for (String s : getLegend()) {
            String average = getAverage(s);
            map.put(s,average);
        }
        return map;
    }

    @Override
    public String getMax(String legend) {
        return lineBean.getMax(legend);
    }

    @Override
    public String getMin(String legend) {
        return lineBean.getMin(legend);
    }

    @Override
    public String getAverage(String legend) {
        return lineBean.getAverage(legend);
    }

    @Override
    public List<String> getY(List<?> list, String symbol) {
        return lineBean.getY(list,symbol);
    }

    @Override
    public List<String> getDateY(List<Date> dates, String format) {
        return lineBean.getDateY(dates,format);
    }

    @Override
    public List<String> getY(List<?> list) {
        return lineBean.getY(list);
    }

}
