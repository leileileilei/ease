package beans;

import java.sql.Date;

public class Order {
	private int oid;
	private String id; 
	private String text;
	private String remark;
	private int mnum;
	private Date odate;
	public int getOid() {//0 订单号
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getId() {//1 账号
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getText() {//2药方
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getMnum() {//3药副数
		return mnum;
	}
	public void setMnum(int mnum) {
		this.mnum = mnum;
	}
	public String getRemark() {//4备注
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Date getOdate() {//4备注
		return odate;
	}
	public void setOdate(Date odate) {
		this.odate = odate;
	}
	
}
