package basics;

import tool.DateTool;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * @author liuguotao
 * @date 2018/5/31 003114:56
 * 所有图表实体的抽象类
 */
public abstract class BasicsBean {
    private List<String> X;
    private List<String> Y;

    /*/**
     * @author liuguotao
     * @date 2018/5/31 0031 11:16
     * @param [list]
     * @return java.util.List<java.lang.String>
     *     Y轴
     */
    public List<String> getY(List<?> objects) {
        List<String> Y = new ArrayList<>();
        for (Object o : objects) {
            Y.add(o.toString());
        }
        this.Y=Y;
        return Y;
    }
    /*/**
     * @author liuguotao
     * @date 2018/5/31 0031 11:18
     * @param [list, symbol]
     * @return java.util.List<java.lang.String>
     *     带符号项的Y轴
     */
    public List<String> getY(List<?> objects, String symbol){
        List<String> Y = new ArrayList<>();
        for (Object s : objects) {
            Y.add(s.toString()+symbol);
        }
        this.Y=Y;
        return this.Y;
    }
    /*/**
    　  * @author liuguotao
        * @date 2018/6/1 0001 8:26
        * @param [dates, format]
        * @return java.util.List<java.lang.String>
        *      时间Y轴
    　*/
    public List<String> getDateY(List<Date> dates, String format){
        List<String> formatDate= new ArrayList<>();
        for (Date date : dates) {
            String s = DateTool.formatDate(format, date);
            formatDate.add(s);
        }
        Y=formatDate;
        return formatDate;
    }
    /*/**
     * @author liuguotao
     * @date 2018/5/31 0031 8:46
     * @param [dates, format]
     * @return java.util.List<java.lang.String>
     *     时间X轴
     */
    public List<String> getDateX(List<Date> dates, String format){
        List<String> formatDate= new ArrayList<>();
        for (Date date : dates) {
            String s = DateTool.formatDate(format, date);
            formatDate.add(s);
        }
        X=formatDate;
        return formatDate;
    }

    /*/**
     * @author liuguotao
     * @date 2018/5/31 0031 8:48
     * @param [objects]
     * @return java.util.List<java.lang.String>
     *     其他类型
     */
    public List<String> getX(List<?> objects){
        List<String> x=new ArrayList<>();
        for (Object object : objects) {
            x.add(object.toString());
        }
        X=x;
        return x;
    }
    /*/**
    　  * @author liuguotao
        * @date 2018/5/31 0031 14:59
        * @param [objects, symbol]
        * @return java.util.List<java.lang.String>
    　*/
    public List<String> getX(List<?> objects, String symbol){
        List<String> x=new ArrayList<>();
        for (Object object : objects) {
            x.add(object.toString()+symbol);
        }
        X=x;
        return x;
    }

    /*/**
     * @author liuguotao
     * @date 2018/5/31 0031 9:12
     * @param []
     * @return java.util.List<java.lang.String>
     *     获取名称项
     */
   public abstract Set<String> getLegend();
}
