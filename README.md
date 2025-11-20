🚀 Automation + API Testing Project
(Selenium TestNG + Postman API Testing)

This repository contains solutions for the QA Machine Test consisting of:

✔ Web Automation using Selenium WebDriver + Java + TestNG + Maven
✔ API Testing using Postman
✔ Manual + Automation tasks combined into a single project
✔ Parameterization, validation, toast verification, customer creation, and environment setup

---

📌 Project Modules
1️⃣ Automation Testing (Selenium + Java + TestNG)

Automated flows for:

✅ 1. Login Journey (Parameterized + Validations)

Valid login

Invalid login

Data read from TestNG parameters

Assertions on page title & dashboard elements

✅ 2. Punch-In Toast Message Verification

Automates the Punch-In action

Captures and validates toast notification

Waits using WebDriverWait

✅ 3. Add Customer (Parameterized + Validations)

Opens "Add Customer" form

Fills customer details (name, address, phone, GST, etc.)

Validates success message on submit

---

📌 2️⃣ Postman API Testing

Environment-based API Test Scenarios:

🌐 Base URL
https://testffc.nimapinfotech.com

🔐 Environment Variables
Variable	Value
baseUrl	https://testffc.nimapinfotech.com

userid	9519519519
password	12345678
token	Generated dynamically after login

---

📁 Project Structure

Automation-Project/

 ├── src/
 
 │   ├── main/java/
 
 │   └── test/java/
 
 │        ├── base/
 
 │        ├── pages
 
 │        ├── test/
 
 ├── postman/
 
 │   ├── FFC_Postman_Environment.json
 
 │   └── FFC_API_Collection.json
 
 ├── pom.xml
 
 ├── .gitignore
 
 ├── TestScenario-Login
 
 └── README.md

---
⚙️ Technologies Used
Automation

Java

Selenium WebDriver

TestNG

Maven

Page Object Model (POM)

WebDriverWait, Assertions

API Testing

Postman

Variables, Environment, Authorization

GET/POST requests

JSON validation
---
