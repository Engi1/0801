package questionpool;

public class a15 {
	String name;
	int age;
	String adrees;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAdrees() {
		return adrees;
	}

	public void setAdrees(String adrees) {
		this.adrees = adrees;
	}

	public a15(String name, int age, String adrees) {
		this.name = name;
		this.age = age;
		this.adrees = adrees;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a15 hush = new a15("김지형", 25, "초량");
//		hush.setName("김지형");
//		hush.setAge(25);
//		hush.setAdrees("초량");
		System.out.println("이름은 :" + hush.getName());
		System.out.println("나이는 :" + hush.getAge());
		System.out.println("지역은 :" + hush.getAdrees());

	}

}
