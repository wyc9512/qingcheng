package nsu.edu.qingcheng.bean;

import java.util.ArrayList;
import java.util.List;

public class ThreemenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ThreemenuExample() {
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

        public Criteria andThreemenuIdIsNull() {
            addCriterion("THREEMENU_ID is null");
            return (Criteria) this;
        }

        public Criteria andThreemenuIdIsNotNull() {
            addCriterion("THREEMENU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andThreemenuIdEqualTo(Integer value) {
            addCriterion("THREEMENU_ID =", value, "threemenuId");
            return (Criteria) this;
        }

        public Criteria andThreemenuIdNotEqualTo(Integer value) {
            addCriterion("THREEMENU_ID <>", value, "threemenuId");
            return (Criteria) this;
        }

        public Criteria andThreemenuIdGreaterThan(Integer value) {
            addCriterion("THREEMENU_ID >", value, "threemenuId");
            return (Criteria) this;
        }

        public Criteria andThreemenuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("THREEMENU_ID >=", value, "threemenuId");
            return (Criteria) this;
        }

        public Criteria andThreemenuIdLessThan(Integer value) {
            addCriterion("THREEMENU_ID <", value, "threemenuId");
            return (Criteria) this;
        }

        public Criteria andThreemenuIdLessThanOrEqualTo(Integer value) {
            addCriterion("THREEMENU_ID <=", value, "threemenuId");
            return (Criteria) this;
        }

        public Criteria andThreemenuIdIn(List<Integer> values) {
            addCriterion("THREEMENU_ID in", values, "threemenuId");
            return (Criteria) this;
        }

        public Criteria andThreemenuIdNotIn(List<Integer> values) {
            addCriterion("THREEMENU_ID not in", values, "threemenuId");
            return (Criteria) this;
        }

        public Criteria andThreemenuIdBetween(Integer value1, Integer value2) {
            addCriterion("THREEMENU_ID between", value1, value2, "threemenuId");
            return (Criteria) this;
        }

        public Criteria andThreemenuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("THREEMENU_ID not between", value1, value2, "threemenuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdIsNull() {
            addCriterion("MENU_ID is null");
            return (Criteria) this;
        }

