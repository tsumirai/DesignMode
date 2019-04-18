package designMode;

public class ProtoType implements Cloneable {
	private String name;
	private String birth;
	private String gender;
	private String school;
	private String timeArea;
	private String company;

	/* ���캯�� */
	public ProtoType(String name) {
		this.name = name;
	}

	/* �趨���˻�����Ϣ */
	public void setPersonInfo(String birth, String gender, String school) {
		this.birth = birth;
		this.gender = gender;
		this.school = school;
	}

	/* �趨�������� */
	public void setWorkExperience(String timeArea, String company) {
		this.timeArea = timeArea;
		this.company = company;
	}

	/* ���ؿ�¡���� */
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
		System.out.println("������" + name);
		System.out.println("���գ�" + birth + ", �Ա�" + gender + "�� ��ҵѧУ��" + school);
		System.out.println("�������ޣ�" + timeArea + ", ��˾��" + company);
	}
}
