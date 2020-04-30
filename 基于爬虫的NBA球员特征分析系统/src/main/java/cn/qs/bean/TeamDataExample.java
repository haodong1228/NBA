package cn.qs.bean;

import java.util.ArrayList;
import java.util.List;

public class TeamDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeamDataExample() {
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

        public Criteria andDataIdIsNull() {
            addCriterion("data_id is null");
            return (Criteria) this;
        }

        public Criteria andDataIdIsNotNull() {
            addCriterion("data_id is not null");
            return (Criteria) this;
        }

        public Criteria andDataIdEqualTo(String value) {
            addCriterion("data_id =", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotEqualTo(String value) {
            addCriterion("data_id <>", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdGreaterThan(String value) {
            addCriterion("data_id >", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdGreaterThanOrEqualTo(String value) {
            addCriterion("data_id >=", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdLessThan(String value) {
            addCriterion("data_id <", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdLessThanOrEqualTo(String value) {
            addCriterion("data_id <=", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdLike(String value) {
            addCriterion("data_id like", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotLike(String value) {
            addCriterion("data_id not like", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdIn(List<String> values) {
            addCriterion("data_id in", values, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotIn(List<String> values) {
            addCriterion("data_id not in", values, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdBetween(String value1, String value2) {
            addCriterion("data_id between", value1, value2, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotBetween(String value1, String value2) {
            addCriterion("data_id not between", value1, value2, "dataId");
            return (Criteria) this;
        }

        public Criteria andTeamIdIsNull() {
            addCriterion("team_id is null");
            return (Criteria) this;
        }

        public Criteria andTeamIdIsNotNull() {
            addCriterion("team_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeamIdEqualTo(String value) {
            addCriterion("team_id =", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotEqualTo(String value) {
            addCriterion("team_id <>", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdGreaterThan(String value) {
            addCriterion("team_id >", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdGreaterThanOrEqualTo(String value) {
            addCriterion("team_id >=", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdLessThan(String value) {
            addCriterion("team_id <", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdLessThanOrEqualTo(String value) {
            addCriterion("team_id <=", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdLike(String value) {
            addCriterion("team_id like", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotLike(String value) {
            addCriterion("team_id not like", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdIn(List<String> values) {
            addCriterion("team_id in", values, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotIn(List<String> values) {
            addCriterion("team_id not in", values, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdBetween(String value1, String value2) {
            addCriterion("team_id between", value1, value2, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotBetween(String value1, String value2) {
            addCriterion("team_id not between", value1, value2, "teamId");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(String value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(String value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(String value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(String value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(String value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(String value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLike(String value) {
            addCriterion("date like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotLike(String value) {
            addCriterion("date not like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<String> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<String> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(String value1, String value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(String value1, String value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andOpponentIsNull() {
            addCriterion("Opponent is null");
            return (Criteria) this;
        }

        public Criteria andOpponentIsNotNull() {
            addCriterion("Opponent is not null");
            return (Criteria) this;
        }

        public Criteria andOpponentEqualTo(String value) {
            addCriterion("Opponent =", value, "opponent");
            return (Criteria) this;
        }

        public Criteria andOpponentNotEqualTo(String value) {
            addCriterion("Opponent <>", value, "opponent");
            return (Criteria) this;
        }

        public Criteria andOpponentGreaterThan(String value) {
            addCriterion("Opponent >", value, "opponent");
            return (Criteria) this;
        }

        public Criteria andOpponentGreaterThanOrEqualTo(String value) {
            addCriterion("Opponent >=", value, "opponent");
            return (Criteria) this;
        }

        public Criteria andOpponentLessThan(String value) {
            addCriterion("Opponent <", value, "opponent");
            return (Criteria) this;
        }

        public Criteria andOpponentLessThanOrEqualTo(String value) {
            addCriterion("Opponent <=", value, "opponent");
            return (Criteria) this;
        }

        public Criteria andOpponentLike(String value) {
            addCriterion("Opponent like", value, "opponent");
            return (Criteria) this;
        }

        public Criteria andOpponentNotLike(String value) {
            addCriterion("Opponent not like", value, "opponent");
            return (Criteria) this;
        }

        public Criteria andOpponentIn(List<String> values) {
            addCriterion("Opponent in", values, "opponent");
            return (Criteria) this;
        }

        public Criteria andOpponentNotIn(List<String> values) {
            addCriterion("Opponent not in", values, "opponent");
            return (Criteria) this;
        }

        public Criteria andOpponentBetween(String value1, String value2) {
            addCriterion("Opponent between", value1, value2, "opponent");
            return (Criteria) this;
        }

        public Criteria andOpponentNotBetween(String value1, String value2) {
            addCriterion("Opponent not between", value1, value2, "opponent");
            return (Criteria) this;
        }

        public Criteria andPlayScoreIsNull() {
            addCriterion("play_score is null");
            return (Criteria) this;
        }

        public Criteria andPlayScoreIsNotNull() {
            addCriterion("play_score is not null");
            return (Criteria) this;
        }

        public Criteria andPlayScoreEqualTo(String value) {
            addCriterion("play_score =", value, "playScore");
            return (Criteria) this;
        }

        public Criteria andPlayScoreNotEqualTo(String value) {
            addCriterion("play_score <>", value, "playScore");
            return (Criteria) this;
        }

        public Criteria andPlayScoreGreaterThan(String value) {
            addCriterion("play_score >", value, "playScore");
            return (Criteria) this;
        }

        public Criteria andPlayScoreGreaterThanOrEqualTo(String value) {
            addCriterion("play_score >=", value, "playScore");
            return (Criteria) this;
        }

        public Criteria andPlayScoreLessThan(String value) {
            addCriterion("play_score <", value, "playScore");
            return (Criteria) this;
        }

        public Criteria andPlayScoreLessThanOrEqualTo(String value) {
            addCriterion("play_score <=", value, "playScore");
            return (Criteria) this;
        }

        public Criteria andPlayScoreLike(String value) {
            addCriterion("play_score like", value, "playScore");
            return (Criteria) this;
        }

        public Criteria andPlayScoreNotLike(String value) {
            addCriterion("play_score not like", value, "playScore");
            return (Criteria) this;
        }

        public Criteria andPlayScoreIn(List<String> values) {
            addCriterion("play_score in", values, "playScore");
            return (Criteria) this;
        }

        public Criteria andPlayScoreNotIn(List<String> values) {
            addCriterion("play_score not in", values, "playScore");
            return (Criteria) this;
        }

        public Criteria andPlayScoreBetween(String value1, String value2) {
            addCriterion("play_score between", value1, value2, "playScore");
            return (Criteria) this;
        }

        public Criteria andPlayScoreNotBetween(String value1, String value2) {
            addCriterion("play_score not between", value1, value2, "playScore");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("time like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("time not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andShootIsNull() {
            addCriterion("shoot is null");
            return (Criteria) this;
        }

        public Criteria andShootIsNotNull() {
            addCriterion("shoot is not null");
            return (Criteria) this;
        }

        public Criteria andShootEqualTo(String value) {
            addCriterion("shoot =", value, "shoot");
            return (Criteria) this;
        }

        public Criteria andShootNotEqualTo(String value) {
            addCriterion("shoot <>", value, "shoot");
            return (Criteria) this;
        }

        public Criteria andShootGreaterThan(String value) {
            addCriterion("shoot >", value, "shoot");
            return (Criteria) this;
        }

        public Criteria andShootGreaterThanOrEqualTo(String value) {
            addCriterion("shoot >=", value, "shoot");
            return (Criteria) this;
        }

        public Criteria andShootLessThan(String value) {
            addCriterion("shoot <", value, "shoot");
            return (Criteria) this;
        }

        public Criteria andShootLessThanOrEqualTo(String value) {
            addCriterion("shoot <=", value, "shoot");
            return (Criteria) this;
        }

        public Criteria andShootLike(String value) {
            addCriterion("shoot like", value, "shoot");
            return (Criteria) this;
        }

        public Criteria andShootNotLike(String value) {
            addCriterion("shoot not like", value, "shoot");
            return (Criteria) this;
        }

        public Criteria andShootIn(List<String> values) {
            addCriterion("shoot in", values, "shoot");
            return (Criteria) this;
        }

        public Criteria andShootNotIn(List<String> values) {
            addCriterion("shoot not in", values, "shoot");
            return (Criteria) this;
        }

        public Criteria andShootBetween(String value1, String value2) {
            addCriterion("shoot between", value1, value2, "shoot");
            return (Criteria) this;
        }

        public Criteria andShootNotBetween(String value1, String value2) {
            addCriterion("shoot not between", value1, value2, "shoot");
            return (Criteria) this;
        }

        public Criteria andShootHitRateIsNull() {
            addCriterion("shoot_hit_rate is null");
            return (Criteria) this;
        }

        public Criteria andShootHitRateIsNotNull() {
            addCriterion("shoot_hit_rate is not null");
            return (Criteria) this;
        }

        public Criteria andShootHitRateEqualTo(String value) {
            addCriterion("shoot_hit_rate =", value, "shootHitRate");
            return (Criteria) this;
        }

        public Criteria andShootHitRateNotEqualTo(String value) {
            addCriterion("shoot_hit_rate <>", value, "shootHitRate");
            return (Criteria) this;
        }

        public Criteria andShootHitRateGreaterThan(String value) {
            addCriterion("shoot_hit_rate >", value, "shootHitRate");
            return (Criteria) this;
        }

        public Criteria andShootHitRateGreaterThanOrEqualTo(String value) {
            addCriterion("shoot_hit_rate >=", value, "shootHitRate");
            return (Criteria) this;
        }

        public Criteria andShootHitRateLessThan(String value) {
            addCriterion("shoot_hit_rate <", value, "shootHitRate");
            return (Criteria) this;
        }

        public Criteria andShootHitRateLessThanOrEqualTo(String value) {
            addCriterion("shoot_hit_rate <=", value, "shootHitRate");
            return (Criteria) this;
        }

        public Criteria andShootHitRateLike(String value) {
            addCriterion("shoot_hit_rate like", value, "shootHitRate");
            return (Criteria) this;
        }

        public Criteria andShootHitRateNotLike(String value) {
            addCriterion("shoot_hit_rate not like", value, "shootHitRate");
            return (Criteria) this;
        }

        public Criteria andShootHitRateIn(List<String> values) {
            addCriterion("shoot_hit_rate in", values, "shootHitRate");
            return (Criteria) this;
        }

        public Criteria andShootHitRateNotIn(List<String> values) {
            addCriterion("shoot_hit_rate not in", values, "shootHitRate");
            return (Criteria) this;
        }

        public Criteria andShootHitRateBetween(String value1, String value2) {
            addCriterion("shoot_hit_rate between", value1, value2, "shootHitRate");
            return (Criteria) this;
        }

        public Criteria andShootHitRateNotBetween(String value1, String value2) {
            addCriterion("shoot_hit_rate not between", value1, value2, "shootHitRate");
            return (Criteria) this;
        }

        public Criteria andThreeIsNull() {
            addCriterion("three is null");
            return (Criteria) this;
        }

        public Criteria andThreeIsNotNull() {
            addCriterion("three is not null");
            return (Criteria) this;
        }

        public Criteria andThreeEqualTo(String value) {
            addCriterion("three =", value, "three");
            return (Criteria) this;
        }

        public Criteria andThreeNotEqualTo(String value) {
            addCriterion("three <>", value, "three");
            return (Criteria) this;
        }

        public Criteria andThreeGreaterThan(String value) {
            addCriterion("three >", value, "three");
            return (Criteria) this;
        }

        public Criteria andThreeGreaterThanOrEqualTo(String value) {
            addCriterion("three >=", value, "three");
            return (Criteria) this;
        }

        public Criteria andThreeLessThan(String value) {
            addCriterion("three <", value, "three");
            return (Criteria) this;
        }

        public Criteria andThreeLessThanOrEqualTo(String value) {
            addCriterion("three <=", value, "three");
            return (Criteria) this;
        }

        public Criteria andThreeLike(String value) {
            addCriterion("three like", value, "three");
            return (Criteria) this;
        }

        public Criteria andThreeNotLike(String value) {
            addCriterion("three not like", value, "three");
            return (Criteria) this;
        }

        public Criteria andThreeIn(List<String> values) {
            addCriterion("three in", values, "three");
            return (Criteria) this;
        }

        public Criteria andThreeNotIn(List<String> values) {
            addCriterion("three not in", values, "three");
            return (Criteria) this;
        }

        public Criteria andThreeBetween(String value1, String value2) {
            addCriterion("three between", value1, value2, "three");
            return (Criteria) this;
        }

        public Criteria andThreeNotBetween(String value1, String value2) {
            addCriterion("three not between", value1, value2, "three");
            return (Criteria) this;
        }

        public Criteria andThreeHitRateIsNull() {
            addCriterion("three_hit_rate is null");
            return (Criteria) this;
        }

        public Criteria andThreeHitRateIsNotNull() {
            addCriterion("three_hit_rate is not null");
            return (Criteria) this;
        }

        public Criteria andThreeHitRateEqualTo(String value) {
            addCriterion("three_hit_rate =", value, "threeHitRate");
            return (Criteria) this;
        }

        public Criteria andThreeHitRateNotEqualTo(String value) {
            addCriterion("three_hit_rate <>", value, "threeHitRate");
            return (Criteria) this;
        }

        public Criteria andThreeHitRateGreaterThan(String value) {
            addCriterion("three_hit_rate >", value, "threeHitRate");
            return (Criteria) this;
        }

        public Criteria andThreeHitRateGreaterThanOrEqualTo(String value) {
            addCriterion("three_hit_rate >=", value, "threeHitRate");
            return (Criteria) this;
        }

        public Criteria andThreeHitRateLessThan(String value) {
            addCriterion("three_hit_rate <", value, "threeHitRate");
            return (Criteria) this;
        }

        public Criteria andThreeHitRateLessThanOrEqualTo(String value) {
            addCriterion("three_hit_rate <=", value, "threeHitRate");
            return (Criteria) this;
        }

        public Criteria andThreeHitRateLike(String value) {
            addCriterion("three_hit_rate like", value, "threeHitRate");
            return (Criteria) this;
        }

        public Criteria andThreeHitRateNotLike(String value) {
            addCriterion("three_hit_rate not like", value, "threeHitRate");
            return (Criteria) this;
        }

        public Criteria andThreeHitRateIn(List<String> values) {
            addCriterion("three_hit_rate in", values, "threeHitRate");
            return (Criteria) this;
        }

        public Criteria andThreeHitRateNotIn(List<String> values) {
            addCriterion("three_hit_rate not in", values, "threeHitRate");
            return (Criteria) this;
        }

        public Criteria andThreeHitRateBetween(String value1, String value2) {
            addCriterion("three_hit_rate between", value1, value2, "threeHitRate");
            return (Criteria) this;
        }

        public Criteria andThreeHitRateNotBetween(String value1, String value2) {
            addCriterion("three_hit_rate not between", value1, value2, "threeHitRate");
            return (Criteria) this;
        }

        public Criteria andPenaltyShotIsNull() {
            addCriterion("penalty_shot is null");
            return (Criteria) this;
        }

        public Criteria andPenaltyShotIsNotNull() {
            addCriterion("penalty_shot is not null");
            return (Criteria) this;
        }

        public Criteria andPenaltyShotEqualTo(String value) {
            addCriterion("penalty_shot =", value, "penaltyShot");
            return (Criteria) this;
        }

        public Criteria andPenaltyShotNotEqualTo(String value) {
            addCriterion("penalty_shot <>", value, "penaltyShot");
            return (Criteria) this;
        }

        public Criteria andPenaltyShotGreaterThan(String value) {
            addCriterion("penalty_shot >", value, "penaltyShot");
            return (Criteria) this;
        }

        public Criteria andPenaltyShotGreaterThanOrEqualTo(String value) {
            addCriterion("penalty_shot >=", value, "penaltyShot");
            return (Criteria) this;
        }

        public Criteria andPenaltyShotLessThan(String value) {
            addCriterion("penalty_shot <", value, "penaltyShot");
            return (Criteria) this;
        }

        public Criteria andPenaltyShotLessThanOrEqualTo(String value) {
            addCriterion("penalty_shot <=", value, "penaltyShot");
            return (Criteria) this;
        }

        public Criteria andPenaltyShotLike(String value) {
            addCriterion("penalty_shot like", value, "penaltyShot");
            return (Criteria) this;
        }

        public Criteria andPenaltyShotNotLike(String value) {
            addCriterion("penalty_shot not like", value, "penaltyShot");
            return (Criteria) this;
        }

        public Criteria andPenaltyShotIn(List<String> values) {
            addCriterion("penalty_shot in", values, "penaltyShot");
            return (Criteria) this;
        }

        public Criteria andPenaltyShotNotIn(List<String> values) {
            addCriterion("penalty_shot not in", values, "penaltyShot");
            return (Criteria) this;
        }

        public Criteria andPenaltyShotBetween(String value1, String value2) {
            addCriterion("penalty_shot between", value1, value2, "penaltyShot");
            return (Criteria) this;
        }

        public Criteria andPenaltyShotNotBetween(String value1, String value2) {
            addCriterion("penalty_shot not between", value1, value2, "penaltyShot");
            return (Criteria) this;
        }

        public Criteria andPsHitRateIsNull() {
            addCriterion("ps_hit_rate is null");
            return (Criteria) this;
        }

        public Criteria andPsHitRateIsNotNull() {
            addCriterion("ps_hit_rate is not null");
            return (Criteria) this;
        }

        public Criteria andPsHitRateEqualTo(String value) {
            addCriterion("ps_hit_rate =", value, "psHitRate");
            return (Criteria) this;
        }

        public Criteria andPsHitRateNotEqualTo(String value) {
            addCriterion("ps_hit_rate <>", value, "psHitRate");
            return (Criteria) this;
        }

        public Criteria andPsHitRateGreaterThan(String value) {
            addCriterion("ps_hit_rate >", value, "psHitRate");
            return (Criteria) this;
        }

        public Criteria andPsHitRateGreaterThanOrEqualTo(String value) {
            addCriterion("ps_hit_rate >=", value, "psHitRate");
            return (Criteria) this;
        }

        public Criteria andPsHitRateLessThan(String value) {
            addCriterion("ps_hit_rate <", value, "psHitRate");
            return (Criteria) this;
        }

        public Criteria andPsHitRateLessThanOrEqualTo(String value) {
            addCriterion("ps_hit_rate <=", value, "psHitRate");
            return (Criteria) this;
        }

        public Criteria andPsHitRateLike(String value) {
            addCriterion("ps_hit_rate like", value, "psHitRate");
            return (Criteria) this;
        }

        public Criteria andPsHitRateNotLike(String value) {
            addCriterion("ps_hit_rate not like", value, "psHitRate");
            return (Criteria) this;
        }

        public Criteria andPsHitRateIn(List<String> values) {
            addCriterion("ps_hit_rate in", values, "psHitRate");
            return (Criteria) this;
        }

        public Criteria andPsHitRateNotIn(List<String> values) {
            addCriterion("ps_hit_rate not in", values, "psHitRate");
            return (Criteria) this;
        }

        public Criteria andPsHitRateBetween(String value1, String value2) {
            addCriterion("ps_hit_rate between", value1, value2, "psHitRate");
            return (Criteria) this;
        }

        public Criteria andPsHitRateNotBetween(String value1, String value2) {
            addCriterion("ps_hit_rate not between", value1, value2, "psHitRate");
            return (Criteria) this;
        }

        public Criteria andBackboardIsNull() {
            addCriterion("backboard is null");
            return (Criteria) this;
        }

        public Criteria andBackboardIsNotNull() {
            addCriterion("backboard is not null");
            return (Criteria) this;
        }

        public Criteria andBackboardEqualTo(String value) {
            addCriterion("backboard =", value, "backboard");
            return (Criteria) this;
        }

        public Criteria andBackboardNotEqualTo(String value) {
            addCriterion("backboard <>", value, "backboard");
            return (Criteria) this;
        }

        public Criteria andBackboardGreaterThan(String value) {
            addCriterion("backboard >", value, "backboard");
            return (Criteria) this;
        }

        public Criteria andBackboardGreaterThanOrEqualTo(String value) {
            addCriterion("backboard >=", value, "backboard");
            return (Criteria) this;
        }

        public Criteria andBackboardLessThan(String value) {
            addCriterion("backboard <", value, "backboard");
            return (Criteria) this;
        }

        public Criteria andBackboardLessThanOrEqualTo(String value) {
            addCriterion("backboard <=", value, "backboard");
            return (Criteria) this;
        }

        public Criteria andBackboardLike(String value) {
            addCriterion("backboard like", value, "backboard");
            return (Criteria) this;
        }

        public Criteria andBackboardNotLike(String value) {
            addCriterion("backboard not like", value, "backboard");
            return (Criteria) this;
        }

        public Criteria andBackboardIn(List<String> values) {
            addCriterion("backboard in", values, "backboard");
            return (Criteria) this;
        }

        public Criteria andBackboardNotIn(List<String> values) {
            addCriterion("backboard not in", values, "backboard");
            return (Criteria) this;
        }

        public Criteria andBackboardBetween(String value1, String value2) {
            addCriterion("backboard between", value1, value2, "backboard");
            return (Criteria) this;
        }

        public Criteria andBackboardNotBetween(String value1, String value2) {
            addCriterion("backboard not between", value1, value2, "backboard");
            return (Criteria) this;
        }

        public Criteria andAssistsIsNull() {
            addCriterion("assists is null");
            return (Criteria) this;
        }

        public Criteria andAssistsIsNotNull() {
            addCriterion("assists is not null");
            return (Criteria) this;
        }

        public Criteria andAssistsEqualTo(String value) {
            addCriterion("assists =", value, "assists");
            return (Criteria) this;
        }

        public Criteria andAssistsNotEqualTo(String value) {
            addCriterion("assists <>", value, "assists");
            return (Criteria) this;
        }

        public Criteria andAssistsGreaterThan(String value) {
            addCriterion("assists >", value, "assists");
            return (Criteria) this;
        }

        public Criteria andAssistsGreaterThanOrEqualTo(String value) {
            addCriterion("assists >=", value, "assists");
            return (Criteria) this;
        }

        public Criteria andAssistsLessThan(String value) {
            addCriterion("assists <", value, "assists");
            return (Criteria) this;
        }

        public Criteria andAssistsLessThanOrEqualTo(String value) {
            addCriterion("assists <=", value, "assists");
            return (Criteria) this;
        }

        public Criteria andAssistsLike(String value) {
            addCriterion("assists like", value, "assists");
            return (Criteria) this;
        }

        public Criteria andAssistsNotLike(String value) {
            addCriterion("assists not like", value, "assists");
            return (Criteria) this;
        }

        public Criteria andAssistsIn(List<String> values) {
            addCriterion("assists in", values, "assists");
            return (Criteria) this;
        }

        public Criteria andAssistsNotIn(List<String> values) {
            addCriterion("assists not in", values, "assists");
            return (Criteria) this;
        }

        public Criteria andAssistsBetween(String value1, String value2) {
            addCriterion("assists between", value1, value2, "assists");
            return (Criteria) this;
        }

        public Criteria andAssistsNotBetween(String value1, String value2) {
            addCriterion("assists not between", value1, value2, "assists");
            return (Criteria) this;
        }

        public Criteria andStealsIsNull() {
            addCriterion("steals is null");
            return (Criteria) this;
        }

        public Criteria andStealsIsNotNull() {
            addCriterion("steals is not null");
            return (Criteria) this;
        }

        public Criteria andStealsEqualTo(String value) {
            addCriterion("steals =", value, "steals");
            return (Criteria) this;
        }

        public Criteria andStealsNotEqualTo(String value) {
            addCriterion("steals <>", value, "steals");
            return (Criteria) this;
        }

        public Criteria andStealsGreaterThan(String value) {
            addCriterion("steals >", value, "steals");
            return (Criteria) this;
        }

        public Criteria andStealsGreaterThanOrEqualTo(String value) {
            addCriterion("steals >=", value, "steals");
            return (Criteria) this;
        }

        public Criteria andStealsLessThan(String value) {
            addCriterion("steals <", value, "steals");
            return (Criteria) this;
        }

        public Criteria andStealsLessThanOrEqualTo(String value) {
            addCriterion("steals <=", value, "steals");
            return (Criteria) this;
        }

        public Criteria andStealsLike(String value) {
            addCriterion("steals like", value, "steals");
            return (Criteria) this;
        }

        public Criteria andStealsNotLike(String value) {
            addCriterion("steals not like", value, "steals");
            return (Criteria) this;
        }

        public Criteria andStealsIn(List<String> values) {
            addCriterion("steals in", values, "steals");
            return (Criteria) this;
        }

        public Criteria andStealsNotIn(List<String> values) {
            addCriterion("steals not in", values, "steals");
            return (Criteria) this;
        }

        public Criteria andStealsBetween(String value1, String value2) {
            addCriterion("steals between", value1, value2, "steals");
            return (Criteria) this;
        }

        public Criteria andStealsNotBetween(String value1, String value2) {
            addCriterion("steals not between", value1, value2, "steals");
            return (Criteria) this;
        }

        public Criteria andBlockShotIsNull() {
            addCriterion("block_shot is null");
            return (Criteria) this;
        }

        public Criteria andBlockShotIsNotNull() {
            addCriterion("block_shot is not null");
            return (Criteria) this;
        }

        public Criteria andBlockShotEqualTo(String value) {
            addCriterion("block_shot =", value, "blockShot");
            return (Criteria) this;
        }

        public Criteria andBlockShotNotEqualTo(String value) {
            addCriterion("block_shot <>", value, "blockShot");
            return (Criteria) this;
        }

        public Criteria andBlockShotGreaterThan(String value) {
            addCriterion("block_shot >", value, "blockShot");
            return (Criteria) this;
        }

        public Criteria andBlockShotGreaterThanOrEqualTo(String value) {
            addCriterion("block_shot >=", value, "blockShot");
            return (Criteria) this;
        }

        public Criteria andBlockShotLessThan(String value) {
            addCriterion("block_shot <", value, "blockShot");
            return (Criteria) this;
        }

        public Criteria andBlockShotLessThanOrEqualTo(String value) {
            addCriterion("block_shot <=", value, "blockShot");
            return (Criteria) this;
        }

        public Criteria andBlockShotLike(String value) {
            addCriterion("block_shot like", value, "blockShot");
            return (Criteria) this;
        }

        public Criteria andBlockShotNotLike(String value) {
            addCriterion("block_shot not like", value, "blockShot");
            return (Criteria) this;
        }

        public Criteria andBlockShotIn(List<String> values) {
            addCriterion("block_shot in", values, "blockShot");
            return (Criteria) this;
        }

        public Criteria andBlockShotNotIn(List<String> values) {
            addCriterion("block_shot not in", values, "blockShot");
            return (Criteria) this;
        }

        public Criteria andBlockShotBetween(String value1, String value2) {
            addCriterion("block_shot between", value1, value2, "blockShot");
            return (Criteria) this;
        }

        public Criteria andBlockShotNotBetween(String value1, String value2) {
            addCriterion("block_shot not between", value1, value2, "blockShot");
            return (Criteria) this;
        }

        public Criteria andErrorIsNull() {
            addCriterion("error is null");
            return (Criteria) this;
        }

        public Criteria andErrorIsNotNull() {
            addCriterion("error is not null");
            return (Criteria) this;
        }

        public Criteria andErrorEqualTo(String value) {
            addCriterion("error =", value, "error");
            return (Criteria) this;
        }

        public Criteria andErrorNotEqualTo(String value) {
            addCriterion("error <>", value, "error");
            return (Criteria) this;
        }

        public Criteria andErrorGreaterThan(String value) {
            addCriterion("error >", value, "error");
            return (Criteria) this;
        }

        public Criteria andErrorGreaterThanOrEqualTo(String value) {
            addCriterion("error >=", value, "error");
            return (Criteria) this;
        }

        public Criteria andErrorLessThan(String value) {
            addCriterion("error <", value, "error");
            return (Criteria) this;
        }

        public Criteria andErrorLessThanOrEqualTo(String value) {
            addCriterion("error <=", value, "error");
            return (Criteria) this;
        }

        public Criteria andErrorLike(String value) {
            addCriterion("error like", value, "error");
            return (Criteria) this;
        }

        public Criteria andErrorNotLike(String value) {
            addCriterion("error not like", value, "error");
            return (Criteria) this;
        }

        public Criteria andErrorIn(List<String> values) {
            addCriterion("error in", values, "error");
            return (Criteria) this;
        }

        public Criteria andErrorNotIn(List<String> values) {
            addCriterion("error not in", values, "error");
            return (Criteria) this;
        }

        public Criteria andErrorBetween(String value1, String value2) {
            addCriterion("error between", value1, value2, "error");
            return (Criteria) this;
        }

        public Criteria andErrorNotBetween(String value1, String value2) {
            addCriterion("error not between", value1, value2, "error");
            return (Criteria) this;
        }

        public Criteria andBreakRulesIsNull() {
            addCriterion("break_rules is null");
            return (Criteria) this;
        }

        public Criteria andBreakRulesIsNotNull() {
            addCriterion("break_rules is not null");
            return (Criteria) this;
        }

        public Criteria andBreakRulesEqualTo(String value) {
            addCriterion("break_rules =", value, "breakRules");
            return (Criteria) this;
        }

        public Criteria andBreakRulesNotEqualTo(String value) {
            addCriterion("break_rules <>", value, "breakRules");
            return (Criteria) this;
        }

        public Criteria andBreakRulesGreaterThan(String value) {
            addCriterion("break_rules >", value, "breakRules");
            return (Criteria) this;
        }

        public Criteria andBreakRulesGreaterThanOrEqualTo(String value) {
            addCriterion("break_rules >=", value, "breakRules");
            return (Criteria) this;
        }

        public Criteria andBreakRulesLessThan(String value) {
            addCriterion("break_rules <", value, "breakRules");
            return (Criteria) this;
        }

        public Criteria andBreakRulesLessThanOrEqualTo(String value) {
            addCriterion("break_rules <=", value, "breakRules");
            return (Criteria) this;
        }

        public Criteria andBreakRulesLike(String value) {
            addCriterion("break_rules like", value, "breakRules");
            return (Criteria) this;
        }

        public Criteria andBreakRulesNotLike(String value) {
            addCriterion("break_rules not like", value, "breakRules");
            return (Criteria) this;
        }

        public Criteria andBreakRulesIn(List<String> values) {
            addCriterion("break_rules in", values, "breakRules");
            return (Criteria) this;
        }

        public Criteria andBreakRulesNotIn(List<String> values) {
            addCriterion("break_rules not in", values, "breakRules");
            return (Criteria) this;
        }

        public Criteria andBreakRulesBetween(String value1, String value2) {
            addCriterion("break_rules between", value1, value2, "breakRules");
            return (Criteria) this;
        }

        public Criteria andBreakRulesNotBetween(String value1, String value2) {
            addCriterion("break_rules not between", value1, value2, "breakRules");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(String value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(String value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(String value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(String value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(String value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(String value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLike(String value) {
            addCriterion("score like", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotLike(String value) {
            addCriterion("score not like", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<String> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<String> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(String value1, String value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(String value1, String value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNull() {
            addCriterion("remark1 is null");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNotNull() {
            addCriterion("remark1 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark1EqualTo(String value) {
            addCriterion("remark1 =", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotEqualTo(String value) {
            addCriterion("remark1 <>", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThan(String value) {
            addCriterion("remark1 >", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThanOrEqualTo(String value) {
            addCriterion("remark1 >=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThan(String value) {
            addCriterion("remark1 <", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThanOrEqualTo(String value) {
            addCriterion("remark1 <=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Like(String value) {
            addCriterion("remark1 like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotLike(String value) {
            addCriterion("remark1 not like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1In(List<String> values) {
            addCriterion("remark1 in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotIn(List<String> values) {
            addCriterion("remark1 not in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Between(String value1, String value2) {
            addCriterion("remark1 between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotBetween(String value1, String value2) {
            addCriterion("remark1 not between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNull() {
            addCriterion("remark2 is null");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNotNull() {
            addCriterion("remark2 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark2EqualTo(String value) {
            addCriterion("remark2 =", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotEqualTo(String value) {
            addCriterion("remark2 <>", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThan(String value) {
            addCriterion("remark2 >", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThanOrEqualTo(String value) {
            addCriterion("remark2 >=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThan(String value) {
            addCriterion("remark2 <", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThanOrEqualTo(String value) {
            addCriterion("remark2 <=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Like(String value) {
            addCriterion("remark2 like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotLike(String value) {
            addCriterion("remark2 not like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2In(List<String> values) {
            addCriterion("remark2 in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotIn(List<String> values) {
            addCriterion("remark2 not in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Between(String value1, String value2) {
            addCriterion("remark2 between", value1, value2, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotBetween(String value1, String value2) {
            addCriterion("remark2 not between", value1, value2, "remark2");
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