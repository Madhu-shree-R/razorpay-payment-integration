# 💳 Razorpay Payment Integration

> A modern online payment application built using **Java, Spring Boot, REST API, Razorpay Payment Gateway, HTML5, CSS3, and JavaScript**. The application allows users to enter a payment amount, creates a Razorpay payment order through a Spring Boot backend, and opens the Razorpay Checkout interface for payment.

---

## 📚 Table of Contents

- [Project Overview](#-project-overview)
- [Key Features](#-key-features)
- [Technology Stack](#️-technology-stack)
- [Screenshots / Demo](#️-screenshots--demo)
- [Architecture Overview](#️-architecture-overview)
- [How Payment Processing Works](#-how-payment-processing-works)
- [Project Structure](#-project-structure)
- [Installation & Setup](#-installation--setup)
- [Razorpay Configuration](#-razorpay-configuration)
- [Application Configuration](#-application-configuration)
- [API Documentation](#-api-documentation)
- [Request and Response](#-request-and-response)
- [Razorpay Checkout](#-razorpay-checkout)
- [Security](#-security)
- [Error Handling](#️-error-handling)
- [Testing](#-testing)
- [How to Run](#-how-to-run)
- [Future Improvements](#-future-improvements)
- [Learning Outcomes](#-learning-outcomes)
- [Contributing](#-contributing)
- [Author](#-author)
- [License](#-license)
- [Support](#-support)

---

## 📌 Project Overview

The **Razorpay Payment Integration** project is a web-based payment application developed using **Java and Spring Boot** with the **Razorpay Payment Gateway**.

The application provides a simple payment interface where users can enter an amount and initiate an online payment.

The frontend communicates with a Spring Boot REST API using the JavaScript Fetch API. The backend uses the Razorpay Java SDK to create a payment order. Once the order is successfully created, the order details are returned to the frontend and the Razorpay Checkout interface is opened.

### Main Workflow

```text
User
  ↓
Enter Payment Amount
  ↓
Frontend Validation
  ↓
Spring Boot REST API
  ↓
Razorpay Java SDK
  ↓
Create Razorpay Order
  ↓
Return Order Details
  ↓
Razorpay Checkout
  ↓
User Completes Payment
  ↓
Payment Response

This project demonstrates practical implementation of:

Java backend development
Spring Boot
REST API development
Razorpay payment gateway integration
JSON request handling
Frontend-backend communication
JavaScript Fetch API
Maven dependency management
Razorpay Checkout integration
✨ Key Features
💳 Razorpay Payment Integration

Integrates the Razorpay Payment Gateway to create payment orders and open the Razorpay Checkout interface.

💰 Dynamic Payment Amount

Users can enter the amount they want to pay through the payment interface.

🚀 Spring Boot REST API

Provides a REST endpoint for creating Razorpay payment orders.

⚡ Fetch API Integration

The frontend communicates with the Spring Boot backend using JavaScript Fetch API.

🔐 Backend Secret Key

The Razorpay secret key is intended to remain on the backend and should not be exposed in frontend JavaScript.

🎨 Modern User Interface

The payment page contains:

Gradient animated background
Glassmorphism-style payment card
Animated background elements
Payment amount input
Payment button
Loading indicator
Feature indicators
📱 Responsive Interface

The interface is designed using HTML5 and CSS3 and can be adapted for different screen sizes.

⚠️ Amount Validation

The application checks whether the entered amount is valid before creating the payment order.

⏳ Loading Indicator

Displays a loading message while the payment order is being created.

✅ Payment Callback

The Razorpay Checkout handler receives the payment response after successful payment.

🛠️ Technology Stack

| Technology                  | Purpose                        |
| --------------------------- | ------------------------------ |
| **Java 21**                 | Backend programming            |
| **Spring Boot**             | Backend framework              |
| **Spring Web MVC**          | REST API development           |
| **Razorpay Java SDK**       | Razorpay payment integration   |
| **HTML5**                   | Frontend structure             |
| **CSS3**                    | UI styling and animations      |
| **JavaScript**              | Frontend functionality         |
| **Fetch API**               | Frontend-backend communication |
| **Razorpay Checkout.js**    | Payment checkout interface     |
| **Maven**                   | Dependency management          |
| **Lombok**                  | Java boilerplate reduction     |
| **Eclipse / IntelliJ IDEA** | Development environment        |
| **Git**                     | Version control                |
| **GitHub**                  | Source code hosting            |
```
## 🖥️ Screenshots / Demo

The following screenshots demonstrate the complete payment flow from entering the amount to successful payment using the Razorpay Test Mode environment.

### 💳 1. Payment Landing Page

Users can enter the amount they want to pay and initiate the payment process.

<p align="center">
  <img src="./screenshots/payment-page.png" alt="Payment Landing Page" width="800">
</p>

---

### 💰 2. Entering Payment Amount

The user enters the required payment amount before starting the transaction.

<p align="center">
  <img src="./screenshots/amount-entry.png" alt="Entering Payment Amount" width="800">
</p>

---

### 💳 3. Razorpay Payment Options

After the backend creates the Razorpay order, the Razorpay Checkout interface displays the available payment methods.

<p align="center">
  <img src="./screenshots/payment-options.png" alt="Razorpay Payment Options" width="800">
</p>

---

### 🔄 4. Payment Confirmation

Razorpay processes the payment request and displays the confirmation screen.

<p align="center">
  <img src="./screenshots/payment-confirmation.png" alt="Payment Confirmation" width="800">
</p>

---

### 🔐 5. OTP Verification

The Razorpay Test Mode payment flow displays OTP verification before completing the transaction.

<p align="center">
  <img src="./screenshots/otp-verification.png" alt="OTP Verification" width="800">
</p>

---

### 🏦 6. Razorpay Test Payment Gateway

The Razorpay Test Mode gateway allows the payment to be simulated using the available test options.

<p align="center">
  <img src="./screenshots/test-bank.png" alt="Razorpay Test Payment Gateway" width="800">
</p>

---

### ✅ 7. Payment Successful

After successful completion of the test payment, Razorpay displays the payment success confirmation.

<p align="center">
  <img src="./screenshots/payment-success.png" alt="Payment Successful" width="800">
</p>

🏗️ Architecture Overview
                    User
                      │
                      ▼
            HTML + CSS + JavaScript
                      │
                  Fetch API
                      │
                      ▼
             Spring Boot Controller
                      │
                      ▼
                 UserService
                      │
                      ▼
             Razorpay Java SDK
                      │
                      ▼
               Razorpay API
                      │
                      ▼
             Razorpay Checkout
                      │
                      ▼
              Payment Response
Backend Architecture

The backend follows a simple layered structure:

Controller
    ↓
Service
    ↓
Razorpay SDK
    ↓
Razorpay API
Components

Controller

Handles incoming HTTP requests and passes the payment amount to the service layer.

Service

Creates the Razorpay client and generates the payment order.

Entity

Contains the payment amount received from the frontend.

Frontend

Provides the user interface and communicates with the backend using Fetch API.

💰 How Payment Processing Works
Step 1 — Enter Amount

The user enters the amount in the payment interface.

Step 2 — Frontend Validation

JavaScript checks whether the entered amount is greater than zero.

Step 3 — API Request

The frontend sends a POST request to:

/payments

with the payment amount.

Step 4 — Spring Boot Controller

The UserController receives the request and extracts the payment amount.

Step 5 — Service Layer

The controller calls UserService.

Step 6 — Razorpay Client

The service creates a RazorpayClient using the Razorpay Key ID and Secret Key.

Step 7 — Create Order

The Razorpay Java SDK creates a payment order.

The amount is converted from rupees to paise because Razorpay expects the amount in the smallest currency unit.

Step 8 — Return Order

The Razorpay order information is returned to the frontend.

Step 9 — Open Checkout

JavaScript uses the returned order ID to open the Razorpay Checkout interface.

Step 10 — Complete Payment

The user completes the payment using Razorpay Test Mode.
