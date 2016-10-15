package beans;

public class User{
		private String id; 
		private String passWord;
		private String name; 
		private String sex;
		private int age;
		private String phone;
		private String email;
		private String address;
		//private float amounts;
	
		public User() { }
		
		public String getId() {//1 账号
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		
		public String getPassWord() {//2 密码
			return passWord;
		}
		public void setPassWord(String passWord) {
			this.passWord = passWord;
		}
		public String getName() {//3姓名
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public String getSex() {//4 性别
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public int getAge() {//5年龄
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		public String getPhone() {//6 电话
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		
		public String getEmail() {//7邮箱
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		public String getAddress() {//8地址ַ
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		
		//public float getAmounts() {//9 余额
			//return amounts;
		//}
		

}
