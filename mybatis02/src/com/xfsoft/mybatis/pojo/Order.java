package com.xfsoft.mybatis.pojo;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private Integer userid;
	private String number;
	private Date createtime;
	private String note;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", userid=" + userid + ", number=" + number + ", createtime=" + createtime
				+ ", note=" + note + "]";
	}

}
