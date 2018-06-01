package pie;

import pie.impl.PieBean;
import pie.impl.PieImpl;

import java.util.List;
import java.util.Set;

/**
 * @author liuguotao
 * @date 2018/6/1 00019:10
 */
public interface Pie {
    /*/**
    　  * @author liuguotao
        * @date 2018/6/1 0001 9:16
        * @param []
        * @return java.util.List<pie.impl.PieBean.PieData>
        *     获取数据
    　*/
     List<PieImpl.PieData> getDataList();
     /*/**
     　  * @author liuguotao
         * @date 2018/6/1 0001 9:18
         * @param []
         * @return java.util.Set<java.lang.String>
         *     获取名称项
     　*/
     Set<String> getLegend();
}
