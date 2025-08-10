# 🔢 Arrays in Java – A Beginner's Guide

This guide explains how to use arrays in Java, including:
- Declaring and initializing arrays
- Looping through arrays
- Using multi-dimensional arrays

---

## 📦 What is an Array?

An **array** is a collection of similar data elements stored in contiguous memory locations.

---

## ✅ Declaring and Initializing Arrays

### Declare an array
```java
int[] numbers;      // preferred style
```

### Allocate memory
```java
numbers = new int[5];  // array of 5 integers (default value 0)
```

### Or declare and allocate together
```java
int[] numbers = new int[5];
```

### Or directly initialize
```java
int[] numbers = {10, 20, 30, 40, 50};
```

---

## 🔁 Looping Through Arrays

### Using a for loop:
```java
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

### Using enhanced for loop (for-each):
#### Syntax
`for(type variable:arrayName)`
```java
for (int num : numbers) {
    System.out.println(num);
}
```

---

## 🔄 Updating Array Elements

```java
int[] numbers = {10, 20, 30, 40, 50}; // Set first element to 99
numebrs[2]=70                         // Changes 40 to 70
```

---


## 🧱 Multidimensional Arrays (Matrix)

### Declare and Initialize a 2D Array
```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6}
};
```

### Access Elements
```java
int x = matrix[0][2];  // 3rd element in 1st row
```

### Nested Loops to Traverse
```java
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```

---

## 🧠 Notes
- Arrays in Java have **fixed size**. You cannot change their size after creation.
- Use `ArrayList` if you need dynamic arrays.

---

## 📘 Useful Links
- [Java Arrays – W3Schools](https://www.w3schools.com/java/java_arrays.asp)
- [Java Multidimensional Arrays – Oracle Docs](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html)
