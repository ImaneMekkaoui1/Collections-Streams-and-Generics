# Collections-Streams-and-Generics
**Author:** Imane Mekkaoui 
**Class:** 1-SDIA / 2025-2027 
**Project:** Practical Exercises on Collections, Streams, and Generics in Java

---

##  Project Description

This project demonstrates the use of **Java Collections (List, Map, Set), Streams, Lambda expressions, and Generics** through several hands-on exercises.  
The goal is to understand **how to store, manage, and manipulate objects** using Java OOP concepts and **generic programming**.

The exercises are divided into **two main parts**:

1. **Collections & Streams**
2. **Generics and OOP with a Product Management Application**

### Key Concepts Used
In this lab, several core Java concepts were utilized to ensure efficient data management and code reusability:

### Java Collections Framework:

ArrayList: Used for ordered lists of items where fast iteration and dynamic resizing are required (e.g., Product List).

HashMap: Used for Key-Value pair storage to allow O(1) access time for retrieving student grades.

HashSet: Selected for group management to automatically ensure uniqueness of elements and perform efficient set operations (Union/Intersection).

### Stream API & Lambda Expressions:

Utilized for writing concise, functional-style code.

Operations like .filter(), .mapToDouble(), and .forEach() replaced verbose traditional loops, making the code more readable and expressive.

### Generics:

Implemented custom classes (GenericStorage<T>) and interfaces (IMetier<T>) to abstract the business logic.

This ensures Type Safety at compile-time and eliminates the need for manual casting, adhering to best practices in software design.

##  Exercises

### 1️ Collections & Streams

#### **1.1 Lists – ProductManagementApp**
- Created a Product class with attributes:
  - id (long)
  - name (String)
  - price (double)
- Implemented the following operations on an ArrayList of products:
  - Add products
  - Delete a product by index
  - Display all products
  - Modify a product by index
  - Search for a product by name (case-insensitive)

**Example Output:**

![Product Management Output](ScreenshotsTp2/ProductManagement.png)



---

#### **1.2 Maps – StudentGrades**
- Created a HashMap<String, Double> storing student names and grades.
- Operations performed:
  - Insert grades
  - Increase a student's grade
  - Delete a grade
  - Display map size
  - Calculate average, maximum, and minimum grades
  - Check if a grade equals 20
  - Display all entries using forEach and lambda

**Example Output:**

![Student Grades Output](ScreenshotsTp2/StudentGrades.png)


---

#### **1.3 Sets – Groups**
  - Created two HashSet<String> for groups A and B.
  - Performed:
  - Add student names
  - Display **intersection**
  - Display **union**

**Example Output:**

![Groups Output](ScreenshotsTp2/Groups.png)


---

###  Generics

#### **2.1 GenericStorage – Application**
  - Implemented a generic class GenericStorage<T> with:
  - addElement(T o) → Add an element
  - removeElement(int index) → Remove by index
  - getElement(int index) → Retrieve element
  - getSize() → Current size
  - Tested with multiple types: Integer, String

**Example Output:**

![Generic Storage Output](ScreenshotsTp2/Application.png)



---

#### **2.2 Generic OOP – Product Management**

  - Created a **generic interface IMetier<T>** with methods:
  - add(T o)  
  - List<T> getAll()  
  - T findById(long id) 
  - delete(long id)

  - Created MetierProduitImpl implementing IMetier<ProductGeneric>.

  - Created a ProductGeneric class with attributes:
  - id, name, brand, price, description, stock

  - Implemented ApplicationMenu with a **menu-driven console**:

**Menu:**

![Application Menu Output](ScreenshotsTp2/AppMenu.png)



