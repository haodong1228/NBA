package cn.qs.bean;

public class Coach {
    private String coachId;

    private String teamId;

    private String name;

    private String sex;

    private String birth;

    private String personalGlory;

    private String background;

    private String teachingScore;

    private String remark1;

    private String remark2;
    
    private Team team;

    public String getCoachId() {
        return coachId;
    }

    public void setCoachId(String coachId) {
        this.coachId = coachId == null ? null : coachId.trim();
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId == null ? null : teamId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth == null ? null : birth.trim();
    }

    public String getPersonalGlory() {
        return personalGlory;
    }

    public void setPersonalGlory(String personalGlory) {
        this.personalGlory = personalGlory == null ? null : personalGlory.trim();
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background == null ? null : background.trim();
    }

    public String getTeachingScore() {
        return teachingScore;
    }

    public void setTeachingScore(String teachingScore) {
        this.teachingScore = teachingScore == null ? null : teachingScore.trim();
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

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}
    
    
}