package designMode;

//��ͬ�ӿ�
interface Sender {
	public void Send();
}

//ʵ����
class MailSender implements Sender {
	@Override
	public void Send() {
		System.out.println("this is mail sender");
	}
}

class SmsSender implements Sender {
	@Override
	public void Send() {
		System.out.println("this is sms sender");
	}
}

//������
public class SimpleFatory {
	public static Sender produceMail() {
		return new MailSender();
	}
	
	public static Sender produceSms() {
		return new SmsSender();
	}
}
