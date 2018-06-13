package relation.impl;

import relation.Relation;

import java.util.List;

/**
 * @author liuguotao
 * @date 2018/6/13 001311:03
 * 关系图实现
 */
public class RelationImpl implements Relation{
    private RelationBean relationBean;

    public RelationImpl(List<RelationLinksData> linksData,List<RelationNodesData> nodesData){
        relationBean=RelationBean.getRelationBean(linksData,nodesData);
    }

    @Override
    public List<String> getLegend() {
        return relationBean.getLegend();
    }

    @Override
    public void setLegend(List<String> legend) {
        relationBean.setLegend(legend);
    }

    @Override
    public List<String> getCategories() {
        return relationBean.getCategories();
    }

    @Override
    public void setCategories(List<String> categories) {
        relationBean.setCategories(categories);
    }

    @Override
    public List<RelationLinksData> getLinks() {
        return relationBean.getLinks();
    }

    @Override
    public List<RelationNodesData> getNodes() {
        return relationBean.getNodes();
    }

    /**nodes数据类*/
    public static class RelationNodesData{
        private String name;
        private int category;
        private int value;
        private String label;

        @Override
        public String toString() {
            return "RelationNodesData{" +
                    "name='" + name + '\'' +
                    ", category=" + category +
                    ", value=" + value +
                    ", label='" + label + '\'' +
                    '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCategory() {
            return category;
        }

        public void setCategory(int category) {
            this.category = category;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }
    }
    /**links数据类*/
    public static class RelationLinksData{
        private String source;
        private String target;
        private int weight;
        private String name;

        @Override
        public String toString() {
            return "RelationLinksData{" +
                    "source='" + source + '\'' +
                    ", target='" + target + '\'' +
                    ", weight=" + weight +
                    ", name='" + name + '\'' +
                    '}';
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getTarget() {
            return target;
        }

        public void setTarget(String target) {
            this.target = target;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
