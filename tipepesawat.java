import java.util.Scanner;
public class tipepesawat {
	public static void main(String[]args)
	{
		
	Scanner input = new Scanner(System.in);
	
	int nilai;
	
	System.out.println("Masukkan Kode: ");
	nilai=input.nextInt();
	
	
		if(nilai==1){
		System.out.println("pesawat Garuda");	}
		else if(nilai==2){
	   System.out.println("pesawat Batik");}
	   else if(nilai==3){
	  	System.out.println("pesawat Lion");}
	   	else
	  	System.out.println("Maaf anda salah memasukkan tipe");
				
			
	}
}