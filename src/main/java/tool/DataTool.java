package tool;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 数据工具
 * @author liuguotao
 * @date 2018/5/30 003016:26
 */
public class DataTool {
    public static void main(String[] args) {
        ArrayList<BigDecimal> bigDecimals = new ArrayList<BigDecimal>();
        bigDecimals.add(new BigDecimal(5));
        bigDecimals.add(new BigDecimal(6));
        bigDecimals.add(new BigDecimal(7));
        bigDecimals.add(new BigDecimal(10));
        bigDecimals.add(new BigDecimal(5));

        String max = getAverage(bigDecimals);
        System.out.println(max);
    }
    /*/**
    　  * @author liuguotao
        * @date 2018/5/30 0030 16:32
        * @param [list]
        * @return java.lang.String
        * 取最大值
    　*/
    public static String getMax(List<?> list){
        Comparable max = Collections.max((Collection<? extends Comparable>) list);
        return max.toString();
    }
    /*/**
    　  * @author liuguotao
        * @date 2018/5/30 0030 16:37
        * @param [list]
        * @return java.lang.String
        * 取最小值
    　*/
    public static String getMin(List<?> list){
        Comparable min = Collections.min((Collection<? extends Comparable>) list);
        return min.toString();
    }
    /*/**
    　  * @author liuguotao
        * @date 2018/5/30 0030 16:47
        * @param [list]
        * @return java.lang.String
        * 求和
    　*/
    public static String getSum(List<?> list){
        BigDecimal sum=new BigDecimal(0);
        for (Object o : list) {
            BigDecimal bigDecimal = new BigDecimal(o.toString());
            sum=sum.add(bigDecimal);
        }
        return sum.toString();
    }
    /*/**
    　  * @author liuguotao
        * @date 2018/5/30 0030 17:14
        * @param [list]
        * @return java.lang.String
        * 平均值
    　*/
    public static String getAverage(List<?> list){
        return new BigDecimal(getSum(list)).compareTo(new BigDecimal(0))==0?"0异常":new BigDecimal(getSum(list)).divide(new BigDecimal(list.size()),BigDecimal.ROUND_HALF_DOWN).toString();
    }
    /*/**
    　  * @author liuguotao
        * @date 2018/5/31 0031 17:03
        * @param [data]
        * @return java.util.List<java.lang.String>
        *     生成集合
    　*/
    public static List<String> getParticleList(Object... data) {
        List<String> list = new ArrayList<>();
        for (Object datum : data) {
            list.add(datum.toString());
        }
        return list;
    }
}
