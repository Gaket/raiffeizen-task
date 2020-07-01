package ru.gaket.raif;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Немножко магии
 */
public class RegexpCompressor implements Compressor {

  @Override
  public String compress(String input) {
    if (input == null || input.isEmpty()) {
      return input;
    }

    String pat = "(.)\\1*";
    Pattern pattern = Pattern.compile(pat);
    Matcher matcher = pattern.matcher(input);
    StringBuilder sb = new StringBuilder();

    while (matcher.find()) {
      String group = matcher.group();
      if (group.length() > 1) {
        sb.append(group.length());
      }
      sb.append(group.charAt(0));
    }

    return sb.toString();
  }

}
