package nsu.edu.qingcheng.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TripExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TripExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andTripIdIsNull() {
            addCriterion("TRIP_ID is null");
            return (Criteria) this;
        }

        public Criteria andTripIdIsNotNull() {
            addCriterion("TRIP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTripIdEqualTo(Integer value) {
            addCriterion("TRIP_ID =", value, "tripId");
            return (Criteria) this;
        }

        public Criteria andTripIdNotEqualTo(Integer value) {
            addCriterion("TRIP_ID <>", value, "tripId");
            return (Criteria) this;
        }

        public Criteria andTripIdGreaterThan(Integer value) {
            addCriterion("TRIP_ID >", value, "tripId");
            return (Criteria) this;
        }

        public Criteria andTripIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TRIP_ID >=", value, "tripId");
            return (Criteria) this;
        }

        public Criteria andTripIdLessThan(Integer value) {
            addCriterion("TRIP_ID <", value, "tripId");
            return (Criteria) this;
        }

        public Criteria andTripIdLessThanOrEqualTo(Integer value) {
            addCriterion("TRIP_ID <=", value, "tripId");
            return (Criteria) this;
        }

        public Criteria andTripIdIn(List<Integer> values) {
            addCriterion("TRIP_ID in", values, "tripId");
            return (Criteria) this;
        }

        public Criteria andTripIdNotIn(List<Integer> values) {
            addCriterion("TRIP_ID not in", values, "tripId");
            return (Criteria) this;
        }

        public Criteria andTripIdBetween(Integer value1, Integer value2) {
            addCriterion("TRIP_ID between", value1, value2, "tripId");
            return (Criteria) this;
        }

        public Criteria andTripIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TRIP_ID not between", value1, value2, "tripId");
            return (Criteria) this;
        }

        public Criteria andTripNameIsNull() {
            addCriterion("TRIP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTripNameIsNotNull() {
            addCriterion("TRIP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTripNameEqualTo(String value) {
            addCriterion("TRIP_NAME =", value, "tripName");
            return (Criteria) this;
        }

        public Criteria andTripNameNotEqualTo(String value) {
            addCriterion("TRIP_NAME <>", value, "tripName");
            return (Criteria) this;
        }

        public Criteria andTripNameGreaterThan(String value) {
            addCriterion("TRIP_NAME >", value, "tripName");
            return (Criteria) this;
        }

        public Criteria andTripNameGreaterThanOrEqualTo(String value) {
            addCriterion("TRIP_NAME >=", value, "tripName");
            return (Criteria) this;
        }

        public Criteria andTripNameLessThan(String value) {
            addCriterion("TRIP_NAME <", value, "tripName");
            return (Criteria) this;
        }

        public Criteria andTripNameLessThanOrEqualTo(String value) {
            addCriterion("TRIP_NAME <=", value, "tripName");
            return (Criteria) this;
        }

        public Criteria andTripNameLike(String value) {
            addCriterion("TRIP_NAME like", value, "tripName");
            return (Criteria) this;
        }

        public Criteria andTripNameNotLike(String value) {
            addCriterion("TRIP_NAME not like", value, "tripName");
            return (Criteria) this;
        }

        public Criteria andTripNameIn(List<String> values) {
            addCriterion("TRIP_NAME in", values, "tripName");
            return (Criteria) this;
        }

        public Criteria andTripNameNotIn(List<String> values) {
            addCriterion("TRIP_NAME not in", values, "tripName");
            return (Criteria) this;
        }

        public Criteria andTripNameBetween(String value1, String value2) {
            addCriterion("TRIP_NAME between", value1, value2, "tripName");
            return (Criteria) this;
        }

        public Criteria andTripNameNotBetween(String value1, String value2) {
            addCriterion("TRIP_NAME not between", value1, value2, "tripName");
            return (Criteria) this;
        }

        public Criteria andTripPicIsNull() {
            addCriterion("TRIP_PIC is null");
            return (Criteria) this;
        }

        public Criteria andTripPicIsNotNull() {
            addCriterion("TRIP_PIC is not null");
            return (Criteria) this;
        }

        public Criteria andTripPicEqualTo(String value) {
            addCriterion("TRIP_PIC =", value, "tripPic");
            return (Criteria) this;
        }

        public Criteria andTripPicNotEqualTo(String value) {
            addCriterion("TRIP_PIC <>", value, "tripPic");
            return (Criteria) this;
        }

        public Criteria andTripPicGreaterThan(String value) {
            addCriterion("TRIP_PIC >", value, "tripPic");
            return (Criteria) this;
        }

        public Criteria andTripPicGreaterThanOrEqualTo(String value) {
            addCriterion("TRIP_PIC >=", value, "tripPic");
            return (Criteria) this;
        }

        public Criteria andTripPicLessThan(String value) {
            addCriterion("TRIP_PIC <", value, "tripPic");
            return (Criteria) this;
        }

        public Criteria andTripPicLessThanOrEqualTo(String value) {
            addCriterion("TRIP_PIC <=", value, "tripPic");
            return (Criteria) this;
        }

        public Criteria andTripPicLike(String value) {
            addCriterion("TRIP_PIC like", value, "tripPic");
            return (Criteria) this;
        }

        public Criteria andTripPicNotLike(String value) {
            addCriterion("TRIP_PIC not like", value, "tripPic");
            return (Criteria) this;
        }

        public Criteria andTripPicIn(List<String> values) {
            addCriterion("TRIP_PIC in", values, "tripPic");
            return (Criteria) this;
        }

        public Criteria andTripPicNotIn(List<String> values) {
            addCriterion("TRIP_PIC not in", values, "tripPic");
            return (Criteria) this;
        }

        public Criteria andTripPicBetween(String value1, String value2) {
            addCriterion("TRIP_PIC between", value1, value2, "tripPic");
            return (Criteria) this;
        }

        public Criteria andTripPicNotBetween(String value1, String value2) {
            addCriterion("TRIP_PIC not between", value1, value2, "tripPic");
            return (Criteria) this;
        }

        public Criteria andTripIntroduceIsNull() {
            addCriterion("TRIP_INTRODUCE is null");
            return (Criteria) this;
        }

        public Criteria andTripIntroduceIsNotNull() {
            addCriterion("TRIP_INTRODUCE is not null");
            return (Criteria) this;
        }

        public Criteria andTripIntroduceEqualTo(String value) {
            addCriterion("TRIP_INTRODUCE =", value, "tripIntroduce");
            return (Criteria) this;
        }

        public Criteria andTripIntroduceNotEqualTo(String value) {
            addCriterion("TRIP_INTRODUCE <>", value, "tripIntroduce");
            return (Criteria) this;
        }

        public Criteria andTripIntroduceGreaterThan(String value) {
            addCriterion("TRIP_INTRODUCE >", value, "tripIntroduce");
            return (Criteria) this;
        }

        public Criteria andTripIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("TRIP_INTRODUCE >=", value, "tripIntroduce");
            return (Criteria) this;
        }

        public Criteria andTripIntroduceLessThan(String value) {
            addCriterion("TRIP_INTRODUCE <", value, "tripIntroduce");
            return (Criteria) this;
        }

        public Criteria andTripIntroduceLessThanOrEqualTo(String value) {
            addCriterion("TRIP_INTRODUCE <=", value, "tripIntroduce");
            return (Criteria) this;
        }

        public Criteria andTripIntroduceLike(String value) {
            addCriterion("TRIP_INTRODUCE like", value, "tripIntroduce");
            return (Criteria) this;
        }

        public Criteria andTripIntroduceNotLike(String value) {
            addCriterion("TRIP_INTRODUCE not like", value, "tripIntroduce");
            return (Criteria) this;
        }

        public Criteria andTripIntroduceIn(List<String> values) {
            addCriterion("TRIP_INTRODUCE in", values, "tripIntroduce");
            return (Criteria) this;
        }

        public Criteria andTripIntroduceNotIn(List<String> values) {
            addCriterion("TRIP_INTRODUCE not in", values, "tripIntroduce");
            return (Criteria) this;
        }

        public Criteria andTripIntroduceBetween(String value1, String value2) {
            addCriterion("TRIP_INTRODUCE between", value1, value2, "tripIntroduce");
            return (Criteria) this;
        }

        public Criteria andTripIntroduceNotBetween(String value1, String value2) {
            addCriterion("TRIP_INTRODUCE not between", value1, value2, "tripIntroduce");
            return (Criteria) this;
        }

        public Criteria andTripKeywordIsNull() {
            addCriterion("TRIP_KEYWORD is null");
            return (Criteria) this;
        }

        public Criteria andTripKeywordIsNotNull() {
            addCriterion("TRIP_KEYWORD is not null");
            return (Criteria) this;
        }

        public Criteria andTripKeywordEqualTo(String value) {
            addCriterion("TRIP_KEYWORD =", value, "tripKeyword");
            return (Criteria) this;
        }

        public Criteria andTripKeywordNotEqualTo(String value) {
            addCriterion("TRIP_KEYWORD <>", value, "tripKeyword");
            return (Criteria) this;
        }

        public Criteria andTripKeywordGreaterThan(String value) {
            addCriterion("TRIP_KEYWORD >", value, "tripKeyword");
            return (Criteria) this;
        }

        public Criteria andTripKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("TRIP_KEYWORD >=", value, "tripKeyword");
            return (Criteria) this;
        }

        public Criteria andTripKeywordLessThan(String value) {
            addCriterion("TRIP_KEYWORD <", value, "tripKeyword");
            return (Criteria) this;
        }

        public Criteria andTripKeywordLessThanOrEqualTo(String value) {
            addCriterion("TRIP_KEYWORD <=", value, "tripKeyword");
            return (Criteria) this;
        }

        public Criteria andTripKeywordLike(String value) {
            addCriterion("TRIP_KEYWORD like", value, "tripKeyword");
            return (Criteria) this;
        }

        public Criteria andTripKeywordNotLike(String value) {
            addCriterion("TRIP_KEYWORD not like", value, "tripKeyword");
            return (Criteria) this;
        }

        public Criteria andTripKeywordIn(List<String> values) {
            addCriterion("TRIP_KEYWORD in", values, "tripKeyword");
            return (Criteria) this;
        }

        public Criteria andTripKeywordNotIn(List<String> values) {
            addCriterion("TRIP_KEYWORD not in", values, "tripKeyword");
            return (Criteria) this;
        }

        public Criteria andTripKeywordBetween(String value1, String value2) {
            addCriterion("TRIP_KEYWORD between", value1, value2, "tripKeyword");
            return (Criteria) this;
        }

        public Criteria andTripKeywordNotBetween(String value1, String value2) {
            addCriterion("TRIP_KEYWORD not between", value1, value2, "tripKeyword");
            return (Criteria) this;
        }

        public Criteria andTripMapIsNull() {
            addCriterion("TRIP_MAP is null");
            return (Criteria) this;
        }

        public Criteria andTripMapIsNotNull() {
            addCriterion("TRIP_MAP is not null");
            return (Criteria) this;
        }

        public Criteria andTripMapEqualTo(String value) {
            addCriterion("TRIP_MAP =", value, "tripMap");
            return (Criteria) this;
        }

        public Criteria andTripMapNotEqualTo(String value) {
            addCriterion("TRIP_MAP <>", value, "tripMap");
            return (Criteria) this;
        }

        public Criteria andTripMapGreaterThan(String value) {
            addCriterion("TRIP_MAP >", value, "tripMap");
            return (Criteria) this;
        }

        public Criteria andTripMapGreaterThanOrEqualTo(String value) {
            addCriterion("TRIP_MAP >=", value, "tripMap");
            return (Criteria) this;
        }

        public Criteria andTripMapLessThan(String value) {
            addCriterion("TRIP_MAP <", value, "tripMap");
            return (Criteria) this;
        }

        public Criteria andTripMapLessThanOrEqualTo(String value) {
            addCriterion("TRIP_MAP <=", value, "tripMap");
            return (Criteria) this;
        }

        public Criteria andTripMapLike(String value) {
            addCriterion("TRIP_MAP like", value, "tripMap");
            return (Criteria) this;
        }

        public Criteria andTripMapNotLike(String value) {
            addCriterion("TRIP_MAP not like", value, "tripMap");
            return (Criteria) this;
        }

        public Criteria andTripMapIn(List<String> values) {
            addCriterion("TRIP_MAP in", values, "tripMap");
            return (Criteria) this;
        }

        public Criteria andTripMapNotIn(List<String> values) {
            addCriterion("TRIP_MAP not in", values, "tripMap");
            return (Criteria) this;
        }

        public Criteria andTripMapBetween(String value1, String value2) {
            addCriterion("TRIP_MAP between", value1, value2, "tripMap");
            return (Criteria) this;
        }

        public Criteria andTripMapNotBetween(String value1, String value2) {
            addCriterion("TRIP_MAP not between", value1, value2, "tripMap");
            return (Criteria) this;
        }

        public Criteria andTripTimeIsNull() {
            addCriterion("TRIP_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTripTimeIsNotNull() {
            addCriterion("TRIP_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTripTimeEqualTo(Date value) {
            addCriterionForJDBCDate("TRIP_TIME =", value, "tripTime");
            return (Criteria) this;
        }

        public Criteria andTripTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("TRIP_TIME <>", value, "tripTime");
            return (Criteria) this;
        }

        public Criteria andTripTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("TRIP_TIME >", value, "tripTime");
            return (Criteria) this;
        }

        public Criteria andTripTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TRIP_TIME >=", value, "tripTime");
            return (Criteria) this;
        }

        public Criteria andTripTimeLessThan(Date value) {
            addCriterionForJDBCDate("TRIP_TIME <", value, "tripTime");
            return (Criteria) this;
        }

        public Criteria andTripTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TRIP_TIME <=", value, "tripTime");
            return (Criteria) this;
        }

        public Criteria andTripTimeIn(List<Date> values) {
            addCriterionForJDBCDate("TRIP_TIME in", values, "tripTime");
            return (Criteria) this;
        }

        public Criteria andTripTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("TRIP_TIME not in", values, "tripTime");
            return (Criteria) this;
        }

        public Criteria andTripTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TRIP_TIME between", value1, value2, "tripTime");
            return (Criteria) this;
        }

        public Criteria andTripTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TRIP_TIME not between", value1, value2, "tripTime");
            return (Criteria) this;
        }

        public Criteria andTripTextSrcIsNull() {
            addCriterion("TRIP_TEXT_SRC is null");
            return (Criteria) this;
        }

        public Criteria andTripTextSrcIsNotNull() {
            addCriterion("TRIP_TEXT_SRC is not null");
            return (Criteria) this;
        }

        public Criteria andTripTextSrcEqualTo(String value) {
            addCriterion("TRIP_TEXT_SRC =", value, "tripTextSrc");
            return (Criteria) this;
        }

        public Criteria andTripTextSrcNotEqualTo(String value) {
            addCriterion("TRIP_TEXT_SRC <>", value, "tripTextSrc");
            return (Criteria) this;
        }

        public Criteria andTripTextSrcGreaterThan(String value) {
            addCriterion("TRIP_TEXT_SRC >", value, "tripTextSrc");
            return (Criteria) this;
        }

        public Criteria andTripTextSrcGreaterThanOrEqualTo(String value) {
            addCriterion("TRIP_TEXT_SRC >=", value, "tripTextSrc");
            return (Criteria) this;
        }

        public Criteria andTripTextSrcLessThan(String value) {
            addCriterion("TRIP_TEXT_SRC <", value, "tripTextSrc");
            return (Criteria) this;
        }

        public Criteria andTripTextSrcLessThanOrEqualTo(String value) {
            addCriterion("TRIP_TEXT_SRC <=", value, "tripTextSrc");
            return (Criteria) this;
        }

        public Criteria andTripTextSrcLike(String value) {
            addCriterion("TRIP_TEXT_SRC like", value, "tripTextSrc");
            return (Criteria) this;
        }

        public Criteria andTripTextSrcNotLike(String value) {
            addCriterion("TRIP_TEXT_SRC not like", value, "tripTextSrc");
            return (Criteria) this;
        }

        public Criteria andTripTextSrcIn(List<String> values) {
            addCriterion("TRIP_TEXT_SRC in", values, "tripTextSrc");
            return (Criteria) this;
        }

        public Criteria andTripTextSrcNotIn(List<String> values) {
            addCriterion("TRIP_TEXT_SRC not in", values, "tripTextSrc");
            return (Criteria) this;
        }

        public Criteria andTripTextSrcBetween(String value1, String value2) {
            addCriterion("TRIP_TEXT_SRC between", value1, value2, "tripTextSrc");
            return (Criteria) this;
        }

        public Criteria andTripTextSrcNotBetween(String value1, String value2) {
            addCriterion("TRIP_TEXT_SRC not between", value1, value2, "tripTextSrc");
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