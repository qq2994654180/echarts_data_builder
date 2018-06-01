package radar.impl;
import tool.DataTool;

import java.util.*;

/**
 * @author liuguotao
 * @date 2018/6/1 000113:44
 */
final class RadarBean {
    private static RadarBean radarBean=null;
    private static List<RadarImpl.RadarData> dataList;
    private static Set<String> legend;
    private RadarBean(){}
    /*/**
    　  * @author liuguotao
        * @date 2018/6/1 0001 13:53
        * @param [data]
        * @return radar.impl.RadarBean
        * 创建实例
    　*/
    static RadarBean getRadarBean(List<RadarImpl.RadarData> data){
        dataList=data;
        Set<String> legends = new HashSet<>();
        for (RadarImpl.RadarData datum : data) {
            legends.add(datum.getName());
        }
        legend=legends;
        synchronized (RadarBean.class) {
            if (radarBean == null) {
                radarBean = new RadarBean();
            }
        }
        return radarBean;
    }
    /*/**
    　  * @author liuguotao
        * @date 2018/6/1 0001 13:54
        * @param []
        * @return java.util.Set<java.lang.String>
        *     获取名称项
    　*/
     Set<String> getLegend() {
        return legend;
    }
    /*/**
    　  * @author liuguotao
        * @date 2018/6/1 0001 13:57
        * @param []
        * @return java.util.List<radar.impl.RadarImpl.RadarData>
        *     获取数据
    　*/
     List<RadarImpl.RadarData> getDataList() {
        return dataList;
    }
    /*/**
    　  * @author liuguotao
        * @date 2018/6/1 0001 14:11
        * @param []
        * @return java.util.List<java.util.Map<java.lang.String,java.lang.String>>
        *     获取所有项最大
    　*/
    List<Map<String,String>> getMax(){
        List<Map<String,String>> listMax = new ArrayList<>();
        for (RadarImpl.RadarData radarData : dataList) {
            String text = radarData.getName();
            String max = DataTool.getMax(radarData.getValue());
            Map<String, String> map = new HashMap<>();
            map.put("text",text);
            map.put("max",max);
            listMax.add(map);
        }
        return listMax;
    }
    /*/**
    　  * @author liuguotao
        * @date 2018/6/1 0001 14:18
        * @param [legend]
        * @return java.lang.String
        * 查询某项最大值
    　*/
    String getMax(String legend){
        for (RadarImpl.RadarData radarData : dataList) {
            if(radarData.getName().equals(legend)){
                return DataTool.getMax(radarData.getValue());
            }
        }
        return null;
    }
    /*/**
     * @author liuguotao
     * @date 2018/6/1 0001 14:11
     * @param []
     * @return java.util.List<java.util.Map<java.lang.String,java.lang.String>>
     *     获取所有项最小
     */
    List<Map<String,String>> getMin(){
        List<Map<String,String>> listMin = new ArrayList<>();
        for (RadarImpl.RadarData radarData : dataList) {
            String text = radarData.getName();
            String max = DataTool.getMin(radarData.getValue());
            Map<String, String> map = new HashMap<>();
            map.put("text",text);
            map.put("min",max);
            listMin.add(map);
        }
        return listMin;
    }
    /*/**
    　  * @author liuguotao
        * @date 2018/6/1 0001 14:19
        * @param [legend]
        * @return java.lang.String
        * 获取某项最小值
    　*/
    String getMin(String legend){
        for (RadarImpl.RadarData radarData : dataList) {
            if(radarData.getName().equals(legend)){
                return DataTool.getMin(radarData.getValue());
            }
        }
        return null;
    }
    /*/**
     * @author liuguotao
     * @date 2018/6/1 0001 14:11
     * @param []
     * @return java.util.List<java.util.Map<java.lang.String,java.lang.String>>
     *     获取所有项均值
     */
    List<Map<String,String>> getAverage(){
        List<Map<String,String>> listAverage = new ArrayList<>();
        for (RadarImpl.RadarData radarData : dataList) {
            String text = radarData.getName();
            String max = DataTool.getAverage(radarData.getValue());
            Map<String, String> map = new HashMap<>();
            map.put("text",text);
            map.put("average",max);
            listAverage.add(map);
        }
        return listAverage;
    }
    /*/**
    　  * @author liuguotao
        * @date 2018/6/1 0001 14:21
        * @param [legend]
        * @return java.lang.String
        * 获取某项均值
    　*/
    String getAverage(String legend){
        for (RadarImpl.RadarData radarData : dataList) {
            if(radarData.getName().equals(legend)){
                return DataTool.getAverage(radarData.getValue());
            }
        }
        return null;
    }
}
