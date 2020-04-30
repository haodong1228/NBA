package cn.qs.bean;

import java.util.ArrayList;
import java.util.List;

public class TeamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeamExample() {
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

        public Criteria andTeamNameIsNull() {
            addCriterion("team_name is null");
            return (Criteria) this;
        }

        public Criteria andTeamNameIsNotNull() {
            addCriterion("team_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeamNameEqualTo(String value) {
            addCriterion("team_name =", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotEqualTo(String value) {
            addCriterion("team_name <>", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameGreaterThan(String value) {
            addCriterion("team_name >", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameGreaterThanOrEqualTo(String value) {
            addCriterion("team_name >=", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLessThan(String value) {
            addCriterion("team_name <", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLessThanOrEqualTo(String value) {
            addCriterion("team_name <=", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLike(String value) {
            addCriterion("team_name like", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotLike(String value) {
            addCriterion("team_name not like", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameIn(List<String> values) {
            addCriterion("team_name in", values, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotIn(List<String> values) {
            addCriterion("team_name not in", values, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameBetween(String value1, String value2) {
            addCriterion("team_name between", value1, value2, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotBetween(String value1, String value2) {
            addCriterion("team_name not between", value1, value2, "teamName");
            return (Criteria) this;
        }

        public Criteria andIntoTimeIsNull() {
            addCriterion("into_time is null");
            return (Criteria) this;
        }

        public Criteria andIntoTimeIsNotNull() {
            addCriterion("into_time is not null");
            return (Criteria) this;
        }

        public Criteria andIntoTimeEqualTo(String value) {
            addCriterion("into_time =", value, "intoTime");
            return (Criteria) this;
        }

        public Criteria andIntoTimeNotEqualTo(String value) {
            addCriterion("into_time <>", value, "intoTime");
            return (Criteria) this;
        }

        public Criteria andIntoTimeGreaterThan(String value) {
            addCriterion("into_time >", value, "intoTime");
            return (Criteria) this;
        }

        public Criteria andIntoTimeGreaterThanOrEqualTo(String value) {
            addCriterion("into_time >=", value, "intoTime");
            return (Criteria) this;
        }

        public Criteria andIntoTimeLessThan(String value) {
            addCriterion("into_time <", value, "intoTime");
            return (Criteria) this;
        }

        public Criteria andIntoTimeLessThanOrEqualTo(String value) {
            addCriterion("into_time <=", value, "intoTime");
            return (Criteria) this;
        }

        public Criteria andIntoTimeLike(String value) {
            addCriterion("into_time like", value, "intoTime");
            return (Criteria) this;
        }

        public Criteria andIntoTimeNotLike(String value) {
            addCriterion("into_time not like", value, "intoTime");
            return (Criteria) this;
        }

        public Criteria andIntoTimeIn(List<String> values) {
            addCriterion("into_time in", values, "intoTime");
            return (Criteria) this;
        }

        public Criteria andIntoTimeNotIn(List<String> values) {
            addCriterion("into_time not in", values, "intoTime");
            return (Criteria) this;
        }

        public Criteria andIntoTimeBetween(String value1, String value2) {
            addCriterion("into_time between", value1, value2, "intoTime");
            return (Criteria) this;
        }

        public Criteria andIntoTimeNotBetween(String value1, String value2) {
            addCriterion("into_time not between", value1, value2, "intoTime");
            return (Criteria) this;
        }

        public Criteria andHomeCourtIsNull() {
            addCriterion("home_court is null");
            return (Criteria) this;
        }

        public Criteria andHomeCourtIsNotNull() {
            addCriterion("home_court is not null");
            return (Criteria) this;
        }

        public Criteria andHomeCourtEqualTo(String value) {
            addCriterion("home_court =", value, "homeCourt");
            return (Criteria) this;
        }

        public Criteria andHomeCourtNotEqualTo(String value) {
            addCriterion("home_court <>", value, "homeCourt");
            return (Criteria) this;
        }

        public Criteria andHomeCourtGreaterThan(String value) {
            addCriterion("home_court >", value, "homeCourt");
            return (Criteria) this;
        }

        public Criteria andHomeCourtGreaterThanOrEqualTo(String value) {
            addCriterion("home_court >=", value, "homeCourt");
            return (Criteria) this;
        }

        public Criteria andHomeCourtLessThan(String value) {
            addCriterion("home_court <", value, "homeCourt");
            return (Criteria) this;
        }

        public Criteria andHomeCourtLessThanOrEqualTo(String value) {
            addCriterion("home_court <=", value, "homeCourt");
            return (Criteria) this;
        }

        public Criteria andHomeCourtLike(String value) {
            addCriterion("home_court like", value, "homeCourt");
            return (Criteria) this;
        }

        public Criteria andHomeCourtNotLike(String value) {
            addCriterion("home_court not like", value, "homeCourt");
            return (Criteria) this;
        }

        public Criteria andHomeCourtIn(List<String> values) {
            addCriterion("home_court in", values, "homeCourt");
            return (Criteria) this;
        }

        public Criteria andHomeCourtNotIn(List<String> values) {
            addCriterion("home_court not in", values, "homeCourt");
            return (Criteria) this;
        }

        public Criteria andHomeCourtBetween(String value1, String value2) {
            addCriterion("home_court between", value1, value2, "homeCourt");
            return (Criteria) this;
        }

        public Criteria andHomeCourtNotBetween(String value1, String value2) {
            addCriterion("home_court not between", value1, value2, "homeCourt");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andCoachIdIsNull() {
            addCriterion("coach_id is null");
            return (Criteria) this;
        }

        public Criteria andCoachIdIsNotNull() {
            addCriterion("coach_id is not null");
            return (Criteria) this;
        }

        public Criteria andCoachIdEqualTo(String value) {
            addCriterion("coach_id =", value, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdNotEqualTo(String value) {
            addCriterion("coach_id <>", value, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdGreaterThan(String value) {
            addCriterion("coach_id >", value, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdGreaterThanOrEqualTo(String value) {
            addCriterion("coach_id >=", value, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdLessThan(String value) {
            addCriterion("coach_id <", value, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdLessThanOrEqualTo(String value) {
            addCriterion("coach_id <=", value, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdLike(String value) {
            addCriterion("coach_id like", value, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdNotLike(String value) {
            addCriterion("coach_id not like", value, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdIn(List<String> values) {
            addCriterion("coach_id in", values, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdNotIn(List<String> values) {
            addCriterion("coach_id not in", values, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdBetween(String value1, String value2) {
            addCriterion("coach_id between", value1, value2, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachIdNotBetween(String value1, String value2) {
            addCriterion("coach_id not between", value1, value2, "coachId");
            return (Criteria) this;
        }

        public Criteria andCoachNameIsNull() {
            addCriterion("coach_name is null");
            return (Criteria) this;
        }

        public Criteria andCoachNameIsNotNull() {
            addCriterion("coach_name is not null");
            return (Criteria) this;
        }

        public Criteria andCoachNameEqualTo(String value) {
            addCriterion("coach_name =", value, "coachName");
            return (Criteria) this;
        }

        public Criteria andCoachNameNotEqualTo(String value) {
            addCriterion("coach_name <>", value, "coachName");
            return (Criteria) this;
        }

        public Criteria andCoachNameGreaterThan(String value) {
            addCriterion("coach_name >", value, "coachName");
            return (Criteria) this;
        }

        public Criteria andCoachNameGreaterThanOrEqualTo(String value) {
            addCriterion("coach_name >=", value, "coachName");
            return (Criteria) this;
        }

        public Criteria andCoachNameLessThan(String value) {
            addCriterion("coach_name <", value, "coachName");
            return (Criteria) this;
        }

        public Criteria andCoachNameLessThanOrEqualTo(String value) {
            addCriterion("coach_name <=", value, "coachName");
            return (Criteria) this;
        }

        public Criteria andCoachNameLike(String value) {
            addCriterion("coach_name like", value, "coachName");
            return (Criteria) this;
        }

        public Criteria andCoachNameNotLike(String value) {
            addCriterion("coach_name not like", value, "coachName");
            return (Criteria) this;
        }

        public Criteria andCoachNameIn(List<String> values) {
            addCriterion("coach_name in", values, "coachName");
            return (Criteria) this;
        }

        public Criteria andCoachNameNotIn(List<String> values) {
            addCriterion("coach_name not in", values, "coachName");
            return (Criteria) this;
        }

        public Criteria andCoachNameBetween(String value1, String value2) {
            addCriterion("coach_name between", value1, value2, "coachName");
            return (Criteria) this;
        }

        public Criteria andCoachNameNotBetween(String value1, String value2) {
            addCriterion("coach_name not between", value1, value2, "coachName");
            return (Criteria) this;
        }

        public Criteria andBackgroundIsNull() {
            addCriterion("background is null");
            return (Criteria) this;
        }

        public Criteria andBackgroundIsNotNull() {
            addCriterion("background is not null");
            return (Criteria) this;
        }

        public Criteria andBackgroundEqualTo(String value) {
            addCriterion("background =", value, "background");
            return (Criteria) this;
        }

        public Criteria andBackgroundNotEqualTo(String value) {
            addCriterion("background <>", value, "background");
            return (Criteria) this;
        }

        public Criteria andBackgroundGreaterThan(String value) {
            addCriterion("background >", value, "background");
            return (Criteria) this;
        }

        public Criteria andBackgroundGreaterThanOrEqualTo(String value) {
            addCriterion("background >=", value, "background");
            return (Criteria) this;
        }

        public Criteria andBackgroundLessThan(String value) {
            addCriterion("background <", value, "background");
            return (Criteria) this;
        }

        public Criteria andBackgroundLessThanOrEqualTo(String value) {
            addCriterion("background <=", value, "background");
            return (Criteria) this;
        }

        public Criteria andBackgroundLike(String value) {
            addCriterion("background like", value, "background");
            return (Criteria) this;
        }

        public Criteria andBackgroundNotLike(String value) {
            addCriterion("background not like", value, "background");
            return (Criteria) this;
        }

        public Criteria andBackgroundIn(List<String> values) {
            addCriterion("background in", values, "background");
            return (Criteria) this;
        }

        public Criteria andBackgroundNotIn(List<String> values) {
            addCriterion("background not in", values, "background");
            return (Criteria) this;
        }

        public Criteria andBackgroundBetween(String value1, String value2) {
            addCriterion("background between", value1, value2, "background");
            return (Criteria) this;
        }

        public Criteria andBackgroundNotBetween(String value1, String value2) {
            addCriterion("background not between", value1, value2, "background");
            return (Criteria) this;
        }

        public Criteria andAverageScoreIsNull() {
            addCriterion("Average_score is null");
            return (Criteria) this;
        }

        public Criteria andAverageScoreIsNotNull() {
            addCriterion("Average_score is not null");
            return (Criteria) this;
        }

        public Criteria andAverageScoreEqualTo(String value) {
            addCriterion("Average_score =", value, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageScoreNotEqualTo(String value) {
            addCriterion("Average_score <>", value, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageScoreGreaterThan(String value) {
            addCriterion("Average_score >", value, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageScoreGreaterThanOrEqualTo(String value) {
            addCriterion("Average_score >=", value, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageScoreLessThan(String value) {
            addCriterion("Average_score <", value, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageScoreLessThanOrEqualTo(String value) {
            addCriterion("Average_score <=", value, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageScoreLike(String value) {
            addCriterion("Average_score like", value, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageScoreNotLike(String value) {
            addCriterion("Average_score not like", value, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageScoreIn(List<String> values) {
            addCriterion("Average_score in", values, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageScoreNotIn(List<String> values) {
            addCriterion("Average_score not in", values, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageScoreBetween(String value1, String value2) {
            addCriterion("Average_score between", value1, value2, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageScoreNotBetween(String value1, String value2) {
            addCriterion("Average_score not between", value1, value2, "averageScore");
            return (Criteria) this;
        }

        public Criteria andAverageAssistsIsNull() {
            addCriterion("Average_Assists is null");
            return (Criteria) this;
        }

        public Criteria andAverageAssistsIsNotNull() {
            addCriterion("Average_Assists is not null");
            return (Criteria) this;
        }

        public Criteria andAverageAssistsEqualTo(String value) {
            addCriterion("Average_Assists =", value, "averageAssists");
            return (Criteria) this;
        }

        public Criteria andAverageAssistsNotEqualTo(String value) {
            addCriterion("Average_Assists <>", value, "averageAssists");
            return (Criteria) this;
        }

        public Criteria andAverageAssistsGreaterThan(String value) {
            addCriterion("Average_Assists >", value, "averageAssists");
            return (Criteria) this;
        }

        public Criteria andAverageAssistsGreaterThanOrEqualTo(String value) {
            addCriterion("Average_Assists >=", value, "averageAssists");
            return (Criteria) this;
        }

        public Criteria andAverageAssistsLessThan(String value) {
            addCriterion("Average_Assists <", value, "averageAssists");
            return (Criteria) this;
        }

        public Criteria andAverageAssistsLessThanOrEqualTo(String value) {
            addCriterion("Average_Assists <=", value, "averageAssists");
            return (Criteria) this;
        }

        public Criteria andAverageAssistsLike(String value) {
            addCriterion("Average_Assists like", value, "averageAssists");
            return (Criteria) this;
        }

        public Criteria andAverageAssistsNotLike(String value) {
            addCriterion("Average_Assists not like", value, "averageAssists");
            return (Criteria) this;
        }

        public Criteria andAverageAssistsIn(List<String> values) {
            addCriterion("Average_Assists in", values, "averageAssists");
            return (Criteria) this;
        }

        public Criteria andAverageAssistsNotIn(List<String> values) {
            addCriterion("Average_Assists not in", values, "averageAssists");
            return (Criteria) this;
        }

        public Criteria andAverageAssistsBetween(String value1, String value2) {
            addCriterion("Average_Assists between", value1, value2, "averageAssists");
            return (Criteria) this;
        }

        public Criteria andAverageAssistsNotBetween(String value1, String value2) {
            addCriterion("Average_Assists not between", value1, value2, "averageAssists");
            return (Criteria) this;
        }

        public Criteria andAverageBackboardIsNull() {
            addCriterion("Average_backboard is null");
            return (Criteria) this;
        }

        public Criteria andAverageBackboardIsNotNull() {
            addCriterion("Average_backboard is not null");
            return (Criteria) this;
        }

        public Criteria andAverageBackboardEqualTo(String value) {
            addCriterion("Average_backboard =", value, "averageBackboard");
            return (Criteria) this;
        }

        public Criteria andAverageBackboardNotEqualTo(String value) {
            addCriterion("Average_backboard <>", value, "averageBackboard");
            return (Criteria) this;
        }

        public Criteria andAverageBackboardGreaterThan(String value) {
            addCriterion("Average_backboard >", value, "averageBackboard");
            return (Criteria) this;
        }

        public Criteria andAverageBackboardGreaterThanOrEqualTo(String value) {
            addCriterion("Average_backboard >=", value, "averageBackboard");
            return (Criteria) this;
        }

        public Criteria andAverageBackboardLessThan(String value) {
            addCriterion("Average_backboard <", value, "averageBackboard");
            return (Criteria) this;
        }

        public Criteria andAverageBackboardLessThanOrEqualTo(String value) {
            addCriterion("Average_backboard <=", value, "averageBackboard");
            return (Criteria) this;
        }

        public Criteria andAverageBackboardLike(String value) {
            addCriterion("Average_backboard like", value, "averageBackboard");
            return (Criteria) this;
        }

        public Criteria andAverageBackboardNotLike(String value) {
            addCriterion("Average_backboard not like", value, "averageBackboard");
            return (Criteria) this;
        }

        public Criteria andAverageBackboardIn(List<String> values) {
            addCriterion("Average_backboard in", values, "averageBackboard");
            return (Criteria) this;
        }

        public Criteria andAverageBackboardNotIn(List<String> values) {
            addCriterion("Average_backboard not in", values, "averageBackboard");
            return (Criteria) this;
        }

        public Criteria andAverageBackboardBetween(String value1, String value2) {
            addCriterion("Average_backboard between", value1, value2, "averageBackboard");
            return (Criteria) this;
        }

        public Criteria andAverageBackboardNotBetween(String value1, String value2) {
            addCriterion("Average_backboard not between", value1, value2, "averageBackboard");
            return (Criteria) this;
        }

        public Criteria andAverageLoseScoreIsNull() {
            addCriterion("Average_lose_score is null");
            return (Criteria) this;
        }

        public Criteria andAverageLoseScoreIsNotNull() {
            addCriterion("Average_lose_score is not null");
            return (Criteria) this;
        }

        public Criteria andAverageLoseScoreEqualTo(String value) {
            addCriterion("Average_lose_score =", value, "averageLoseScore");
            return (Criteria) this;
        }

        public Criteria andAverageLoseScoreNotEqualTo(String value) {
            addCriterion("Average_lose_score <>", value, "averageLoseScore");
            return (Criteria) this;
        }

        public Criteria andAverageLoseScoreGreaterThan(String value) {
            addCriterion("Average_lose_score >", value, "averageLoseScore");
            return (Criteria) this;
        }

        public Criteria andAverageLoseScoreGreaterThanOrEqualTo(String value) {
            addCriterion("Average_lose_score >=", value, "averageLoseScore");
            return (Criteria) this;
        }

        public Criteria andAverageLoseScoreLessThan(String value) {
            addCriterion("Average_lose_score <", value, "averageLoseScore");
            return (Criteria) this;
        }

        public Criteria andAverageLoseScoreLessThanOrEqualTo(String value) {
            addCriterion("Average_lose_score <=", value, "averageLoseScore");
            return (Criteria) this;
        }

        public Criteria andAverageLoseScoreLike(String value) {
            addCriterion("Average_lose_score like", value, "averageLoseScore");
            return (Criteria) this;
        }

        public Criteria andAverageLoseScoreNotLike(String value) {
            addCriterion("Average_lose_score not like", value, "averageLoseScore");
            return (Criteria) this;
        }

        public Criteria andAverageLoseScoreIn(List<String> values) {
            addCriterion("Average_lose_score in", values, "averageLoseScore");
            return (Criteria) this;
        }

        public Criteria andAverageLoseScoreNotIn(List<String> values) {
            addCriterion("Average_lose_score not in", values, "averageLoseScore");
            return (Criteria) this;
        }

        public Criteria andAverageLoseScoreBetween(String value1, String value2) {
            addCriterion("Average_lose_score between", value1, value2, "averageLoseScore");
            return (Criteria) this;
        }

        public Criteria andAverageLoseScoreNotBetween(String value1, String value2) {
            addCriterion("Average_lose_score not between", value1, value2, "averageLoseScore");
            return (Criteria) this;
        }

        public Criteria andAverageErrorIsNull() {
            addCriterion("Average_error is null");
            return (Criteria) this;
        }

        public Criteria andAverageErrorIsNotNull() {
            addCriterion("Average_error is not null");
            return (Criteria) this;
        }

        public Criteria andAverageErrorEqualTo(String value) {
            addCriterion("Average_error =", value, "averageError");
            return (Criteria) this;
        }

        public Criteria andAverageErrorNotEqualTo(String value) {
            addCriterion("Average_error <>", value, "averageError");
            return (Criteria) this;
        }

        public Criteria andAverageErrorGreaterThan(String value) {
            addCriterion("Average_error >", value, "averageError");
            return (Criteria) this;
        }

        public Criteria andAverageErrorGreaterThanOrEqualTo(String value) {
            addCriterion("Average_error >=", value, "averageError");
            return (Criteria) this;
        }

        public Criteria andAverageErrorLessThan(String value) {
            addCriterion("Average_error <", value, "averageError");
            return (Criteria) this;
        }

        public Criteria andAverageErrorLessThanOrEqualTo(String value) {
            addCriterion("Average_error <=", value, "averageError");
            return (Criteria) this;
        }

        public Criteria andAverageErrorLike(String value) {
            addCriterion("Average_error like", value, "averageError");
            return (Criteria) this;
        }

        public Criteria andAverageErrorNotLike(String value) {
            addCriterion("Average_error not like", value, "averageError");
            return (Criteria) this;
        }

        public Criteria andAverageErrorIn(List<String> values) {
            addCriterion("Average_error in", values, "averageError");
            return (Criteria) this;
        }

        public Criteria andAverageErrorNotIn(List<String> values) {
            addCriterion("Average_error not in", values, "averageError");
            return (Criteria) this;
        }

        public Criteria andAverageErrorBetween(String value1, String value2) {
            addCriterion("Average_error between", value1, value2, "averageError");
            return (Criteria) this;
        }

        public Criteria andAverageErrorNotBetween(String value1, String value2) {
            addCriterion("Average_error not between", value1, value2, "averageError");
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