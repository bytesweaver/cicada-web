package com.mantis.cicada.entity;

import java.util.Date;

/**
 * 作者
 * @author quan
 *
 */
public class Author {
	
	private String authorId;
	
	private String authorName;//姓名
	
	private Date   birthDate;//出生日期
	
	private String birthPalace;//出生地点
	
	private String nationality;//国籍
	
	private String sex;//性别

	public String getAuthorId() {
		return authorId;
	}

	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getBirthPalace() {
		return birthPalace;
	}

	public void setBirthPalace(String birthPalace) {
		this.birthPalace = birthPalace;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", authorName=" + authorName + ", birthDate=" + birthDate
				+ ", birthPalace=" + birthPalace + ", nationality=" + nationality + ", sex=" + sex + "]";
	}
	
	
}
