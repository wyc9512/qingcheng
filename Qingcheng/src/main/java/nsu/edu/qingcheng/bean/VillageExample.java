package nsu.edu.qingcheng.bean;

import java.util.ArrayList;
import java.util.List;

public class VillageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VillageExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andVillageIdIsNull() {
            addCriterion("VILLAGE_ID is null");
            return (Criteria) this;
        }

        public Criteria andVillageIdIsNotNull() {
            addCriterion("VILLAGE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVillageIdEqualTo(Integer value) {
            addCriterion("VILLAGE_ID =", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdNotEqualTo(Integer value) {
            addCriterion("VILLAGE_ID <>", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdGreaterThan(Integer value) {
            addCriterion("VILLAGE_ID >", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("VILLAGE_ID >=", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdLessThan(Integer value) {
            addCriterion("VILLAGE_ID <", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdLessThanOrEqualTo(Integer value) {
            addCriterion("VILLAGE_ID <=", value, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdIn(List<Integer> values) {
            addCriterion("VILLAGE_ID in", values, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdNotIn(List<Integer> values) {
            addCriterion("VILLAGE_ID not in", values, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdBetween(Integer value1, Integer value2) {
            addCriterion("VILLAGE_ID between", value1, value2, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("VILLAGE_ID not between", value1, value2, "villageId");
            return (Criteria) this;
        }

        public Criteria andVillageNameIsNull() {
            addCriterion("VILLAGE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andVillageNameIsNotNull() {
            addCriterion("VILLAGE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andVillageNameEqualTo(String value) {
            addCriterion("VILLAGE_NAME =", value, "villageName");
            return (Criteria) this;
        }

        public Criteria andVillageNameNotEqualTo(String value) {
            addCriterion("VILLAGE_NAME <>", value, "villageName");
            return (Criteria) this;
        }

        public Criteria andVillageNameGreaterThan(String value) {
            addCriterion("VILLAGE_NAME >", value, "villageName");
            return (Criteria) this;
        }

        public Criteria andVillageNameGreaterThanOrEqualTo(String value) {
            addCriterion("VILLAGE_NAME >=", value, "villageName");
            return (Criteria) this;
        }

        public Criteria andVillageNameLessThan(String value) {
            addCriterion("VILLAGE_NAME <", value, "villageName");
            return (Criteria) this;
        }

        public Criteria andVillageNameLessThanOrEqualTo(String value) {
            addCriterion("VILLAGE_NAME <=", value, "villageName");
            return (Criteria) this;
        }

        public Criteria andVillageNameLike(String value) {
            addCriterion("VILLAGE_NAME like", value, "villageName");
            return (Criteria) this;
        }

        public Criteria andVillageNameNotLike(String value) {
            addCriterion("VILLAGE_NAME not like", value, "villageName");
            return (Criteria) this;
        }

        public Criteria andVillageNameIn(List<String> values) {
            addCriterion("VILLAGE_NAME in", values, "villageName");
            return (Criteria) this;
        }

        public Criteria andVillageNameNotIn(List<String> values) {
            addCriterion("VILLAGE_NAME not in", values, "villageName");
            return (Criteria) this;
        }

        public Criteria andVillageNameBetween(String value1, String value2) {
            addCriterion("VILLAGE_NAME between", value1, value2, "villageName");
            return (Criteria) this;
        }

        public Criteria andVillageNameNotBetween(String value1, String value2) {
            addCriterion("VILLAGE_NAME not between", value1, value2, "villageName");
            return (Criteria) this;
        }

        public Criteria andVillagePicIsNull() {
            addCriterion("VILLAGE_PIC is null");
            return (Criteria) this;
        }

        public Criteria andVillagePicIsNotNull() {
            addCriterion("VILLAGE_PIC is not null");
            return (Criteria) this;
        }

        public Criteria andVillagePicEqualTo(String value) {
            addCriterion("VILLAGE_PIC =", value, "villagePic");
            return (Criteria) this;
        }

        public Criteria andVillagePicNotEqualTo(String value) {
            addCriterion("VILLAGE_PIC <>", value, "villagePic");
            return (Criteria) this;
        }

        public Criteria andVillagePicGreaterThan(String value) {
            addCriterion("VILLAGE_PIC >", value, "villagePic");
            return (Criteria) this;
        }

        public Criteria andVillagePicGreaterThanOrEqualTo(String value) {
            addCriterion("VILLAGE_PIC >=", value, "villagePic");
            return (Criteria) this;
        }

        public Criteria andVillagePicLessThan(String value) {
            addCriterion("VILLAGE_PIC <", value, "villagePic");
            return (Criteria) this;
        }

        public Criteria andVillagePicLessThanOrEqualTo(String value) {
            addCriterion("VILLAGE_PIC <=", value, "villagePic");
            return (Criteria) this;
        }

        public Criteria andVillagePicLike(String value) {
            addCriterion("VILLAGE_PIC like", value, "villagePic");
            return (Criteria) this;
        }

        public Criteria andVillagePicNotLike(String value) {
            addCriterion("VILLAGE_PIC not like", value, "villagePic");
            return (Criteria) this;
        }

        public Criteria andVillagePicIn(List<String> values) {
            addCriterion("VILLAGE_PIC in", values, "villagePic");
            return (Criteria) this;
        }

        public Criteria andVillagePicNotIn(List<String> values) {
            addCriterion("VILLAGE_PIC not in", values, "villagePic");
            return (Criteria) this;
        }

        public Criteria andVillagePicBetween(String value1, String value2) {
            addCriterion("VILLAGE_PIC between", value1, value2, "villagePic");
            return (Criteria) this;
        }

        public Criteria andVillagePicNotBetween(String value1, String value2) {
            addCriterion("VILLAGE_PIC not between", value1, value2, "villagePic");
            return (Criteria) this;
        }

        public Criteria andVillageIntroduceIsNull() {
            addCriterion("VILLAGE_INTRODUCE is null");
            return (Criteria) this;
        }

        public Criteria andVillageIntroduceIsNotNull() {
            addCriterion("VILLAGE_INTRODUCE is not null");
            return (Criteria) this;
        }

        public Criteria andVillageIntroduceEqualTo(String value) {
            addCriterion("VILLAGE_INTRODUCE =", value, "villageIntroduce");
            return (Criteria) this;
        }

        public Criteria andVillageIntroduceNotEqualTo(String value) {
            addCriterion("VILLAGE_INTRODUCE <>", value, "villageIntroduce");
            return (Criteria) this;
        }

        public Criteria andVillageIntroduceGreaterThan(String value) {
            addCriterion("VILLAGE_INTRODUCE >", value, "villageIntroduce");
            return (Criteria) this;
        }

        public Criteria andVillageIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("VILLAGE_INTRODUCE >=", value, "villageIntroduce");
            return (Criteria) this;
        }

        public Criteria andVillageIntroduceLessThan(String value) {
            addCriterion("VILLAGE_INTRODUCE <", value, "villageIntroduce");
            return (Criteria) this;
        }

        public Criteria andVillageIntroduceLessThanOrEqualTo(String value) {
            addCriterion("VILLAGE_INTRODUCE <=", value, "villageIntroduce");
            return (Criteria) this;
        }

        public Criteria andVillageIntroduceLike(String value) {
            addCriterion("VILLAGE_INTRODUCE like", value, "villageIntroduce");
            return (Criteria) this;
        }

        public Criteria andVillageIntroduceNotLike(String value) {
            addCriterion("VILLAGE_INTRODUCE not like", value, "villageIntroduce");
            return (Criteria) this;
        }

        public Criteria andVillageIntroduceIn(List<String> values) {
            addCriterion("VILLAGE_INTRODUCE in", values, "villageIntroduce");
            return (Criteria) this;
        }

        public Criteria andVillageIntroduceNotIn(List<String> values) {
            addCriterion("VILLAGE_INTRODUCE not in", values, "villageIntroduce");
            return (Criteria) this;
        }

        public Criteria andVillageIntroduceBetween(String value1, String value2) {
            addCriterion("VILLAGE_INTRODUCE between", value1, value2, "villageIntroduce");
            return (Criteria) this;
        }

        public Criteria andVillageIntroduceNotBetween(String value1, String value2) {
            addCriterion("VILLAGE_INTRODUCE not between", value1, value2, "villageIntroduce");
            return (Criteria) this;
        }

        public Criteria andVillagePlaceIsNull() {
            addCriterion("VILLAGE_PLACE is null");
            return (Criteria) this;
        }

        public Criteria andVillagePlaceIsNotNull() {
            addCriterion("VILLAGE_PLACE is not null");
            return (Criteria) this;
        }

        public Criteria andVillagePlaceEqualTo(String value) {
            addCriterion("VILLAGE_PLACE =", value, "villagePlace");
            return (Criteria) this;
        }

        public Criteria andVillagePlaceNotEqualTo(String value) {
            addCriterion("VILLAGE_PLACE <>", value, "villagePlace");
            return (Criteria) this;
        }

        public Criteria andVillagePlaceGreaterThan(String value) {
            addCriterion("VILLAGE_PLACE >", value, "villagePlace");
            return (Criteria) this;
        }

        public Criteria andVillagePlaceGreaterThanOrEqualTo(String value) {
            addCriterion("VILLAGE_PLACE >=", value, "villagePlace");
            return (Criteria) this;
        }

        public Criteria andVillagePlaceLessThan(String value) {
            addCriterion("VILLAGE_PLACE <", value, "villagePlace");
            return (Criteria) this;
        }

        public Criteria andVillagePlaceLessThanOrEqualTo(String value) {
            addCriterion("VILLAGE_PLACE <=", value, "villagePlace");
            return (Criteria) this;
        }

        public Criteria andVillagePlaceLike(String value) {
            addCriterion("VILLAGE_PLACE like", value, "villagePlace");
            return (Criteria) this;
        }

        public Criteria andVillagePlaceNotLike(String value) {
            addCriterion("VILLAGE_PLACE not like", value, "villagePlace");
            return (Criteria) this;
        }

        public Criteria andVillagePlaceIn(List<String> values) {
            addCriterion("VILLAGE_PLACE in", values, "villagePlace");
            return (Criteria) this;
        }

        public Criteria andVillagePlaceNotIn(List<String> values) {
            addCriterion("VILLAGE_PLACE not in", values, "villagePlace");
            return (Criteria) this;
        }

        public Criteria andVillagePlaceBetween(String value1, String value2) {
            addCriterion("VILLAGE_PLACE between", value1, value2, "villagePlace");
            return (Criteria) this;
        }

        public Criteria andVillagePlaceNotBetween(String value1, String value2) {
            addCriterion("VILLAGE_PLACE not between", value1, value2, "villagePlace");
            return (Criteria) this;
        }

        public Criteria andVillageKeywordIsNull() {
            addCriterion("VILLAGE_KEYWORD is null");
            return (Criteria) this;
        }

        public Criteria andVillageKeywordIsNotNull() {
            addCriterion("VILLAGE_KEYWORD is not null");
            return (Criteria) this;
        }

        public Criteria andVillageKeywordEqualTo(String value) {
            addCriterion("VILLAGE_KEYWORD =", value, "villageKeyword");
            return (Criteria) this;
        }

        public Criteria andVillageKeywordNotEqualTo(String value) {
            addCriterion("VILLAGE_KEYWORD <>", value, "villageKeyword");
            return (Criteria) this;
        }

        public Criteria andVillageKeywordGreaterThan(String value) {
            addCriterion("VILLAGE_KEYWORD >", value, "villageKeyword");
            return (Criteria) this;
        }

        public Criteria andVillageKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("VILLAGE_KEYWORD >=", value, "villageKeyword");
            return (Criteria) this;
        }

        public Criteria andVillageKeywordLessThan(String value) {
            addCriterion("VILLAGE_KEYWORD <", value, "villageKeyword");
            return (Criteria) this;
        }

        public Criteria andVillageKeywordLessThanOrEqualTo(String value) {
            addCriterion("VILLAGE_KEYWORD <=", value, "villageKeyword");
            return (Criteria) this;
        }

        public Criteria andVillageKeywordLike(String value) {
            addCriterion("VILLAGE_KEYWORD like", value, "villageKeyword");
            return (Criteria) this;
        }

        public Criteria andVillageKeywordNotLike(String value) {
            addCriterion("VILLAGE_KEYWORD not like", value, "villageKeyword");
            return (Criteria) this;
        }

        public Criteria andVillageKeywordIn(List<String> values) {
            addCriterion("VILLAGE_KEYWORD in", values, "villageKeyword");
            return (Criteria) this;
        }

        public Criteria andVillageKeywordNotIn(List<String> values) {
            addCriterion("VILLAGE_KEYWORD not in", values, "villageKeyword");
            return (Criteria) this;
        }

        public Criteria andVillageKeywordBetween(String value1, String value2) {
            addCriterion("VILLAGE_KEYWORD between", value1, value2, "villageKeyword");
            return (Criteria) this;
        }

        public Criteria andVillageKeywordNotBetween(String value1, String value2) {
            addCriterion("VILLAGE_KEYWORD not between", value1, value2, "villageKeyword");
            return (Criteria) this;
        }

        public Criteria andVillageMapIsNull() {
            addCriterion("VILLAGE_MAP is null");
            return (Criteria) this;
        }

        public Criteria andVillageMapIsNotNull() {
            addCriterion("VILLAGE_MAP is not null");
            return (Criteria) this;
        }

        public Criteria andVillageMapEqualTo(String value) {
            addCriterion("VILLAGE_MAP =", value, "villageMap");
            return (Criteria) this;
        }

        public Criteria andVillageMapNotEqualTo(String value) {
            addCriterion("VILLAGE_MAP <>", value, "villageMap");
            return (Criteria) this;
        }

        public Criteria andVillageMapGreaterThan(String value) {
            addCriterion("VILLAGE_MAP >", value, "villageMap");
            return (Criteria) this;
        }

        public Criteria andVillageMapGreaterThanOrEqualTo(String value) {
            addCriterion("VILLAGE_MAP >=", value, "villageMap");
            return (Criteria) this;
        }

        public Criteria andVillageMapLessThan(String value) {
            addCriterion("VILLAGE_MAP <", value, "villageMap");
            return (Criteria) this;
        }

        public Criteria andVillageMapLessThanOrEqualTo(String value) {
            addCriterion("VILLAGE_MAP <=", value, "villageMap");
            return (Criteria) this;
        }

        public Criteria andVillageMapLike(String value) {
            addCriterion("VILLAGE_MAP like", value, "villageMap");
            return (Criteria) this;
        }

        public Criteria andVillageMapNotLike(String value) {
            addCriterion("VILLAGE_MAP not like", value, "villageMap");
            return (Criteria) this;
        }

        public Criteria andVillageMapIn(List<String> values) {
            addCriterion("VILLAGE_MAP in", values, "villageMap");
            return (Criteria) this;
        }

        public Criteria andVillageMapNotIn(List<String> values) {
            addCriterion("VILLAGE_MAP not in", values, "villageMap");
            return (Criteria) this;
        }

        public Criteria andVillageMapBetween(String value1, String value2) {
            addCriterion("VILLAGE_MAP between", value1, value2, "villageMap");
            return (Criteria) this;
        }

        public Criteria andVillageMapNotBetween(String value1, String value2) {
            addCriterion("VILLAGE_MAP not between", value1, value2, "villageMap");
            return (Criteria) this;
        }

        public Criteria andVillageTrafficIsNull() {
            addCriterion("VILLAGE_TRAFFIC is null");
            return (Criteria) this;
        }

        public Criteria andVillageTrafficIsNotNull() {
            addCriterion("VILLAGE_TRAFFIC is not null");
            return (Criteria) this;
        }

        public Criteria andVillageTrafficEqualTo(String value) {
            addCriterion("VILLAGE_TRAFFIC =", value, "villageTraffic");
            return (Criteria) this;
        }

        public Criteria andVillageTrafficNotEqualTo(String value) {
            addCriterion("VILLAGE_TRAFFIC <>", value, "villageTraffic");
            return (Criteria) this;
        }

        public Criteria andVillageTrafficGreaterThan(String value) {
            addCriterion("VILLAGE_TRAFFIC >", value, "villageTraffic");
            return (Criteria) this;
        }

        public Criteria andVillageTrafficGreaterThanOrEqualTo(String value) {
            addCriterion("VILLAGE_TRAFFIC >=", value, "villageTraffic");
            return (Criteria) this;
        }

        public Criteria andVillageTrafficLessThan(String value) {
            addCriterion("VILLAGE_TRAFFIC <", value, "villageTraffic");
            return (Criteria) this;
        }

        public Criteria andVillageTrafficLessThanOrEqualTo(String value) {
            addCriterion("VILLAGE_TRAFFIC <=", value, "villageTraffic");
            return (Criteria) this;
        }

        public Criteria andVillageTrafficLike(String value) {
            addCriterion("VILLAGE_TRAFFIC like", value, "villageTraffic");
            return (Criteria) this;
        }

        public Criteria andVillageTrafficNotLike(String value) {
            addCriterion("VILLAGE_TRAFFIC not like", value, "villageTraffic");
            return (Criteria) this;
        }

        public Criteria andVillageTrafficIn(List<String> values) {
            addCriterion("VILLAGE_TRAFFIC in", values, "villageTraffic");
            return (Criteria) this;
        }

        public Criteria andVillageTrafficNotIn(List<String> values) {
            addCriterion("VILLAGE_TRAFFIC not in", values, "villageTraffic");
            return (Criteria) this;
        }

        public Criteria andVillageTrafficBetween(String value1, String value2) {
            addCriterion("VILLAGE_TRAFFIC between", value1, value2, "villageTraffic");
            return (Criteria) this;
        }

        public Criteria andVillageTrafficNotBetween(String value1, String value2) {
            addCriterion("VILLAGE_TRAFFIC not between", value1, value2, "villageTraffic");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}