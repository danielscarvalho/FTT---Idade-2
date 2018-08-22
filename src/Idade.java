import java.util.Scanner;

public class Idade {

	//ఐ ఫిక్స్డ్ ఠిస్ మిస్సై ప్రోగ్రాం
	// Vai Corinthians!!
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Dica: sout + Crtl + " "
		System.out.println("Idade...");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe seu ano de nascimento: ");
		
		try {
		
			System.out.println("Sua idade é: " + (2018 - scanner.nextInt()));
		
		} catch(Exception e) {
			System.err.println("Ops!!");
			e.printStackTrace();
			//System.out.println(e.getLocalizedMessage());
		} //try
		System.out.println("Vai corinthians!!");
		scanner.close();
	}

}
