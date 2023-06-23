package tips;


class Player{
	private String name;
	private static int count; // static 이 없엇으면 getCount를 통해서 각각의 객체에 대한 값만 나와서 선수생성을 2천명해도 1로 나옴.. static을 붙여서 모든 객체에서 공유하는 자료가된다
	public Player(String name) {
		super();
		this.name = name;
		count++;
	}
	static public int getCount() { //정적변수인 count를 이용하는 정적메소드 getcouunt는 클래스이름으로도 호출 가능하다... 이유는 모든 객체에서 공유하기 때문이라는대..
		return count;
	}
	
	
}

public class StaticModifierRunner {
	public static void main(String[] args) {
		Player player1 = new Player("Ho");
		Player player2 = new Player("HoHO");
		System.out.println(Player.getCount());
		System.out.println(Player.getCount());
		System.out.println(player2.getCount());
	}
}
