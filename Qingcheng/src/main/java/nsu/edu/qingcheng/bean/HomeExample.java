package nsu.edu.qingcheng.bean;

import java.util.ArrayList;
import java.util.List;

public class HomeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HomeExample() {
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

        public Criteria andHomeIdIsNull() {
            addCriterion("HOME_ID is null");
            return (Criteria) this;
        }

        public Criteria andHomeIdIsNotNull() {
            addCriterion("HOME_ID is not null");
            return (Criteria) this;
        }

        public Criteria andHomeIdEqualTo(Integer value) {
            addCriterion("HOME_ID =", value, "homeId");
            return (Criteria) this;
        }

        public Criteria andHomeIdNotEqualTo(Integer value) {
            addCriterion("HOME_ID <>", value, "homeId");
            return (Criteria) this;
        }

        public Criteria andHomeIdGreaterThan(Integer value) {
            addCriterion("HOME_ID >", value, "homeId");
            return (Criteria) this;
        }

        public Criteria andHomeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("HOME_ID >=", value, "homeId");
            return (Criteria) this;
        }

        public Criteria andHomeIdLessThan(Integer value) {
            addCriterion("HOME_ID <", value, "homeId");
            return (Criteria) this;
        }

        public Criteria andHomeIdLessThanOrEqualTo(Integer value) {
            addCriterion("HOME_ID <=", value, "homeId");
            return (Criteria) this;
        }

        public Criteria andHomeIdIn(List<Integer> values) {
            addCriterion("HOME_ID in", values, "homeId");
            return (Criteria) this;
        }

        public Criteria andHomeIdNotIn(List<Integer> values) {
            addCriterion("HOME_ID not in", values, "homeId");
            return (Criteria) this;
        }

        public Criteria andHomeIdBetween(Integer value1, Integer value2) {
            addCriterion("HOME_ID between", value1, value2, "homeId");
            return (Criteria) this;
        }

        public Criteria andHomeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("HOME_ID not between", value1, value2, "homeId");
            return (Criteria) this;
        }

        public Criteria andHomePicIsNull() {
            addCriterion("HOME_PIC is null");
            return (Criteria) this;
        }

        public Criteria andHomePicIsNotNull() {
            addCriterion("HOME_PIC is not null");
            return (Criteria) this;
        }

        public Criteria andHomePicEqualTo(String value) {
            addCriterion("HOME_PIC =", value, "homePic");
            return (Criteria) this;
        }

        public Criteria andHomePicNotEqualTo(String value) {
            addCriterion("HOME_PIC <>", value, "homePic");
            return (Criteria) this;
        }

        public Criteria andHomePicGreaterThan(String value) {
            addCriterion("HOME_PIC >", value, "homePic");
            return (Criteria) this;
        }

        public Criteria andHomePicGreaterThanOrEqualTo(String value) {
            addCriterion("HOME_PIC >=", value, "homePic");
            return (Criteria) this;
        }

        public Criteria andHomePicLessThan(String value) {
            addCriterion("HOME_PIC <", value, "homePic");
            return (Criteria) this;
        }

        public Criteria andHomePicLessThanOrEqualTo(String value) {
            addCriterion("HOME_PIC <=", value, "homePic");
            return (Criteria) this;
        }

        public Criteria andHomePicLike(String value) {
            addCriterion("HOME_PIC like", value, "homePic");
            return (Criteria) this;
        }

        public Criteria andHomePicNotLike(String value) {
            addCriterion("HOME_PIC not like", value, "homePic");
            return (Criteria) this;
        }

        public Criteria andHomePicIn(List<String> values) {
            addCriterion("HOME_PIC in", values, "homePic");
            return (Criteria) this;
        }

        public Criteria andHomePicNotIn(List<String> values) {
            addCriterion("HOME_PIC not in", values, "homePic");
            return (Criteria) this;
        }

        public Criteria andHomePicBetween(String value1, String value2) {
            addCriterion("HOME_PIC between", value1, value2, "homePic");
            return (Criteria) this;
        }

        public Criteria andHomePicNotBetween(String value1, String value2) {
            addCriterion("HOME_PIC not between", value1, value2, "homePic");
            return (Criteria) this;
        }

        public Criteria andHomeIntroduceIsNull() {
            addCriterion("HOME_INTRODUCE is null");
            return (Criteria) this;
        }

        public Criteria andHomeIntroduceIsNotNull() {
            addCriterion("HOME_INTRODUCE is not null");
            return (Criteria) this;
        }

        public Criteria andHomeIntroduceEqualTo(String value) {
            addCriterion("HOME_INTRODUCE =", value, "homeIntroduce");
            return (Criteria) this;
        }

        public Criteria andHomeIntroduceNotEqualTo(String value) {
            addCriterion("HOME_INTRODUCE <>", value, "homeIntroduce");
            return (Criteria) this;
        }

        public Criteria andHomeIntroduceGreaterThan(String value) {
            addCriterion("HOME_INTRODUCE >", value, "homeIntroduce");
            return (Criteria) this;
        }

        public Criteria andHomeIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("HOME_INTRODUCE >=", value, "homeIntroduce");
            return (Criteria) this;
        }

        public Criteria andHomeIntroduceLessThan(String value) {
            addCriterion("HOME_INTRODUCE <", value, "homeIntroduce");
            return (Criteria) this;
        }

        public Criteria andHomeIntroduceLessThanOrEqualTo(String value) {
            addCriterion("HOME_INTRODUCE <=", value, "homeIntroduce");
            return (Criteria) this;
        }

        public Criteria andHomeIntroduceLike(String value) {
            addCriterion("HOME_INTRODUCE like", value, "homeIntroduce");
            return (Criteria) this;
        }

        public Criteria andHomeIntroduceNotLike(String value) {
            addCriterion("HOME_INTRODUCE not like", value, "homeIntroduce");
            return (Criteria) this;
        }

        public Criteria andHomeIntroduceIn(List<String> values) {
            addCriterion("HOME_INTRODUCE in", values, "homeIntroduce");
            return (Criteria) this;
        }

        public Criteria andHomeIntroduceNotIn(List<String> values) {
            addCriterion("HOME_INTRODUCE not in", values, "homeIntroduce");
            return (Criteria) this;
        }

        public Criteria andHomeIntroduceBetween(String value1, String value2) {
            addCriterion("HOME_INTRODUCE between", value1, value2, "homeIntroduce");
            return (Criteria) this;
        }

        public Criteria andHomeIntroduceNotBetween(String value1, String value2) {
            addCriterion("HOME_INTRODUCE not between", value1, value2, "homeIntroduce");
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