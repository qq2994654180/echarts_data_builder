package radar;

import radar.impl.RadarImpl;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author liuguotao
 * @date 2018/6/1 000113:43
 */
public interface Radar {
    /*/**
    　  * @author liuguotao
        * @date 2018/6/1 0001 14:26
        * @param []
        * @return java.util.Set<java.lang.String>
        *     获取名称项
    　*/
    Set<String> getLegend();
    /*/**
    　  * @author liuguotao
        * @date 2018/6/1 0001 14:27
        * @param []
        * @return java.util.List<radar.impl.RadarImpl.RadarData>
        *     获取数据
    　*/
    List<RadarImpl.RadarData> getDataList();
    /*/**
    　  * @author liuguotao
        * @date 2018/6/1 0001 14:28
        * @param []
        * @return java.util.List<java.util.Map<java.lang.String,java.lang.String>>
        *     获取所有项的最大值
    　*/
    List<Map<String,String>> getMax();
    /*/**
    　  * @author liuguotao
        * @date 2018/6/1 0001 14:28
        * @param [legend]
        * @return java.lang.String
        * 或取某一项最大
    　*/
    String getMax(String legend);
    /*/**
    　  * @author liuguotao
        * @date 2018/6/1 0001 14:29
        * @param []
        * @return java.util.List<java.util.Map<java.lang.String,java.lang.String>>
        *     获取所有项最小
    　*/
    List<Map<String,String>> getMin();
    /*/**
    　  * @author liuguotao
        * @date 2018/6/1 0001 14:30
        * @param [legend]
        * @return java.lang.String
        * 获取某项最小值
    　*/
    String getMin(String legend);
    /*/**
    　  * @author liuguotao
        * @date 2018/6/1 0001 14:30
        * @param []
        * @return java.util.List<java.util.Map<java.lang.String,java.lang.String>>
        *   获取所有项均值
    　*/
    List<Map<String,String>> getAverage();
    /*/**
    　  * @author liuguotao
        * @date 2018/6/1 0001 14:31
        * @param [legend]
        * @return java.lang.String
        * 获取某项的均值
    　*/
    String getAverage(String legend);
}
