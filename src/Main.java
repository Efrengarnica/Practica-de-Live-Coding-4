public class Main {
	public static void main(String[] args) {
		FizzBuzz prueba= new FizzBuzz();
		prueba.imprimirNumeros();
	}//main

}//class Main

class FizzBuzz {
	
	void imprimirNumeros() {
		for(int i =1;i<=100;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println(i + " FizzBuzz");
			}else if(i%3==0) {
				System.out.println(i + " Fizz");
			}else if(i%5==0) {
				System.out.println(i + " Buzz");
			}else {
				System.out.println(i);
			}
		}//for
	}//imprimirNumeros
	
}//class FizzBuzz
