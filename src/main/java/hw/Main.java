package hw;

import java.util.*;

public class Main {

  public static void main(final String[] args) {

    System.out.println("./topword");
    Scanner keyboard = new Scanner(System.in);


    final int howmany = keyboard.nextInt();
    final int minlength = keyboard.nextInt();
    final int lastnwords = keyboard.nextInt();

    Scanner input = new Scanner(System.in);

    final Queue<String> cloudinput = new LinkedList<>();
    final Map<String, Integer> cloudoutput = new HashMap<>();


    while (input.hasNext() && (cloudinput.size()<lastnwords)) {
      String line = input.next();
      if (line.length()>=minlength) {
        cloudinput.add(line);
      }

      }
    while (!cloudinput.isEmpty()) {
      String word = cloudinput.remove();
      if (cloudoutput.containsKey(word)) {
        cloudoutput.put(word,cloudoutput.get(word)+1);
      }
      else{
        cloudoutput.put(word, 1);
      }
    }
    ArrayList<String> output = new ArrayList<>();
    cloudoutput.entrySet().
            stream().
            sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).
            forEachOrdered(x -> output.add(x.getKey()));

    int count = 0;
    while(count < howmany && count < output.size()) {
      System.out.println(output.get(count) + ": " + cloudoutput.get(output.get(count)));
      count++;
    }
  }


}
