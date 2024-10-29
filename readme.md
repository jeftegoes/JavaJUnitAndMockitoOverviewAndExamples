# 1. JUnit dependencies

- Option with less dependencies:

  ```xml
      <dependency>
          <groupId>org.junit.jupiter</groupId>
          <artifactId>junit-jupiter-api</artifactId>
          <version>5.11.0</version>
          <scope>test</scope>
      </dependency>
      <dependency>
          <groupId>org.junit.jupiter</groupId>
          <artifactId>junit-jupiter-engine</artifactId>
          <version>5.11.0</version>
          <scope>test</scope>
      </dependency>
      <dependency>
          <groupId>org.junit.jupiter</groupId>
          <artifactId>junit-jupiter-params</artifactId>
          <version>5.11.0</version>
          <scope>test</scope>
      </dependency>
  ```

- Full option:

```xml
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter</artifactId>
        <version>5.11.0</version>
        <scope>test</scope>
    </dependency>
```

# 2. Mockito

- **What is Mockito?**
  - Mockito is an open source testing framework created for Java.
  - It allows us to easily create "test doubles" objects in unit tests.

## 2.1. Test Double

- **What is Test Double?**
  - Test doubles are stand-ins for the real components of your software under test.
- They mimic the behavior of these components, allowing you to test the code in isolation without relying on any dependencies.
- Different testing types require varying functioning features of the software.
- There might be cases where a certain test run may need the function to return a numeric value.
  ![Code Dependency](/Images/CodeDependency.png)

## 2.2. Types of Test Doubles

- Choosing the right test double for such test scenarios is critical.
- This is the list of different types of test doubles available:
  | Types | Description |
  | ------- | ------------------------------------------------ |
  | Fake | Simplified implementation<br>Basic functionality |
  | Stub | Predetermined responses<br>Mimics behavior |
  | Mock | Behavior verification<br>Method call tracking |
  | Dummies | Placeholder objects<br>No functionality |
  | Spies | Interaction monitoring<br>Observes behavior |

## 2.3. Mockito dependencies

```xml
    <dependency>
        <groupId>org.mockito</groupId>
        <artifactId>mockito-junit-jupiter</artifactId>
        <version>5.14.2</version>
        <scope>test</scope>
    </dependency>
```