package tool;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 时间工具
 * @author liuguotao
 * @date 2018/5/30 003015:47
 */
public class DateTool {
    private static final long ONE_MINUTE = 60000L;
    private static final long ONE_HOUR = 3600000L;
    private static final long ONE_DAY = 86400000L;


    private static final String ONE_SECOND_AGO = "刚刚";
    private static final String ONE_MINUTE_AGO = "分钟前";
    private static final String ONE_HOUR_AGO = "小时前";
/*/**
　  * @author liuguotao
    * @date 2018/5/30 0030 16:08
    * @param [format, date]
    * @return java.lang.String
    * 时间格式化字符串
　*/
    public static String formatDate(String format,Date date){
        SimpleDateFormat formatDate = new SimpleDateFormat(format);
        return formatDate.format(date);
    }
    /*/**
    　  * @author liuguotao
        * @date 2018/5/30 0030 16:09
        * @param [date, num]
        * @return java.util.Date
        * 时间推移
    　*/
    public static Date getPassday(Date date,int num){
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        calendar.add(calendar.DATE,num);//把日期往后增加一天.整数往后推,负数往前移动
        return calendar.getTime(); //这个时间就是日期往后推一天的结果
    }
    /*/**
    　  * @author liuguotao
        * @date 2018/5/30 0030 16:11
        * @param [date]
        * @return java.lang.String
        * 个性话时间展示
    　*/
    public static String format(Date date) {
        long delta = new Date().getTime() - date.getTime();
        if (delta < 1L * ONE_MINUTE) {
            return ONE_SECOND_AGO;
        }
        if (delta < 45L * ONE_MINUTE) {
            long minutes = toMinutes(delta);
            if((minutes <= 0 ? 1 : minutes)>30){
                return "半小时前";
            }
            return (minutes <= 0 ? 1 : minutes) + ONE_MINUTE_AGO;
        }
        if (delta < 24L * ONE_HOUR) {
            long hours = toHours(delta);
            if((hours <= 0 ? 1 : hours)>12){//超过12小时显示月日
                SimpleDateFormat format = new SimpleDateFormat("MM-dd");
                return format.format(date);
            }
            return (hours <= 0 ? 1 : hours) + ONE_HOUR_AGO;
        }
        if (delta < 48L * ONE_HOUR) {
            return "昨天";
        }
        SimpleDateFormat format = new SimpleDateFormat("MM-dd");
        return format.format(date);
    }


    private static long toSeconds(long date) {
        return date / 1000L;
    }


    private static long toMinutes(long date) {
        return toSeconds(date) / 60L;
    }


    private static long toHours(long date) {
        return toMinutes(date) / 60L;
    }


    private static long toDays(long date) {
        return toHours(date) / 24L;
    }


    private static long toMonths(long date) {
        return toDays(date) / 30L;
    }


    private static long toYears(long date) {
        return toMonths(date) / 365L;
    }
}
