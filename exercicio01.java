package br.com.generation.lacosfor;

public class exercicio01 {
 
	public static void main(String[] args) {
		for(int n = 1000; n<=1999; n++) {
            if (n % 11 == 5) {
                System.out.println(n);
            }
        }
    }

}