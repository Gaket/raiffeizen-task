package ru.gaket.raif;

import org.junit.Before;

public class RegexpCompressorTest extends CompressorTests {

  @Before
  public void beforeClass() throws Exception {
    sut = new RegexpCompressor();
  }

}