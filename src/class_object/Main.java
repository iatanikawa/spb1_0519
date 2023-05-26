package class_object;

public class Main {

	public static void main(String[] args) {
		
		Chara tanikawa = new Chara();
		
		tanikawa.name ="谷川";
		int num = tanikawa.add(3, 3);
		
		System.out.println(tanikawa.name);
		System.out.println(num);

	}

}
