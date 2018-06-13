package relation.impl;

import java.util.List;

/**
 * @author liuguotao
 * @date 2018/6/13 001311:02
 * 关系图实体
 */
final class RelationBean {
    private static RelationBean relationBean=null;
    private List<String> legend;
    private List<String> categories;
    private static List<RelationImpl.RelationLinksData> links;
    private static List<RelationImpl.RelationNodesData> nodes;
    private RelationBean(){}
    static RelationBean getRelationBean(List<RelationImpl.RelationLinksData> link,List<RelationImpl.RelationNodesData> node){
        links=link;
        nodes=node;
        synchronized (RelationBean.class) {
            if (relationBean == null) {
                relationBean = new RelationBean();
            }
        }
        return relationBean;
    }

    public List<String> getLegend() {
        return legend;
    }

    public void setLegend(List<String> legend) {
        this.legend = legend;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public List<RelationImpl.RelationLinksData> getLinks() {
        return links;
    }

    public List<RelationImpl.RelationNodesData> getNodes() {
        return nodes;
    }

}
