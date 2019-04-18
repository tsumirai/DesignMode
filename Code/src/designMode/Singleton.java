package designMode;

public class Singleton {
	private static Singleton instance = null;

	/* ˽�й��췽������ֹ��ʵ���� */
	private Singleton() {
	};

	private static synchronized void syncInit() {
		if (instance == null) {
			instance = new Singleton();
		}
	}

	public static Singleton getInstance() {
		if (instance == null) {
			syncInit();
		}
		return instance;
	}
}
