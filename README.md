<div align="center">

# 📊 List Manager - CS102 HW1

### *An Interactive Java-Based List Analysis Tool*

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)
[![License](https://img.shields.io/badge/License-MIT-blue.svg?style=for-the-badge)](LICENSE)

</div>

---

## 📖 Overview

**List Manager** is a comprehensive Java application that generates random integer lists and provides powerful statistical analysis tools. This project demonstrates fundamental programming concepts including array manipulation, user input validation, and interactive menu systems.

## ✨ Features

- 🎲 **Dynamic List Generation** - Create custom-sized arrays filled with random integers (0-99)
- 📉 **Minimum Value Finder** - Quickly identify the smallest element in your list
- 📈 **Maximum Value Finder** - Locate the largest element with ease
- 📊 **Average Difference Calculator** - Calculate and display each element's deviation from the average
- ➕ **Even/Odd Index Sum** - Separate sums for elements at even and odd indices
- ✅ **Input Validation** - Robust error handling for user inputs

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- A Java IDE (Eclipse, IntelliJ IDEA, VS Code) or terminal with Java compiler

### Installation & Running

1. **Clone the repository:**
   ```bash
   git clone <repository-url>
   cd CS102_HW1_TEAMWORK
   ```

2. **Compile the program:**
   ```bash
   javac src/CS102_HW1_TEAMWORK/Main.java
   ```

3. **Run the application:**
   ```bash
   java -cp src CS102_HW1_TEAMWORK.Main
   ```

## 💻 Usage

Upon launching the application, you'll be prompted to:

1. **Enter the capacity** of your list (positive integer)
2. **Choose from the menu options:**

```
==== List Manager ====
(1) -Find Minimum-
(2) -Find Maximum-
(3) -Find Difference to Average-
(4) -Sums of Odd and Even Indexes-
(5) -Exit Program-
```

### Example Session

```
Please enter the capacity of the list: 5
1  |2  |3  |4  |5  |
42 |17 |89 |23 |56 |

==== List Manager ====
(1) -Find Minimum-
(2) -Find Maximum-
(3) -Find Difference to Average-
(4) -Sums of Odd and Even Indexes-
(5) -Exit Program-
Select: 1

  -17-

==== List Manager ====
(1) -Find Minimum-
(2) -Find Maximum-
(3) -Find Difference to Average-
(4) -Sums of Odd and Even Indexes-
(5) -Exit Program-
Select: 2

  -89-
```

## 🏗️ Project Structure

```
CS102_HW1_TEAMWORK/
├── src/
│   └── CS102_HW1_TEAMWORK/
│       └── Main.java          # Main application file
├── LICENSE                     # License information
└── README.md                   # Project documentation
```

## 🔧 Key Functions

| Function | Description |
|----------|-------------|
| `createList()` | Generates a random integer array |
| `minList(int[] list)` | Returns the minimum value in the list |
| `maxList(int[] list)` | Returns the maximum value in the list |
| `averageList(int[] list)` | Calculates differences from average |
| `sumList(int[] list)` | Computes sums for even/odd indexed elements |
| `getValidInput()` | Validates and processes user input |
| `printList(int[] list)` | Displays the list in formatted output |

## 👥 Authors

<table>
  <tr>
    <td align="center">
      <b>Berkin İlkan Seçkin</b>
    </td>
    <td align="center">
      <b>Onur Arda Özçimen</b>
    </td>
    <td align="center">
      <b>Berke Özkan</b>
    </td>
  </tr>
  <tr>
    <td align="center">
      <b>Samet Talha Zorlu</b>
    </td>
    <td align="center">
      <b>Göktan Arslan</b>
    </td>
    <td></td>
  </tr>
</table>

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🎓 Academic Context

This project was developed as part of **CS102** coursework, demonstrating proficiency in:
- Array manipulation and algorithms
- Object-oriented programming principles
- User interface design and input validation
- Statistical computations
- Software documentation

---

<div align="center">

**Made with ❤️ by CS102 Team**

*January 2026*

</div>
