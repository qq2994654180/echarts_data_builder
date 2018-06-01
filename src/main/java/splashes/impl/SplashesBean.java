package splashes.impl;

import basics.BasicsBean;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author liuguotao
 * @date 2018/5/31 003114:31
 */
final class SplashesBean extends BasicsBean{
    private static SplashesBean splashesBean=null;
    private static Map<String,List<List<?>>> dataList;
    private static Set<String> legend;
    private SplashesBean(){}
    /*/**
    　  * @author liuguotao
        * @date 2018/5/31 0031 16:04
        * @param [map]
        * @return splashes.impl.SplashesBean
        *  数据列表和名称项
    　*/
     static SplashesBean getSplashesBean(Map<String,List<List<?>>> map){
        legend = map.keySet();
        dataList=map;
        synchronized (SplashesBean.class) {
            if (splashesBean == null) {
                splashesBean = new SplashesBean();
            }
        }
        return splashesBean;
    }
    @Override
    public Set<String> getLegend() {
        return legend;
    }

    /*/**
    　  * @author liuguotao
        * @date 2018/5/31 0031 16:18
        * @param []
        * @return java.util.Map<java.lang.String,java.util.List<java.util.List<?>>>
        *     获取数据
    　*/
    public Map<String, List<List<?>>> getDataList() {
        return dataList;
    }
}
