package designMode;

public class ProtoType implements Cloneable {
	private String name;
	private String birth;
	private String gender;
	private String school;
	private String timeArea;
	private String company;

	/* 构造函数 */
	public ProtoType(String name) {
		this.name = name;
	}

	/* 设定个人基本信息 */
	public void setPersonInfo(String birth, String gender, String school) {
		this.birth = birth;
		this.gender = gender;
		this.school = school;
	}

	/* 设定工作经历 */
	public void setWorkExperience(String timeArea, String company) {
		this.timeArea = timeArea;
		this.company = company;
	}

	/* 重载克隆函数 */
	public Object clone() {
		ProtoType proto = null;
		try {
			proto = (ProtoType) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return proto;
	}

	public void display() {
		System.out.println("姓名：" + name);
		System.out.println("生日：" + birth + ", 性别：" + gender + "， 毕业学校：" + school);
		System.out.println("工作年限：" + timeArea + ", 公司：" + company);
	}
}
