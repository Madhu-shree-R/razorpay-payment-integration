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
