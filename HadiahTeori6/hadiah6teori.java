import java.util.Scanner;
class Lingkaran{
	
	final double PI = 3.14;
	int jari2;


		void cetak()
		{
			
			System.out.println("Luas lingkaran: "+(PI * jari2 *jari2));
			
		}
}
class Kubus{
		int sisi;
		
		void cetak(){
			System.out.println("Volume kubus: "+(sisi*sisi*sisi));
			
		}
	
}
	
public class hadiah6teori{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		Lingkaran l = new Lingkaran();
		Kubus k = new Kubus();
		
		System.out.print("jari-jari (r): ");
		l.jari2 = input.nextInt();
		System.out.print("sisi: ");
		k.sisi = input.nextInt();
		
		l.cetak();
		System.out.println("=======================");
		k.cetak();
	
		
	
	}
	
}