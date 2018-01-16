package com.tws.model;

import java.util.Date;

public class Work {
private int id;
private String worktitle;
private String workrequire;
private String workmaterial;
private Date time;
private int teacher_id;
private int course_id;
private int workstyle_id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getWorktitle() {
	return worktitle;
}
public void setWorktitle(String worktitle) {
	this.worktitle = worktitle;
}
public String getWorkrequire() {
	return workrequire;
}
public void setWorkrequire(String workrequire) {
	this.workrequire = workrequire;
}
public String getWorkmaterial() {
	return workmaterial;
}
public void setWorkmaterial(String workmaterial) {
	this.workmaterial = workmaterial;
}
public Date getTime() {
	return time;
}
public void setTime(Date time) {
	this.time = time;
}
public int getTeacher_id() {
	return teacher_id;
}
public void setTeacher_id(int teacher_id) {
	this.teacher_id = teacher_id;
}
public int getCourse_id() {
	return course_id;
}
public void setCourse_id(int course_id) {
	this.course_id = course_id;
}
public int getWorkstyle_id() {
	return workstyle_id;
}
public void setWorkstyle_id(int workstyle_id) {
	this.workstyle_id = workstyle_id;
}


}
