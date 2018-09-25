package hw

import java.util._

//remove if not needed
import scala.collection.JavaConversions._

object Main {
  def main(args: Array[String]): Unit = {
          println("./topword")
        val keyboard: Scanner = new Scanner(System.in)
        val howmany: Int = keyboard.nextInt()
        val minlength: Int = keyboard.nextInt()
        val lastnwords: Int = keyboard.nextInt()
        val input: Scanner = new Scanner(System.in)
        val cloudinput: Queue[String] = new LinkedList[String]()
        val cloudoutput: Map[String, Integer] = new HashMap[String, Integer]()
        while (input.hasNext && (cloudinput.size < lastnwords)) {
          val line: String = input.next()
        if (line.length >= minlength) {
          cloudinput.add(line)
        }
        }
        while (!cloudinput.isEmpty) {
          val word: String = cloudinput.remove()
        if (cloudoutput.containsKey(word)) {
          cloudoutput.put(word, cloudoutput.get(word) + 1)
        }
        else {
          cloudoutput.put(word, 1)
        }
        }
        val output: ArrayList[String] = new ArrayList[String]()
        cloudoutput
        .entrySet()
        .stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .forEachOrdered((x) => output.add(x.getKey))
        var count: Int = 0
        while (count < howmany && count < output.size) {
          println(output.get(count) + ": " + cloudoutput.get(output.get(count))) {
            count += 1;
            count - 1
        }
        }
        }

        }
