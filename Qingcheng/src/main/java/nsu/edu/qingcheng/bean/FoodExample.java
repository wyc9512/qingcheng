package nsu.edu.qingcheng.bean;

import java.util.ArrayList;
import java.util.List;

public class FoodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FoodExample() {
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

        public Criteria andFoodIdIsNull() {
            addCriterion("FOOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andFoodIdIsNotNull() {
            addCriterion("FOOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFoodIdEqualTo(Integer value) {
            addCriterion("FOOD_ID =", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdNotEqualTo(Integer value) {
            addCriterion("FOOD_ID <>", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdGreaterThan(Integer value) {
            addCriterion("FOOD_ID >", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("FOOD_ID >=", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdLessThan(Integer value) {
            addCriterion("FOOD_ID <", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdLessThanOrEqualTo(Integer value) {
            addCriterion("FOOD_ID <=", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdIn(List<Integer> values) {
            addCriterion("FOOD_ID in", values, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdNotIn(List<Integer> values) {
            addCriterion("FOOD_ID not in", values, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdBetween(Integer value1, Integer value2) {
            addCriterion("FOOD_ID between", value1, value2, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("FOOD_ID not between", value1, value2, "foodId");
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

        public Criteria andFoodNameIsNull() {
            addCriterion("FOOD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFoodNameIsNotNull() {
            addCriterion("FOOD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFoodNameEqualTo(String value) {
            addCriterion("FOOD_NAME =", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameNotEqualTo(String value) {
            addCriterion("FOOD_NAME <>", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameGreaterThan(String value) {
            addCriterion("FOOD_NAME >", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameGreaterThanOrEqualTo(String value) {
            addCriterion("FOOD_NAME >=", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameLessThan(String value) {
            addCriterion("FOOD_NAME <", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameLessThanOrEqualTo(String value) {
            addCriterion("FOOD_NAME <=", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameLike(String value) {
            addCriterion("FOOD_NAME like", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameNotLike(String value) {
            addCriterion("FOOD_NAME not like", value, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameIn(List<String> values) {
            addCriterion("FOOD_NAME in", values, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameNotIn(List<String> values) {
            addCriterion("FOOD_NAME not in", values, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameBetween(String value1, String value2) {
            addCriterion("FOOD_NAME between", value1, value2, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodNameNotBetween(String value1, String value2) {
            addCriterion("FOOD_NAME not between", value1, value2, "foodName");
            return (Criteria) this;
        }

        public Criteria andFoodPicIsNull() {
            addCriterion("FOOD_PIC is null");
            return (Criteria) this;
        }

        public Criteria andFoodPicIsNotNull() {
            addCriterion("FOOD_PIC is not null");
            return (Criteria) this;
        }

        public Criteria andFoodPicEqualTo(String value) {
            addCriterion("FOOD_PIC =", value, "foodPic");
            return (Criteria) this;
        }

        public Criteria andFoodPicNotEqualTo(String value) {
            addCriterion("FOOD_PIC <>", value, "foodPic");
            return (Criteria) this;
        }

        public Criteria andFoodPicGreaterThan(String value) {
            addCriterion("FOOD_PIC >", value, "foodPic");
            return (Criteria) this;
        }

        public Criteria andFoodPicGreaterThanOrEqualTo(String value) {
            addCriterion("FOOD_PIC >=", value, "foodPic");
            return (Criteria) this;
        }

        public Criteria andFoodPicLessThan(String value) {
            addCriterion("FOOD_PIC <", value, "foodPic");
            return (Criteria) this;
        }

        public Criteria andFoodPicLessThanOrEqualTo(String value) {
            addCriterion("FOOD_PIC <=", value, "foodPic");
            return (Criteria) this;
        }

        public Criteria andFoodPicLike(String value) {
            addCriterion("FOOD_PIC like", value, "foodPic");
            return (Criteria) this;
        }

        public Criteria andFoodPicNotLike(String value) {
            addCriterion("FOOD_PIC not like", value, "foodPic");
            return (Criteria) this;
        }

        public Criteria andFoodPicIn(List<String> values) {
            addCriterion("FOOD_PIC in", values, "foodPic");
            return (Criteria) this;
        }

        public Criteria andFoodPicNotIn(List<String> values) {
            addCriterion("FOOD_PIC not in", values, "foodPic");
            return (Criteria) this;
        }

        public Criteria andFoodPicBetween(String value1, String value2) {
            addCriterion("FOOD_PIC between", value1, value2, "foodPic");
            return (Criteria) this;
        }

        public Criteria andFoodPicNotBetween(String value1, String value2) {
            addCriterion("FOOD_PIC not between", value1, value2, "foodPic");
            return (Criteria) this;
        }

        public Criteria andFoodIntroduceIsNull() {
            addCriterion("FOOD_INTRODUCE is null");
            return (Criteria) this;
        }

        public Criteria andFoodIntroduceIsNotNull() {
            addCriterion("FOOD_INTRODUCE is not null");
            return (Criteria) this;
        }

        public Criteria andFoodIntroduceEqualTo(String value) {
            addCriterion("FOOD_INTRODUCE =", value, "foodIntroduce");
            return (Criteria) this;
        }

        public Criteria andFoodIntroduceNotEqualTo(String value) {
            addCriterion("FOOD_INTRODUCE <>", value, "foodIntroduce");
            return (Criteria) this;
        }

        public Criteria andFoodIntroduceGreaterThan(String value) {
            addCriterion("FOOD_INTRODUCE >", value, "foodIntroduce");
            return (Criteria) this;
        }

        public Criteria andFoodIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("FOOD_INTRODUCE >=", value, "foodIntroduce");
            return (Criteria) this;
        }

        public Criteria andFoodIntroduceLessThan(String value) {
            addCriterion("FOOD_INTRODUCE <", value, "foodIntroduce");
            return (Criteria) this;
        }

        public Criteria andFoodIntroduceLessThanOrEqualTo(String value) {
            addCriterion("FOOD_INTRODUCE <=", value, "foodIntroduce");
            return (Criteria) this;
        }

        public Criteria andFoodIntroduceLike(String value) {
            addCriterion("FOOD_INTRODUCE like", value, "foodIntroduce");
            return (Criteria) this;
        }

        public Criteria andFoodIntroduceNotLike(String value) {
            addCriterion("FOOD_INTRODUCE not like", value, "foodIntroduce");
            return (Criteria) this;
        }

        public Criteria andFoodIntroduceIn(List<String> values) {
            addCriterion("FOOD_INTRODUCE in", values, "foodIntroduce");
            return (Criteria) this;
        }

        public Criteria andFoodIntroduceNotIn(List<String> values) {
            addCriterion("FOOD_INTRODUCE not in", values, "foodIntroduce");
            return (Criteria) this;
        }

        public Criteria andFoodIntroduceBetween(String value1, String value2) {
            addCriterion("FOOD_INTRODUCE between", value1, value2, "foodIntroduce");
            return (Criteria) this;
        }

        public Criteria andFoodIntroduceNotBetween(String value1, String value2) {
            addCriterion("FOOD_INTRODUCE not between", value1, value2, "foodIntroduce");
            return (Criteria) this;
        }

        public Criteria andFoodPriceIsNull() {
            addCriterion("FOOD_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andFoodPriceIsNotNull() {
            addCriterion("FOOD_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andFoodPriceEqualTo(Float value) {
            addCriterion("FOOD_PRICE =", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceNotEqualTo(Float value) {
            addCriterion("FOOD_PRICE <>", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceGreaterThan(Float value) {
            addCriterion("FOOD_PRICE >", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("FOOD_PRICE >=", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceLessThan(Float value) {
            addCriterion("FOOD_PRICE <", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceLessThanOrEqualTo(Float value) {
            addCriterion("FOOD_PRICE <=", value, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceIn(List<Float> values) {
            addCriterion("FOOD_PRICE in", values, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceNotIn(List<Float> values) {
            addCriterion("FOOD_PRICE not in", values, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceBetween(Float value1, Float value2) {
            addCriterion("FOOD_PRICE between", value1, value2, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodPriceNotBetween(Float value1, Float value2) {
            addCriterion("FOOD_PRICE not between", value1, value2, "foodPrice");
            return (Criteria) this;
        }

        public Criteria andFoodRecommendIsNull() {
            addCriterion("FOOD_RECOMMEND is null");
            return (Criteria) this;
        }

        public Criteria andFoodRecommendIsNotNull() {
            addCriterion("FOOD_RECOMMEND is not null");
            return (Criteria) this;
        }

        public Criteria andFoodRecommendEqualTo(Integer value) {
            addCriterion("FOOD_RECOMMEND =", value, "foodRecommend");
            return (Criteria) this;
        }

        public Criteria andFoodRecommendNotEqualTo(Integer value) {
            addCriterion("FOOD_RECOMMEND <>", value, "foodRecommend");
            return (Criteria) this;
        }

        public Criteria andFoodRecommendGreaterThan(Integer value) {
            addCriterion("FOOD_RECOMMEND >", value, "foodRecommend");
            return (Criteria) this;
        }

        public Criteria andFoodRecommendGreaterThanOrEqualTo(Integer value) {
            addCriterion("FOOD_RECOMMEND >=", value, "foodRecommend");
            return (Criteria) this;
        }

        public Criteria andFoodRecommendLessThan(Integer value) {
            addCriterion("FOOD_RECOMMEND <", value, "foodRecommend");
            return (Criteria) this;
        }

        public Criteria andFoodRecommendLessThanOrEqualTo(Integer value) {
            addCriterion("FOOD_RECOMMEND <=", value, "foodRecommend");
            return (Criteria) this;
        }

        public Criteria andFoodRecommendIn(List<Integer> values) {
            addCriterion("FOOD_RECOMMEND in", values, "foodRecommend");
            return (Criteria) this;
        }

        public Criteria andFoodRecommendNotIn(List<Integer> values) {
            addCriterion("FOOD_RECOMMEND not in", values, "foodRecommend");
            return (Criteria) this;
        }

        public Criteria andFoodRecommendBetween(Integer value1, Integer value2) {
            addCriterion("FOOD_RECOMMEND between", value1, value2, "foodRecommend");
            return (Criteria) this;
        }

        public Criteria andFoodRecommendNotBetween(Integer value1, Integer value2) {
            addCriterion("FOOD_RECOMMEND not between", value1, value2, "foodRecommend");
            return (Criteria) this;
        }

        public Criteria andFoodPlaceIsNull() {
            addCriterion("FOOD_PLACE is null");
            return (Criteria) this;
        }

        public Criteria andFoodPlaceIsNotNull() {
            addCriterion("FOOD_PLACE is not null");
            return (Criteria) this;
        }

        public Criteria andFoodPlaceEqualTo(String value) {
            addCriterion("FOOD_PLACE =", value, "foodPlace");
            return (Criteria) this;
        }

        public Criteria andFoodPlaceNotEqualTo(String value) {
            addCriterion("FOOD_PLACE <>", value, "foodPlace");
            return (Criteria) this;
        }

        public Criteria andFoodPlaceGreaterThan(String value) {
            addCriterion("FOOD_PLACE >", value, "foodPlace");
            return (Criteria) this;
        }

        public Criteria andFoodPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("FOOD_PLACE >=", value, "foodPlace");
            return (Criteria) this;
        }

        public Criteria andFoodPlaceLessThan(String value) {
            addCriterion("FOOD_PLACE <", value, "foodPlace");
            return (Criteria) this;
        }

        public Criteria andFoodPlaceLessThanOrEqualTo(String value) {
            addCriterion("FOOD_PLACE <=", value, "foodPlace");
            return (Criteria) this;
        }

        public Criteria andFoodPlaceLike(String value) {
            addCriterion("FOOD_PLACE like", value, "foodPlace");
            return (Criteria) this;
        }

        public Criteria andFoodPlaceNotLike(String value) {
            addCriterion("FOOD_PLACE not like", value, "foodPlace");
            return (Criteria) this;
        }

        public Criteria andFoodPlaceIn(List<String> values) {
            addCriterion("FOOD_PLACE in", values, "foodPlace");
            return (Criteria) this;
        }

        public Criteria andFoodPlaceNotIn(List<String> values) {
            addCriterion("FOOD_PLACE not in", values, "foodPlace");
            return (Criteria) this;
        }

        public Criteria andFoodPlaceBetween(String value1, String value2) {
            addCriterion("FOOD_PLACE between", value1, value2, "foodPlace");
            return (Criteria) this;
        }

        public Criteria andFoodPlaceNotBetween(String value1, String value2) {
            addCriterion("FOOD_PLACE not between", value1, value2, "foodPlace");
            return (Criteria) this;
        }

        public Criteria andFoodMaterialIsNull() {
            addCriterion("FOOD_MATERIAL is null");
            return (Criteria) this;
        }

        public Criteria andFoodMaterialIsNotNull() {
            addCriterion("FOOD_MATERIAL is not null");
            return (Criteria) this;
        }

        public Criteria andFoodMaterialEqualTo(String value) {
            addCriterion("FOOD_MATERIAL =", value, "foodMaterial");
            return (Criteria) this;
        }

        public Criteria andFoodMaterialNotEqualTo(String value) {
            addCriterion("FOOD_MATERIAL <>", value, "foodMaterial");
            return (Criteria) this;
        }

        public Criteria andFoodMaterialGreaterThan(String value) {
            addCriterion("FOOD_MATERIAL >", value, "foodMaterial");
            return (Criteria) this;
        }

        public Criteria andFoodMaterialGreaterThanOrEqualTo(String value) {
            addCriterion("FOOD_MATERIAL >=", value, "foodMaterial");
            return (Criteria) this;
        }

        public Criteria andFoodMaterialLessThan(String value) {
            addCriterion("FOOD_MATERIAL <", value, "foodMaterial");
            return (Criteria) this;
        }

        public Criteria andFoodMaterialLessThanOrEqualTo(String value) {
            addCriterion("FOOD_MATERIAL <=", value, "foodMaterial");
            return (Criteria) this;
        }

        public Criteria andFoodMaterialLike(String value) {
            addCriterion("FOOD_MATERIAL like", value, "foodMaterial");
            return (Criteria) this;
        }

        public Criteria andFoodMaterialNotLike(String value) {
            addCriterion("FOOD_MATERIAL not like", value, "foodMaterial");
            return (Criteria) this;
        }

        public Criteria andFoodMaterialIn(List<String> values) {
            addCriterion("FOOD_MATERIAL in", values, "foodMaterial");
            return (Criteria) this;
        }

        public Criteria andFoodMaterialNotIn(List<String> values) {
            addCriterion("FOOD_MATERIAL not in", values, "foodMaterial");
            return (Criteria) this;
        }

        public Criteria andFoodMaterialBetween(String value1, String value2) {
            addCriterion("FOOD_MATERIAL between", value1, value2, "foodMaterial");
            return (Criteria) this;
        }

        public Criteria andFoodMaterialNotBetween(String value1, String value2) {
            addCriterion("FOOD_MATERIAL not between", value1, value2, "foodMaterial");
            return (Criteria) this;
        }

        public Criteria andFoodPracticeIsNull() {
            addCriterion("FOOD_PRACTICE is null");
            return (Criteria) this;
        }

        public Criteria andFoodPracticeIsNotNull() {
            addCriterion("FOOD_PRACTICE is not null");
            return (Criteria) this;
        }

        public Criteria andFoodPracticeEqualTo(String value) {
            addCriterion("FOOD_PRACTICE =", value, "foodPractice");
            return (Criteria) this;
        }

        public Criteria andFoodPracticeNotEqualTo(String value) {
            addCriterion("FOOD_PRACTICE <>", value, "foodPractice");
            return (Criteria) this;
        }

        public Criteria andFoodPracticeGreaterThan(String value) {
            addCriterion("FOOD_PRACTICE >", value, "foodPractice");
            return (Criteria) this;
        }

        public Criteria andFoodPracticeGreaterThanOrEqualTo(String value) {
            addCriterion("FOOD_PRACTICE >=", value, "foodPractice");
            return (Criteria) this;
        }

        public Criteria andFoodPracticeLessThan(String value) {
            addCriterion("FOOD_PRACTICE <", value, "foodPractice");
            return (Criteria) this;
        }

        public Criteria andFoodPracticeLessThanOrEqualTo(String value) {
            addCriterion("FOOD_PRACTICE <=", value, "foodPractice");
            return (Criteria) this;
        }

        public Criteria andFoodPracticeLike(String value) {
            addCriterion("FOOD_PRACTICE like", value, "foodPractice");
            return (Criteria) this;
        }

        public Criteria andFoodPracticeNotLike(String value) {
            addCriterion("FOOD_PRACTICE not like", value, "foodPractice");
            return (Criteria) this;
        }

        public Criteria andFoodPracticeIn(List<String> values) {
            addCriterion("FOOD_PRACTICE in", values, "foodPractice");
            return (Criteria) this;
        }

        public Criteria andFoodPracticeNotIn(List<String> values) {
            addCriterion("FOOD_PRACTICE not in", values, "foodPractice");
            return (Criteria) this;
        }

        public Criteria andFoodPracticeBetween(String value1, String value2) {
            addCriterion("FOOD_PRACTICE between", value1, value2, "foodPractice");
            return (Criteria) this;
        }

        public Criteria andFoodPracticeNotBetween(String value1, String value2) {
            addCriterion("FOOD_PRACTICE not between", value1, value2, "foodPractice");
            return (Criteria) this;
        }

        public Criteria andFoodEffectIsNull() {
            addCriterion("FOOD_EFFECT is null");
            return (Criteria) this;
        }

        public Criteria andFoodEffectIsNotNull() {
            addCriterion("FOOD_EFFECT is not null");
            return (Criteria) this;
        }

        public Criteria andFoodEffectEqualTo(String value) {
            addCriterion("FOOD_EFFECT =", value, "foodEffect");
            return (Criteria) this;
        }

        public Criteria andFoodEffectNotEqualTo(String value) {
            addCriterion("FOOD_EFFECT <>", value, "foodEffect");
            return (Criteria) this;
        }

        public Criteria andFoodEffectGreaterThan(String value) {
            addCriterion("FOOD_EFFECT >", value, "foodEffect");
            return (Criteria) this;
        }

        public Criteria andFoodEffectGreaterThanOrEqualTo(String value) {
            addCriterion("FOOD_EFFECT >=", value, "foodEffect");
            return (Criteria) this;
        }

        public Criteria andFoodEffectLessThan(String value) {
            addCriterion("FOOD_EFFECT <", value, "foodEffect");
            return (Criteria) this;
        }

        public Criteria andFoodEffectLessThanOrEqualTo(String value) {
            addCriterion("FOOD_EFFECT <=", value, "foodEffect");
            return (Criteria) this;
        }

        public Criteria andFoodEffectLike(String value) {
            addCriterion("FOOD_EFFECT like", value, "foodEffect");
            return (Criteria) this;
        }

        public Criteria andFoodEffectNotLike(String value) {
            addCriterion("FOOD_EFFECT not like", value, "foodEffect");
            return (Criteria) this;
        }

        public Criteria andFoodEffectIn(List<String> values) {
            addCriterion("FOOD_EFFECT in", values, "foodEffect");
            return (Criteria) this;
        }

        public Criteria andFoodEffectNotIn(List<String> values) {
            addCriterion("FOOD_EFFECT not in", values, "foodEffect");
            return (Criteria) this;
        }

        public Criteria andFoodEffectBetween(String value1, String value2) {
            addCriterion("FOOD_EFFECT between", value1, value2, "foodEffect");
            return (Criteria) this;
        }

        public Criteria andFoodEffectNotBetween(String value1, String value2) {
            addCriterion("FOOD_EFFECT not between", value1, value2, "foodEffect");
            return (Criteria) this;
        }

        public Criteria andFoodTypeIsNull() {
            addCriterion("FOOD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFoodTypeIsNotNull() {
            addCriterion("FOOD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFoodTypeEqualTo(Integer value) {
            addCriterion("FOOD_TYPE =", value, "foodType");
            return (Criteria) this;
        }

        public Criteria andFoodTypeNotEqualTo(Integer value) {
            addCriterion("FOOD_TYPE <>", value, "foodType");
            return (Criteria) this;
        }

        public Criteria andFoodTypeGreaterThan(Integer value) {
            addCriterion("FOOD_TYPE >", value, "foodType");
            return (Criteria) this;
        }

        public Criteria andFoodTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("FOOD_TYPE >=", value, "foodType");
            return (Criteria) this;
        }

        public Criteria andFoodTypeLessThan(Integer value) {
            addCriterion("FOOD_TYPE <", value, "foodType");
            return (Criteria) this;
        }

        public Criteria andFoodTypeLessThanOrEqualTo(Integer value) {
            addCriterion("FOOD_TYPE <=", value, "foodType");
            return (Criteria) this;
        }

        public Criteria andFoodTypeIn(List<Integer> values) {
            addCriterion("FOOD_TYPE in", values, "foodType");
            return (Criteria) this;
        }

        public Criteria andFoodTypeNotIn(List<Integer> values) {
            addCriterion("FOOD_TYPE not in", values, "foodType");
            return (Criteria) this;
        }

        public Criteria andFoodTypeBetween(Integer value1, Integer value2) {
            addCriterion("FOOD_TYPE between", value1, value2, "foodType");
            return (Criteria) this;
        }

        public Criteria andFoodTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("FOOD_TYPE not between", value1, value2, "foodType");
            return (Criteria) this;
        }

        public Criteria andFoodKeywordIsNull() {
            addCriterion("FOOD_KEYWORD is null");
            return (Criteria) this;
        }

        public Criteria andFoodKeywordIsNotNull() {
            addCriterion("FOOD_KEYWORD is not null");
            return (Criteria) this;
        }

        public Criteria andFoodKeywordEqualTo(String value) {
            addCriterion("FOOD_KEYWORD =", value, "foodKeyword");
            return (Criteria) this;
        }

        public Criteria andFoodKeywordNotEqualTo(String value) {
            addCriterion("FOOD_KEYWORD <>", value, "foodKeyword");
            return (Criteria) this;
        }

        public Criteria andFoodKeywordGreaterThan(String value) {
            addCriterion("FOOD_KEYWORD >", value, "foodKeyword");
            return (Criteria) this;
        }

        public Criteria andFoodKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("FOOD_KEYWORD >=", value, "foodKeyword");
            return (Criteria) this;
        }

        public Criteria andFoodKeywordLessThan(String value) {
            addCriterion("FOOD_KEYWORD <", value, "foodKeyword");
            return (Criteria) this;
        }

        public Criteria andFoodKeywordLessThanOrEqualTo(String value) {
            addCriterion("FOOD_KEYWORD <=", value, "foodKeyword");
            return (Criteria) this;
        }

        public Criteria andFoodKeywordLike(String value) {
            addCriterion("FOOD_KEYWORD like", value, "foodKeyword");
            return (Criteria) this;
        }

        public Criteria andFoodKeywordNotLike(String value) {
            addCriterion("FOOD_KEYWORD not like", value, "foodKeyword");
            return (Criteria) this;
        }

        public Criteria andFoodKeywordIn(List<String> values) {
            addCriterion("FOOD_KEYWORD in", values, "foodKeyword");
            return (Criteria) this;
        }

        public Criteria andFoodKeywordNotIn(List<String> values) {
            addCriterion("FOOD_KEYWORD not in", values, "foodKeyword");
            return (Criteria) this;
        }

        public Criteria andFoodKeywordBetween(String value1, String value2) {
            addCriterion("FOOD_KEYWORD between", value1, value2, "foodKeyword");
            return (Criteria) this;
        }

        public Criteria andFoodKeywordNotBetween(String value1, String value2) {
            addCriterion("FOOD_KEYWORD not between", value1, value2, "foodKeyword");
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