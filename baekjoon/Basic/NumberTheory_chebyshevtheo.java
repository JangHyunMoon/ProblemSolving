import java.util.Scanner;

public class NumberTheory_chebyshevtheo {

	/*
	 문제
	베르트랑-체비쇼프 정리는 임의의 자연수 n에 대하여, n보다 크고, 2n보다 작거나 같은 소수는 적어도 하나 존재한다는 내용을 담고 있다.
	이 명제는 조제프 베르트랑(Joseph Louis François Bertrand, 1822–1900)이 1845년에 추측했고, 파프누티 체비쇼프(Пафнутий Львович Чебышёв, 1821–1894)가 1850년에 증명했다.
	예를 들어, 10보다 크고, 20보다 작거나 같은 소수는 4개가 있다. (11, 13, 17, 19) 또, 14보다 크고, 28보다 작거나 같은 소수는 3개가 있다. (17, 19, 23)
	n이 주어졌을 때, n보다 크고, 2n보다 작거나 같은 소수의 개수를 구하는 프로그램을 작성하시오.  
	입력
	입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 케이스는 n을 포함하며, 한 줄로 이루어져 있다. (n ≤ 123,456)
	입력의 마지막에는 0이 주어진다.
	출력
	각 테스트 케이스에 대해서, n보다 크고, 2n보다 작거나 같은 소수의 개수를 출력한다.
	예제 입력
	1
	10
	13
	100
	1000
	10000
	100000
	0
	예제 출력
	1
	4
	3
	21
	135
	1033
	8392
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		while (sc.hasNext()) {
			int num = sc.nextInt();
			if (num == 0)
				break;
			System.out.println(getPrimeCount(num));
		}
		
	}
	
	public static int getPrimeCount(int num) {
		int count = 0;
		for (int i = num + 1; i <= 2 * num; i++) {
			if (isPrime(i))
				count++;
		}
		return count;
	}
	
	public static boolean isPrime(int num) {
		if (num <= 1)
			return false;
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}
