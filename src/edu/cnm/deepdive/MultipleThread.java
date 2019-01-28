package edu.cnm.deepdive;

import edu.cnm.deepdive.Utility;

public class MultipleThread {

  public static void main(String[] args) {
    Thread lazy = new LazyThread();
    lazy.start();
    Utility.processInput();
  }

}
