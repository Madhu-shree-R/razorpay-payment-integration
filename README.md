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
