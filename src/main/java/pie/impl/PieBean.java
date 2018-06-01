package pie.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author liuguotao
 * @date 2018/6/1 00018:44
 */
final public class PieBean {
    private static PieBean pieBean=null;
    private static List<PieImpl.PieData> dataList;
    private static Set<String> legend;
    private PieBean(){
    }
    /*/**
    　  * @author liuguotao
        * @date 2018/6/1 0001 9:05
        * @param [map]
        * @return pie.impl.PieBean
        * 数据列表和名称项
    　*/
     static PieBean getPieBean(List<PieImpl.PieData> map){
        Set<String> legends = new HashSet<>();
        for (PieImpl.PieData pieData : map) {
            legends.add(pieData.getName());
        }
        legend=legends;
        dataList=map;
        synchronized (PieBean.class) {
            if (pieBean == null) {
                pieBean = new PieBean();
            }
        }
        return pieBean;
    }
/*/**
　  * @author liuguotao
    * @date 2018/6/1 0001 9:07
    * @param []
    * @return java.util.List<pie.impl.PieBean.PieData>
    *     获取数据列表
　*/
    public  List<PieImpl.PieData> getDataList() {
        return dataList;
    }
/*/**
　  * @author liuguotao
    * @date 2018/6/1 0001 9:07
    * @param []
    * @return java.util.Set<java.lang.String>
    *     获取名称项
　*/
    public  Set<String> getLegend() {
        return legend;
    }

}
