package cn.cooper.blog.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PostEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PostEntityExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andExcerptIsNull() {
            addCriterion("excerpt is null");
            return (Criteria) this;
        }

        public Criteria andExcerptIsNotNull() {
            addCriterion("excerpt is not null");
            return (Criteria) this;
        }

        public Criteria andExcerptEqualTo(String value) {
            addCriterion("excerpt =", value, "excerpt");
            return (Criteria) this;
        }

        public Criteria andExcerptNotEqualTo(String value) {
            addCriterion("excerpt <>", value, "excerpt");
            return (Criteria) this;
        }

        public Criteria andExcerptGreaterThan(String value) {
            addCriterion("excerpt >", value, "excerpt");
            return (Criteria) this;
        }

        public Criteria andExcerptGreaterThanOrEqualTo(String value) {
            addCriterion("excerpt >=", value, "excerpt");
            return (Criteria) this;
        }

        public Criteria andExcerptLessThan(String value) {
            addCriterion("excerpt <", value, "excerpt");
            return (Criteria) this;
        }

        public Criteria andExcerptLessThanOrEqualTo(String value) {
            addCriterion("excerpt <=", value, "excerpt");
            return (Criteria) this;
        }

        public Criteria andExcerptLike(String value) {
            addCriterion("excerpt like", value, "excerpt");
            return (Criteria) this;
        }

        public Criteria andExcerptNotLike(String value) {
            addCriterion("excerpt not like", value, "excerpt");
            return (Criteria) this;
        }

        public Criteria andExcerptIn(List<String> values) {
            addCriterion("excerpt in", values, "excerpt");
            return (Criteria) this;
        }

        public Criteria andExcerptNotIn(List<String> values) {
            addCriterion("excerpt not in", values, "excerpt");
            return (Criteria) this;
        }

        public Criteria andExcerptBetween(String value1, String value2) {
            addCriterion("excerpt between", value1, value2, "excerpt");
            return (Criteria) this;
        }

        public Criteria andExcerptNotBetween(String value1, String value2) {
            addCriterion("excerpt not between", value1, value2, "excerpt");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andParentIsNull() {
            addCriterion("parent is null");
            return (Criteria) this;
        }

        public Criteria andParentIsNotNull() {
            addCriterion("parent is not null");
            return (Criteria) this;
        }

        public Criteria andParentEqualTo(String value) {
            addCriterion("parent =", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentNotEqualTo(String value) {
            addCriterion("parent <>", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentGreaterThan(String value) {
            addCriterion("parent >", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentGreaterThanOrEqualTo(String value) {
            addCriterion("parent >=", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentLessThan(String value) {
            addCriterion("parent <", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentLessThanOrEqualTo(String value) {
            addCriterion("parent <=", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentLike(String value) {
            addCriterion("parent like", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentNotLike(String value) {
            addCriterion("parent not like", value, "parent");
            return (Criteria) this;
        }

        public Criteria andParentIn(List<String> values) {
            addCriterion("parent in", values, "parent");
            return (Criteria) this;
        }

        public Criteria andParentNotIn(List<String> values) {
            addCriterion("parent not in", values, "parent");
            return (Criteria) this;
        }

        public Criteria andParentBetween(String value1, String value2) {
            addCriterion("parent between", value1, value2, "parent");
            return (Criteria) this;
        }

        public Criteria andParentNotBetween(String value1, String value2) {
            addCriterion("parent not between", value1, value2, "parent");
            return (Criteria) this;
        }

        public Criteria andCategoryidIsNull() {
            addCriterion("categoryid is null");
            return (Criteria) this;
        }

        public Criteria andCategoryidIsNotNull() {
            addCriterion("categoryid is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryidEqualTo(String value) {
            addCriterion("categoryid =", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotEqualTo(String value) {
            addCriterion("categoryid <>", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThan(String value) {
            addCriterion("categoryid >", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThanOrEqualTo(String value) {
            addCriterion("categoryid >=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThan(String value) {
            addCriterion("categoryid <", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThanOrEqualTo(String value) {
            addCriterion("categoryid <=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLike(String value) {
            addCriterion("categoryid like", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotLike(String value) {
            addCriterion("categoryid not like", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidIn(List<String> values) {
            addCriterion("categoryid in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotIn(List<String> values) {
            addCriterion("categoryid not in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidBetween(String value1, String value2) {
            addCriterion("categoryid between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotBetween(String value1, String value2) {
            addCriterion("categoryid not between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andPstatusIsNull() {
            addCriterion("pstatus is null");
            return (Criteria) this;
        }

        public Criteria andPstatusIsNotNull() {
            addCriterion("pstatus is not null");
            return (Criteria) this;
        }

        public Criteria andPstatusEqualTo(String value) {
            addCriterion("pstatus =", value, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPstatusNotEqualTo(String value) {
            addCriterion("pstatus <>", value, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPstatusGreaterThan(String value) {
            addCriterion("pstatus >", value, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPstatusGreaterThanOrEqualTo(String value) {
            addCriterion("pstatus >=", value, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPstatusLessThan(String value) {
            addCriterion("pstatus <", value, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPstatusLessThanOrEqualTo(String value) {
            addCriterion("pstatus <=", value, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPstatusLike(String value) {
            addCriterion("pstatus like", value, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPstatusNotLike(String value) {
            addCriterion("pstatus not like", value, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPstatusIn(List<String> values) {
            addCriterion("pstatus in", values, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPstatusNotIn(List<String> values) {
            addCriterion("pstatus not in", values, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPstatusBetween(String value1, String value2) {
            addCriterion("pstatus between", value1, value2, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPstatusNotBetween(String value1, String value2) {
            addCriterion("pstatus not between", value1, value2, "pstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusIsNull() {
            addCriterion("cstatus is null");
            return (Criteria) this;
        }

        public Criteria andCstatusIsNotNull() {
            addCriterion("cstatus is not null");
            return (Criteria) this;
        }

        public Criteria andCstatusEqualTo(String value) {
            addCriterion("cstatus =", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusNotEqualTo(String value) {
            addCriterion("cstatus <>", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusGreaterThan(String value) {
            addCriterion("cstatus >", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusGreaterThanOrEqualTo(String value) {
            addCriterion("cstatus >=", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusLessThan(String value) {
            addCriterion("cstatus <", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusLessThanOrEqualTo(String value) {
            addCriterion("cstatus <=", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusLike(String value) {
            addCriterion("cstatus like", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusNotLike(String value) {
            addCriterion("cstatus not like", value, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusIn(List<String> values) {
            addCriterion("cstatus in", values, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusNotIn(List<String> values) {
            addCriterion("cstatus not in", values, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusBetween(String value1, String value2) {
            addCriterion("cstatus between", value1, value2, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCstatusNotBetween(String value1, String value2) {
            addCriterion("cstatus not between", value1, value2, "cstatus");
            return (Criteria) this;
        }

        public Criteria andCcountIsNull() {
            addCriterion("ccount is null");
            return (Criteria) this;
        }

        public Criteria andCcountIsNotNull() {
            addCriterion("ccount is not null");
            return (Criteria) this;
        }

        public Criteria andCcountEqualTo(Integer value) {
            addCriterion("ccount =", value, "ccount");
            return (Criteria) this;
        }

        public Criteria andCcountNotEqualTo(Integer value) {
            addCriterion("ccount <>", value, "ccount");
            return (Criteria) this;
        }

        public Criteria andCcountGreaterThan(Integer value) {
            addCriterion("ccount >", value, "ccount");
            return (Criteria) this;
        }

        public Criteria andCcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ccount >=", value, "ccount");
            return (Criteria) this;
        }

        public Criteria andCcountLessThan(Integer value) {
            addCriterion("ccount <", value, "ccount");
            return (Criteria) this;
        }

        public Criteria andCcountLessThanOrEqualTo(Integer value) {
            addCriterion("ccount <=", value, "ccount");
            return (Criteria) this;
        }

        public Criteria andCcountIn(List<Integer> values) {
            addCriterion("ccount in", values, "ccount");
            return (Criteria) this;
        }

        public Criteria andCcountNotIn(List<Integer> values) {
            addCriterion("ccount not in", values, "ccount");
            return (Criteria) this;
        }

        public Criteria andCcountBetween(Integer value1, Integer value2) {
            addCriterion("ccount between", value1, value2, "ccount");
            return (Criteria) this;
        }

        public Criteria andCcountNotBetween(Integer value1, Integer value2) {
            addCriterion("ccount not between", value1, value2, "ccount");
            return (Criteria) this;
        }

        public Criteria andRcountIsNull() {
            addCriterion("rcount is null");
            return (Criteria) this;
        }

        public Criteria andRcountIsNotNull() {
            addCriterion("rcount is not null");
            return (Criteria) this;
        }

        public Criteria andRcountEqualTo(Integer value) {
            addCriterion("rcount =", value, "rcount");
            return (Criteria) this;
        }

        public Criteria andRcountNotEqualTo(Integer value) {
            addCriterion("rcount <>", value, "rcount");
            return (Criteria) this;
        }

        public Criteria andRcountGreaterThan(Integer value) {
            addCriterion("rcount >", value, "rcount");
            return (Criteria) this;
        }

        public Criteria andRcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("rcount >=", value, "rcount");
            return (Criteria) this;
        }

        public Criteria andRcountLessThan(Integer value) {
            addCriterion("rcount <", value, "rcount");
            return (Criteria) this;
        }

        public Criteria andRcountLessThanOrEqualTo(Integer value) {
            addCriterion("rcount <=", value, "rcount");
            return (Criteria) this;
        }

        public Criteria andRcountIn(List<Integer> values) {
            addCriterion("rcount in", values, "rcount");
            return (Criteria) this;
        }

        public Criteria andRcountNotIn(List<Integer> values) {
            addCriterion("rcount not in", values, "rcount");
            return (Criteria) this;
        }

        public Criteria andRcountBetween(Integer value1, Integer value2) {
            addCriterion("rcount between", value1, value2, "rcount");
            return (Criteria) this;
        }

        public Criteria andRcountNotBetween(Integer value1, Integer value2) {
            addCriterion("rcount not between", value1, value2, "rcount");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andLastupdateIsNull() {
            addCriterion("lastUpdate is null");
            return (Criteria) this;
        }

        public Criteria andLastupdateIsNotNull() {
            addCriterion("lastUpdate is not null");
            return (Criteria) this;
        }

        public Criteria andLastupdateEqualTo(Date value) {
            addCriterion("lastUpdate =", value, "lastupdate");
            return (Criteria) this;
        }

        public Criteria andLastupdateNotEqualTo(Date value) {
            addCriterion("lastUpdate <>", value, "lastupdate");
            return (Criteria) this;
        }

        public Criteria andLastupdateGreaterThan(Date value) {
            addCriterion("lastUpdate >", value, "lastupdate");
            return (Criteria) this;
        }

        public Criteria andLastupdateGreaterThanOrEqualTo(Date value) {
            addCriterion("lastUpdate >=", value, "lastupdate");
            return (Criteria) this;
        }

        public Criteria andLastupdateLessThan(Date value) {
            addCriterion("lastUpdate <", value, "lastupdate");
            return (Criteria) this;
        }

        public Criteria andLastupdateLessThanOrEqualTo(Date value) {
            addCriterion("lastUpdate <=", value, "lastupdate");
            return (Criteria) this;
        }

        public Criteria andLastupdateIn(List<Date> values) {
            addCriterion("lastUpdate in", values, "lastupdate");
            return (Criteria) this;
        }

        public Criteria andLastupdateNotIn(List<Date> values) {
            addCriterion("lastUpdate not in", values, "lastupdate");
            return (Criteria) this;
        }

        public Criteria andLastupdateBetween(Date value1, Date value2) {
            addCriterion("lastUpdate between", value1, value2, "lastupdate");
            return (Criteria) this;
        }

        public Criteria andLastupdateNotBetween(Date value1, Date value2) {
            addCriterion("lastUpdate not between", value1, value2, "lastupdate");
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