import line_histogram.LineHistogram;
import line_histogram.impl.LineHistogramImpl;
import pie.Pie;
import pie.impl.PieBean;
import pie.impl.PieImpl;
import splashes.Splashes;
import splashes.impl.SplashesImpl;
import tool.DataTool;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author liuguotao
 * @date 2018/5/31 003110:37
 */
public class TestA {
    public static void main(String[] args) {
        //制造数据
        List<Integer> data = new ArrayList<>();
        data.add(5);
        data.add(10);
        data.add(7);
        data.add(8);
        List<Integer> data2 = new ArrayList<>();
        data2.add(5);
        data2.add(10);
        data2.add(7);
        data2.add(8);
        List<Integer> data3 = new ArrayList<>();
        data3.add(5);
        data3.add(10);
        data3.add(7);
        data3.add(8);
        Map<String, List<?>> map = new HashMap<String,List<?>>();
        map.put("data",data);
        map.put("data2",data2);
        map.put("data3",data3);
        //end
        //制造一个轴数据
        List<Date> date = new ArrayList<>();
        date.add(new Date());
        date.add(new Date());
        date.add(new Date());
        date.add(new Date());
        //end
        LineHistogram lineHistogram = new LineHistogramImpl(map);//创建工具类接口
        Map<String, List<?>> dataList = lineHistogram.getDataList();//获取数据
        Map<String, Object> average = lineHistogram.getAverage();//获取每项均价
        String data1 = lineHistogram.getAverage("data");//获取某项均价
        Set<String> legend = lineHistogram.getLegend();//获取名称项
        List<String> dateX = lineHistogram.getDateX(date, "yyyy-MM-dd");//创建一个时间X轴

        System.out.println(dataList.toString());
        System.out.println(average.toString());
        System.out.println(data1);
        System.out.println(new ArrayList<>(legend).toString());
        System.out.println(dateX.toString());

    }
}
