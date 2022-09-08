package com.tlglearning;

import java.util.EnumSet;
import java.util.Set;

public enum FizzBuzz {

  FIZZ, BUZZ;

  public static Set<FizzBuzz> valueOf(int num) { //return type is, set of fizzbuzz
    Set<FizzBuzz> result = EnumSet.noneOf(FizzBuzz.class);

    if (num % 3 == 0) {
      result.add(FIZZ);
    }
    if (num % 5 == 0) {
      result.add(BUZZ);
    }
    return result;
  }

}
