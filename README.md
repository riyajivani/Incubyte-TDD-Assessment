# String Calculator
## Overview
This project is a String Calculator implementation based on the TDD (Test-Driven Development) Kata. The goal is to create a simple calculator that parses a string of numbers separated by commas or new lines and calculates their sum. Additionally, the calculator supports custom delimiters and handles edge cases, such as negative numbers.

## Features
### Basic Addition:
Input: "" (empty string)<br/>
Output: 0<br/>
Input: "1"<br/>
Output: 1<br/>
Input: "1,5"<br/>
Output: 6<br/>

### Handling New Lines:
Input: "1\n2,3"<br/>
Output: 6<br/>

### Custom Delimiters:
Input: "//;\n1;2"<br/>
Output: 3<br/>

### Negative Numbers:
Input: "1,-2"<br/>
Output: Throws an exception with message: negative numbers not allowed -2<br/>
Input: "1,-2,-3"<br/>
Output: Throws an exception with message: negative numbers not allowed -2,-3<br/>

## Setup
### Prerequisites
<ul>
<li>Java Development Kit (JDK) 8 or higher<br/></li>
<li>Maven or Gradle (for dependency management and build automation)<br/></li>
<li>JUnit (for testing)<br/></li>
</ul>

### Installation
#### 1. Clone The Repositiory:
      git clone https://github.com/riyajivani/Incubyte-TDD-Assessment.git
#### 2. Navigate to the Project Directory:
      cd Incubyte-TDD_Assesment
#### 3. Build:
      javac -d bin src/com/riyajivani/StringNumberAddition.java src/com/riyajivani/StringNumberAdditionTest.java  
#### 4. Compile the test:
      javac -d bin -cp "junit-4.13.2.jar;hamcrest-core-1.3.jar" src/com/riyajivani/StringNumberAdditionTest.java
#### 5. Run the Test:
      java -cp "bin;junit-4.13.2.jar;hamcrest-core-1.3.jar" org.junit.runner.JUnitCore com.riyajivani.StringNumberAdditionTest

## Implementation Details
<ul>
<li>Delimiter Handling: The calculator supports custom delimiters specified at the start of the string. The format is //[delimiter]\n[numbers...].</li>
<li>Negative Number Detection: The calculator detects negative numbers and throws an IllegalArgumentException listing all negative numbers found.</li>
<li>Edge Cases: Handles empty strings and ensures proper addition even with new line and custom delimiter formats.</li>
</ul>

## Author
- Github: [riyajivani](https://github.com/riyajivani)
- Linkedin: [RiyaJivani](https://www.linkedin.com/in/riya-jivani-729116228/)
- Portfolio: [Portfolio](https://riya-portfolio-emdk.onrender.com/)
