# Quantum Bookstore

A simple object-oriented **Java application** simulating an online bookstore called **Quantum Bookstore**. This system supports physical books, eBooks, and demo books, and allows operations such as adding, removing, and purchasing books.

> 📘 All system output is prefixed with **"Quantum book store"**

---

## 📦 Features

- Manage an inventory of:
  - 📚 **PaperBook** – has stock and can be shipped.
  - 💾 **EBook** – has file type and can be emailed.
  - 🧾 **ShowcaseBook** – not for sale.
- Add books with details: `ISBN`, `Title`, `Author`, `Published Year`, `Price`.
- Remove outdated books published 10 years ago.
- Buy books by `ISBN`, quantity, and customer info.
  - Decrease quantity from inventory.
  - Return total payment.
  - Simulate sending:
    - Paper books via shipping (stubbed).
    - EBooks via email (stubbed).
- Designed to be easily extensible using OOP principles.
