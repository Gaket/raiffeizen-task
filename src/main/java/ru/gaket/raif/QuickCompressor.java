package ru.gaket.raif;

import java.util.Arrays;

/**
 * 2 курсора, ничего интересного. O(n) cpu. Могло бы быть O(1) memory, если бы не строки на входе и выходе.
 */
public class QuickCompressor implements Compressor {

  @Override
  public String compress(String input) {
    if (input == null || input.isEmpty()) {
      return input;
    }

    char[] chars = input.toCharArray();
    int finalCursor = 0;
    int cursor = 0;
    while (cursor < chars.length) {
      char current = chars[cursor];
      int count = 0;
      while (cursor < chars.length && chars[cursor] == current) {
        cursor++;
        count++;
      }
      if (count != 1) {
        for (char c : Integer.toString(count).toCharArray()) {
          chars[finalCursor++] = c;
        }
      }
      chars[finalCursor++] = current;
    }
    return String.copyValueOf(Arrays.copyOf(chars, finalCursor));
  }

}
