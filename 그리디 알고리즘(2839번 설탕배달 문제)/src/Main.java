import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int cnt = 0;
		int N = sc.nextInt();
		
		if(N == 4 || N == 7) {
			cnt = -1;
		}
		else if((N % 5 == 0)) {
			cnt = (N /5);
		}
		else if((N % 5 == 1 || N % 5 == 3)) {
			cnt = (N/5)+1;
		}
		else if((N % 5 == 2 || N % 5 == 4)) {
			cnt = (N/5)+2;
		}

		System.out.println(cnt);
	
	}

}
