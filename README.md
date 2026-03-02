# Selenium TestNG Automation Project

This project demonstrates automated browser testing using **Selenium WebDriver** and **TestNG** in Java. It contains test classes that simulate common web application actions such as opening a website, signing up, logging in, adding items to a cart, and logging out.

---

## Prerequisites

- Java JDK 8 or higher  
- Chrome browser installed  
- Internet connection (for WebDriverManager to download drivers)  
- IDE like IntelliJ IDEA or Eclipse (optional)  

---

## Project Structure


project-root/
├─ src/
│ └─ test/
│ └─ java/
│ ├─ FirstTestNgClass.java
│ └─ SecondTestNgClass.java
└─ testng.xml


---

## Test Classes

### FirstTestNgClass
- `openWebSite()` – Opens Google in Chrome  
- `signUp()` – Placeholder for signup actions  
- `login()` – Placeholder for login actions  
- `addToCard()` – Placeholder for adding items to cart  
- `logOut()` – Placeholder for logout  

**Test execution order is controlled with `priority`.**

### SecondTestNgClass
- Similar tests without explicit priority  
- Extra method `closeBrowser()` – prints closing browser message  

---

## How to Run Tests

### Using TestNG XML

1. Open `testng.xml`  
2. Uncomment the classes you want to run:

```xml
<suite name="Suite1">
    <test name="myTest">
        <classes>
            <class name="FirstTestNgClass"/>
            <!-- <class name="SecondTestNgClass"/> -->
        </classes>
    </test>
</suite>

Run in your IDE: Right-click testng.xml → Run As → TestNG Suite

Using Maven
mvn clean test
