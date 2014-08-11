public class Loop {

  private String withoutReturnStatement() {
    while(true) {
        // you will never come out from this loop
    }   // so there is no return value needed
    // code never reaches here. Compiler not expecting a return value. 
    // See http://docs.oracle.com/javase/specs/jls/se8/html/jls-8.html#jls-8.4.7
  }

  public static void main(String[] a) {
    new Loop().withoutReturnStatement();
  }
}
