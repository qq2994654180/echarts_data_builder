package basics;

import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * @author liuguotao
 * @date 2018/5/31 003115:48
 * 所有图表接口的父接口
 */
public interface BasicsInterface {
    /*/**
     * @author liuguotao
     * @date 2018/5/31 0031 15:45
     * @param [legend]
     * @return java.lang.String
     * 输入集合和指定后缀获取带有后缀的Y轴
     */
    List<String> getY(List<?> list, String symbol);
    /*/**
    　  * @author liuguotao
        * @date 2018/6/1 0001 8:27
        * @param [dates, format]
        * @return java.util.List<java.lang.String>
        *     日期Y
    　*/
    List<String> getDateY(List<Date> dates,String format);
    /*/**
     * @author liuguotao
     * @date 2018/5/31 0031 15:45
     * @param [legend]
     * @return java.lang.String
     * 输入集合获取Y轴
     */
    List<String> getY(List<?> list);
    /*/**
     * @author liuguotao
     * @date 2018/5/31 0031 15:40
     * @param []
     * @return java.util.Set<java.lang.String>
     *     获取所有项名称
     */
    Set<String> getLegend();
    /*/**
     * @author liuguotao
     * @date 2018/5/31 0031 15:40
     * @param [dates, format]
     * @return java.util.List<java.lang.String>
     *     输入时间和指定格式生成X轴数据
     */
    List<String> getDateX(List<Date> dates, String format);
    /*/**
     * @author liuguotao
     * @date 2018/5/31 0031 15:41
     * @param [objects]
     * @return java.util.List<java.lang.String>
     *     输入集合生成X轴数据
     */
    List<String> getX(List<?> objects);
    /*/**
     * @author liuguotao
     * @date 2018/5/31 0031 15:42
     * @param [objects, symbol]
     * @return java.util.List<java.lang.String>
     *     生成带后缀的X轴数据
     */
    List<String> getX(List<?> objects,String symbol);
}