        public Criteria andMenuIdIsNotNull() {
            addCriterion("MENU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIdEqualTo(Integer value) {
            addCriterion("MENU_ID =", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotEqualTo(Integer value) {
            addCriterion("MENU_ID <>", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThan(Integer value) {
            addCriterion("MENU_ID >", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("MENU_ID >=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThan(Integer value) {
            addCriterion("MENU_ID <", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThanOrEqualTo(Integer value) {
            addCriterion("MENU_ID <=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdIn(List<Integer> values) {
            addCriterion("MENU_ID in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotIn(List<Integer> values) {
            addCriterion("MENU_ID not in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdBetween(Integer value1, Integer value2) {
            addCriterion("MENU_ID between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("MENU_ID not between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andThreemenuNameIsNull() {
            addCriterion("THREEMENU_NAME is null");
            return (Criteria) this;
        }

        public Criteria andThreemenuNameIsNotNull() {
            addCriterion("THREEMENU_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andThreemenuNameEqualTo(String value) {
            addCriterion("THREEMENU_NAME =", value, "threemenuName");
            return (Criteria) this;
        }

        public Criteria andThreemenuNameNotEqualTo(String value) {
            addCriterion("THREEMENU_NAME <>", value, "threemenuName");
            return (Criteria) this;
        }

        public Criteria andThreemenuNameGreaterThan(String value) {
            addCriterion("THREEMENU_NAME >", value, "threemenuName");
            return (Criteria) this;
        }

        public Criteria andThreemenuNameGreaterThanOrEqualTo(String value) {
            addCriterion("THREEMENU_NAME >=", value, "threemenuName");
            return (Criteria) this;
        }

        public Criteria andThreemenuNameLessThan(String value) {
            addCriterion("THREEMENU_NAME <", value, "threemenuName");
            return (Criteria) this;
        }

        public Criteria andThreemenuNameLessThanOrEqualTo(String value) {
            addCriterion("THREEMENU_NAME <=", value, "threemenuName");
            return (Criteria) this;
        }

        public Criteria andThreemenuNameLike(String value) {
            addCriterion("THREEMENU_NAME like", value, "threemenuName");
            return (Criteria) this;
        }

        public Criteria andThreemenuNameNotLike(String value) {
            addCriterion("THREEMENU_NAME not like", value, "threemenuName");
            return (Criteria) this;
        }

        public Criteria andThreemenuNameIn(List<String> values) {
            addCriterion("THREEMENU_NAME in", values, "threemenuName");
            return (Criteria) this;
        }

        public Criteria andThreemenuNameNotIn(List<String> values) {
            addCriterion("THREEMENU_NAME not in", values, "threemenuName");
            return (Criteria) this;
        }

        public Criteria andThreemenuNameBetween(String value1, String value2) {
            addCriterion("THREEMENU_NAME between", value1, value2, "threemenuName");
            return (Criteria) this;
        }

        public Criteria andThreemenuNameNotBetween(String value1, String value2) {
            addCriterion("THREEMENU_NAME not between", value1, value2, "threemenuName");
            return (Criteria) this;
        }

        public Criteria andThreemenuLogoIsNull() {
            addCriterion("THREEMENU_LOGO is null");
            return (Criteria) this;
        }

        public Criteria andThreemenuLogoIsNotNull() {
            addCriterion("THREEMENU_LOGO is not null");
            return (Criteria) this;
        }

        public Criteria andThreemenuLogoEqualTo(String value) {
            addCriterion("THREEMENU_LOGO =", value, "threemenuLogo");
            return (Criteria) this;
        }

        public Criteria andThreemenuLogoNotEqualTo(String value) {
            addCriterion("THREEMENU_LOGO <>", value, "threemenuLogo");
            return (Criteria) this;
        }

        public Criteria andThreemenuLogoGreaterThan(String value) {
            addCriterion("THREEMENU_LOGO >", value, "threemenuLogo");
            return (Criteria) this;
        }

        public Criteria andThreemenuLogoGreaterThanOrEqualTo(String value) {
            addCriterion("THREEMENU_LOGO >=", value, "threemenuLogo");
            return (Criteria) this;
        }

        public Criteria andThreemenuLogoLessThan(String value) {
            addCriterion("THREEMENU_LOGO <", value, "threemenuLogo");
            return (Criteria) this;
        }

        public Criteria andThreemenuLogoLessThanOrEqualTo(String value) {
            addCriterion("THREEMENU_LOGO <=", value, "threemenuLogo");
            return (Criteria) this;
        }

        public Criteria andThreemenuLogoLike(String value) {
            addCriterion("THREEMENU_LOGO like", value, "threemenuLogo");
            return (Criteria) this;
        }

        public Criteria andThreemenuLogoNotLike(String value) {
            addCriterion("THREEMENU_LOGO not like", value, "threemenuLogo");
            return (Criteria) this;
        }

        public Criteria andThreemenuLogoIn(List<String> values) {
            addCriterion("THREEMENU_LOGO in", values, "threemenuLogo");
            return (Criteria) this;
        }

        public Criteria andThreemenuLogoNotIn(List<String> values) {
            addCriterion("THREEMENU_LOGO not in", values, "threemenuLogo");
            return (Criteria) this;
        }

        public Criteria andThreemenuLogoBetween(String value1, String value2) {
            addCriterion("THREEMENU_LOGO between", value1, value2, "threemenuLogo");
            return (Criteria) this;
        }

        public Criteria andThreemenuLogoNotBetween(String value1, String value2) {
            addCriterion("THREEMENU_LOGO not between", value1, value2, "threemenuLogo");
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