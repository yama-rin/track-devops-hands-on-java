package com.example.handson;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

  @Test
  public void testAdd() {
    Calculator calc = new Calculator();
    assertEquals(5.0, calc.add(2.0, 3.0));
  }

  @Test
  public void testAddDecimalValues() {
      Calculator calc = new Calculator();
      assertEquals(4.7, calc.add(1.2, 3.5), 0.0001);
  } 
    
}
