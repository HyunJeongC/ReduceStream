package git;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReduceMultiplication {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		//int형은 기본적으로 약 21억의 수밖에 표현이 안된다 그래서 8byte의 long형으로 900경만큼 표현 가능하게 설정했다
		List<Long> list = new ArrayList<>(); //List형 배열 생성
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in); //원하는 수 입력
		long num = 0;
		num = sc.nextLong();
		for(long i = 1; i <= num; i++) //for문으로 입력받은 1~num만큼 배열에 저장
			list.add(i);
		
		//병렬 스트림으로 reduce메소드를 사용하여 짝수들만의 곱과 홀수들만의 곱을 구하여 출력한다
		long mulEvenNum = list.parallelStream().filter(n -> n%2 == 0).reduce((long) 1, (n1, n2) -> n1 * n2);
		long mulOddNum = list.parallelStream().filter(n -> n%2 == 1).reduce((long) 1, (n1, n2) -> n1 * n2);
		System.out.println(mulEvenNum);
		System.out.println(mulOddNum);
	}

}
