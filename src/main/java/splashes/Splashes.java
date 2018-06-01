package splashes;

import basics.BasicsInterface;

import java.util.List;
import java.util.Map;

/**
 * @author liuguotao
 * @date 2018/5/31 003114:30
 * 散点图接口
 */
public interface Splashes extends BasicsInterface{

    /*/**
    　  * @author liuguotao
        * @date 2018/5/31 0031 16:19
        * @param []
        * @return java.util.Map<java.lang.String,java.util.List<java.util.List<?>>>
        *     获取数据
    　*/
    Map<String, List<List<?>>> getDataList();
}
