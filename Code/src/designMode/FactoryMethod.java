package designMode;

interface Provider {
	public Sender Produce();
}

class SendMailFactory implements Provider{
	@Override
	public Sender Produce() {
		return new MailSender();
	}
}

class SendSmsFactory implements Provider {
	@Override
	public Sender Produce() {
		return new SmsSender();
	}
}

public class FactoryMethod {

}
