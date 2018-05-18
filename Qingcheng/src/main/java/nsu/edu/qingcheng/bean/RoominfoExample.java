package nsu.edu.qingcheng.bean;

import java.util.ArrayList;
import java.util.List;

public class RoominfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoominfoExample() {
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

        public Criteria andRoominfoIdIsNull() {
            addCriterion("ROOMINFO_ID is null");
            return (Criteria) this;
        }

        public Criteria andRoominfoIdIsNotNull() {
            addCriterion("ROOMINFO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRoominfoIdEqualTo(Integer value) {
            addCriterion("ROOMINFO_ID =", value, "roominfoId");
            return (Criteria) this;
        }

        public Criteria andRoominfoIdNotEqualTo(Integer value) {
            addCriterion("ROOMINFO_ID <>", value, "roominfoId");
            return (Criteria) this;
        }

        public Criteria andRoominfoIdGreaterThan(Integer value) {
            addCriterion("ROOMINFO_ID >", value, "roominfoId");
            return (Criteria) this;
        }

        public Criteria andRoominfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ROOMINFO_ID >=", value, "roominfoId");
            return (Criteria) this;
        }

        public Criteria andRoominfoIdLessThan(Integer value) {
            addCriterion("ROOMINFO_ID <", value, "roominfoId");
            return (Criteria) this;
        }

