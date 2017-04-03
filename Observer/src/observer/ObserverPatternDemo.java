package observer;

public class ObserverPatternDemo {
	public static void main(String[] args) {
		Subject subject = new Subject();

		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);

		System.out.println("Primer anuncio...");
		System.out.println("Subject anuncia: 15");
		subject.setState(15);
		System.out.println("\nSegundo anuncio...");
		System.out.println("Subject anuncia: 10");
		subject.setState(10);
	}
}