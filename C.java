class Classify {
	public static void remove(String or) {
		int a = 0, b = 0;
		char aCharacter;
		for (int x = 0; x < or.length(); x++) {
			aCharacter = or.charAt(x);
			if (Character.isUpperCase(aCharacter))
				a++;
			else {
				b++;
			}
		}
		System.out.println("大写字母数为：" + a + "小写字母数为：" + b);
	}
}

public class ClassifyTest {

	public static void main(String[] args) {
		String or = "aWdefEhiACpqrstBDwxyz";
		Classify.remove(or);

	}

}
