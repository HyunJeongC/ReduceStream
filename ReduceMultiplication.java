package git;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReduceMultiplication {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		//int���� �⺻������ �� 21���� ���ۿ� ǥ���� �ȵȴ� �׷��� 8byte�� long������ 900�游ŭ ǥ�� �����ϰ� �����ߴ�
		List<Long> list = new ArrayList<>(); //List�� �迭 ����
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in); //���ϴ� �� �Է�
		long num = 0;
		num = sc.nextLong();
		for(long i = 1; i <= num; i++) //for������ �Է¹��� 1~num��ŭ �迭�� ����
			list.add(i);
		
		//���� ��Ʈ������ reduce�޼ҵ带 ����Ͽ� ¦���鸸�� ���� Ȧ���鸸�� ���� ���Ͽ� ����Ѵ�
		long mulEvenNum = list.parallelStream().filter(n -> n%2 == 0).reduce((long) 1, (n1, n2) -> n1 * n2);
		long mulOddNum = list.parallelStream().filter(n -> n%2 == 1).reduce((long) 1, (n1, n2) -> n1 * n2);
		System.out.println(mulEvenNum);
		System.out.println(mulOddNum);
	}

}
