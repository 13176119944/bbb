package com.lening.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CoachBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CoachBeanExample() {
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

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCnameIsNull() {
            addCriterion("cname is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("cname is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("cname =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("cname <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("cname >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("cname >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("cname <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("cname <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("cname like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("cname not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("cname in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("cname not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("cname between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("cname not between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCbirthIsNull() {
            addCriterion("cbirth is null");
            return (Criteria) this;
        }

        public Criteria andCbirthIsNotNull() {
            addCriterion("cbirth is not null");
            return (Criteria) this;
        }

        public Criteria andCbirthEqualTo(Date value) {
            addCriterionForJDBCDate("cbirth =", value, "cbirth");
            return (Criteria) this;
        }

        public Criteria andCbirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("cbirth <>", value, "cbirth");
            return (Criteria) this;
        }

        public Criteria andCbirthGreaterThan(Date value) {
            addCriterionForJDBCDate("cbirth >", value, "cbirth");
            return (Criteria) this;
        }

        public Criteria andCbirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cbirth >=", value, "cbirth");
            return (Criteria) this;
        }

        public Criteria andCbirthLessThan(Date value) {
            addCriterionForJDBCDate("cbirth <", value, "cbirth");
            return (Criteria) this;
        }

        public Criteria andCbirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cbirth <=", value, "cbirth");
            return (Criteria) this;
        }

        public Criteria andCbirthIn(List<Date> values) {
            addCriterionForJDBCDate("cbirth in", values, "cbirth");
            return (Criteria) this;
        }

        public Criteria andCbirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("cbirth not in", values, "cbirth");
            return (Criteria) this;
        }

        public Criteria andCbirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cbirth between", value1, value2, "cbirth");
            return (Criteria) this;
        }

        public Criteria andCbirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cbirth not between", value1, value2, "cbirth");
            return (Criteria) this;
        }

        public Criteria andCsexIsNull() {
            addCriterion("csex is null");
            return (Criteria) this;
        }

        public Criteria andCsexIsNotNull() {
            addCriterion("csex is not null");
            return (Criteria) this;
        }

        public Criteria andCsexEqualTo(String value) {
            addCriterion("csex =", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexNotEqualTo(String value) {
            addCriterion("csex <>", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexGreaterThan(String value) {
            addCriterion("csex >", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexGreaterThanOrEqualTo(String value) {
            addCriterion("csex >=", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexLessThan(String value) {
            addCriterion("csex <", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexLessThanOrEqualTo(String value) {
            addCriterion("csex <=", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexLike(String value) {
            addCriterion("csex like", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexNotLike(String value) {
            addCriterion("csex not like", value, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexIn(List<String> values) {
            addCriterion("csex in", values, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexNotIn(List<String> values) {
            addCriterion("csex not in", values, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexBetween(String value1, String value2) {
            addCriterion("csex between", value1, value2, "csex");
            return (Criteria) this;
        }

        public Criteria andCsexNotBetween(String value1, String value2) {
            addCriterion("csex not between", value1, value2, "csex");
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