# Credit Card Type Determination App

## Overview

This is a simple Java application that uses Object-Oriented Programming (OOP) principles to determine the type of a credit card based on its information.

## CreditCard Class

The `CreditCard` class serves as the base class with the following fields:

```java
public class CreditCard {
    private String cardNumber;
    private String ccHolderName;
    private String expirationDate;
    private int csv;
    
    // Constructor and other methods can be added as needed
}
```

There are four classes for different credit card companies, all of which inherit from the CreditCard class. Each class corresponds to a specific card company.

## CreditCardFactory Class
The CreditCardFactory class is responsible for creating the relevant credit card class based on the input information. It has a method that takes the card information and returns an instance of the appropriate credit card class