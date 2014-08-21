public class FizzBuzzFast {
    public static void fizzbuzz(){
        for (int i = 1; i <= 100; i++) {
            switch (i % 15) {
                case 0:
                    System.out.println("FizzBuzz");
                    break;
                case 3:
                case 6:
                case 9:
                case 12:
                    System.out.println("Fizz");
                    break;
                case 5:
                case 10:
                    System.out.println("Buzz");
                    break;
                default:
                    System.out.println(i);
            }
        }
    }
	
	public static void main(String[] args) {
	    fizzbuzz();
	}
}
