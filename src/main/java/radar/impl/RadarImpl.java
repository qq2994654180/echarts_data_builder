package radar.impl;

import radar.Radar;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author liuguotao
 * @date 2018/6/1 000113:44
 */
public class RadarImpl implements Radar{
    private RadarBean radarBean;

    public RadarImpl(List<RadarData> list){
        radarBean=RadarBean.getRadarBean(list);
    }

    @Override
    public Set<String> getLegend() {
        return radarBean.getLegend();
    }

    @Override
    public List<RadarData> getDataList() {
        return radarBean.getDataList();
    }

    @Override
    public List<Map<String, String>> getMax() {
        return radarBean.getMax();
    }

    @Override
    public String getMax(String legend) {
        return radarBean.getMax(legend);
    }

    @Override
    public List<Map<String, String>> getMin() {
        return radarBean.getMin();
    }

    @Override
    public String getMin(String legend) {
        return radarBean.getMin(legend);
    }

    @Override
    public List<Map<String, String>> getAverage() {
        return radarBean.getAverage();
    }

    @Override
    public String getAverage(String legend) {
        return radarBean.getAverage(legend);
    }

    public static class RadarData{
        private String name;
        private List<?> value;
        @Override
        public String toString() {
            return "RadarData{" +
                    "name='" + name + '\'' +
                    ", value=" + value +
                    '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<?> getValue() {
            return value;
        }

        public void setValue(List<?> value) {
            this.value = value;
        }
    }
}
