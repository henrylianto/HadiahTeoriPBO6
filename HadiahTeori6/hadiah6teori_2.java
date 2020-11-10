import java.util.Scanner;

class Siswa{
	String nama;
	String jurusan;
	String nim;	
			void setnama(String namasiswa)
		{
			nama=namasiswa;
		}
			void setjurusan(String jurusansiswa)
		{
			jurusan=jurusansiswa;
		}
			void setnim(String nimsiswa)
		{
			nim=nimsiswa;
		}
			void cetak()
		{
			System.out.println("Nama Saya " + nama + ", "+
			"Jurusan saya yaitu"+" " +jurusan+", "+"NIM Saya "+ nim);
		}
}

public class hadiah6teori_2{
	public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			Siswa s;
			s= new Siswa();
			
		System.out.print("Nama Anda: ");
		s.nama = input.nextLine();
		System.out.print("Jurusan: ");
		s.jurusan = input.nextLine();
		System.out.print("NIM/Stambuk: ");
		s.nim = input.nextLine();
		
		s.setnama(s.nama);
		s.setjurusan(s.jurusan);
		s.setnim(s.nim);
		s.cetak();
		
		
	}
	
}