        public Criteria andRoominfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("ROOMINFO_ID <=", value, "roominfoId");
            return (Criteria) this;
        }

        public Criteria andRoominfoIdIn(List<Integer> values) {
            addCriterion("ROOMINFO_ID in", values, "roominfoId");
            return (Criteria) this;
        }

        public Criteria andRoominfoIdNotIn(List<Integer> values) {
            addCriterion("ROOMINFO_ID not in", values, "roominfoId");
            return (Criteria) this;
        }

        public Criteria andRoominfoIdBetween(Integer value1, Integer value2) {
            addCriterion("ROOMINFO_ID between", value1, value2, "roominfoId");
            return (Criteria) this;
        }

        public Criteria andRoominfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ROOMINFO_ID not between", value1, value2, "roominfoId");
            return (Criteria) this;
        }

        public Criteria andResidenceIdIsNull() {
            addCriterion("RESIDENCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andResidenceIdIsNotNull() {
            addCriterion("RESIDENCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andResidenceIdEqualTo(Integer value) {
            addCriterion("RESIDENCE_ID =", value, "residenceId");
            return (Criteria) this;
        }

        public Criteria andResidenceIdNotEqualTo(Integer value) {
            addCriterion("RESIDENCE_ID <>", value, "residenceId");
            return (Criteria) this;
        }

        public Criteria andResidenceIdGreaterThan(Integer value) {
            addCriterion("RESIDENCE_ID >", value, "residenceId");
            return (Criteria) this;
        }

        public Criteria andResidenceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("RESIDENCE_ID >=", value, "residenceId");
            return (Criteria) this;
        }

        public Criteria andResidenceIdLessThan(Integer value) {
            addCriterion("RESIDENCE_ID <", value, "residenceId");
            return (Criteria) this;
        }

        public Criteria andResidenceIdLessThanOrEqualTo(Integer value) {
            addCriterion("RESIDENCE_ID <=", value, "residenceId");
            return (Criteria) this;
        }

        public Criteria andResidenceIdIn(List<Integer> values) {
            addCriterion("RESIDENCE_ID in", values, "residenceId");
            return (Criteria) this;
        }

        public Criteria andResidenceIdNotIn(List<Integer> values) {
            addCriterion("RESIDENCE_ID not in", values, "residenceId");
            return (Criteria) this;
        }

        public Criteria andResidenceIdBetween(Integer value1, Integer value2) {
            addCriterion("RESIDENCE_ID between", value1, value2, "residenceId");
            return (Criteria) this;
        }

        public Criteria andResidenceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("RESIDENCE_ID not between", value1, value2, "residenceId");
            return (Criteria) this;
        }

        public Criteria andRoominfoHouseTypeIsNull() {
            addCriterion("ROOMINFO_HOUSE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRoominfoHouseTypeIsNotNull() {
            addCriterion("ROOMINFO_HOUSE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRoominfoHouseTypeEqualTo(String value) {
            addCriterion("ROOMINFO_HOUSE_TYPE =", value, "roominfoHouseType");
            return (Criteria) this;
        }

        public Criteria andRoominfoHouseTypeNotEqualTo(String value) {
            addCriterion("ROOMINFO_HOUSE_TYPE <>", value, "roominfoHouseType");
            return (Criteria) this;
        }

        public Criteria andRoominfoHouseTypeGreaterThan(String value) {
            addCriterion("ROOMINFO_HOUSE_TYPE >", value, "roominfoHouseType");
            return (Criteria) this;
        }

        public Criteria andRoominfoHouseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ROOMINFO_HOUSE_TYPE >=", value, "roominfoHouseType");
            return (Criteria) this;
        }

        public Criteria andRoominfoHouseTypeLessThan(String value) {
            addCriterion("ROOMINFO_HOUSE_TYPE <", value, "roominfoHouseType");
            return (Criteria) this;
        }

        public Criteria andRoominfoHouseTypeLessThanOrEqualTo(String value) {
            addCriterion("ROOMINFO_HOUSE_TYPE <=", value, "roominfoHouseType");
            return (Criteria) this;
        }

        public Criteria andRoominfoHouseTypeLike(String value) {
            addCriterion("ROOMINFO_HOUSE_TYPE like", value, "roominfoHouseType");
            return (Criteria) this;
        }

        public Criteria andRoominfoHouseTypeNotLike(String value) {
            addCriterion("ROOMINFO_HOUSE_TYPE not like", value, "roominfoHouseType");
            return (Criteria) this;
        }

        public Criteria andRoominfoHouseTypeIn(List<String> values) {
            addCriterion("ROOMINFO_HOUSE_TYPE in", values, "roominfoHouseType");
            return (Criteria) this;
        }

        public Criteria andRoominfoHouseTypeNotIn(List<String> values) {
            addCriterion("ROOMINFO_HOUSE_TYPE not in", values, "roominfoHouseType");
            return (Criteria) this;
        }

        public Criteria andRoominfoHouseTypeBetween(String value1, String value2) {
            addCriterion("ROOMINFO_HOUSE_TYPE between", value1, value2, "roominfoHouseType");
            return (Criteria) this;
        }

        public Criteria andRoominfoHouseTypeNotBetween(String value1, String value2) {
            addCriterion("ROOMINFO_HOUSE_TYPE not between", value1, value2, "roominfoHouseType");
            return (Criteria) this;
        }

        public Criteria andRoominfoDiscountsIsNull() {
            addCriterion("ROOMINFO_DISCOUNTS is null");
            return (Criteria) this;
        }

        public Criteria andRoominfoDiscountsIsNotNull() {
            addCriterion("ROOMINFO_DISCOUNTS is not null");
            return (Criteria) this;
        }

        public Criteria andRoominfoDiscountsEqualTo(String value) {
            addCriterion("ROOMINFO_DISCOUNTS =", value, "roominfoDiscounts");
            return (Criteria) this;
        }

        public Criteria andRoominfoDiscountsNotEqualTo(String value) {
            addCriterion("ROOMINFO_DISCOUNTS <>", value, "roominfoDiscounts");
            return (Criteria) this;
        }

        public Criteria andRoominfoDiscountsGreaterThan(String value) {
            addCriterion("ROOMINFO_DISCOUNTS >", value, "roominfoDiscounts");
            return (Criteria) this;
        }

        public Criteria andRoominfoDiscountsGreaterThanOrEqualTo(String value) {
            addCriterion("ROOMINFO_DISCOUNTS >=", value, "roominfoDiscounts");
            return (Criteria) this;
        }

        public Criteria andRoominfoDiscountsLessThan(String value) {
            addCriterion("ROOMINFO_DISCOUNTS <", value, "roominfoDiscounts");
            return (Criteria) this;
        }

        public Criteria andRoominfoDiscountsLessThanOrEqualTo(String value) {
            addCriterion("ROOMINFO_DISCOUNTS <=", value, "roominfoDiscounts");
            return (Criteria) this;
        }

        public Criteria andRoominfoDiscountsLike(String value) {
            addCriterion("ROOMINFO_DISCOUNTS like", value, "roominfoDiscounts");
            return (Criteria) this;
        }

        public Criteria andRoominfoDiscountsNotLike(String value) {
            addCriterion("ROOMINFO_DISCOUNTS not like", value, "roominfoDiscounts");
            return (Criteria) this;
        }

        public Criteria andRoominfoDiscountsIn(List<String> values) {
            addCriterion("ROOMINFO_DISCOUNTS in", values, "roominfoDiscounts");
            return (Criteria) this;
        }

        public Criteria andRoominfoDiscountsNotIn(List<String> values) {
            addCriterion("ROOMINFO_DISCOUNTS not in", values, "roominfoDiscounts");
            return (Criteria) this;
        }

        public Criteria andRoominfoDiscountsBetween(String value1, String value2) {
            addCriterion("ROOMINFO_DISCOUNTS between", value1, value2, "roominfoDiscounts");
            return (Criteria) this;
        }

        public Criteria andRoominfoDiscountsNotBetween(String value1, String value2) {
            addCriterion("ROOMINFO_DISCOUNTS not between", value1, value2, "roominfoDiscounts");
            return (Criteria) this;
        }

        public Criteria andRoominfoSupportCountIsNull() {
            addCriterion("ROOMINFO_SUPPORT_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andRoominfoSupportCountIsNotNull() {
            addCriterion("ROOMINFO_SUPPORT_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRoominfoSupportCountEqualTo(Integer value) {
            addCriterion("ROOMINFO_SUPPORT_COUNT =", value, "roominfoSupportCount");
            return (Criteria) this;
        }

        public Criteria andRoominfoSupportCountNotEqualTo(Integer value) {
            addCriterion("ROOMINFO_SUPPORT_COUNT <>", value, "roominfoSupportCount");
            return (Criteria) this;
        }

        public Criteria andRoominfoSupportCountGreaterThan(Integer value) {
            addCriterion("ROOMINFO_SUPPORT_COUNT >", value, "roominfoSupportCount");
            return (Criteria) this;
        }

        public Criteria andRoominfoSupportCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ROOMINFO_SUPPORT_COUNT >=", value, "roominfoSupportCount");
            return (Criteria) this;
        }

        public Criteria andRoominfoSupportCountLessThan(Integer value) {
            addCriterion("ROOMINFO_SUPPORT_COUNT <", value, "roominfoSupportCount");
            return (Criteria) this;
        }

        public Criteria andRoominfoSupportCountLessThanOrEqualTo(Integer value) {
            addCriterion("ROOMINFO_SUPPORT_COUNT <=", value, "roominfoSupportCount");
            return (Criteria) this;
        }

        public Criteria andRoominfoSupportCountIn(List<Integer> values) {
            addCriterion("ROOMINFO_SUPPORT_COUNT in", values, "roominfoSupportCount");
            return (Criteria) this;
        }

        public Criteria andRoominfoSupportCountNotIn(List<Integer> values) {
            addCriterion("ROOMINFO_SUPPORT_COUNT not in", values, "roominfoSupportCount");
            return (Criteria) this;
        }

        public Criteria andRoominfoSupportCountBetween(Integer value1, Integer value2) {
            addCriterion("ROOMINFO_SUPPORT_COUNT between", value1, value2, "roominfoSupportCount");
            return (Criteria) this;
        }

        public Criteria andRoominfoSupportCountNotBetween(Integer value1, Integer value2) {
            addCriterion("ROOMINFO_SUPPORT_COUNT not between", value1, value2, "roominfoSupportCount");
            return (Criteria) this;
        }

        public Criteria andRoominfoPriceIsNull() {
            addCriterion("ROOMINFO_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andRoominfoPriceIsNotNull() {
            addCriterion("ROOMINFO_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andRoominfoPriceEqualTo(Float value) {
            addCriterion("ROOMINFO_PRICE =", value, "roominfoPrice");
            return (Criteria) this;
        }

        public Criteria andRoominfoPriceNotEqualTo(Float value) {
            addCriterion("ROOMINFO_PRICE <>", value, "roominfoPrice");
            return (Criteria) this;
        }

        public Criteria andRoominfoPriceGreaterThan(Float value) {
            addCriterion("ROOMINFO_PRICE >", value, "roominfoPrice");
            return (Criteria) this;
        }

        public Criteria andRoominfoPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("ROOMINFO_PRICE >=", value, "roominfoPrice");
            return (Criteria) this;
        }

        public Criteria andRoominfoPriceLessThan(Float value) {
            addCriterion("ROOMINFO_PRICE <", value, "roominfoPrice");
            return (Criteria) this;
        }

        public Criteria andRoominfoPriceLessThanOrEqualTo(Float value) {
            addCriterion("ROOMINFO_PRICE <=", value, "roominfoPrice");
            return (Criteria) this;
        }

        public Criteria andRoominfoPriceIn(List<Float> values) {
            addCriterion("ROOMINFO_PRICE in", values, "roominfoPrice");
            return (Criteria) this;
        }

        public Criteria andRoominfoPriceNotIn(List<Float> values) {
            addCriterion("ROOMINFO_PRICE not in", values, "roominfoPrice");
            return (Criteria) this;
        }

        public Criteria andRoominfoPriceBetween(Float value1, Float value2) {
            addCriterion("ROOMINFO_PRICE between", value1, value2, "roominfoPrice");
            return (Criteria) this;
        }

        public Criteria andRoominfoPriceNotBetween(Float value1, Float value2) {
            addCriterion("ROOMINFO_PRICE not between", value1, value2, "roominfoPrice");
            return (Criteria) this;
        }

        public Criteria andRoominfoPicIsNull() {
            addCriterion("ROOMINFO_PIC is null");
            return (Criteria) this;
        }

        public Criteria andRoominfoPicIsNotNull() {
            addCriterion("ROOMINFO_PIC is not null");
            return (Criteria) this;
        }

        public Criteria andRoominfoPicEqualTo(String value) {
            addCriterion("ROOMINFO_PIC =", value, "roominfoPic");
            return (Criteria) this;
        }

        public Criteria andRoominfoPicNotEqualTo(String value) {
            addCriterion("ROOMINFO_PIC <>", value, "roominfoPic");
            return (Criteria) this;
        }

        public Criteria andRoominfoPicGreaterThan(String value) {
            addCriterion("ROOMINFO_PIC >", value, "roominfoPic");
            return (Criteria) this;
        }

        public Criteria andRoominfoPicGreaterThanOrEqualTo(String value) {
            addCriterion("ROOMINFO_PIC >=", value, "roominfoPic");
            return (Criteria) this;
        }

        public Criteria andRoominfoPicLessThan(String value) {
            addCriterion("ROOMINFO_PIC <", value, "roominfoPic");
            return (Criteria) this;
        }

        public Criteria andRoominfoPicLessThanOrEqualTo(String value) {
            addCriterion("ROOMINFO_PIC <=", value, "roominfoPic");
            return (Criteria) this;
        }

        public Criteria andRoominfoPicLike(String value) {
            addCriterion("ROOMINFO_PIC like", value, "roominfoPic");
            return (Criteria) this;
        }

        public Criteria andRoominfoPicNotLike(String value) {
            addCriterion("ROOMINFO_PIC not like", value, "roominfoPic");
            return (Criteria) this;
        }

        public Criteria andRoominfoPicIn(List<String> values) {
            addCriterion("ROOMINFO_PIC in", values, "roominfoPic");
            return (Criteria) this;
        }

        public Criteria andRoominfoPicNotIn(List<String> values) {
            addCriterion("ROOMINFO_PIC not in", values, "roominfoPic");
            return (Criteria) this;
        }

        public Criteria andRoominfoPicBetween(String value1, String value2) {
            addCriterion("ROOMINFO_PIC between", value1, value2, "roominfoPic");
            return (Criteria) this;
        }

        public Criteria andRoominfoPicNotBetween(String value1, String value2) {
            addCriterion("ROOMINFO_PIC not between", value1, value2, "roominfoPic");
            return (Criteria) this;
        }

        public Criteria andRoominfoNameIsNull() {
            addCriterion("ROOMINFO_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRoominfoNameIsNotNull() {
            addCriterion("ROOMINFO_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRoominfoNameEqualTo(String value) {
            addCriterion("ROOMINFO_NAME =", value, "roominfoName");
            return (Criteria) this;
        }

        public Criteria andRoominfoNameNotEqualTo(String value) {
            addCriterion("ROOMINFO_NAME <>", value, "roominfoName");
            return (Criteria) this;
        }

        public Criteria andRoominfoNameGreaterThan(String value) {
            addCriterion("ROOMINFO_NAME >", value, "roominfoName");
            return (Criteria) this;
        }

        public Criteria andRoominfoNameGreaterThanOrEqualTo(String value) {
            addCriterion("ROOMINFO_NAME >=", value, "roominfoName");
            return (Criteria) this;
        }

        public Criteria andRoominfoNameLessThan(String value) {
            addCriterion("ROOMINFO_NAME <", value, "roominfoName");
            return (Criteria) this;
        }

        public Criteria andRoominfoNameLessThanOrEqualTo(String value) {
            addCriterion("ROOMINFO_NAME <=", value, "roominfoName");
            return (Criteria) this;
        }

        public Criteria andRoominfoNameLike(String value) {
            addCriterion("ROOMINFO_NAME like", value, "roominfoName");
            return (Criteria) this;
        }

        public Criteria andRoominfoNameNotLike(String value) {
            addCriterion("ROOMINFO_NAME not like", value, "roominfoName");
            return (Criteria) this;
        }

        public Criteria andRoominfoNameIn(List<String> values) {
            addCriterion("ROOMINFO_NAME in", values, "roominfoName");
            return (Criteria) this;
        }

        public Criteria andRoominfoNameNotIn(List<String> values) {
            addCriterion("ROOMINFO_NAME not in", values, "roominfoName");
            return (Criteria) this;
        }

        public Criteria andRoominfoNameBetween(String value1, String value2) {
            addCriterion("ROOMINFO_NAME between", value1, value2, "roominfoName");
            return (Criteria) this;
        }

        public Criteria andRoominfoNameNotBetween(String value1, String value2) {
            addCriterion("ROOMINFO_NAME not between", value1, value2, "roominfoName");
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