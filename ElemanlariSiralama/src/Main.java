import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Dizinin boyutu: ");
		int lenght = scanner.nextInt();
		int[] arr = new int[lenght];      
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i+1) + ". Eleman: ");   
			arr[i] = scanner.nextInt();       //Arrayin elemanlarını for döngüsüyle kullanıcıdan aldım
		}
		
		Arrays.sort(arr);   //Daha sonra sort metoduyla arrayi küçükten büyüğe sıraladım ve yazdırdım.
		System.out.println("Sıralama : " + Arrays.toString(arr));
		
	}

}
