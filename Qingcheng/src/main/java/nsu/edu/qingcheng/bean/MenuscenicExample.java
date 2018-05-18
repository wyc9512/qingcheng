package nsu.edu.qingcheng.bean;

import java.util.ArrayList;
import java.util.List;

public class MenuscenicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MenuscenicExample() {
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

        public Criteria andMenuscenicNameIsNull() {
            addCriterion("MENUSCENIC_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMenuscenicNameIsNotNull() {
            addCriterion("MENUSCENIC_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMenuscenicNameEqualTo(String value) {
            addCriterion("MENUSCENIC_NAME =", value, "menuscenicName");
            return (Criteria) this;
        }

        public Criteria andMenuscenicNameNotEqualTo(String value) {
            addCriterion("MENUSCENIC_NAME <>", value, "menuscenicName");
            return (Criteria) this;
        }

        public Criteria andMenuscenicNameGreaterThan(String value) {
            addCriterion("MENUSCENIC_NAME >", value, "menuscenicName");
            return (Criteria) this;
        }

        public Criteria andMenuscenicNameGreaterThanOrEqualTo(String value) {
            addCriterion("MENUSCENIC_NAME >=", value, "menuscenicName");
            return (Criteria) this;
        }

        public Criteria andMenuscenicNameLessThan(String value) {
            addCriterion("MENUSCENIC_NAME <", value, "menuscenicName");
            return (Criteria) this;
        }

        public Criteria andMenuscenicNameLessThanOrEqualTo(String value) {
            addCriterion("MENUSCENIC_NAME <=", value, "menuscenicName");
            return (Criteria) this;
        }

        public Criteria andMenuscenicNameLike(String value) {
            addCriterion("MENUSCENIC_NAME like", value, "menuscenicName");
            return (Criteria) this;
        }

        public Criteria andMenuscenicNameNotLike(String value) {
            addCriterion("MENUSCENIC_NAME not like", value, "menuscenicName");
            return (Criteria) this;
        }

        public Criteria andMenuscenicNameIn(List<String> values) {
            addCriterion("MENUSCENIC_NAME in", values, "menuscenicName");
            return (Criteria) this;
        }

        public Criteria andMenuscenicNameNotIn(List<String> values) {
            addCriterion("MENUSCENIC_NAME not in", values, "menuscenicName");
            return (Criteria) this;
        }

        public Criteria andMenuscenicNameBetween(String value1, String value2) {
            addCriterion("MENUSCENIC_NAME between", value1, value2, "menuscenicName");
            return (Criteria) this;
        }

        public Criteria andMenuscenicNameNotBetween(String value1, String value2) {
            addCriterion("MENUSCENIC_NAME not between", value1, value2, "menuscenicName");
            return (Criteria) this;
        }

        public Criteria andMenuscenicIntroduceIsNull() {
            addCriterion("MENUSCENIC_INTRODUCE is null");
            return (Criteria) this;
        }

        public Criteria andMenuscenicIntroduceIsNotNull() {
            addCriterion("MENUSCENIC_INTRODUCE is not null");
            return (Criteria) this;
        }

        public Criteria andMenuscenicIntroduceEqualTo(String value) {
            addCriterion("MENUSCENIC_INTRODUCE =", value, "menuscenicIntroduce");
            return (Criteria) this;
        }

        public Criteria andMenuscenicIntroduceNotEqualTo(String value) {
            addCriterion("MENUSCENIC_INTRODUCE <>", value, "menuscenicIntroduce");
            return (Criteria) this;
        }

        public Criteria andMenuscenicIntroduceGreaterThan(String value) {
            addCriterion("MENUSCENIC_INTRODUCE >", value, "menuscenicIntroduce");
            return (Criteria) this;
        }

        public Criteria andMenuscenicIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("MENUSCENIC_INTRODUCE >=", value, "menuscenicIntroduce");
            return (Criteria) this;
        }

        public Criteria andMenuscenicIntroduceLessThan(String value) {
            addCriterion("MENUSCENIC_INTRODUCE <", value, "menuscenicIntroduce");
            return (Criteria) this;
        }

        public Criteria andMenuscenicIntroduceLessThanOrEqualTo(String value) {
            addCriterion("MENUSCENIC_INTRODUCE <=", value, "menuscenicIntroduce");
            return (Criteria) this;
        }

        public Criteria andMenuscenicIntroduceLike(String value) {
            addCriterion("MENUSCENIC_INTRODUCE like", value, "menuscenicIntroduce");
            return (Criteria) this;
        }

        public Criteria andMenuscenicIntroduceNotLike(String value) {
            addCriterion("MENUSCENIC_INTRODUCE not like", value, "menuscenicIntroduce");
            return (Criteria) this;
        }

        public Criteria andMenuscenicIntroduceIn(List<String> values) {
            addCriterion("MENUSCENIC_INTRODUCE in", values, "menuscenicIntroduce");
            return (Criteria) this;
        }

        public Criteria andMenuscenicIntroduceNotIn(List<String> values) {
            addCriterion("MENUSCENIC_INTRODUCE not in", values, "menuscenicIntroduce");
            return (Criteria) this;
        }

        public Criteria andMenuscenicIntroduceBetween(String value1, String value2) {
            addCriterion("MENUSCENIC_INTRODUCE between", value1, value2, "menuscenicIntroduce");
            return (Criteria) this;
        }

        public Criteria andMenuscenicIntroduceNotBetween(String value1, String value2) {
            addCriterion("MENUSCENIC_INTRODUCE not between", value1, value2, "menuscenicIntroduce");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPicIsNull() {
            addCriterion("MENUSCENIC_PIC is null");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPicIsNotNull() {
            addCriterion("MENUSCENIC_PIC is not null");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPicEqualTo(String value) {
            addCriterion("MENUSCENIC_PIC =", value, "menuscenicPic");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPicNotEqualTo(String value) {
            addCriterion("MENUSCENIC_PIC <>", value, "menuscenicPic");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPicGreaterThan(String value) {
            addCriterion("MENUSCENIC_PIC >", value, "menuscenicPic");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPicGreaterThanOrEqualTo(String value) {
            addCriterion("MENUSCENIC_PIC >=", value, "menuscenicPic");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPicLessThan(String value) {
            addCriterion("MENUSCENIC_PIC <", value, "menuscenicPic");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPicLessThanOrEqualTo(String value) {
            addCriterion("MENUSCENIC_PIC <=", value, "menuscenicPic");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPicLike(String value) {
            addCriterion("MENUSCENIC_PIC like", value, "menuscenicPic");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPicNotLike(String value) {
            addCriterion("MENUSCENIC_PIC not like", value, "menuscenicPic");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPicIn(List<String> values) {
            addCriterion("MENUSCENIC_PIC in", values, "menuscenicPic");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPicNotIn(List<String> values) {
            addCriterion("MENUSCENIC_PIC not in", values, "menuscenicPic");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPicBetween(String value1, String value2) {
            addCriterion("MENUSCENIC_PIC between", value1, value2, "menuscenicPic");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPicNotBetween(String value1, String value2) {
            addCriterion("MENUSCENIC_PIC not between", value1, value2, "menuscenicPic");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPriceIsNull() {
            addCriterion("MENUSCENIC_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPriceIsNotNull() {
            addCriterion("MENUSCENIC_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPriceEqualTo(Float value) {
            addCriterion("MENUSCENIC_PRICE =", value, "menuscenicPrice");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPriceNotEqualTo(Float value) {
            addCriterion("MENUSCENIC_PRICE <>", value, "menuscenicPrice");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPriceGreaterThan(Float value) {
            addCriterion("MENUSCENIC_PRICE >", value, "menuscenicPrice");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("MENUSCENIC_PRICE >=", value, "menuscenicPrice");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPriceLessThan(Float value) {
            addCriterion("MENUSCENIC_PRICE <", value, "menuscenicPrice");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPriceLessThanOrEqualTo(Float value) {
            addCriterion("MENUSCENIC_PRICE <=", value, "menuscenicPrice");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPriceIn(List<Float> values) {
            addCriterion("MENUSCENIC_PRICE in", values, "menuscenicPrice");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPriceNotIn(List<Float> values) {
            addCriterion("MENUSCENIC_PRICE not in", values, "menuscenicPrice");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPriceBetween(Float value1, Float value2) {
            addCriterion("MENUSCENIC_PRICE between", value1, value2, "menuscenicPrice");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPriceNotBetween(Float value1, Float value2) {
            addCriterion("MENUSCENIC_PRICE not between", value1, value2, "menuscenicPrice");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPlaceIsNull() {
            addCriterion("MENUSCENIC_PLACE is null");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPlaceIsNotNull() {
            addCriterion("MENUSCENIC_PLACE is not null");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPlaceEqualTo(String value) {
            addCriterion("MENUSCENIC_PLACE =", value, "menuscenicPlace");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPlaceNotEqualTo(String value) {
            addCriterion("MENUSCENIC_PLACE <>", value, "menuscenicPlace");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPlaceGreaterThan(String value) {
            addCriterion("MENUSCENIC_PLACE >", value, "menuscenicPlace");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("MENUSCENIC_PLACE >=", value, "menuscenicPlace");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPlaceLessThan(String value) {
            addCriterion("MENUSCENIC_PLACE <", value, "menuscenicPlace");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPlaceLessThanOrEqualTo(String value) {
            addCriterion("MENUSCENIC_PLACE <=", value, "menuscenicPlace");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPlaceLike(String value) {
            addCriterion("MENUSCENIC_PLACE like", value, "menuscenicPlace");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPlaceNotLike(String value) {
            addCriterion("MENUSCENIC_PLACE not like", value, "menuscenicPlace");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPlaceIn(List<String> values) {
            addCriterion("MENUSCENIC_PLACE in", values, "menuscenicPlace");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPlaceNotIn(List<String> values) {
            addCriterion("MENUSCENIC_PLACE not in", values, "menuscenicPlace");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPlaceBetween(String value1, String value2) {
            addCriterion("MENUSCENIC_PLACE between", value1, value2, "menuscenicPlace");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPlaceNotBetween(String value1, String value2) {
            addCriterion("MENUSCENIC_PLACE not between", value1, value2, "menuscenicPlace");
            return (Criteria) this;
        }

        public Criteria andMenuscenicTimeIsNull() {
            addCriterion("MENUSCENIC_TIME is null");
            return (Criteria) this;
        }

        public Criteria andMenuscenicTimeIsNotNull() {
            addCriterion("MENUSCENIC_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andMenuscenicTimeEqualTo(String value) {
            addCriterion("MENUSCENIC_TIME =", value, "menuscenicTime");
            return (Criteria) this;
        }

        public Criteria andMenuscenicTimeNotEqualTo(String value) {
            addCriterion("MENUSCENIC_TIME <>", value, "menuscenicTime");
            return (Criteria) this;
        }

        public Criteria andMenuscenicTimeGreaterThan(String value) {
            addCriterion("MENUSCENIC_TIME >", value, "menuscenicTime");
            return (Criteria) this;
        }

        public Criteria andMenuscenicTimeGreaterThanOrEqualTo(String value) {
            addCriterion("MENUSCENIC_TIME >=", value, "menuscenicTime");
            return (Criteria) this;
        }

        public Criteria andMenuscenicTimeLessThan(String value) {
            addCriterion("MENUSCENIC_TIME <", value, "menuscenicTime");
            return (Criteria) this;
        }

        public Criteria andMenuscenicTimeLessThanOrEqualTo(String value) {
            addCriterion("MENUSCENIC_TIME <=", value, "menuscenicTime");
            return (Criteria) this;
        }

        public Criteria andMenuscenicTimeLike(String value) {
            addCriterion("MENUSCENIC_TIME like", value, "menuscenicTime");
            return (Criteria) this;
        }

        public Criteria andMenuscenicTimeNotLike(String value) {
            addCriterion("MENUSCENIC_TIME not like", value, "menuscenicTime");
            return (Criteria) this;
        }

        public Criteria andMenuscenicTimeIn(List<String> values) {
            addCriterion("MENUSCENIC_TIME in", values, "menuscenicTime");
            return (Criteria) this;
        }

        public Criteria andMenuscenicTimeNotIn(List<String> values) {
            addCriterion("MENUSCENIC_TIME not in", values, "menuscenicTime");
            return (Criteria) this;
        }

        public Criteria andMenuscenicTimeBetween(String value1, String value2) {
            addCriterion("MENUSCENIC_TIME between", value1, value2, "menuscenicTime");
            return (Criteria) this;
        }

        public Criteria andMenuscenicTimeNotBetween(String value1, String value2) {
            addCriterion("MENUSCENIC_TIME not between", value1, value2, "menuscenicTime");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPolicyIsNull() {
            addCriterion("MENUSCENIC_POLICY is null");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPolicyIsNotNull() {
            addCriterion("MENUSCENIC_POLICY is not null");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPolicyEqualTo(String value) {
            addCriterion("MENUSCENIC_POLICY =", value, "menuscenicPolicy");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPolicyNotEqualTo(String value) {
            addCriterion("MENUSCENIC_POLICY <>", value, "menuscenicPolicy");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPolicyGreaterThan(String value) {
            addCriterion("MENUSCENIC_POLICY >", value, "menuscenicPolicy");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPolicyGreaterThanOrEqualTo(String value) {
            addCriterion("MENUSCENIC_POLICY >=", value, "menuscenicPolicy");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPolicyLessThan(String value) {
            addCriterion("MENUSCENIC_POLICY <", value, "menuscenicPolicy");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPolicyLessThanOrEqualTo(String value) {
            addCriterion("MENUSCENIC_POLICY <=", value, "menuscenicPolicy");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPolicyLike(String value) {
            addCriterion("MENUSCENIC_POLICY like", value, "menuscenicPolicy");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPolicyNotLike(String value) {
            addCriterion("MENUSCENIC_POLICY not like", value, "menuscenicPolicy");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPolicyIn(List<String> values) {
            addCriterion("MENUSCENIC_POLICY in", values, "menuscenicPolicy");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPolicyNotIn(List<String> values) {
            addCriterion("MENUSCENIC_POLICY not in", values, "menuscenicPolicy");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPolicyBetween(String value1, String value2) {
            addCriterion("MENUSCENIC_POLICY between", value1, value2, "menuscenicPolicy");
            return (Criteria) this;
        }

        public Criteria andMenuscenicPolicyNotBetween(String value1, String value2) {
            addCriterion("MENUSCENIC_POLICY not between", value1, value2, "menuscenicPolicy");
            return (Criteria) this;
        }

        public Criteria andMenuscenicTrafficIsNull() {
            addCriterion("MENUSCENIC_TRAFFIC is null");
            return (Criteria) this;
        }

        public Criteria andMenuscenicTrafficIsNotNull() {
            addCriterion("MENUSCENIC_TRAFFIC is not null");
            return (Criteria) this;
        }

        public Criteria andMenuscenicTrafficEqualTo(String value) {
            addCriterion("MENUSCENIC_TRAFFIC =", value, "menuscenicTraffic");
            return (Criteria) this;
        }

        public Criteria andMenuscenicTrafficNotEqualTo(String value) {
            addCriterion("MENUSCENIC_TRAFFIC <>", value, "menuscenicTraffic");
            return (Criteria) this;
        }

        public Criteria andMenuscenicTrafficGreaterThan(String value) {
            addCriterion("MENUSCENIC_TRAFFIC >", value, "menuscenicTraffic");
            return (Criteria) this;
        }

        public Criteria andMenuscenicTrafficGreaterThanOrEqualTo(String value) {
            addCriterion("MENUSCENIC_TRAFFIC >=", value, "menuscenicTraffic");
            return (Criteria) this;
        }

        public Criteria andMenuscenicTrafficLessThan(String value) {
            addCriterion("MENUSCENIC_TRAFFIC <", value, "menuscenicTraffic");
            return (Criteria) this;
        }

        public Criteria andMenuscenicTrafficLessThanOrEqualTo(String value) {
            addCriterion("MENUSCENIC_TRAFFIC <=", value, "menuscenicTraffic");
            return (Criteria) this;
        }

        public Criteria andMenuscenicTrafficLike(String value) {
            addCriterion("MENUSCENIC_TRAFFIC like", value, "menuscenicTraffic");
            return (Criteria) this;
        }

        public Criteria andMenuscenicTrafficNotLike(String value) {
            addCriterion("MENUSCENIC_TRAFFIC not like", value, "menuscenicTraffic");
            return (Criteria) this;
        }

        public Criteria andMenuscenicTrafficIn(List<String> values) {
            addCriterion("MENUSCENIC_TRAFFIC in", values, "menuscenicTraffic");
            return (Criteria) this;
        }

        public Criteria andMenuscenicTrafficNotIn(List<String> values) {
            addCriterion("MENUSCENIC_TRAFFIC not in", values, "menuscenicTraffic");
            return (Criteria) this;
        }

        public Criteria andMenuscenicTrafficBetween(String value1, String value2) {
            addCriterion("MENUSCENIC_TRAFFIC between", value1, value2, "menuscenicTraffic");
            return (Criteria) this;
        }

        public Criteria andMenuscenicTrafficNotBetween(String value1, String value2) {
            addCriterion("MENUSCENIC_TRAFFIC not between", value1, value2, "menuscenicTraffic");
            return (Criteria) this;
        }

        public Criteria andMenuscenicQrCodeIsNull() {
            addCriterion("MENUSCENIC_QR_CODE is null");
            return (Criteria) this;
        }

        public Criteria andMenuscenicQrCodeIsNotNull() {
            addCriterion("MENUSCENIC_QR_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andMenuscenicQrCodeEqualTo(String value) {
            addCriterion("MENUSCENIC_QR_CODE =", value, "menuscenicQrCode");
            return (Criteria) this;
        }

        public Criteria andMenuscenicQrCodeNotEqualTo(String value) {
            addCriterion("MENUSCENIC_QR_CODE <>", value, "menuscenicQrCode");
            return (Criteria) this;
        }

        public Criteria andMenuscenicQrCodeGreaterThan(String value) {
            addCriterion("MENUSCENIC_QR_CODE >", value, "menuscenicQrCode");
            return (Criteria) this;
        }

        public Criteria andMenuscenicQrCodeGreaterThanOrEqualTo(String value) {
            addCriterion("MENUSCENIC_QR_CODE >=", value, "menuscenicQrCode");
            return (Criteria) this;
        }

        public Criteria andMenuscenicQrCodeLessThan(String value) {
            addCriterion("MENUSCENIC_QR_CODE <", value, "menuscenicQrCode");
            return (Criteria) this;
        }

        public Criteria andMenuscenicQrCodeLessThanOrEqualTo(String value) {
            addCriterion("MENUSCENIC_QR_CODE <=", value, "menuscenicQrCode");
            return (Criteria) this;
        }

        public Criteria andMenuscenicQrCodeLike(String value) {
            addCriterion("MENUSCENIC_QR_CODE like", value, "menuscenicQrCode");
            return (Criteria) this;
        }

        public Criteria andMenuscenicQrCodeNotLike(String value) {
            addCriterion("MENUSCENIC_QR_CODE not like", value, "menuscenicQrCode");
            return (Criteria) this;
        }

        public Criteria andMenuscenicQrCodeIn(List<String> values) {
            addCriterion("MENUSCENIC_QR_CODE in", values, "menuscenicQrCode");
            return (Criteria) this;
        }

        public Criteria andMenuscenicQrCodeNotIn(List<String> values) {
            addCriterion("MENUSCENIC_QR_CODE not in", values, "menuscenicQrCode");
            return (Criteria) this;
        }

        public Criteria andMenuscenicQrCodeBetween(String value1, String value2) {
            addCriterion("MENUSCENIC_QR_CODE between", value1, value2, "menuscenicQrCode");
            return (Criteria) this;
        }

        public Criteria andMenuscenicQrCodeNotBetween(String value1, String value2) {
            addCriterion("MENUSCENIC_QR_CODE not between", value1, value2, "menuscenicQrCode");
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