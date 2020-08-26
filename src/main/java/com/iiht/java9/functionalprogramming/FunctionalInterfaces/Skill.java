package com.iiht.java9.functionalprogramming.FunctionalInterfaces;

public class Skill {
	private final String skillName;
	private final String technology;
	private int skillRank;
	public Skill(String skillName, String technology, int skillRank) {
		super();
		this.skillName = skillName;
		this.technology = technology;
		this.skillRank = skillRank;
	}
	public int getSkillRank() {
		return skillRank;
	}
	public void setSkillRank(int skillRank) {
		this.skillRank = skillRank;
	}
	public String getSkillName() {
		return skillName;
	}
	public String getTechnology() {
		return technology;
	}
	
	
	

}
