package relation;

import relation.impl.RelationImpl;

import java.util.List;

/**
 * @author liuguotao
 * @date 2018/6/13 001311:01
 * 关系图接口
 */
public interface Relation {
    /*/**
    　  * @author liuguotao
        * @date 2018/6/13 0013 11:26
        * @param []
        * @return java.util.List<java.lang.String>
        *     获取项
    　*/
     List<String> getLegend();
     /*/**
     　  * @author liuguotao
         * @date 2018/6/13 0013 11:27
         * @param [legend]
         * @return void
         * 添加项
     　*/
    void setLegend(List<String> legend);
    /*/**
    　  * @author liuguotao
        * @date 2018/6/13 0013 11:28
        * @param []
        * @return java.util.List<java.lang.String>
        *     获取关系类型
    　*/
    List<String> getCategories();
    /*/**
    　  * @author liuguotao
        * @date 2018/6/13 0013 11:28
        * @param [categories]
        * @return void
        * 添加关系类型
    　*/
    void setCategories(List<String> categories);
    /*/**
    　  * @author liuguotao
        * @date 2018/6/13 0013 11:29
        * @param []
        * @return java.util.List<relation.impl.RelationImpl.RelationLinksData>
        *     获取关系链接数据
    　*/
    List<RelationImpl.RelationLinksData> getLinks();
    /*/**
    　  * @author liuguotao
        * @date 2018/6/13 0013 13:23
        * @param []
        * @return java.util.List<relation.impl.RelationImpl.RelationNodesData>
        *     获取节点数据
    　*/
     List<RelationImpl.RelationNodesData> getNodes();
}
