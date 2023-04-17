import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int realSum = 0;
		int N = sc.nextInt();
		int array[] = new int[N];
		
		for(int i=0; i<N; i++) {
			array[i] = sc.nextInt();
		}
		
		Arrays.sort(array);

		for(int i=0; i<N; i++) {
			sum = sum + array[i];
			realSum = realSum + sum;
		}
		System.out.println(realSum);
	}

}
