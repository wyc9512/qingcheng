package nsu.edu.qingcheng.bean;

import java.util.ArrayList;
import java.util.List;

public class MenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MenuExample() {
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

        public Criteria andTopIdIsNull() {
            addCriterion("TOP_ID is null");
            return (Criteria) this;
        }

        public Criteria andTopIdIsNotNull() {
            addCriterion("TOP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTopIdEqualTo(Integer value) {
            addCriterion("TOP_ID =", value, "topId");
            return (Criteria) this;
        }

        public Criteria andTopIdNotEqualTo(Integer value) {
            addCriterion("TOP_ID <>", value, "topId");
            return (Criteria) this;
        }

        public Criteria andTopIdGreaterThan(Integer value) {
            addCriterion("TOP_ID >", value, "topId");
            return (Criteria) this;
        }

        public Criteria andTopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TOP_ID >=", value, "topId");
            return (Criteria) this;
        }

        public Criteria andTopIdLessThan(Integer value) {
            addCriterion("TOP_ID <", value, "topId");
            return (Criteria) this;
        }

        public Criteria andTopIdLessThanOrEqualTo(Integer value) {
            addCriterion("TOP_ID <=", value, "topId");
            return (Criteria) this;
        }

        public Criteria andTopIdIn(List<Integer> values) {
            addCriterion("TOP_ID in", values, "topId");
            return (Criteria) this;
        }

        public Criteria andTopIdNotIn(List<Integer> values) {
            addCriterion("TOP_ID not in", values, "topId");
            return (Criteria) this;
        }

        public Criteria andTopIdBetween(Integer value1, Integer value2) {
            addCriterion("TOP_ID between", value1, value2, "topId");
            return (Criteria) this;
        }

        public Criteria andTopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TOP_ID not between", value1, value2, "topId");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNull() {
            addCriterion("MENU_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNotNull() {
            addCriterion("MENU_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMenuNameEqualTo(String value) {
            addCriterion("MENU_NAME =", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotEqualTo(String value) {
            addCriterion("MENU_NAME <>", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThan(String value) {
            addCriterion("MENU_NAME >", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_NAME >=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThan(String value) {
            addCriterion("MENU_NAME <", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThanOrEqualTo(String value) {
            addCriterion("MENU_NAME <=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLike(String value) {
            addCriterion("MENU_NAME like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotLike(String value) {
            addCriterion("MENU_NAME not like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameIn(List<String> values) {
            addCriterion("MENU_NAME in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotIn(List<String> values) {
            addCriterion("MENU_NAME not in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameBetween(String value1, String value2) {
            addCriterion("MENU_NAME between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotBetween(String value1, String value2) {
            addCriterion("MENU_NAME not between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuPicIsNull() {
            addCriterion("MENU_PIC is null");
            return (Criteria) this;
        }

        public Criteria andMenuPicIsNotNull() {
            addCriterion("MENU_PIC is not null");
            return (Criteria) this;
        }

        public Criteria andMenuPicEqualTo(String value) {
            addCriterion("MENU_PIC =", value, "menuPic");
            return (Criteria) this;
        }

        public Criteria andMenuPicNotEqualTo(String value) {
            addCriterion("MENU_PIC <>", value, "menuPic");
            return (Criteria) this;
        }

        public Criteria andMenuPicGreaterThan(String value) {
            addCriterion("MENU_PIC >", value, "menuPic");
            return (Criteria) this;
        }

        public Criteria andMenuPicGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_PIC >=", value, "menuPic");
            return (Criteria) this;
        }

        public Criteria andMenuPicLessThan(String value) {
            addCriterion("MENU_PIC <", value, "menuPic");
            return (Criteria) this;
        }

        public Criteria andMenuPicLessThanOrEqualTo(String value) {
            addCriterion("MENU_PIC <=", value, "menuPic");
            return (Criteria) this;
        }

        public Criteria andMenuPicLike(String value) {
            addCriterion("MENU_PIC like", value, "menuPic");
            return (Criteria) this;
        }

        public Criteria andMenuPicNotLike(String value) {
            addCriterion("MENU_PIC not like", value, "menuPic");
            return (Criteria) this;
        }

        public Criteria andMenuPicIn(List<String> values) {
            addCriterion("MENU_PIC in", values, "menuPic");
            return (Criteria) this;
        }

        public Criteria andMenuPicNotIn(List<String> values) {
            addCriterion("MENU_PIC not in", values, "menuPic");
            return (Criteria) this;
        }

        public Criteria andMenuPicBetween(String value1, String value2) {
            addCriterion("MENU_PIC between", value1, value2, "menuPic");
            return (Criteria) this;
        }

        public Criteria andMenuPicNotBetween(String value1, String value2) {
            addCriterion("MENU_PIC not between", value1, value2, "menuPic");
            return (Criteria) this;
        }

        public Criteria andMenuDescriptionIsNull() {
            addCriterion("MENU_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andMenuDescriptionIsNotNull() {
            addCriterion("MENU_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andMenuDescriptionEqualTo(String value) {
            addCriterion("MENU_DESCRIPTION =", value, "menuDescription");
            return (Criteria) this;
        }

        public Criteria andMenuDescriptionNotEqualTo(String value) {
            addCriterion("MENU_DESCRIPTION <>", value, "menuDescription");
            return (Criteria) this;
        }

        public Criteria andMenuDescriptionGreaterThan(String value) {
            addCriterion("MENU_DESCRIPTION >", value, "menuDescription");
            return (Criteria) this;
        }

        public Criteria andMenuDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_DESCRIPTION >=", value, "menuDescription");
            return (Criteria) this;
        }

        public Criteria andMenuDescriptionLessThan(String value) {
            addCriterion("MENU_DESCRIPTION <", value, "menuDescription");
            return (Criteria) this;
        }

        public Criteria andMenuDescriptionLessThanOrEqualTo(String value) {
            addCriterion("MENU_DESCRIPTION <=", value, "menuDescription");
            return (Criteria) this;
        }

        public Criteria andMenuDescriptionLike(String value) {
            addCriterion("MENU_DESCRIPTION like", value, "menuDescription");
            return (Criteria) this;
        }

        public Criteria andMenuDescriptionNotLike(String value) {
            addCriterion("MENU_DESCRIPTION not like", value, "menuDescription");
            return (Criteria) this;
        }

        public Criteria andMenuDescriptionIn(List<String> values) {
            addCriterion("MENU_DESCRIPTION in", values, "menuDescription");
            return (Criteria) this;
        }

        public Criteria andMenuDescriptionNotIn(List<String> values) {
            addCriterion("MENU_DESCRIPTION not in", values, "menuDescription");
            return (Criteria) this;
        }

        public Criteria andMenuDescriptionBetween(String value1, String value2) {
            addCriterion("MENU_DESCRIPTION between", value1, value2, "menuDescription");
            return (Criteria) this;
        }

        public Criteria andMenuDescriptionNotBetween(String value1, String value2) {
            addCriterion("MENU_DESCRIPTION not between", value1, value2, "menuDescription");
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