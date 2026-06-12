package com.example.handson;

public class Calculator {
  
  public double add(double a, double b) {
    return a + b;
  }

  public double add(double a, double b, double c) {
    validateRange(a);
    validateRange(b);
    validateRange(c);
    
    return a + b + c;
  }

  private void validateRange(double value) {
    if (value < 0 || value > 10) {
      throw new IllegalArgumentException("value must be between 0 and 10");
    }
  }
  
}
