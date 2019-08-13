package com.green.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserRelationExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andInterestIdIsNull() {
            addCriterion("interest_id is null");
            return (Criteria) this;
        }

        public Criteria andInterestIdIsNotNull() {
            addCriterion("interest_id is not null");
            return (Criteria) this;
        }

        public Criteria andInterestIdEqualTo(String value) {
            addCriterion("interest_id =", value, "interestId");
            return (Criteria) this;
        }

        public Criteria andInterestIdNotEqualTo(String value) {
            addCriterion("interest_id <>", value, "interestId");
            return (Criteria) this;
        }

        public Criteria andInterestIdGreaterThan(String value) {
            addCriterion("interest_id >", value, "interestId");
            return (Criteria) this;
        }

        public Criteria andInterestIdGreaterThanOrEqualTo(String value) {
            addCriterion("interest_id >=", value, "interestId");
            return (Criteria) this;
        }

        public Criteria andInterestIdLessThan(String value) {
            addCriterion("interest_id <", value, "interestId");
            return (Criteria) this;
        }

        public Criteria andInterestIdLessThanOrEqualTo(String value) {
            addCriterion("interest_id <=", value, "interestId");
            return (Criteria) this;
        }

        public Criteria andInterestIdLike(String value) {
            addCriterion("interest_id like", value, "interestId");
            return (Criteria) this;
        }

        public Criteria andInterestIdNotLike(String value) {
            addCriterion("interest_id not like", value, "interestId");
            return (Criteria) this;
        }

        public Criteria andInterestIdIn(List<String> values) {
            addCriterion("interest_id in", values, "interestId");
            return (Criteria) this;
        }

        public Criteria andInterestIdNotIn(List<String> values) {
            addCriterion("interest_id not in", values, "interestId");
            return (Criteria) this;
        }

        public Criteria andInterestIdBetween(String value1, String value2) {
            addCriterion("interest_id between", value1, value2, "interestId");
            return (Criteria) this;
        }

        public Criteria andInterestIdNotBetween(String value1, String value2) {
            addCriterion("interest_id not between", value1, value2, "interestId");
            return (Criteria) this;
        }

        public Criteria andFollowerIdIsNull() {
            addCriterion("follower_id is null");
            return (Criteria) this;
        }

        public Criteria andFollowerIdIsNotNull() {
            addCriterion("follower_id is not null");
            return (Criteria) this;
        }

        public Criteria andFollowerIdEqualTo(String value) {
            addCriterion("follower_id =", value, "followerId");
            return (Criteria) this;
        }

        public Criteria andFollowerIdNotEqualTo(String value) {
            addCriterion("follower_id <>", value, "followerId");
            return (Criteria) this;
        }

        public Criteria andFollowerIdGreaterThan(String value) {
            addCriterion("follower_id >", value, "followerId");
            return (Criteria) this;
        }

        public Criteria andFollowerIdGreaterThanOrEqualTo(String value) {
            addCriterion("follower_id >=", value, "followerId");
            return (Criteria) this;
        }

        public Criteria andFollowerIdLessThan(String value) {
            addCriterion("follower_id <", value, "followerId");
            return (Criteria) this;
        }

        public Criteria andFollowerIdLessThanOrEqualTo(String value) {
            addCriterion("follower_id <=", value, "followerId");
            return (Criteria) this;
        }

        public Criteria andFollowerIdLike(String value) {
            addCriterion("follower_id like", value, "followerId");
            return (Criteria) this;
        }

        public Criteria andFollowerIdNotLike(String value) {
            addCriterion("follower_id not like", value, "followerId");
            return (Criteria) this;
        }

        public Criteria andFollowerIdIn(List<String> values) {
            addCriterion("follower_id in", values, "followerId");
            return (Criteria) this;
        }

        public Criteria andFollowerIdNotIn(List<String> values) {
            addCriterion("follower_id not in", values, "followerId");
            return (Criteria) this;
        }

        public Criteria andFollowerIdBetween(String value1, String value2) {
            addCriterion("follower_id between", value1, value2, "followerId");
            return (Criteria) this;
        }

        public Criteria andFollowerIdNotBetween(String value1, String value2) {
            addCriterion("follower_id not between", value1, value2, "followerId");
            return (Criteria) this;
        }

        public Criteria andHistoryProductIdIsNull() {
            addCriterion("history_product_id is null");
            return (Criteria) this;
        }

        public Criteria andHistoryProductIdIsNotNull() {
            addCriterion("history_product_id is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryProductIdEqualTo(String value) {
            addCriterion("history_product_id =", value, "historyProductId");
            return (Criteria) this;
        }

        public Criteria andHistoryProductIdNotEqualTo(String value) {
            addCriterion("history_product_id <>", value, "historyProductId");
            return (Criteria) this;
        }

        public Criteria andHistoryProductIdGreaterThan(String value) {
            addCriterion("history_product_id >", value, "historyProductId");
            return (Criteria) this;
        }

        public Criteria andHistoryProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("history_product_id >=", value, "historyProductId");
            return (Criteria) this;
        }

        public Criteria andHistoryProductIdLessThan(String value) {
            addCriterion("history_product_id <", value, "historyProductId");
            return (Criteria) this;
        }

        public Criteria andHistoryProductIdLessThanOrEqualTo(String value) {
            addCriterion("history_product_id <=", value, "historyProductId");
            return (Criteria) this;
        }

        public Criteria andHistoryProductIdLike(String value) {
            addCriterion("history_product_id like", value, "historyProductId");
            return (Criteria) this;
        }

        public Criteria andHistoryProductIdNotLike(String value) {
            addCriterion("history_product_id not like", value, "historyProductId");
            return (Criteria) this;
        }

        public Criteria andHistoryProductIdIn(List<String> values) {
            addCriterion("history_product_id in", values, "historyProductId");
            return (Criteria) this;
        }

        public Criteria andHistoryProductIdNotIn(List<String> values) {
            addCriterion("history_product_id not in", values, "historyProductId");
            return (Criteria) this;
        }

        public Criteria andHistoryProductIdBetween(String value1, String value2) {
            addCriterion("history_product_id between", value1, value2, "historyProductId");
            return (Criteria) this;
        }

        public Criteria andHistoryProductIdNotBetween(String value1, String value2) {
            addCriterion("history_product_id not between", value1, value2, "historyProductId");
            return (Criteria) this;
        }

        public Criteria andHistoryArticleIdIsNull() {
            addCriterion("history_article_id is null");
            return (Criteria) this;
        }

        public Criteria andHistoryArticleIdIsNotNull() {
            addCriterion("history_article_id is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryArticleIdEqualTo(String value) {
            addCriterion("history_article_id =", value, "historyArticleId");
            return (Criteria) this;
        }

        public Criteria andHistoryArticleIdNotEqualTo(String value) {
            addCriterion("history_article_id <>", value, "historyArticleId");
            return (Criteria) this;
        }

        public Criteria andHistoryArticleIdGreaterThan(String value) {
            addCriterion("history_article_id >", value, "historyArticleId");
            return (Criteria) this;
        }

        public Criteria andHistoryArticleIdGreaterThanOrEqualTo(String value) {
            addCriterion("history_article_id >=", value, "historyArticleId");
            return (Criteria) this;
        }

        public Criteria andHistoryArticleIdLessThan(String value) {
            addCriterion("history_article_id <", value, "historyArticleId");
            return (Criteria) this;
        }

        public Criteria andHistoryArticleIdLessThanOrEqualTo(String value) {
            addCriterion("history_article_id <=", value, "historyArticleId");
            return (Criteria) this;
        }

        public Criteria andHistoryArticleIdLike(String value) {
            addCriterion("history_article_id like", value, "historyArticleId");
            return (Criteria) this;
        }

        public Criteria andHistoryArticleIdNotLike(String value) {
            addCriterion("history_article_id not like", value, "historyArticleId");
            return (Criteria) this;
        }

        public Criteria andHistoryArticleIdIn(List<String> values) {
            addCriterion("history_article_id in", values, "historyArticleId");
            return (Criteria) this;
        }

        public Criteria andHistoryArticleIdNotIn(List<String> values) {
            addCriterion("history_article_id not in", values, "historyArticleId");
            return (Criteria) this;
        }

        public Criteria andHistoryArticleIdBetween(String value1, String value2) {
            addCriterion("history_article_id between", value1, value2, "historyArticleId");
            return (Criteria) this;
        }

        public Criteria andHistoryArticleIdNotBetween(String value1, String value2) {
            addCriterion("history_article_id not between", value1, value2, "historyArticleId");
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