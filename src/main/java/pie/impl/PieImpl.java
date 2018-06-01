package pie.impl;

import pie.Pie;

import java.util.List;
import java.util.Set;

/**
 * @author liuguotao
 * @date 2018/6/1 00019:10
 */
public class PieImpl implements Pie{

    private PieBean pieBean;

    public  PieImpl(List<PieData> map){
       pieBean=PieBean.getPieBean(map);
    }

    @Override
    public List<PieData> getDataList() {
        return pieBean.getDataList();
    }

    @Override
    public Set<String> getLegend() {
        return pieBean.getLegend();
    }
    /*/**
     * @author liuguotao
     * @date 2018/6/1 0001 9:08
     *规定参数
     */
    public static class PieData{
        private String name;
        private Object value;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "PieData{" +
                    "name='" + name + '\'' +
                    ", value=" + value +
                    '}';
        }
    }
}
