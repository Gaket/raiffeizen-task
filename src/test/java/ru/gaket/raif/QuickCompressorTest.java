package ru.gaket.raif;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickCompressorTest extends CompressorTests {

  @Before
  public  void beforeClass() throws Exception {
    sut = new QuickCompressor();
  }

}