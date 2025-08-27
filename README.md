---

# RestAssured API Automation Framework – Restful Booker

This project is a **Java Test Automation Framework** built using **RestAssured, TestNG, and Maven** to test the [Restful Booker API](https://restful-booker.herokuapp.com/apidoc/index.html).

It demonstrates API testing for endpoints like **create booking, get booking, update booking, and delete booking**.

---

## 📂 Project Structure

```
restassured-restfulbooker/
│── pom.xml                      # Maven dependencies
│── README.md                    # Project documentation
└── src
    └── main
        └── java
            └── com.example.restbooker
                ├── client        # API client classes
                │    └── BookingClient.java
                ├── model         # POJOs (Booking, BookingDates)
                │    ├── Booking.java
                │    └── BookingDates.java
                └── utils         # Utility classes (Config, etc.)
    └── test
        └── java
            └── com.example.restbooker.tests
                 └── BookingCrudTest.java   # Test cases
```

---

## 🛠️ Tech Stack

* **Java 11+**
* **Maven** – Dependency management
* **RestAssured** – API automation library
* **TestNG** – Test runner and assertions
* **Jackson** – JSON serialization/deserialization

---

## ⚙️ Setup Instructions

1. **Clone the repository**

   ```bash
   git clone https://github.com/the-vaishnavi23/APITestingFramework.git
   cd restassured-restfulbooker
   ```

2. **Install dependencies**
   Make sure you have Maven installed, then run:

   ```bash
   mvn clean install
   ```

3. **Run tests**
   Execute all TestNG tests:

   ```bash
   mvn test
   ```

---

## 📊 Reports

* **Surefire Reports**: After running tests, reports are generated under

  ```
  target/surefire-reports
  ```

* You can open the `index.html` report in a browser for a summary.

---

## 🚀 Future Enhancements

* Add test coverage for **Update, Get, and Delete** APIs.
* Implement **data-driven testing** using TestNG DataProviders.
* Integrate with **Allure Reports** for rich reporting.
* Add **CI/CD integration** with Jenkins or GitHub Actions.

---

## 👩‍💻 Author

* Developed by **Vaishnavi Srivastava**
* Built for learning and practicing **API Test Automation with RestAssured**

--
