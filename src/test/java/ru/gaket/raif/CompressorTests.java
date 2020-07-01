package ru.gaket.raif;

import org.junit.Assert;
import org.junit.Test;

public class CompressorTests {

  protected Compressor sut;

  @Test
  public void compressSingleCharManyTimes() {
    String expected = "5A";
    String actual = sut.compress("AAAAA");
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void compressSingleChar() {
    String expected = "A";
    String actual = sut.compress("A");
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void compressEmpty() {
    String expected = "";
    String actual = sut.compress("");
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void compressNull() {
    String expected = null;
    String actual = sut.compress(null);
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void compressSeveralSingle() {
    String expected = "ABC";
    String actual = sut.compress("ABC");
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void compressSeveralComplex() {
    String expected = "2A3BC";
    String actual = sut.compress("AABBBC");
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void compressManyLetters() {
    String expected = "2A11BC";
    String actual = sut.compress("AABBBBBBBBBBBC");
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void compressDifferentCase() {
    String expected = "a2A3b2B";
    String actual = sut.compress("aAAbbbBB");
    Assert.assertEquals(expected, actual);
  }

}
