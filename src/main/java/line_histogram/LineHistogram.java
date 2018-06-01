package line_histogram;

import basics.BasicsInterface;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author liuguotao
 * @date 2018/5/30 003016:13
 * 线图和柱状图接口
 */
public interface LineHistogram extends BasicsInterface{
    /*/**
    　  * @author liuguotao
        * @date 2018/5/31 0031 15:39
        * @param []
        * @return java.util.Map<java.lang.String,java.util.List<?>>
        *     获取所有项名称及列表
    　*/
    Map<String,List<?>> getDataList();

    /*/**
    　  * @author liuguotao
        * @date 2018/5/31 0031 15:44
        * @param []
        * @return java.util.Map<java.lang.String,java.lang.Object>
        *     获取每项最大值
    　*/
    Map<String, Object> getMax();
    /*/**
    　  * @author liuguotao
        * @date 2018/5/31 0031 15:44
        * @param []
        * @return java.util.Map<java.lang.String,java.lang.Object>
        *     获取每项最小值
    　*/
    Map<String, Object> getMin();
    /*/**
    　  * @author liuguotao
        * @date 2018/5/31 0031 15:45
        * @param []
        * @return java.util.Map<java.lang.String,java.lang.Object>
        *     获取每项平均值
    　*/
    Map<String, Object> getAverage();
    /*/**
    　  * @author liuguotao
        * @date 2018/5/31 0031 15:45
        * @param [legend]
        * @return java.lang.String
        * 获取指定项最大值
    　*/
    String getMax(String legend);
    /*/**
     * @author liuguotao
     * @date 2018/5/31 0031 15:45
     * @param [legend]
     * @return java.lang.String
     * 获取指定项最小值
     */
    String getMin(String legend);
    /*/**
     * @author liuguotao
     * @date 2018/5/31 0031 15:45
     * @param [legend]
     * @return java.lang.String
     * 获取指定项平均值
     */
    String getAverage(String legend);
}
