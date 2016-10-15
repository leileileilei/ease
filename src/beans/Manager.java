package beans;

public class Manager {
	private String id; 
	private String passWord;
	public String getId() {//1 账号
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPassWord() {//2密码
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
}
