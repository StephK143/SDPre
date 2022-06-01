public class Objective8Lab3 {
  public static void main(String[] args) {
    int counter = 1;

    for (int control= 1; control<=20; control++) {

      if(counter % 2 == 0) {
      System.out.println(counter + " is even.");
    }

      else if(counter % 2 == 1) {
      System.out.println(counter + " is odd.");
    }
    counter++;
    }

  }
}
