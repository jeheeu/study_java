// java2 2주차, 조건
// new Rect(2,3), 가로2, 높이3인 직사각형을 나타내는 Rect 객체 생성
// boolean equals(Object o) -> 위에 조건이 동일한지 판정 
class Rect {

	int w;

	int h;

	public Rect(int w, int h) {

		this.w = w;

		this.h = h;

	}

	

	public boolean equals(Object obj) {

		Rect p = (Rect) obj;

		if (w == p.w && h == p.h)

			return true;

		else if (w == p.h && h == p.w)

			return true;

		else

			return false;

	}

	public String toString() {

		return "w = " + w + ", h =" + h;

	}

}

public class RectTest {

	public static void main(String[] args) {

		Rect a = new Rect(2,3);

		Rect b = new Rect(3,2);

		Rect c = new Rect(1,6);

		

		System.out.println(a);

		System.out.println(b);

		System.out.printl
      }
}
