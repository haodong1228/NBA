package cn.qs.bean;

public class Team {
    private String teamId;

    private String teamName;

    private String intoTime;

    private String homeCourt;

    private String url;

    private String area;

    private String coachId;

    private String coachName;

    private String background;

    private String averageScore;

    private String averageAssists;

    private String averageBackboard;

    private String averageLoseScore;

    private String averageError;

    private String remark1;

    private String remark2;

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId == null ? null : teamId.trim();
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName == null ? null : teamName.trim();
    }

    public String getIntoTime() {
        return intoTime;
    }

    public void setIntoTime(String intoTime) {
        this.intoTime = intoTime == null ? null : intoTime.trim();
    }

    public String getHomeCourt() {
        return homeCourt;
    }

    public void setHomeCourt(String homeCourt) {
        this.homeCourt = homeCourt == null ? null : homeCourt.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getCoachId() {
        return coachId;
    }

    public void setCoachId(String coachId) {
        this.coachId = coachId == null ? null : coachId.trim();
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName == null ? null : coachName.trim();
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background == null ? null : background.trim();
    }

    public String getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(String averageScore) {
        this.averageScore = averageScore == null ? null : averageScore.trim();
    }

    public String getAverageAssists() {
        return averageAssists;
    }

    public void setAverageAssists(String averageAssists) {
        this.averageAssists = averageAssists == null ? null : averageAssists.trim();
    }

    public String getAverageBackboard() {
        return averageBackboard;
    }

    public void setAverageBackboard(String averageBackboard) {
        this.averageBackboard = averageBackboard == null ? null : averageBackboard.trim();
    }

    public String getAverageLoseScore() {
        return averageLoseScore;
    }

    public void setAverageLoseScore(String averageLoseScore) {
        this.averageLoseScore = averageLoseScore == null ? null : averageLoseScore.trim();
    }

    public String getAverageError() {
        return averageError;
    }

    public void setAverageError(String averageError) {
        this.averageError = averageError == null ? null : averageError.trim();
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1 == null ? null : remark1.trim();
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2 == null ? null : remark2.trim();
    }
}