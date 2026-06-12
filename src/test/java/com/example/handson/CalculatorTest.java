package com.example.handson;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

  @Test
  public void testAddIntegerlValues() {
    Calculator calc = new Calculator();
    assertEquals(5.0, calc.add(2.0, 3.0));
  }

  @Test
  public void testAddDecimalValues() {
      Calculator calc = new Calculator();
      assertEquals(4.7, calc.add(1.2, 3.5), 0.0001);
  } 

  @Test
  public void testAddThreeValues() {
    Calculator calc = new Calculator();
    assertEquals(6.0, calc.add(1.0, 2.0, 3.0));
  }

  @Test
  public void testAddThreeValuesWhenAIsLessThanZero() {
    Calculator calc = new Calculator();
    assertThrows(IllegalArgumentException.class, () -> {
      calc.add(-1.0, 2.0, 3.0);
    });
  }

  @Test
  public void testAddThreeValuesWhenBIsGreaterThanTen() {
    Calculator calc = new Calculator();
    assertThrows(IllegalArgumentException.class, () -> {
      calc.add(1.0, 11.0, 3.0);
    });
  }

  @Test
  public void testAddThreeValuesWhenCIsGreaterThanTen() {
    Calculator calc = new Calculator();
    assertThrows(IllegalArgumentException.class, () -> {
      calc.add(1.0, 2.0, 11.0);
    });
  }

  @Test
  public void testAddThreeValuesAtBoundaryValues() {
    Calculator calc = new Calculator();
    assertEquals(30.0, calc.add(10.0, 10.0, 10.0));
    assertEquals(0.0, calc.add(0.0, 0.0, 0.0));
  }
  
}
