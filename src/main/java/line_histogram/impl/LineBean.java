package line_histogram.impl;

import basics.BasicsBean;
import tool.DataTool;
import tool.DateTool;
import java.util.*;

/**
 * @author liuguotao
 * @date 2018/5/31 00319:37
 */
final class LineBean extends BasicsBean{
    private static LineBean lineBean=null;
    private static Map<String,List<?>> dataList;
    private static Set<String> legend;
    private LineBean() {
    }

    /*/**
     * @author liuguotao
     * @date 2018/5/31 0031 8:46
     * @param [list]
     * @return line.LineBean
     * 数据列表和名称项
     */
      static LineBean getLineBean(Map<String,List<?>> map){
         legend = map.keySet();
         dataList=map;
         synchronized (LineBean.class) {
             if (lineBean == null) {
                 lineBean = new LineBean();
             }
         }
        return lineBean;
     }
    /*/**
     * @author liuguotao
     * @date 2018/5/31 0031 9:11
     * @param []
     * @return java.util.List<java.util.List<?>>
     *     获取数据
     */


     Map<String,List<?>> getDataList() {
        return dataList;
    }

    /*/**
     * @author liuguotao
     * @date 2018/5/31 0031 9:12
     * @param []
     * @return java.util.List<java.lang.String>
     *     获取名称项
     */
    @Override
    public Set<String> getLegend() {
        return legend;
    }

    /*/**
    　  * @author liuguotao
        * @date 2018/5/31 0031 10:20
        * @param [legend]
        * @return java.lang.String
        * 取某项最大
        *
    　*/
     String getMax(String legend){
            List<?> list = dataList.get(legend);
            return DataTool.getMax(list);
    }
    /*/**
    　  * @author liuguotao
        * @date 2018/5/31 0031 10:25
        * @param [legend]
        * @return java.lang.String
        * 取某项最小
    　*/
     String getMin(String legend){
        List<?> list = dataList.get(legend);
        return DataTool.getMin(list);
    }
    /*/**
    　  * @author liuguotao
        * @date 2018/5/31 0031 10:27
        * @param [legend]
        * @return java.lang.String
        * 取某项平均
    　*/
     String getAverage(String legend){
        List<?> list = dataList.get(legend);
        return DataTool.getAverage(list);
    }
}
