# Karate API Test Project

## 📌 Overview
This project is a **Karate API testing framework** using **Gradle and JUnit 5**. It allows automated testing of APIs with feature files written in **Gherkin syntax**.

## 🛠️ Setup & Installation

### **1️⃣ Prerequisites**
Ensure you have the following installed:
- [Java 20+](https://adoptopenjdk.net/)
- [Gradle](https://gradle.org/install/)

### **2️⃣ Clone the Repository**
```sh
git clone https://github.com/your-repo/karate-api-test.git
cd karate-api-test
```

### **3️⃣ Install Dependencies**
```sh
./gradlew build
```

## 📂 Project Structure
```
📂 my-karate-project
 ┣ 📂 src
   ┗ 📂 test
     ┣ 📂 kotlin     <-- If using Kotlin test runners
     ┗ 📂 resources
       ┗ 📂 features <-- Karate feature files
         ┣ 📜 sample.feature  <-- Example feature file
 ┣ 📜 build.gradle.kts  <-- Gradle build file
 ┣ 📜 settings.gradle.kts
 ┣ 📜 README.md  <-- This file
 ┣ 📜 gradlew
 ┣ 📜 gradlew.bat
 ┗ 📂 .gradle
```

## 🚀 Running Tests

### **Run All Tests**
```sh
./gradlew test
```

### **Run a Specific Feature File**
```sh
./gradlew test --tests "KarateTest"
```

## 📝 Writing Test Cases

Example **Karate Feature File** (`src/test/resources/features/sample.feature`):
```gherkin
Feature: Sample API Test

  Scenario: Get user details
    Given url 'https://jsonplaceholder.typicode.com/users/1'
    When method GET
    Then status 200
    And match response.id == 1
```

### **JUnit 5 Test Runner (`KarateTest.kt`)**
```kotlin
import com.intuit.karate.junit5.Karate

class KarateTest {
    @Karate.Test
    fun testAll(): Karate {
        return Karate.run("classpath:features").relativeTo(javaClass)
    }
}
```

## ⚡ Parallel Test Execution
To run all features in parallel:
```kotlin
import com.intuit.karate.Runner
import org.junit.jupiter.api.Test

class ApiTest {
    @Test
    fun testAll() {
        val result = Runner.path("classpath:features").parallel(5) // Run with 5 threads
        println("Total: ${result.featureCount}, Passed: ${result.passCount}, Failed: ${result.failCount}")
    }
}
```

## 📌 Additional Configuration
### **Enable JUnit 5 in `build.gradle.kts`**
```kotlin
dependencies {
    testImplementation("com.intuit.karate:karate-junit5:1.4.1")
}

tasks.test {
    useJUnitPlatform()
}
```

## 📜 License
This project is licensed under the [MIT License](LICENSE).

---
### 🎯 **Happy Testing with Karate! 🚀**

