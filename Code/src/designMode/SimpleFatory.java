package designMode;

//共同接口
interface Sender {
	public void Send();
}

//实现类
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

//工厂类
public class SimpleFatory {
	public static Sender produceMail() {
		return new MailSender();
	}
	
	public static Sender produceSms() {
		return new SmsSender();
	}
}
