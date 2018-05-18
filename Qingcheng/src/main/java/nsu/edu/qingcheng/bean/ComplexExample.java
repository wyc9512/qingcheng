package nsu.edu.qingcheng.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ComplexExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComplexExample() {
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

        public Criteria andComplexIdIsNull() {
            addCriterion("COMPLEX_ID is null");
            return (Criteria) this;
        }

        public Criteria andComplexIdIsNotNull() {
            addCriterion("COMPLEX_ID is not null");
            return (Criteria) this;
        }

        public Criteria andComplexIdEqualTo(Integer value) {
            addCriterion("COMPLEX_ID =", value, "complexId");
            return (Criteria) this;
        }

        public Criteria andComplexIdNotEqualTo(Integer value) {
            addCriterion("COMPLEX_ID <>", value, "complexId");
            return (Criteria) this;
        }

        public Criteria andComplexIdGreaterThan(Integer value) {
            addCriterion("COMPLEX_ID >", value, "complexId");
            return (Criteria) this;
        }

        public Criteria andComplexIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("COMPLEX_ID >=", value, "complexId");
            return (Criteria) this;
        }

        public Criteria andComplexIdLessThan(Integer value) {
            addCriterion("COMPLEX_ID <", value, "complexId");
            return (Criteria) this;
        }

        public Criteria andComplexIdLessThanOrEqualTo(Integer value) {
            addCriterion("COMPLEX_ID <=", value, "complexId");
            return (Criteria) this;
        }

        public Criteria andComplexIdIn(List<Integer> values) {
            addCriterion("COMPLEX_ID in", values, "complexId");
            return (Criteria) this;
        }

        public Criteria andComplexIdNotIn(List<Integer> values) {
            addCriterion("COMPLEX_ID not in", values, "complexId");
            return (Criteria) this;
        }

        public Criteria andComplexIdBetween(Integer value1, Integer value2) {
            addCriterion("COMPLEX_ID between", value1, value2, "complexId");
            return (Criteria) this;
        }

        public Criteria andComplexIdNotBetween(Integer value1, Integer value2) {
            addCriterion("COMPLEX_ID not between", value1, value2, "complexId");
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

        public Criteria andComplexTypeIsNull() {
            addCriterion("COMPLEX_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andComplexTypeIsNotNull() {
            addCriterion("COMPLEX_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andComplexTypeEqualTo(Integer value) {
            addCriterion("COMPLEX_TYPE =", value, "complexType");
            return (Criteria) this;
        }

        public Criteria andComplexTypeNotEqualTo(Integer value) {
            addCriterion("COMPLEX_TYPE <>", value, "complexType");
            return (Criteria) this;
        }

        public Criteria andComplexTypeGreaterThan(Integer value) {
            addCriterion("COMPLEX_TYPE >", value, "complexType");
            return (Criteria) this;
        }

        public Criteria andComplexTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("COMPLEX_TYPE >=", value, "complexType");
            return (Criteria) this;
        }

        public Criteria andComplexTypeLessThan(Integer value) {
            addCriterion("COMPLEX_TYPE <", value, "complexType");
            return (Criteria) this;
        }

        public Criteria andComplexTypeLessThanOrEqualTo(Integer value) {
            addCriterion("COMPLEX_TYPE <=", value, "complexType");
            return (Criteria) this;
        }

        public Criteria andComplexTypeIn(List<Integer> values) {
            addCriterion("COMPLEX_TYPE in", values, "complexType");
            return (Criteria) this;
        }

        public Criteria andComplexTypeNotIn(List<Integer> values) {
            addCriterion("COMPLEX_TYPE not in", values, "complexType");
            return (Criteria) this;
        }

        public Criteria andComplexTypeBetween(Integer value1, Integer value2) {
            addCriterion("COMPLEX_TYPE between", value1, value2, "complexType");
            return (Criteria) this;
        }

        public Criteria andComplexTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("COMPLEX_TYPE not between", value1, value2, "complexType");
            return (Criteria) this;
        }

        public Criteria andComplexNameIsNull() {
            addCriterion("COMPLEX_NAME is null");
            return (Criteria) this;
        }

        public Criteria andComplexNameIsNotNull() {
            addCriterion("COMPLEX_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andComplexNameEqualTo(String value) {
            addCriterion("COMPLEX_NAME =", value, "complexName");
            return (Criteria) this;
        }

        public Criteria andComplexNameNotEqualTo(String value) {
            addCriterion("COMPLEX_NAME <>", value, "complexName");
            return (Criteria) this;
        }

        public Criteria andComplexNameGreaterThan(String value) {
            addCriterion("COMPLEX_NAME >", value, "complexName");
            return (Criteria) this;
        }

        public Criteria andComplexNameGreaterThanOrEqualTo(String value) {
            addCriterion("COMPLEX_NAME >=", value, "complexName");
            return (Criteria) this;
        }

        public Criteria andComplexNameLessThan(String value) {
            addCriterion("COMPLEX_NAME <", value, "complexName");
            return (Criteria) this;
        }

        public Criteria andComplexNameLessThanOrEqualTo(String value) {
            addCriterion("COMPLEX_NAME <=", value, "complexName");
            return (Criteria) this;
        }

        public Criteria andComplexNameLike(String value) {
            addCriterion("COMPLEX_NAME like", value, "complexName");
            return (Criteria) this;
        }

        public Criteria andComplexNameNotLike(String value) {
            addCriterion("COMPLEX_NAME not like", value, "complexName");
            return (Criteria) this;
        }

        public Criteria andComplexNameIn(List<String> values) {
            addCriterion("COMPLEX_NAME in", values, "complexName");
            return (Criteria) this;
        }

        public Criteria andComplexNameNotIn(List<String> values) {
            addCriterion("COMPLEX_NAME not in", values, "complexName");
            return (Criteria) this;
        }

        public Criteria andComplexNameBetween(String value1, String value2) {
            addCriterion("COMPLEX_NAME between", value1, value2, "complexName");
            return (Criteria) this;
        }

        public Criteria andComplexNameNotBetween(String value1, String value2) {
            addCriterion("COMPLEX_NAME not between", value1, value2, "complexName");
            return (Criteria) this;
        }

        public Criteria andComplexPicIsNull() {
            addCriterion("COMPLEX_PIC is null");
            return (Criteria) this;
        }

        public Criteria andComplexPicIsNotNull() {
            addCriterion("COMPLEX_PIC is not null");
            return (Criteria) this;
        }

        public Criteria andComplexPicEqualTo(String value) {
            addCriterion("COMPLEX_PIC =", value, "complexPic");
            return (Criteria) this;
        }

        public Criteria andComplexPicNotEqualTo(String value) {
            addCriterion("COMPLEX_PIC <>", value, "complexPic");
            return (Criteria) this;
        }

        public Criteria andComplexPicGreaterThan(String value) {
            addCriterion("COMPLEX_PIC >", value, "complexPic");
            return (Criteria) this;
        }

        public Criteria andComplexPicGreaterThanOrEqualTo(String value) {
            addCriterion("COMPLEX_PIC >=", value, "complexPic");
            return (Criteria) this;
        }

        public Criteria andComplexPicLessThan(String value) {
            addCriterion("COMPLEX_PIC <", value, "complexPic");
            return (Criteria) this;
        }

        public Criteria andComplexPicLessThanOrEqualTo(String value) {
            addCriterion("COMPLEX_PIC <=", value, "complexPic");
            return (Criteria) this;
        }

        public Criteria andComplexPicLike(String value) {
            addCriterion("COMPLEX_PIC like", value, "complexPic");
            return (Criteria) this;
        }

        public Criteria andComplexPicNotLike(String value) {
            addCriterion("COMPLEX_PIC not like", value, "complexPic");
            return (Criteria) this;
        }

        public Criteria andComplexPicIn(List<String> values) {
            addCriterion("COMPLEX_PIC in", values, "complexPic");
            return (Criteria) this;
        }

        public Criteria andComplexPicNotIn(List<String> values) {
            addCriterion("COMPLEX_PIC not in", values, "complexPic");
            return (Criteria) this;
        }

        public Criteria andComplexPicBetween(String value1, String value2) {
            addCriterion("COMPLEX_PIC between", value1, value2, "complexPic");
            return (Criteria) this;
        }

        public Criteria andComplexPicNotBetween(String value1, String value2) {
            addCriterion("COMPLEX_PIC not between", value1, value2, "complexPic");
            return (Criteria) this;
        }

        public Criteria andComplexIntroduceIsNull() {
            addCriterion("COMPLEX_INTRODUCE is null");
            return (Criteria) this;
        }

        public Criteria andComplexIntroduceIsNotNull() {
            addCriterion("COMPLEX_INTRODUCE is not null");
            return (Criteria) this;
        }

        public Criteria andComplexIntroduceEqualTo(String value) {
            addCriterion("COMPLEX_INTRODUCE =", value, "complexIntroduce");
            return (Criteria) this;
        }

        public Criteria andComplexIntroduceNotEqualTo(String value) {
            addCriterion("COMPLEX_INTRODUCE <>", value, "complexIntroduce");
            return (Criteria) this;
        }

        public Criteria andComplexIntroduceGreaterThan(String value) {
            addCriterion("COMPLEX_INTRODUCE >", value, "complexIntroduce");
            return (Criteria) this;
        }

        public Criteria andComplexIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("COMPLEX_INTRODUCE >=", value, "complexIntroduce");
            return (Criteria) this;
        }

        public Criteria andComplexIntroduceLessThan(String value) {
            addCriterion("COMPLEX_INTRODUCE <", value, "complexIntroduce");
            return (Criteria) this;
        }

        public Criteria andComplexIntroduceLessThanOrEqualTo(String value) {
            addCriterion("COMPLEX_INTRODUCE <=", value, "complexIntroduce");
            return (Criteria) this;
        }

        public Criteria andComplexIntroduceLike(String value) {
            addCriterion("COMPLEX_INTRODUCE like", value, "complexIntroduce");
            return (Criteria) this;
        }

        public Criteria andComplexIntroduceNotLike(String value) {
            addCriterion("COMPLEX_INTRODUCE not like", value, "complexIntroduce");
            return (Criteria) this;
        }

        public Criteria andComplexIntroduceIn(List<String> values) {
            addCriterion("COMPLEX_INTRODUCE in", values, "complexIntroduce");
            return (Criteria) this;
        }

        public Criteria andComplexIntroduceNotIn(List<String> values) {
            addCriterion("COMPLEX_INTRODUCE not in", values, "complexIntroduce");
            return (Criteria) this;
        }

        public Criteria andComplexIntroduceBetween(String value1, String value2) {
            addCriterion("COMPLEX_INTRODUCE between", value1, value2, "complexIntroduce");
            return (Criteria) this;
        }

        public Criteria andComplexIntroduceNotBetween(String value1, String value2) {
            addCriterion("COMPLEX_INTRODUCE not between", value1, value2, "complexIntroduce");
            return (Criteria) this;
        }

        public Criteria andComplexLogoIsNull() {
            addCriterion("COMPLEX_LOGO is null");
            return (Criteria) this;
        }

        public Criteria andComplexLogoIsNotNull() {
            addCriterion("COMPLEX_LOGO is not null");
            return (Criteria) this;
        }

        public Criteria andComplexLogoEqualTo(String value) {
            addCriterion("COMPLEX_LOGO =", value, "complexLogo");
            return (Criteria) this;
        }

        public Criteria andComplexLogoNotEqualTo(String value) {
            addCriterion("COMPLEX_LOGO <>", value, "complexLogo");
            return (Criteria) this;
        }

        public Criteria andComplexLogoGreaterThan(String value) {
            addCriterion("COMPLEX_LOGO >", value, "complexLogo");
            return (Criteria) this;
        }

        public Criteria andComplexLogoGreaterThanOrEqualTo(String value) {
            addCriterion("COMPLEX_LOGO >=", value, "complexLogo");
            return (Criteria) this;
        }

        public Criteria andComplexLogoLessThan(String value) {
            addCriterion("COMPLEX_LOGO <", value, "complexLogo");
            return (Criteria) this;
        }

        public Criteria andComplexLogoLessThanOrEqualTo(String value) {
            addCriterion("COMPLEX_LOGO <=", value, "complexLogo");
            return (Criteria) this;
        }

        public Criteria andComplexLogoLike(String value) {
            addCriterion("COMPLEX_LOGO like", value, "complexLogo");
            return (Criteria) this;
        }

        public Criteria andComplexLogoNotLike(String value) {
            addCriterion("COMPLEX_LOGO not like", value, "complexLogo");
            return (Criteria) this;
        }

        public Criteria andComplexLogoIn(List<String> values) {
            addCriterion("COMPLEX_LOGO in", values, "complexLogo");
            return (Criteria) this;
        }

        public Criteria andComplexLogoNotIn(List<String> values) {
            addCriterion("COMPLEX_LOGO not in", values, "complexLogo");
            return (Criteria) this;
        }

        public Criteria andComplexLogoBetween(String value1, String value2) {
            addCriterion("COMPLEX_LOGO between", value1, value2, "complexLogo");
            return (Criteria) this;
        }

        public Criteria andComplexLogoNotBetween(String value1, String value2) {
            addCriterion("COMPLEX_LOGO not between", value1, value2, "complexLogo");
            return (Criteria) this;
        }

        public Criteria andComplexReadCountIsNull() {
            addCriterion("COMPLEX_READ_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andComplexReadCountIsNotNull() {
            addCriterion("COMPLEX_READ_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andComplexReadCountEqualTo(Integer value) {
            addCriterion("COMPLEX_READ_COUNT =", value, "complexReadCount");
            return (Criteria) this;
        }

        public Criteria andComplexReadCountNotEqualTo(Integer value) {
            addCriterion("COMPLEX_READ_COUNT <>", value, "complexReadCount");
            return (Criteria) this;
        }

        public Criteria andComplexReadCountGreaterThan(Integer value) {
            addCriterion("COMPLEX_READ_COUNT >", value, "complexReadCount");
            return (Criteria) this;
        }

        public Criteria andComplexReadCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("COMPLEX_READ_COUNT >=", value, "complexReadCount");
            return (Criteria) this;
        }

        public Criteria andComplexReadCountLessThan(Integer value) {
            addCriterion("COMPLEX_READ_COUNT <", value, "complexReadCount");
            return (Criteria) this;
        }

        public Criteria andComplexReadCountLessThanOrEqualTo(Integer value) {
            addCriterion("COMPLEX_READ_COUNT <=", value, "complexReadCount");
            return (Criteria) this;
        }

        public Criteria andComplexReadCountIn(List<Integer> values) {
            addCriterion("COMPLEX_READ_COUNT in", values, "complexReadCount");
            return (Criteria) this;
        }

        public Criteria andComplexReadCountNotIn(List<Integer> values) {
            addCriterion("COMPLEX_READ_COUNT not in", values, "complexReadCount");
            return (Criteria) this;
        }

        public Criteria andComplexReadCountBetween(Integer value1, Integer value2) {
            addCriterion("COMPLEX_READ_COUNT between", value1, value2, "complexReadCount");
            return (Criteria) this;
        }

        public Criteria andComplexReadCountNotBetween(Integer value1, Integer value2) {
            addCriterion("COMPLEX_READ_COUNT not between", value1, value2, "complexReadCount");
            return (Criteria) this;
        }

        public Criteria andComplexKeywordIsNull() {
            addCriterion("COMPLEX_KEYWORD is null");
            return (Criteria) this;
        }

        public Criteria andComplexKeywordIsNotNull() {
            addCriterion("COMPLEX_KEYWORD is not null");
            return (Criteria) this;
        }

        public Criteria andComplexKeywordEqualTo(String value) {
            addCriterion("COMPLEX_KEYWORD =", value, "complexKeyword");
            return (Criteria) this;
        }

        public Criteria andComplexKeywordNotEqualTo(String value) {
            addCriterion("COMPLEX_KEYWORD <>", value, "complexKeyword");
            return (Criteria) this;
        }

        public Criteria andComplexKeywordGreaterThan(String value) {
            addCriterion("COMPLEX_KEYWORD >", value, "complexKeyword");
            return (Criteria) this;
        }

        public Criteria andComplexKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("COMPLEX_KEYWORD >=", value, "complexKeyword");
            return (Criteria) this;
        }

        public Criteria andComplexKeywordLessThan(String value) {
            addCriterion("COMPLEX_KEYWORD <", value, "complexKeyword");
            return (Criteria) this;
        }

        public Criteria andComplexKeywordLessThanOrEqualTo(String value) {
            addCriterion("COMPLEX_KEYWORD <=", value, "complexKeyword");
            return (Criteria) this;
        }

        public Criteria andComplexKeywordLike(String value) {
            addCriterion("COMPLEX_KEYWORD like", value, "complexKeyword");
            return (Criteria) this;
        }

        public Criteria andComplexKeywordNotLike(String value) {
            addCriterion("COMPLEX_KEYWORD not like", value, "complexKeyword");
            return (Criteria) this;
        }

        public Criteria andComplexKeywordIn(List<String> values) {
            addCriterion("COMPLEX_KEYWORD in", values, "complexKeyword");
            return (Criteria) this;
        }

        public Criteria andComplexKeywordNotIn(List<String> values) {
            addCriterion("COMPLEX_KEYWORD not in", values, "complexKeyword");
            return (Criteria) this;
        }

        public Criteria andComplexKeywordBetween(String value1, String value2) {
            addCriterion("COMPLEX_KEYWORD between", value1, value2, "complexKeyword");
            return (Criteria) this;
        }

        public Criteria andComplexKeywordNotBetween(String value1, String value2) {
            addCriterion("COMPLEX_KEYWORD not between", value1, value2, "complexKeyword");
            return (Criteria) this;
        }

        public Criteria andComplexDateIsNull() {
            addCriterion("COMPLEX_DATE is null");
            return (Criteria) this;
        }

        public Criteria andComplexDateIsNotNull() {
            addCriterion("COMPLEX_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andComplexDateEqualTo(Date value) {
            addCriterionForJDBCDate("COMPLEX_DATE =", value, "complexDate");
            return (Criteria) this;
        }

        public Criteria andComplexDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("COMPLEX_DATE <>", value, "complexDate");
            return (Criteria) this;
        }

        public Criteria andComplexDateGreaterThan(Date value) {
            addCriterionForJDBCDate("COMPLEX_DATE >", value, "complexDate");
            return (Criteria) this;
        }

        public Criteria andComplexDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("COMPLEX_DATE >=", value, "complexDate");
            return (Criteria) this;
        }

        public Criteria andComplexDateLessThan(Date value) {
            addCriterionForJDBCDate("COMPLEX_DATE <", value, "complexDate");
            return (Criteria) this;
        }

        public Criteria andComplexDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("COMPLEX_DATE <=", value, "complexDate");
            return (Criteria) this;
        }

        public Criteria andComplexDateIn(List<Date> values) {
            addCriterionForJDBCDate("COMPLEX_DATE in", values, "complexDate");
            return (Criteria) this;
        }

        public Criteria andComplexDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("COMPLEX_DATE not in", values, "complexDate");
            return (Criteria) this;
        }

        public Criteria andComplexDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("COMPLEX_DATE between", value1, value2, "complexDate");
            return (Criteria) this;
        }

        public Criteria andComplexDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("COMPLEX_DATE not between", value1, value2, "complexDate");
            return (Criteria) this;
        }

        public Criteria andComplexPlaceIsNull() {
            addCriterion("COMPLEX_PLACE is null");
            return (Criteria) this;
        }

        public Criteria andComplexPlaceIsNotNull() {
            addCriterion("COMPLEX_PLACE is not null");
            return (Criteria) this;
        }

        public Criteria andComplexPlaceEqualTo(String value) {
            addCriterion("COMPLEX_PLACE =", value, "complexPlace");
            return (Criteria) this;
        }

        public Criteria andComplexPlaceNotEqualTo(String value) {
            addCriterion("COMPLEX_PLACE <>", value, "complexPlace");
            return (Criteria) this;
        }

        public Criteria andComplexPlaceGreaterThan(String value) {
            addCriterion("COMPLEX_PLACE >", value, "complexPlace");
            return (Criteria) this;
        }

        public Criteria andComplexPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("COMPLEX_PLACE >=", value, "complexPlace");
            return (Criteria) this;
        }

        public Criteria andComplexPlaceLessThan(String value) {
            addCriterion("COMPLEX_PLACE <", value, "complexPlace");
            return (Criteria) this;
        }

        public Criteria andComplexPlaceLessThanOrEqualTo(String value) {
            addCriterion("COMPLEX_PLACE <=", value, "complexPlace");
            return (Criteria) this;
        }

        public Criteria andComplexPlaceLike(String value) {
            addCriterion("COMPLEX_PLACE like", value, "complexPlace");
            return (Criteria) this;
        }

        public Criteria andComplexPlaceNotLike(String value) {
            addCriterion("COMPLEX_PLACE not like", value, "complexPlace");
            return (Criteria) this;
        }

        public Criteria andComplexPlaceIn(List<String> values) {
            addCriterion("COMPLEX_PLACE in", values, "complexPlace");
            return (Criteria) this;
        }

        public Criteria andComplexPlaceNotIn(List<String> values) {
            addCriterion("COMPLEX_PLACE not in", values, "complexPlace");
            return (Criteria) this;
        }

        public Criteria andComplexPlaceBetween(String value1, String value2) {
            addCriterion("COMPLEX_PLACE between", value1, value2, "complexPlace");
            return (Criteria) this;
        }

        public Criteria andComplexPlaceNotBetween(String value1, String value2) {
            addCriterion("COMPLEX_PLACE not between", value1, value2, "complexPlace");
            return (Criteria) this;
        }

        public Criteria andComplexPhoneIsNull() {
            addCriterion("COMPLEX_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andComplexPhoneIsNotNull() {
            addCriterion("COMPLEX_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andComplexPhoneEqualTo(String value) {
            addCriterion("COMPLEX_PHONE =", value, "complexPhone");
            return (Criteria) this;
        }

        public Criteria andComplexPhoneNotEqualTo(String value) {
            addCriterion("COMPLEX_PHONE <>", value, "complexPhone");
            return (Criteria) this;
        }

        public Criteria andComplexPhoneGreaterThan(String value) {
            addCriterion("COMPLEX_PHONE >", value, "complexPhone");
            return (Criteria) this;
        }

        public Criteria andComplexPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("COMPLEX_PHONE >=", value, "complexPhone");
            return (Criteria) this;
        }

        public Criteria andComplexPhoneLessThan(String value) {
            addCriterion("COMPLEX_PHONE <", value, "complexPhone");
            return (Criteria) this;
        }

        public Criteria andComplexPhoneLessThanOrEqualTo(String value) {
            addCriterion("COMPLEX_PHONE <=", value, "complexPhone");
            return (Criteria) this;
        }

        public Criteria andComplexPhoneLike(String value) {
            addCriterion("COMPLEX_PHONE like", value, "complexPhone");
            return (Criteria) this;
        }

        public Criteria andComplexPhoneNotLike(String value) {
            addCriterion("COMPLEX_PHONE not like", value, "complexPhone");
            return (Criteria) this;
        }

        public Criteria andComplexPhoneIn(List<String> values) {
            addCriterion("COMPLEX_PHONE in", values, "complexPhone");
            return (Criteria) this;
        }

        public Criteria andComplexPhoneNotIn(List<String> values) {
            addCriterion("COMPLEX_PHONE not in", values, "complexPhone");
            return (Criteria) this;
        }

        public Criteria andComplexPhoneBetween(String value1, String value2) {
            addCriterion("COMPLEX_PHONE between", value1, value2, "complexPhone");
            return (Criteria) this;
        }

        public Criteria andComplexPhoneNotBetween(String value1, String value2) {
            addCriterion("COMPLEX_PHONE not between", value1, value2, "complexPhone");
            return (Criteria) this;
        }

        public Criteria andComplexTrafficIsNull() {
            addCriterion("COMPLEX_TRAFFIC is null");
            return (Criteria) this;
        }

        public Criteria andComplexTrafficIsNotNull() {
            addCriterion("COMPLEX_TRAFFIC is not null");
            return (Criteria) this;
        }

        public Criteria andComplexTrafficEqualTo(String value) {
            addCriterion("COMPLEX_TRAFFIC =", value, "complexTraffic");
            return (Criteria) this;
        }

        public Criteria andComplexTrafficNotEqualTo(String value) {
            addCriterion("COMPLEX_TRAFFIC <>", value, "complexTraffic");
            return (Criteria) this;
        }

        public Criteria andComplexTrafficGreaterThan(String value) {
            addCriterion("COMPLEX_TRAFFIC >", value, "complexTraffic");
            return (Criteria) this;
        }

        public Criteria andComplexTrafficGreaterThanOrEqualTo(String value) {
            addCriterion("COMPLEX_TRAFFIC >=", value, "complexTraffic");
            return (Criteria) this;
        }

        public Criteria andComplexTrafficLessThan(String value) {
            addCriterion("COMPLEX_TRAFFIC <", value, "complexTraffic");
            return (Criteria) this;
        }

        public Criteria andComplexTrafficLessThanOrEqualTo(String value) {
            addCriterion("COMPLEX_TRAFFIC <=", value, "complexTraffic");
            return (Criteria) this;
        }

        public Criteria andComplexTrafficLike(String value) {
            addCriterion("COMPLEX_TRAFFIC like", value, "complexTraffic");
            return (Criteria) this;
        }

        public Criteria andComplexTrafficNotLike(String value) {
            addCriterion("COMPLEX_TRAFFIC not like", value, "complexTraffic");
            return (Criteria) this;
        }

        public Criteria andComplexTrafficIn(List<String> values) {
            addCriterion("COMPLEX_TRAFFIC in", values, "complexTraffic");
            return (Criteria) this;
        }

        public Criteria andComplexTrafficNotIn(List<String> values) {
            addCriterion("COMPLEX_TRAFFIC not in", values, "complexTraffic");
            return (Criteria) this;
        }

        public Criteria andComplexTrafficBetween(String value1, String value2) {
            addCriterion("COMPLEX_TRAFFIC between", value1, value2, "complexTraffic");
            return (Criteria) this;
        }

        public Criteria andComplexTrafficNotBetween(String value1, String value2) {
            addCriterion("COMPLEX_TRAFFIC not between", value1, value2, "complexTraffic");
            return (Criteria) this;
        }

        public Criteria andComplexPeopleIsNull() {
            addCriterion("COMPLEX_PEOPLE is null");
            return (Criteria) this;
        }

        public Criteria andComplexPeopleIsNotNull() {
            addCriterion("COMPLEX_PEOPLE is not null");
            return (Criteria) this;
        }

        public Criteria andComplexPeopleEqualTo(Integer value) {
            addCriterion("COMPLEX_PEOPLE =", value, "complexPeople");
            return (Criteria) this;
        }

        public Criteria andComplexPeopleNotEqualTo(Integer value) {
            addCriterion("COMPLEX_PEOPLE <>", value, "complexPeople");
            return (Criteria) this;
        }

        public Criteria andComplexPeopleGreaterThan(Integer value) {
            addCriterion("COMPLEX_PEOPLE >", value, "complexPeople");
            return (Criteria) this;
        }

        public Criteria andComplexPeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("COMPLEX_PEOPLE >=", value, "complexPeople");
            return (Criteria) this;
        }

        public Criteria andComplexPeopleLessThan(Integer value) {
            addCriterion("COMPLEX_PEOPLE <", value, "complexPeople");
            return (Criteria) this;
        }

        public Criteria andComplexPeopleLessThanOrEqualTo(Integer value) {
            addCriterion("COMPLEX_PEOPLE <=", value, "complexPeople");
            return (Criteria) this;
        }

        public Criteria andComplexPeopleIn(List<Integer> values) {
            addCriterion("COMPLEX_PEOPLE in", values, "complexPeople");
            return (Criteria) this;
        }

        public Criteria andComplexPeopleNotIn(List<Integer> values) {
            addCriterion("COMPLEX_PEOPLE not in", values, "complexPeople");
            return (Criteria) this;
        }

        public Criteria andComplexPeopleBetween(Integer value1, Integer value2) {
            addCriterion("COMPLEX_PEOPLE between", value1, value2, "complexPeople");
            return (Criteria) this;
        }

        public Criteria andComplexPeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("COMPLEX_PEOPLE not between", value1, value2, "complexPeople");
            return (Criteria) this;
        }

        public Criteria andComplexArticleSourceIsNull() {
            addCriterion("COMPLEX_ARTICLE_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andComplexArticleSourceIsNotNull() {
            addCriterion("COMPLEX_ARTICLE_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andComplexArticleSourceEqualTo(String value) {
            addCriterion("COMPLEX_ARTICLE_SOURCE =", value, "complexArticleSource");
            return (Criteria) this;
        }

        public Criteria andComplexArticleSourceNotEqualTo(String value) {
            addCriterion("COMPLEX_ARTICLE_SOURCE <>", value, "complexArticleSource");
            return (Criteria) this;
        }

        public Criteria andComplexArticleSourceGreaterThan(String value) {
            addCriterion("COMPLEX_ARTICLE_SOURCE >", value, "complexArticleSource");
            return (Criteria) this;
        }

        public Criteria andComplexArticleSourceGreaterThanOrEqualTo(String value) {
            addCriterion("COMPLEX_ARTICLE_SOURCE >=", value, "complexArticleSource");
            return (Criteria) this;
        }

        public Criteria andComplexArticleSourceLessThan(String value) {
            addCriterion("COMPLEX_ARTICLE_SOURCE <", value, "complexArticleSource");
            return (Criteria) this;
        }

        public Criteria andComplexArticleSourceLessThanOrEqualTo(String value) {
            addCriterion("COMPLEX_ARTICLE_SOURCE <=", value, "complexArticleSource");
            return (Criteria) this;
        }

        public Criteria andComplexArticleSourceLike(String value) {
            addCriterion("COMPLEX_ARTICLE_SOURCE like", value, "complexArticleSource");
            return (Criteria) this;
        }

        public Criteria andComplexArticleSourceNotLike(String value) {
            addCriterion("COMPLEX_ARTICLE_SOURCE not like", value, "complexArticleSource");
            return (Criteria) this;
        }

        public Criteria andComplexArticleSourceIn(List<String> values) {
            addCriterion("COMPLEX_ARTICLE_SOURCE in", values, "complexArticleSource");
            return (Criteria) this;
        }

        public Criteria andComplexArticleSourceNotIn(List<String> values) {
            addCriterion("COMPLEX_ARTICLE_SOURCE not in", values, "complexArticleSource");
            return (Criteria) this;
        }

        public Criteria andComplexArticleSourceBetween(String value1, String value2) {
            addCriterion("COMPLEX_ARTICLE_SOURCE between", value1, value2, "complexArticleSource");
            return (Criteria) this;
        }

        public Criteria andComplexArticleSourceNotBetween(String value1, String value2) {
            addCriterion("COMPLEX_ARTICLE_SOURCE not between", value1, value2, "complexArticleSource");
            return (Criteria) this;
        }

        public Criteria andComplexAuthorIsNull() {
            addCriterion("COMPLEX_AUTHOR is null");
            return (Criteria) this;
        }

        public Criteria andComplexAuthorIsNotNull() {
            addCriterion("COMPLEX_AUTHOR is not null");
            return (Criteria) this;
        }

        public Criteria andComplexAuthorEqualTo(String value) {
            addCriterion("COMPLEX_AUTHOR =", value, "complexAuthor");
            return (Criteria) this;
        }

        public Criteria andComplexAuthorNotEqualTo(String value) {
            addCriterion("COMPLEX_AUTHOR <>", value, "complexAuthor");
            return (Criteria) this;
        }

        public Criteria andComplexAuthorGreaterThan(String value) {
            addCriterion("COMPLEX_AUTHOR >", value, "complexAuthor");
            return (Criteria) this;
        }

        public Criteria andComplexAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("COMPLEX_AUTHOR >=", value, "complexAuthor");
            return (Criteria) this;
        }

        public Criteria andComplexAuthorLessThan(String value) {
            addCriterion("COMPLEX_AUTHOR <", value, "complexAuthor");
            return (Criteria) this;
        }

        public Criteria andComplexAuthorLessThanOrEqualTo(String value) {
            addCriterion("COMPLEX_AUTHOR <=", value, "complexAuthor");
            return (Criteria) this;
        }

        public Criteria andComplexAuthorLike(String value) {
            addCriterion("COMPLEX_AUTHOR like", value, "complexAuthor");
            return (Criteria) this;
        }

        public Criteria andComplexAuthorNotLike(String value) {
            addCriterion("COMPLEX_AUTHOR not like", value, "complexAuthor");
            return (Criteria) this;
        }

        public Criteria andComplexAuthorIn(List<String> values) {
            addCriterion("COMPLEX_AUTHOR in", values, "complexAuthor");
            return (Criteria) this;
        }

        public Criteria andComplexAuthorNotIn(List<String> values) {
            addCriterion("COMPLEX_AUTHOR not in", values, "complexAuthor");
            return (Criteria) this;
        }

        public Criteria andComplexAuthorBetween(String value1, String value2) {
            addCriterion("COMPLEX_AUTHOR between", value1, value2, "complexAuthor");
            return (Criteria) this;
        }

        public Criteria andComplexAuthorNotBetween(String value1, String value2) {
            addCriterion("COMPLEX_AUTHOR not between", value1, value2, "complexAuthor");
            return (Criteria) this;
        }

        public Criteria andComplexSummaryIsNull() {
            addCriterion("COMPLEX_SUMMARY is null");
            return (Criteria) this;
        }

        public Criteria andComplexSummaryIsNotNull() {
            addCriterion("COMPLEX_SUMMARY is not null");
            return (Criteria) this;
        }

        public Criteria andComplexSummaryEqualTo(String value) {
            addCriterion("COMPLEX_SUMMARY =", value, "complexSummary");
            return (Criteria) this;
        }

        public Criteria andComplexSummaryNotEqualTo(String value) {
            addCriterion("COMPLEX_SUMMARY <>", value, "complexSummary");
            return (Criteria) this;
        }

        public Criteria andComplexSummaryGreaterThan(String value) {
            addCriterion("COMPLEX_SUMMARY >", value, "complexSummary");
            return (Criteria) this;
        }

        public Criteria andComplexSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("COMPLEX_SUMMARY >=", value, "complexSummary");
            return (Criteria) this;
        }

        public Criteria andComplexSummaryLessThan(String value) {
            addCriterion("COMPLEX_SUMMARY <", value, "complexSummary");
            return (Criteria) this;
        }

        public Criteria andComplexSummaryLessThanOrEqualTo(String value) {
            addCriterion("COMPLEX_SUMMARY <=", value, "complexSummary");
            return (Criteria) this;
        }

        public Criteria andComplexSummaryLike(String value) {
            addCriterion("COMPLEX_SUMMARY like", value, "complexSummary");
            return (Criteria) this;
        }

        public Criteria andComplexSummaryNotLike(String value) {
            addCriterion("COMPLEX_SUMMARY not like", value, "complexSummary");
            return (Criteria) this;
        }

        public Criteria andComplexSummaryIn(List<String> values) {
            addCriterion("COMPLEX_SUMMARY in", values, "complexSummary");
            return (Criteria) this;
        }

        public Criteria andComplexSummaryNotIn(List<String> values) {
            addCriterion("COMPLEX_SUMMARY not in", values, "complexSummary");
            return (Criteria) this;
        }

        public Criteria andComplexSummaryBetween(String value1, String value2) {
            addCriterion("COMPLEX_SUMMARY between", value1, value2, "complexSummary");
            return (Criteria) this;
        }

        public Criteria andComplexSummaryNotBetween(String value1, String value2) {
            addCriterion("COMPLEX_SUMMARY not between", value1, value2, "complexSummary");
            return (Criteria) this;
        }

        public Criteria andComplexPriceIsNull() {
            addCriterion("COMPLEX_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andComplexPriceIsNotNull() {
            addCriterion("COMPLEX_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andComplexPriceEqualTo(Float value) {
            addCriterion("COMPLEX_PRICE =", value, "complexPrice");
            return (Criteria) this;
        }

        public Criteria andComplexPriceNotEqualTo(Float value) {
            addCriterion("COMPLEX_PRICE <>", value, "complexPrice");
            return (Criteria) this;
        }

        public Criteria andComplexPriceGreaterThan(Float value) {
            addCriterion("COMPLEX_PRICE >", value, "complexPrice");
            return (Criteria) this;
        }

        public Criteria andComplexPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("COMPLEX_PRICE >=", value, "complexPrice");
            return (Criteria) this;
        }

        public Criteria andComplexPriceLessThan(Float value) {
            addCriterion("COMPLEX_PRICE <", value, "complexPrice");
            return (Criteria) this;
        }

        public Criteria andComplexPriceLessThanOrEqualTo(Float value) {
            addCriterion("COMPLEX_PRICE <=", value, "complexPrice");
            return (Criteria) this;
        }

        public Criteria andComplexPriceIn(List<Float> values) {
            addCriterion("COMPLEX_PRICE in", values, "complexPrice");
            return (Criteria) this;
        }

        public Criteria andComplexPriceNotIn(List<Float> values) {
            addCriterion("COMPLEX_PRICE not in", values, "complexPrice");
            return (Criteria) this;
        }

        public Criteria andComplexPriceBetween(Float value1, Float value2) {
            addCriterion("COMPLEX_PRICE between", value1, value2, "complexPrice");
            return (Criteria) this;
        }

        public Criteria andComplexPriceNotBetween(Float value1, Float value2) {
            addCriterion("COMPLEX_PRICE not between", value1, value2, "complexPrice");
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