package com.mameiyu.senior1.week1.domain;

public class Cla {
	private  Integer cid;
	private String ctype;
	private  Integer score;
	public Cla() {
		// TODO Auto-generated constructor stub
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCtype() {
		return ctype;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Cla [cid=" + cid + ", ctype=" + ctype + ", score=" + score + "]";
	}
	
}
