package nsu.edu.qingcheng.bean;

import java.util.ArrayList;
import java.util.List;

public class ScenicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScenicExample() {
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

        public Criteria andScenicIdIsNull() {
            addCriterion("SCENIC_ID is null");
            return (Criteria) this;
        }

        public Criteria andScenicIdIsNotNull() {
            addCriterion("SCENIC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andScenicIdEqualTo(Integer value) {
            addCriterion("SCENIC_ID =", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdNotEqualTo(Integer value) {
            addCriterion("SCENIC_ID <>", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdGreaterThan(Integer value) {
            addCriterion("SCENIC_ID >", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SCENIC_ID >=", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdLessThan(Integer value) {
            addCriterion("SCENIC_ID <", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdLessThanOrEqualTo(Integer value) {
            addCriterion("SCENIC_ID <=", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdIn(List<Integer> values) {
            addCriterion("SCENIC_ID in", values, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdNotIn(List<Integer> values) {
            addCriterion("SCENIC_ID not in", values, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdBetween(Integer value1, Integer value2) {
            addCriterion("SCENIC_ID between", value1, value2, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SCENIC_ID not between", value1, value2, "scenicId");
            return (Criteria) this;
        }

        public Criteria andMenuscenicIdIsNull() {
            addCriterion("MENUSCENIC_ID is null");
            return (Criteria) this;
        }

        public Criteria andMenuscenicIdIsNotNull() {
            addCriterion("MENUSCENIC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMenuscenicIdEqualTo(Integer value) {
            addCriterion("MENUSCENIC_ID =", value, "menuscenicId");
            return (Criteria) this;
        }

        public Criteria andMenuscenicIdNotEqualTo(Integer value) {
            addCriterion("MENUSCENIC_ID <>", value, "menuscenicId");
            return (Criteria) this;
        }

        public Criteria andMenuscenicIdGreaterThan(Integer value) {
            addCriterion("MENUSCENIC_ID >", value, "menuscenicId");
            return (Criteria) this;
        }

        public Criteria andMenuscenicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("MENUSCENIC_ID >=", value, "menuscenicId");
            return (Criteria) this;
        }

        public Criteria andMenuscenicIdLessThan(Integer value) {
            addCriterion("MENUSCENIC_ID <", value, "menuscenicId");
            return (Criteria) this;
        }

        public Criteria andMenuscenicIdLessThanOrEqualTo(Integer value) {
            addCriterion("MENUSCENIC_ID <=", value, "menuscenicId");
            return (Criteria) this;
        }

        public Criteria andMenuscenicIdIn(List<Integer> values) {
            addCriterion("MENUSCENIC_ID in", values, "menuscenicId");
            return (Criteria) this;
        }

        public Criteria andMenuscenicIdNotIn(List<Integer> values) {
            addCriterion("MENUSCENIC_ID not in", values, "menuscenicId");
            return (Criteria) this;
        }

        public Criteria andMenuscenicIdBetween(Integer value1, Integer value2) {
            addCriterion("MENUSCENIC_ID between", value1, value2, "menuscenicId");
            return (Criteria) this;
        }

        public Criteria andMenuscenicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("MENUSCENIC_ID not between", value1, value2, "menuscenicId");
            return (Criteria) this;
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

        public Criteria andScenicNameIsNull() {
            addCriterion("SCENIC_NAME is null");
            return (Criteria) this;
        }

        public Criteria andScenicNameIsNotNull() {
            addCriterion("SCENIC_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andScenicNameEqualTo(String value) {
            addCriterion("SCENIC_NAME =", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameNotEqualTo(String value) {
            addCriterion("SCENIC_NAME <>", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameGreaterThan(String value) {
            addCriterion("SCENIC_NAME >", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameGreaterThanOrEqualTo(String value) {
            addCriterion("SCENIC_NAME >=", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameLessThan(String value) {
            addCriterion("SCENIC_NAME <", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameLessThanOrEqualTo(String value) {
            addCriterion("SCENIC_NAME <=", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameLike(String value) {
            addCriterion("SCENIC_NAME like", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameNotLike(String value) {
            addCriterion("SCENIC_NAME not like", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameIn(List<String> values) {
            addCriterion("SCENIC_NAME in", values, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameNotIn(List<String> values) {
            addCriterion("SCENIC_NAME not in", values, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameBetween(String value1, String value2) {
            addCriterion("SCENIC_NAME between", value1, value2, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameNotBetween(String value1, String value2) {
            addCriterion("SCENIC_NAME not between", value1, value2, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicIntroduceIsNull() {
            addCriterion("SCENIC_INTRODUCE is null");
            return (Criteria) this;
        }

        public Criteria andScenicIntroduceIsNotNull() {
            addCriterion("SCENIC_INTRODUCE is not null");
            return (Criteria) this;
        }

        public Criteria andScenicIntroduceEqualTo(String value) {
            addCriterion("SCENIC_INTRODUCE =", value, "scenicIntroduce");
            return (Criteria) this;
        }

        public Criteria andScenicIntroduceNotEqualTo(String value) {
            addCriterion("SCENIC_INTRODUCE <>", value, "scenicIntroduce");
            return (Criteria) this;
        }

        public Criteria andScenicIntroduceGreaterThan(String value) {
            addCriterion("SCENIC_INTRODUCE >", value, "scenicIntroduce");
            return (Criteria) this;
        }

        public Criteria andScenicIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("SCENIC_INTRODUCE >=", value, "scenicIntroduce");
            return (Criteria) this;
        }

        public Criteria andScenicIntroduceLessThan(String value) {
            addCriterion("SCENIC_INTRODUCE <", value, "scenicIntroduce");
            return (Criteria) this;
        }

        public Criteria andScenicIntroduceLessThanOrEqualTo(String value) {
            addCriterion("SCENIC_INTRODUCE <=", value, "scenicIntroduce");
            return (Criteria) this;
        }

        public Criteria andScenicIntroduceLike(String value) {
            addCriterion("SCENIC_INTRODUCE like", value, "scenicIntroduce");
            return (Criteria) this;
        }

        public Criteria andScenicIntroduceNotLike(String value) {
            addCriterion("SCENIC_INTRODUCE not like", value, "scenicIntroduce");
            return (Criteria) this;
        }

        public Criteria andScenicIntroduceIn(List<String> values) {
            addCriterion("SCENIC_INTRODUCE in", values, "scenicIntroduce");
            return (Criteria) this;
        }

        public Criteria andScenicIntroduceNotIn(List<String> values) {
            addCriterion("SCENIC_INTRODUCE not in", values, "scenicIntroduce");
            return (Criteria) this;
        }

        public Criteria andScenicIntroduceBetween(String value1, String value2) {
            addCriterion("SCENIC_INTRODUCE between", value1, value2, "scenicIntroduce");
            return (Criteria) this;
        }

        public Criteria andScenicIntroduceNotBetween(String value1, String value2) {
            addCriterion("SCENIC_INTRODUCE not between", value1, value2, "scenicIntroduce");
            return (Criteria) this;
        }

        public Criteria andScenicPicIsNull() {
            addCriterion("SCENIC_PIC is null");
            return (Criteria) this;
        }

        public Criteria andScenicPicIsNotNull() {
            addCriterion("SCENIC_PIC is not null");
            return (Criteria) this;
        }

        public Criteria andScenicPicEqualTo(String value) {
            addCriterion("SCENIC_PIC =", value, "scenicPic");
            return (Criteria) this;
        }

        public Criteria andScenicPicNotEqualTo(String value) {
            addCriterion("SCENIC_PIC <>", value, "scenicPic");
            return (Criteria) this;
        }

        public Criteria andScenicPicGreaterThan(String value) {
            addCriterion("SCENIC_PIC >", value, "scenicPic");
            return (Criteria) this;
        }

        public Criteria andScenicPicGreaterThanOrEqualTo(String value) {
            addCriterion("SCENIC_PIC >=", value, "scenicPic");
            return (Criteria) this;
        }

        public Criteria andScenicPicLessThan(String value) {
            addCriterion("SCENIC_PIC <", value, "scenicPic");
            return (Criteria) this;
        }

        public Criteria andScenicPicLessThanOrEqualTo(String value) {
            addCriterion("SCENIC_PIC <=", value, "scenicPic");
            return (Criteria) this;
        }

        public Criteria andScenicPicLike(String value) {
            addCriterion("SCENIC_PIC like", value, "scenicPic");
            return (Criteria) this;
        }

        public Criteria andScenicPicNotLike(String value) {
            addCriterion("SCENIC_PIC not like", value, "scenicPic");
            return (Criteria) this;
        }

        public Criteria andScenicPicIn(List<String> values) {
            addCriterion("SCENIC_PIC in", values, "scenicPic");
            return (Criteria) this;
        }

        public Criteria andScenicPicNotIn(List<String> values) {
            addCriterion("SCENIC_PIC not in", values, "scenicPic");
            return (Criteria) this;
        }

        public Criteria andScenicPicBetween(String value1, String value2) {
            addCriterion("SCENIC_PIC between", value1, value2, "scenicPic");
            return (Criteria) this;
        }

        public Criteria andScenicPicNotBetween(String value1, String value2) {
            addCriterion("SCENIC_PIC not between", value1, value2, "scenicPic");
            return (Criteria) this;
        }

        public Criteria andScenicKeywordIsNull() {
            addCriterion("SCENIC_KEYWORD is null");
            return (Criteria) this;
        }

        public Criteria andScenicKeywordIsNotNull() {
            addCriterion("SCENIC_KEYWORD is not null");
            return (Criteria) this;
        }

        public Criteria andScenicKeywordEqualTo(String value) {
            addCriterion("SCENIC_KEYWORD =", value, "scenicKeyword");
            return (Criteria) this;
        }

        public Criteria andScenicKeywordNotEqualTo(String value) {
            addCriterion("SCENIC_KEYWORD <>", value, "scenicKeyword");
            return (Criteria) this;
        }

        public Criteria andScenicKeywordGreaterThan(String value) {
            addCriterion("SCENIC_KEYWORD >", value, "scenicKeyword");
            return (Criteria) this;
        }

        public Criteria andScenicKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("SCENIC_KEYWORD >=", value, "scenicKeyword");
            return (Criteria) this;
        }

        public Criteria andScenicKeywordLessThan(String value) {
            addCriterion("SCENIC_KEYWORD <", value, "scenicKeyword");
            return (Criteria) this;
        }

        public Criteria andScenicKeywordLessThanOrEqualTo(String value) {
            addCriterion("SCENIC_KEYWORD <=", value, "scenicKeyword");
            return (Criteria) this;
        }

        public Criteria andScenicKeywordLike(String value) {
            addCriterion("SCENIC_KEYWORD like", value, "scenicKeyword");
            return (Criteria) this;
        }

        public Criteria andScenicKeywordNotLike(String value) {
            addCriterion("SCENIC_KEYWORD not like", value, "scenicKeyword");
            return (Criteria) this;
        }

        public Criteria andScenicKeywordIn(List<String> values) {
            addCriterion("SCENIC_KEYWORD in", values, "scenicKeyword");
            return (Criteria) this;
        }

        public Criteria andScenicKeywordNotIn(List<String> values) {
            addCriterion("SCENIC_KEYWORD not in", values, "scenicKeyword");
            return (Criteria) this;
        }

        public Criteria andScenicKeywordBetween(String value1, String value2) {
            addCriterion("SCENIC_KEYWORD between", value1, value2, "scenicKeyword");
            return (Criteria) this;
        }

        public Criteria andScenicKeywordNotBetween(String value1, String value2) {
            addCriterion("SCENIC_KEYWORD not between", value1, value2, "scenicKeyword");
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