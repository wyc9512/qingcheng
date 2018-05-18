package nsu.edu.qingcheng.bean;

import java.util.ArrayList;
import java.util.List;

public class ResidenceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResidenceExample() {
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

        public Criteria andResidenceNameIsNull() {
            addCriterion("RESIDENCE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andResidenceNameIsNotNull() {
            addCriterion("RESIDENCE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andResidenceNameEqualTo(String value) {
            addCriterion("RESIDENCE_NAME =", value, "residenceName");
            return (Criteria) this;
        }

        public Criteria andResidenceNameNotEqualTo(String value) {
            addCriterion("RESIDENCE_NAME <>", value, "residenceName");
            return (Criteria) this;
        }

        public Criteria andResidenceNameGreaterThan(String value) {
            addCriterion("RESIDENCE_NAME >", value, "residenceName");
            return (Criteria) this;
        }

        public Criteria andResidenceNameGreaterThanOrEqualTo(String value) {
            addCriterion("RESIDENCE_NAME >=", value, "residenceName");
            return (Criteria) this;
        }

        public Criteria andResidenceNameLessThan(String value) {
            addCriterion("RESIDENCE_NAME <", value, "residenceName");
            return (Criteria) this;
        }

        public Criteria andResidenceNameLessThanOrEqualTo(String value) {
            addCriterion("RESIDENCE_NAME <=", value, "residenceName");
            return (Criteria) this;
        }

        public Criteria andResidenceNameLike(String value) {
            addCriterion("RESIDENCE_NAME like", value, "residenceName");
            return (Criteria) this;
        }

        public Criteria andResidenceNameNotLike(String value) {
            addCriterion("RESIDENCE_NAME not like", value, "residenceName");
            return (Criteria) this;
        }

        public Criteria andResidenceNameIn(List<String> values) {
            addCriterion("RESIDENCE_NAME in", values, "residenceName");
            return (Criteria) this;
        }

        public Criteria andResidenceNameNotIn(List<String> values) {
            addCriterion("RESIDENCE_NAME not in", values, "residenceName");
            return (Criteria) this;
        }

        public Criteria andResidenceNameBetween(String value1, String value2) {
            addCriterion("RESIDENCE_NAME between", value1, value2, "residenceName");
            return (Criteria) this;
        }

        public Criteria andResidenceNameNotBetween(String value1, String value2) {
            addCriterion("RESIDENCE_NAME not between", value1, value2, "residenceName");
            return (Criteria) this;
        }

        public Criteria andResidencePicIsNull() {
            addCriterion("RESIDENCE_PIC is null");
            return (Criteria) this;
        }

        public Criteria andResidencePicIsNotNull() {
            addCriterion("RESIDENCE_PIC is not null");
            return (Criteria) this;
        }

        public Criteria andResidencePicEqualTo(String value) {
            addCriterion("RESIDENCE_PIC =", value, "residencePic");
            return (Criteria) this;
        }

        public Criteria andResidencePicNotEqualTo(String value) {
            addCriterion("RESIDENCE_PIC <>", value, "residencePic");
            return (Criteria) this;
        }

        public Criteria andResidencePicGreaterThan(String value) {
            addCriterion("RESIDENCE_PIC >", value, "residencePic");
            return (Criteria) this;
        }

        public Criteria andResidencePicGreaterThanOrEqualTo(String value) {
            addCriterion("RESIDENCE_PIC >=", value, "residencePic");
            return (Criteria) this;
        }

        public Criteria andResidencePicLessThan(String value) {
            addCriterion("RESIDENCE_PIC <", value, "residencePic");
            return (Criteria) this;
        }

        public Criteria andResidencePicLessThanOrEqualTo(String value) {
            addCriterion("RESIDENCE_PIC <=", value, "residencePic");
            return (Criteria) this;
        }

        public Criteria andResidencePicLike(String value) {
            addCriterion("RESIDENCE_PIC like", value, "residencePic");
            return (Criteria) this;
        }

        public Criteria andResidencePicNotLike(String value) {
            addCriterion("RESIDENCE_PIC not like", value, "residencePic");
            return (Criteria) this;
        }

        public Criteria andResidencePicIn(List<String> values) {
            addCriterion("RESIDENCE_PIC in", values, "residencePic");
            return (Criteria) this;
        }

        public Criteria andResidencePicNotIn(List<String> values) {
            addCriterion("RESIDENCE_PIC not in", values, "residencePic");
            return (Criteria) this;
        }

        public Criteria andResidencePicBetween(String value1, String value2) {
            addCriterion("RESIDENCE_PIC between", value1, value2, "residencePic");
            return (Criteria) this;
        }

        public Criteria andResidencePicNotBetween(String value1, String value2) {
            addCriterion("RESIDENCE_PIC not between", value1, value2, "residencePic");
            return (Criteria) this;
        }

        public Criteria andResidenceIntroduceIsNull() {
            addCriterion("RESIDENCE_INTRODUCE is null");
            return (Criteria) this;
        }

        public Criteria andResidenceIntroduceIsNotNull() {
            addCriterion("RESIDENCE_INTRODUCE is not null");
            return (Criteria) this;
        }

        public Criteria andResidenceIntroduceEqualTo(String value) {
            addCriterion("RESIDENCE_INTRODUCE =", value, "residenceIntroduce");
            return (Criteria) this;
        }

        public Criteria andResidenceIntroduceNotEqualTo(String value) {
            addCriterion("RESIDENCE_INTRODUCE <>", value, "residenceIntroduce");
            return (Criteria) this;
        }

        public Criteria andResidenceIntroduceGreaterThan(String value) {
            addCriterion("RESIDENCE_INTRODUCE >", value, "residenceIntroduce");
            return (Criteria) this;
        }

        public Criteria andResidenceIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("RESIDENCE_INTRODUCE >=", value, "residenceIntroduce");
            return (Criteria) this;
        }

        public Criteria andResidenceIntroduceLessThan(String value) {
            addCriterion("RESIDENCE_INTRODUCE <", value, "residenceIntroduce");
            return (Criteria) this;
        }

        public Criteria andResidenceIntroduceLessThanOrEqualTo(String value) {
            addCriterion("RESIDENCE_INTRODUCE <=", value, "residenceIntroduce");
            return (Criteria) this;
        }

        public Criteria andResidenceIntroduceLike(String value) {
            addCriterion("RESIDENCE_INTRODUCE like", value, "residenceIntroduce");
            return (Criteria) this;
        }

        public Criteria andResidenceIntroduceNotLike(String value) {
            addCriterion("RESIDENCE_INTRODUCE not like", value, "residenceIntroduce");
            return (Criteria) this;
        }

        public Criteria andResidenceIntroduceIn(List<String> values) {
            addCriterion("RESIDENCE_INTRODUCE in", values, "residenceIntroduce");
            return (Criteria) this;
        }

        public Criteria andResidenceIntroduceNotIn(List<String> values) {
            addCriterion("RESIDENCE_INTRODUCE not in", values, "residenceIntroduce");
            return (Criteria) this;
        }

        public Criteria andResidenceIntroduceBetween(String value1, String value2) {
            addCriterion("RESIDENCE_INTRODUCE between", value1, value2, "residenceIntroduce");
            return (Criteria) this;
        }

        public Criteria andResidenceIntroduceNotBetween(String value1, String value2) {
            addCriterion("RESIDENCE_INTRODUCE not between", value1, value2, "residenceIntroduce");
            return (Criteria) this;
        }

        public Criteria andResidenceMapIsNull() {
            addCriterion("RESIDENCE_MAP is null");
            return (Criteria) this;
        }

        public Criteria andResidenceMapIsNotNull() {
            addCriterion("RESIDENCE_MAP is not null");
            return (Criteria) this;
        }

        public Criteria andResidenceMapEqualTo(String value) {
            addCriterion("RESIDENCE_MAP =", value, "residenceMap");
            return (Criteria) this;
        }

        public Criteria andResidenceMapNotEqualTo(String value) {
            addCriterion("RESIDENCE_MAP <>", value, "residenceMap");
            return (Criteria) this;
        }

        public Criteria andResidenceMapGreaterThan(String value) {
            addCriterion("RESIDENCE_MAP >", value, "residenceMap");
            return (Criteria) this;
        }

        public Criteria andResidenceMapGreaterThanOrEqualTo(String value) {
            addCriterion("RESIDENCE_MAP >=", value, "residenceMap");
            return (Criteria) this;
        }

        public Criteria andResidenceMapLessThan(String value) {
            addCriterion("RESIDENCE_MAP <", value, "residenceMap");
            return (Criteria) this;
        }

        public Criteria andResidenceMapLessThanOrEqualTo(String value) {
            addCriterion("RESIDENCE_MAP <=", value, "residenceMap");
            return (Criteria) this;
        }

        public Criteria andResidenceMapLike(String value) {
            addCriterion("RESIDENCE_MAP like", value, "residenceMap");
            return (Criteria) this;
        }

        public Criteria andResidenceMapNotLike(String value) {
            addCriterion("RESIDENCE_MAP not like", value, "residenceMap");
            return (Criteria) this;
        }

        public Criteria andResidenceMapIn(List<String> values) {
            addCriterion("RESIDENCE_MAP in", values, "residenceMap");
            return (Criteria) this;
        }

        public Criteria andResidenceMapNotIn(List<String> values) {
            addCriterion("RESIDENCE_MAP not in", values, "residenceMap");
            return (Criteria) this;
        }

        public Criteria andResidenceMapBetween(String value1, String value2) {
            addCriterion("RESIDENCE_MAP between", value1, value2, "residenceMap");
            return (Criteria) this;
        }

        public Criteria andResidenceMapNotBetween(String value1, String value2) {
            addCriterion("RESIDENCE_MAP not between", value1, value2, "residenceMap");
            return (Criteria) this;
        }

        public Criteria andResidenceTimeIsNull() {
            addCriterion("RESIDENCE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andResidenceTimeIsNotNull() {
            addCriterion("RESIDENCE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andResidenceTimeEqualTo(String value) {
            addCriterion("RESIDENCE_TIME =", value, "residenceTime");
            return (Criteria) this;
        }

        public Criteria andResidenceTimeNotEqualTo(String value) {
            addCriterion("RESIDENCE_TIME <>", value, "residenceTime");
            return (Criteria) this;
        }

        public Criteria andResidenceTimeGreaterThan(String value) {
            addCriterion("RESIDENCE_TIME >", value, "residenceTime");
            return (Criteria) this;
        }

        public Criteria andResidenceTimeGreaterThanOrEqualTo(String value) {
            addCriterion("RESIDENCE_TIME >=", value, "residenceTime");
            return (Criteria) this;
        }

        public Criteria andResidenceTimeLessThan(String value) {
            addCriterion("RESIDENCE_TIME <", value, "residenceTime");
            return (Criteria) this;
        }

        public Criteria andResidenceTimeLessThanOrEqualTo(String value) {
            addCriterion("RESIDENCE_TIME <=", value, "residenceTime");
            return (Criteria) this;
        }

        public Criteria andResidenceTimeLike(String value) {
            addCriterion("RESIDENCE_TIME like", value, "residenceTime");
            return (Criteria) this;
        }

        public Criteria andResidenceTimeNotLike(String value) {
            addCriterion("RESIDENCE_TIME not like", value, "residenceTime");
            return (Criteria) this;
        }

        public Criteria andResidenceTimeIn(List<String> values) {
            addCriterion("RESIDENCE_TIME in", values, "residenceTime");
            return (Criteria) this;
        }

        public Criteria andResidenceTimeNotIn(List<String> values) {
            addCriterion("RESIDENCE_TIME not in", values, "residenceTime");
            return (Criteria) this;
        }

        public Criteria andResidenceTimeBetween(String value1, String value2) {
            addCriterion("RESIDENCE_TIME between", value1, value2, "residenceTime");
            return (Criteria) this;
        }

        public Criteria andResidenceTimeNotBetween(String value1, String value2) {
            addCriterion("RESIDENCE_TIME not between", value1, value2, "residenceTime");
            return (Criteria) this;
        }

        public Criteria andResidencePriceIsNull() {
            addCriterion("RESIDENCE_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andResidencePriceIsNotNull() {
            addCriterion("RESIDENCE_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andResidencePriceEqualTo(Integer value) {
            addCriterion("RESIDENCE_PRICE =", value, "residencePrice");
            return (Criteria) this;
        }

        public Criteria andResidencePriceNotEqualTo(Integer value) {
            addCriterion("RESIDENCE_PRICE <>", value, "residencePrice");
            return (Criteria) this;
        }

        public Criteria andResidencePriceGreaterThan(Integer value) {
            addCriterion("RESIDENCE_PRICE >", value, "residencePrice");
            return (Criteria) this;
        }

        public Criteria andResidencePriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("RESIDENCE_PRICE >=", value, "residencePrice");
            return (Criteria) this;
        }

        public Criteria andResidencePriceLessThan(Integer value) {
            addCriterion("RESIDENCE_PRICE <", value, "residencePrice");
            return (Criteria) this;
        }

        public Criteria andResidencePriceLessThanOrEqualTo(Integer value) {
            addCriterion("RESIDENCE_PRICE <=", value, "residencePrice");
            return (Criteria) this;
        }

        public Criteria andResidencePriceIn(List<Integer> values) {
            addCriterion("RESIDENCE_PRICE in", values, "residencePrice");
            return (Criteria) this;
        }

        public Criteria andResidencePriceNotIn(List<Integer> values) {
            addCriterion("RESIDENCE_PRICE not in", values, "residencePrice");
            return (Criteria) this;
        }

        public Criteria andResidencePriceBetween(Integer value1, Integer value2) {
            addCriterion("RESIDENCE_PRICE between", value1, value2, "residencePrice");
            return (Criteria) this;
        }

        public Criteria andResidencePriceNotBetween(Integer value1, Integer value2) {
            addCriterion("RESIDENCE_PRICE not between", value1, value2, "residencePrice");
            return (Criteria) this;
        }

        public Criteria andResidenceLevelIsNull() {
            addCriterion("RESIDENCE_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andResidenceLevelIsNotNull() {
            addCriterion("RESIDENCE_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andResidenceLevelEqualTo(Integer value) {
            addCriterion("RESIDENCE_LEVEL =", value, "residenceLevel");
            return (Criteria) this;
        }

        public Criteria andResidenceLevelNotEqualTo(Integer value) {
            addCriterion("RESIDENCE_LEVEL <>", value, "residenceLevel");
            return (Criteria) this;
        }

        public Criteria andResidenceLevelGreaterThan(Integer value) {
            addCriterion("RESIDENCE_LEVEL >", value, "residenceLevel");
            return (Criteria) this;
        }

        public Criteria andResidenceLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("RESIDENCE_LEVEL >=", value, "residenceLevel");
            return (Criteria) this;
        }

        public Criteria andResidenceLevelLessThan(Integer value) {
            addCriterion("RESIDENCE_LEVEL <", value, "residenceLevel");
            return (Criteria) this;
        }

        public Criteria andResidenceLevelLessThanOrEqualTo(Integer value) {
            addCriterion("RESIDENCE_LEVEL <=", value, "residenceLevel");
            return (Criteria) this;
        }

        public Criteria andResidenceLevelIn(List<Integer> values) {
            addCriterion("RESIDENCE_LEVEL in", values, "residenceLevel");
            return (Criteria) this;
        }

        public Criteria andResidenceLevelNotIn(List<Integer> values) {
            addCriterion("RESIDENCE_LEVEL not in", values, "residenceLevel");
            return (Criteria) this;
        }

        public Criteria andResidenceLevelBetween(Integer value1, Integer value2) {
            addCriterion("RESIDENCE_LEVEL between", value1, value2, "residenceLevel");
            return (Criteria) this;
        }

        public Criteria andResidenceLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("RESIDENCE_LEVEL not between", value1, value2, "residenceLevel");
            return (Criteria) this;
        }

        public Criteria andResidenceCategoryIsNull() {
            addCriterion("RESIDENCE_CATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andResidenceCategoryIsNotNull() {
            addCriterion("RESIDENCE_CATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andResidenceCategoryEqualTo(Integer value) {
            addCriterion("RESIDENCE_CATEGORY =", value, "residenceCategory");
            return (Criteria) this;
        }

        public Criteria andResidenceCategoryNotEqualTo(Integer value) {
            addCriterion("RESIDENCE_CATEGORY <>", value, "residenceCategory");
            return (Criteria) this;
        }

        public Criteria andResidenceCategoryGreaterThan(Integer value) {
            addCriterion("RESIDENCE_CATEGORY >", value, "residenceCategory");
            return (Criteria) this;
        }

        public Criteria andResidenceCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("RESIDENCE_CATEGORY >=", value, "residenceCategory");
            return (Criteria) this;
        }

        public Criteria andResidenceCategoryLessThan(Integer value) {
            addCriterion("RESIDENCE_CATEGORY <", value, "residenceCategory");
            return (Criteria) this;
        }

        public Criteria andResidenceCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("RESIDENCE_CATEGORY <=", value, "residenceCategory");
            return (Criteria) this;
        }

        public Criteria andResidenceCategoryIn(List<Integer> values) {
            addCriterion("RESIDENCE_CATEGORY in", values, "residenceCategory");
            return (Criteria) this;
        }

        public Criteria andResidenceCategoryNotIn(List<Integer> values) {
            addCriterion("RESIDENCE_CATEGORY not in", values, "residenceCategory");
            return (Criteria) this;
        }

        public Criteria andResidenceCategoryBetween(Integer value1, Integer value2) {
            addCriterion("RESIDENCE_CATEGORY between", value1, value2, "residenceCategory");
            return (Criteria) this;
        }

        public Criteria andResidenceCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("RESIDENCE_CATEGORY not between", value1, value2, "residenceCategory");
            return (Criteria) this;
        }

        public Criteria andResidenceLoctypeIsNull() {
            addCriterion("RESIDENCE_LOCTYPE is null");
            return (Criteria) this;
        }

        public Criteria andResidenceLoctypeIsNotNull() {
            addCriterion("RESIDENCE_LOCTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andResidenceLoctypeEqualTo(Integer value) {
            addCriterion("RESIDENCE_LOCTYPE =", value, "residenceLoctype");
            return (Criteria) this;
        }

        public Criteria andResidenceLoctypeNotEqualTo(Integer value) {
            addCriterion("RESIDENCE_LOCTYPE <>", value, "residenceLoctype");
            return (Criteria) this;
        }

        public Criteria andResidenceLoctypeGreaterThan(Integer value) {
            addCriterion("RESIDENCE_LOCTYPE >", value, "residenceLoctype");
            return (Criteria) this;
        }

        public Criteria andResidenceLoctypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("RESIDENCE_LOCTYPE >=", value, "residenceLoctype");
            return (Criteria) this;
        }

        public Criteria andResidenceLoctypeLessThan(Integer value) {
            addCriterion("RESIDENCE_LOCTYPE <", value, "residenceLoctype");
            return (Criteria) this;
        }

        public Criteria andResidenceLoctypeLessThanOrEqualTo(Integer value) {
            addCriterion("RESIDENCE_LOCTYPE <=", value, "residenceLoctype");
            return (Criteria) this;
        }

        public Criteria andResidenceLoctypeIn(List<Integer> values) {
            addCriterion("RESIDENCE_LOCTYPE in", values, "residenceLoctype");
            return (Criteria) this;
        }

        public Criteria andResidenceLoctypeNotIn(List<Integer> values) {
            addCriterion("RESIDENCE_LOCTYPE not in", values, "residenceLoctype");
            return (Criteria) this;
        }

        public Criteria andResidenceLoctypeBetween(Integer value1, Integer value2) {
            addCriterion("RESIDENCE_LOCTYPE between", value1, value2, "residenceLoctype");
            return (Criteria) this;
        }

        public Criteria andResidenceLoctypeNotBetween(Integer value1, Integer value2) {
            addCriterion("RESIDENCE_LOCTYPE not between", value1, value2, "residenceLoctype");
            return (Criteria) this;
        }

        public Criteria andResidenceLogosIsNull() {
            addCriterion("RESIDENCE_LOGOs is null");
            return (Criteria) this;
        }

        public Criteria andResidenceLogosIsNotNull() {
            addCriterion("RESIDENCE_LOGOs is not null");
            return (Criteria) this;
        }

        public Criteria andResidenceLogosEqualTo(Integer value) {
            addCriterion("RESIDENCE_LOGOs =", value, "residenceLogos");
            return (Criteria) this;
        }

        public Criteria andResidenceLogosNotEqualTo(Integer value) {
            addCriterion("RESIDENCE_LOGOs <>", value, "residenceLogos");
            return (Criteria) this;
        }

        public Criteria andResidenceLogosGreaterThan(Integer value) {
            addCriterion("RESIDENCE_LOGOs >", value, "residenceLogos");
            return (Criteria) this;
        }

        public Criteria andResidenceLogosGreaterThanOrEqualTo(Integer value) {
            addCriterion("RESIDENCE_LOGOs >=", value, "residenceLogos");
            return (Criteria) this;
        }

        public Criteria andResidenceLogosLessThan(Integer value) {
            addCriterion("RESIDENCE_LOGOs <", value, "residenceLogos");
            return (Criteria) this;
        }

        public Criteria andResidenceLogosLessThanOrEqualTo(Integer value) {
            addCriterion("RESIDENCE_LOGOs <=", value, "residenceLogos");
            return (Criteria) this;
        }

        public Criteria andResidenceLogosIn(List<Integer> values) {
            addCriterion("RESIDENCE_LOGOs in", values, "residenceLogos");
            return (Criteria) this;
        }

        public Criteria andResidenceLogosNotIn(List<Integer> values) {
            addCriterion("RESIDENCE_LOGOs not in", values, "residenceLogos");
            return (Criteria) this;
        }

        public Criteria andResidenceLogosBetween(Integer value1, Integer value2) {
            addCriterion("RESIDENCE_LOGOs between", value1, value2, "residenceLogos");
            return (Criteria) this;
        }

        public Criteria andResidenceLogosNotBetween(Integer value1, Integer value2) {
            addCriterion("RESIDENCE_LOGOs not between", value1, value2, "residenceLogos");
            return (Criteria) this;
        }

        public Criteria andResidenceRecommendIsNull() {
            addCriterion("RESIDENCE_RECOMMEND is null");
            return (Criteria) this;
        }

        public Criteria andResidenceRecommendIsNotNull() {
            addCriterion("RESIDENCE_RECOMMEND is not null");
            return (Criteria) this;
        }

        public Criteria andResidenceRecommendEqualTo(Float value) {
            addCriterion("RESIDENCE_RECOMMEND =", value, "residenceRecommend");
            return (Criteria) this;
        }

        public Criteria andResidenceRecommendNotEqualTo(Float value) {
            addCriterion("RESIDENCE_RECOMMEND <>", value, "residenceRecommend");
            return (Criteria) this;
        }

        public Criteria andResidenceRecommendGreaterThan(Float value) {
            addCriterion("RESIDENCE_RECOMMEND >", value, "residenceRecommend");
            return (Criteria) this;
        }

        public Criteria andResidenceRecommendGreaterThanOrEqualTo(Float value) {
            addCriterion("RESIDENCE_RECOMMEND >=", value, "residenceRecommend");
            return (Criteria) this;
        }

        public Criteria andResidenceRecommendLessThan(Float value) {
            addCriterion("RESIDENCE_RECOMMEND <", value, "residenceRecommend");
            return (Criteria) this;
        }

        public Criteria andResidenceRecommendLessThanOrEqualTo(Float value) {
            addCriterion("RESIDENCE_RECOMMEND <=", value, "residenceRecommend");
            return (Criteria) this;
        }

        public Criteria andResidenceRecommendIn(List<Float> values) {
            addCriterion("RESIDENCE_RECOMMEND in", values, "residenceRecommend");
            return (Criteria) this;
        }

        public Criteria andResidenceRecommendNotIn(List<Float> values) {
            addCriterion("RESIDENCE_RECOMMEND not in", values, "residenceRecommend");
            return (Criteria) this;
        }

        public Criteria andResidenceRecommendBetween(Float value1, Float value2) {
            addCriterion("RESIDENCE_RECOMMEND between", value1, value2, "residenceRecommend");
            return (Criteria) this;
        }

        public Criteria andResidenceRecommendNotBetween(Float value1, Float value2) {
            addCriterion("RESIDENCE_RECOMMEND not between", value1, value2, "residenceRecommend");
            return (Criteria) this;
        }

        public Criteria andResidencePhoneIsNull() {
            addCriterion("RESIDENCE_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andResidencePhoneIsNotNull() {
            addCriterion("RESIDENCE_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andResidencePhoneEqualTo(String value) {
            addCriterion("RESIDENCE_PHONE =", value, "residencePhone");
            return (Criteria) this;
        }

        public Criteria andResidencePhoneNotEqualTo(String value) {
            addCriterion("RESIDENCE_PHONE <>", value, "residencePhone");
            return (Criteria) this;
        }

        public Criteria andResidencePhoneGreaterThan(String value) {
            addCriterion("RESIDENCE_PHONE >", value, "residencePhone");
            return (Criteria) this;
        }

        public Criteria andResidencePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("RESIDENCE_PHONE >=", value, "residencePhone");
            return (Criteria) this;
        }

        public Criteria andResidencePhoneLessThan(String value) {
            addCriterion("RESIDENCE_PHONE <", value, "residencePhone");
            return (Criteria) this;
        }

        public Criteria andResidencePhoneLessThanOrEqualTo(String value) {
            addCriterion("RESIDENCE_PHONE <=", value, "residencePhone");
            return (Criteria) this;
        }

        public Criteria andResidencePhoneLike(String value) {
            addCriterion("RESIDENCE_PHONE like", value, "residencePhone");
            return (Criteria) this;
        }

        public Criteria andResidencePhoneNotLike(String value) {
            addCriterion("RESIDENCE_PHONE not like", value, "residencePhone");
            return (Criteria) this;
        }

        public Criteria andResidencePhoneIn(List<String> values) {
            addCriterion("RESIDENCE_PHONE in", values, "residencePhone");
            return (Criteria) this;
        }

        public Criteria andResidencePhoneNotIn(List<String> values) {
            addCriterion("RESIDENCE_PHONE not in", values, "residencePhone");
            return (Criteria) this;
        }

        public Criteria andResidencePhoneBetween(String value1, String value2) {
            addCriterion("RESIDENCE_PHONE between", value1, value2, "residencePhone");
            return (Criteria) this;
        }

        public Criteria andResidencePhoneNotBetween(String value1, String value2) {
            addCriterion("RESIDENCE_PHONE not between", value1, value2, "residencePhone");
            return (Criteria) this;
        }

        public Criteria andResidenceBankIsNull() {
            addCriterion("RESIDENCE_BANK is null");
            return (Criteria) this;
        }

        public Criteria andResidenceBankIsNotNull() {
            addCriterion("RESIDENCE_BANK is not null");
            return (Criteria) this;
        }

        public Criteria andResidenceBankEqualTo(String value) {
            addCriterion("RESIDENCE_BANK =", value, "residenceBank");
            return (Criteria) this;
        }

        public Criteria andResidenceBankNotEqualTo(String value) {
            addCriterion("RESIDENCE_BANK <>", value, "residenceBank");
            return (Criteria) this;
        }

        public Criteria andResidenceBankGreaterThan(String value) {
            addCriterion("RESIDENCE_BANK >", value, "residenceBank");
            return (Criteria) this;
        }

        public Criteria andResidenceBankGreaterThanOrEqualTo(String value) {
            addCriterion("RESIDENCE_BANK >=", value, "residenceBank");
            return (Criteria) this;
        }

        public Criteria andResidenceBankLessThan(String value) {
            addCriterion("RESIDENCE_BANK <", value, "residenceBank");
            return (Criteria) this;
        }

        public Criteria andResidenceBankLessThanOrEqualTo(String value) {
            addCriterion("RESIDENCE_BANK <=", value, "residenceBank");
            return (Criteria) this;
        }

        public Criteria andResidenceBankLike(String value) {
            addCriterion("RESIDENCE_BANK like", value, "residenceBank");
            return (Criteria) this;
        }

        public Criteria andResidenceBankNotLike(String value) {
            addCriterion("RESIDENCE_BANK not like", value, "residenceBank");
            return (Criteria) this;
        }

        public Criteria andResidenceBankIn(List<String> values) {
            addCriterion("RESIDENCE_BANK in", values, "residenceBank");
            return (Criteria) this;
        }

        public Criteria andResidenceBankNotIn(List<String> values) {
            addCriterion("RESIDENCE_BANK not in", values, "residenceBank");
            return (Criteria) this;
        }

        public Criteria andResidenceBankBetween(String value1, String value2) {
            addCriterion("RESIDENCE_BANK between", value1, value2, "residenceBank");
            return (Criteria) this;
        }

        public Criteria andResidenceBankNotBetween(String value1, String value2) {
            addCriterion("RESIDENCE_BANK not between", value1, value2, "residenceBank");
            return (Criteria) this;
        }

        public Criteria andResidenceHospitalIsNull() {
            addCriterion("RESIDENCE_HOSPITAL is null");
            return (Criteria) this;
        }

        public Criteria andResidenceHospitalIsNotNull() {
            addCriterion("RESIDENCE_HOSPITAL is not null");
            return (Criteria) this;
        }

        public Criteria andResidenceHospitalEqualTo(String value) {
            addCriterion("RESIDENCE_HOSPITAL =", value, "residenceHospital");
            return (Criteria) this;
        }

        public Criteria andResidenceHospitalNotEqualTo(String value) {
            addCriterion("RESIDENCE_HOSPITAL <>", value, "residenceHospital");
            return (Criteria) this;
        }

        public Criteria andResidenceHospitalGreaterThan(String value) {
            addCriterion("RESIDENCE_HOSPITAL >", value, "residenceHospital");
            return (Criteria) this;
        }

        public Criteria andResidenceHospitalGreaterThanOrEqualTo(String value) {
            addCriterion("RESIDENCE_HOSPITAL >=", value, "residenceHospital");
            return (Criteria) this;
        }

        public Criteria andResidenceHospitalLessThan(String value) {
            addCriterion("RESIDENCE_HOSPITAL <", value, "residenceHospital");
            return (Criteria) this;
        }

        public Criteria andResidenceHospitalLessThanOrEqualTo(String value) {
            addCriterion("RESIDENCE_HOSPITAL <=", value, "residenceHospital");
            return (Criteria) this;
        }

        public Criteria andResidenceHospitalLike(String value) {
            addCriterion("RESIDENCE_HOSPITAL like", value, "residenceHospital");
            return (Criteria) this;
        }

        public Criteria andResidenceHospitalNotLike(String value) {
            addCriterion("RESIDENCE_HOSPITAL not like", value, "residenceHospital");
            return (Criteria) this;
        }

        public Criteria andResidenceHospitalIn(List<String> values) {
            addCriterion("RESIDENCE_HOSPITAL in", values, "residenceHospital");
            return (Criteria) this;
        }

        public Criteria andResidenceHospitalNotIn(List<String> values) {
            addCriterion("RESIDENCE_HOSPITAL not in", values, "residenceHospital");
            return (Criteria) this;
        }

        public Criteria andResidenceHospitalBetween(String value1, String value2) {
            addCriterion("RESIDENCE_HOSPITAL between", value1, value2, "residenceHospital");
            return (Criteria) this;
        }

        public Criteria andResidenceHospitalNotBetween(String value1, String value2) {
            addCriterion("RESIDENCE_HOSPITAL not between", value1, value2, "residenceHospital");
            return (Criteria) this;
        }

        public Criteria andResidencePlaceIsNull() {
            addCriterion("RESIDENCE_PLACE is null");
            return (Criteria) this;
        }

        public Criteria andResidencePlaceIsNotNull() {
            addCriterion("RESIDENCE_PLACE is not null");
            return (Criteria) this;
        }

        public Criteria andResidencePlaceEqualTo(String value) {
            addCriterion("RESIDENCE_PLACE =", value, "residencePlace");
            return (Criteria) this;
        }

        public Criteria andResidencePlaceNotEqualTo(String value) {
            addCriterion("RESIDENCE_PLACE <>", value, "residencePlace");
            return (Criteria) this;
        }

        public Criteria andResidencePlaceGreaterThan(String value) {
            addCriterion("RESIDENCE_PLACE >", value, "residencePlace");
            return (Criteria) this;
        }

        public Criteria andResidencePlaceGreaterThanOrEqualTo(String value) {
            addCriterion("RESIDENCE_PLACE >=", value, "residencePlace");
            return (Criteria) this;
        }

        public Criteria andResidencePlaceLessThan(String value) {
            addCriterion("RESIDENCE_PLACE <", value, "residencePlace");
            return (Criteria) this;
        }

        public Criteria andResidencePlaceLessThanOrEqualTo(String value) {
            addCriterion("RESIDENCE_PLACE <=", value, "residencePlace");
            return (Criteria) this;
        }

        public Criteria andResidencePlaceLike(String value) {
            addCriterion("RESIDENCE_PLACE like", value, "residencePlace");
            return (Criteria) this;
        }

        public Criteria andResidencePlaceNotLike(String value) {
            addCriterion("RESIDENCE_PLACE not like", value, "residencePlace");
            return (Criteria) this;
        }

        public Criteria andResidencePlaceIn(List<String> values) {
            addCriterion("RESIDENCE_PLACE in", values, "residencePlace");
            return (Criteria) this;
        }

        public Criteria andResidencePlaceNotIn(List<String> values) {
            addCriterion("RESIDENCE_PLACE not in", values, "residencePlace");
            return (Criteria) this;
        }

        public Criteria andResidencePlaceBetween(String value1, String value2) {
            addCriterion("RESIDENCE_PLACE between", value1, value2, "residencePlace");
            return (Criteria) this;
        }

        public Criteria andResidencePlaceNotBetween(String value1, String value2) {
            addCriterion("RESIDENCE_PLACE not between", value1, value2, "residencePlace");
            return (Criteria) this;
        }

        public Criteria andResidenceFacitityIsNull() {
            addCriterion("RESIDENCE_FACITITY is null");
            return (Criteria) this;
        }

        public Criteria andResidenceFacitityIsNotNull() {
            addCriterion("RESIDENCE_FACITITY is not null");
            return (Criteria) this;
        }

        public Criteria andResidenceFacitityEqualTo(String value) {
            addCriterion("RESIDENCE_FACITITY =", value, "residenceFacitity");
            return (Criteria) this;
        }

        public Criteria andResidenceFacitityNotEqualTo(String value) {
            addCriterion("RESIDENCE_FACITITY <>", value, "residenceFacitity");
            return (Criteria) this;
        }

        public Criteria andResidenceFacitityGreaterThan(String value) {
            addCriterion("RESIDENCE_FACITITY >", value, "residenceFacitity");
            return (Criteria) this;
        }

        public Criteria andResidenceFacitityGreaterThanOrEqualTo(String value) {
            addCriterion("RESIDENCE_FACITITY >=", value, "residenceFacitity");
            return (Criteria) this;
        }

        public Criteria andResidenceFacitityLessThan(String value) {
            addCriterion("RESIDENCE_FACITITY <", value, "residenceFacitity");
            return (Criteria) this;
        }

        public Criteria andResidenceFacitityLessThanOrEqualTo(String value) {
            addCriterion("RESIDENCE_FACITITY <=", value, "residenceFacitity");
            return (Criteria) this;
        }

        public Criteria andResidenceFacitityLike(String value) {
            addCriterion("RESIDENCE_FACITITY like", value, "residenceFacitity");
            return (Criteria) this;
        }

        public Criteria andResidenceFacitityNotLike(String value) {
            addCriterion("RESIDENCE_FACITITY not like", value, "residenceFacitity");
            return (Criteria) this;
        }

        public Criteria andResidenceFacitityIn(List<String> values) {
            addCriterion("RESIDENCE_FACITITY in", values, "residenceFacitity");
            return (Criteria) this;
        }

        public Criteria andResidenceFacitityNotIn(List<String> values) {
            addCriterion("RESIDENCE_FACITITY not in", values, "residenceFacitity");
            return (Criteria) this;
        }

        public Criteria andResidenceFacitityBetween(String value1, String value2) {
            addCriterion("RESIDENCE_FACITITY between", value1, value2, "residenceFacitity");
            return (Criteria) this;
        }

        public Criteria andResidenceFacitityNotBetween(String value1, String value2) {
            addCriterion("RESIDENCE_FACITITY not between", value1, value2, "residenceFacitity");
            return (Criteria) this;
        }

        public Criteria andResidenceScoreIsNull() {
            addCriterion("RESIDENCE_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andResidenceScoreIsNotNull() {
            addCriterion("RESIDENCE_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andResidenceScoreEqualTo(Float value) {
            addCriterion("RESIDENCE_SCORE =", value, "residenceScore");
            return (Criteria) this;
        }

        public Criteria andResidenceScoreNotEqualTo(Float value) {
            addCriterion("RESIDENCE_SCORE <>", value, "residenceScore");
            return (Criteria) this;
        }

        public Criteria andResidenceScoreGreaterThan(Float value) {
            addCriterion("RESIDENCE_SCORE >", value, "residenceScore");
            return (Criteria) this;
        }

        public Criteria andResidenceScoreGreaterThanOrEqualTo(Float value) {
            addCriterion("RESIDENCE_SCORE >=", value, "residenceScore");
            return (Criteria) this;
        }

        public Criteria andResidenceScoreLessThan(Float value) {
            addCriterion("RESIDENCE_SCORE <", value, "residenceScore");
            return (Criteria) this;
        }

        public Criteria andResidenceScoreLessThanOrEqualTo(Float value) {
            addCriterion("RESIDENCE_SCORE <=", value, "residenceScore");
            return (Criteria) this;
        }

        public Criteria andResidenceScoreIn(List<Float> values) {
            addCriterion("RESIDENCE_SCORE in", values, "residenceScore");
            return (Criteria) this;
        }

        public Criteria andResidenceScoreNotIn(List<Float> values) {
            addCriterion("RESIDENCE_SCORE not in", values, "residenceScore");
            return (Criteria) this;
        }

        public Criteria andResidenceScoreBetween(Float value1, Float value2) {
            addCriterion("RESIDENCE_SCORE between", value1, value2, "residenceScore");
            return (Criteria) this;
        }

        public Criteria andResidenceScoreNotBetween(Float value1, Float value2) {
            addCriterion("RESIDENCE_SCORE not between", value1, value2, "residenceScore");
            return (Criteria) this;
        }

        public Criteria andResidenceLogoIsNull() {
            addCriterion("RESIDENCE_LOGO is null");
            return (Criteria) this;
        }

        public Criteria andResidenceLogoIsNotNull() {
            addCriterion("RESIDENCE_LOGO is not null");
            return (Criteria) this;
        }

        public Criteria andResidenceLogoEqualTo(String value) {
            addCriterion("RESIDENCE_LOGO =", value, "residenceLogo");
            return (Criteria) this;
        }

        public Criteria andResidenceLogoNotEqualTo(String value) {
            addCriterion("RESIDENCE_LOGO <>", value, "residenceLogo");
            return (Criteria) this;
        }

        public Criteria andResidenceLogoGreaterThan(String value) {
            addCriterion("RESIDENCE_LOGO >", value, "residenceLogo");
            return (Criteria) this;
        }

        public Criteria andResidenceLogoGreaterThanOrEqualTo(String value) {
            addCriterion("RESIDENCE_LOGO >=", value, "residenceLogo");
            return (Criteria) this;
        }

        public Criteria andResidenceLogoLessThan(String value) {
            addCriterion("RESIDENCE_LOGO <", value, "residenceLogo");
            return (Criteria) this;
        }

        public Criteria andResidenceLogoLessThanOrEqualTo(String value) {
            addCriterion("RESIDENCE_LOGO <=", value, "residenceLogo");
            return (Criteria) this;
        }

        public Criteria andResidenceLogoLike(String value) {
            addCriterion("RESIDENCE_LOGO like", value, "residenceLogo");
            return (Criteria) this;
        }

        public Criteria andResidenceLogoNotLike(String value) {
            addCriterion("RESIDENCE_LOGO not like", value, "residenceLogo");
            return (Criteria) this;
        }

        public Criteria andResidenceLogoIn(List<String> values) {
            addCriterion("RESIDENCE_LOGO in", values, "residenceLogo");
            return (Criteria) this;
        }

        public Criteria andResidenceLogoNotIn(List<String> values) {
            addCriterion("RESIDENCE_LOGO not in", values, "residenceLogo");
            return (Criteria) this;
        }

        public Criteria andResidenceLogoBetween(String value1, String value2) {
            addCriterion("RESIDENCE_LOGO between", value1, value2, "residenceLogo");
            return (Criteria) this;
        }

        public Criteria andResidenceLogoNotBetween(String value1, String value2) {
            addCriterion("RESIDENCE_LOGO not between", value1, value2, "residenceLogo");
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