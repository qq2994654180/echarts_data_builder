import radar.Radar;
import radar.impl.RadarImpl;
import relation.Relation;
import relation.impl.RelationImpl;

import java.util.*;

/**
 * @author liuguotao
 * @date 2018/5/31 003110:37
 */
public class TestA {
    public static void main(String[] args) {
        /**制造数据*/
        RelationImpl.RelationLinksData relationLinksData = new RelationImpl.RelationLinksData();
        relationLinksData.setName("父亲");//关系
        relationLinksData.setSource("张三");//本人
        relationLinksData.setTarget("张一");//关系人
        relationLinksData.setWeight(1);//权重
        //张一是张三的父亲
        RelationImpl.RelationNodesData relationNodesData=new RelationImpl.RelationNodesData();
        relationNodesData.setCategory(0);//所属类型
        relationNodesData.setLabel("张三(主要人)");//显示本人信息
        relationNodesData.setName("张三");//本人姓名
        relationNodesData.setValue(10);//圆点大小
        List<RelationImpl.RelationLinksData> relationLinksData1 = new ArrayList<>();
        relationLinksData1.add(relationLinksData);
        List<RelationImpl.RelationNodesData> relationNodesData1 = new ArrayList<>();
        relationNodesData1.add(relationNodesData);
        Relation relation = new RelationImpl(relationLinksData1, relationNodesData1);
        List<String> strings = new ArrayList<>();
        strings.add("本人");
        strings.add("亲人");
        List<String> strings1 = new ArrayList<>();
        strings1.add("亲人");
        relation.setCategories(strings);
        relation.setLegend(strings1);
        List<String> categories = relation.getCategories();
        List<String> legend = relation.getLegend();
        List<RelationImpl.RelationLinksData> links = relation.getLinks();
        List<RelationImpl.RelationNodesData> nodes = relation.getNodes();
        System.out.println(categories.toString());
        System.out.println(legend.toString());
        System.out.println(links.toString());
        System.out.println(nodes.toString());
    }
}
