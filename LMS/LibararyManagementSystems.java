package com.LMS;
import java.util.*;

public class LibararyManagementSystems {
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public LibararyManagementSystems() {
        books.add(new Book(10, "Java  ", " 97", "Herbert  ", 20));
        books.add(new Book( 2, "python ", " 88",  "Eric     ", 10));
        books.add(new Book( 7, "C++    ", " 42",  "Bjarne   ", 5));
        books.add(new Book( 8, "DSA    ", " 58",  "Michael  ", 15));
        books.add(new Book( 12 ,"AI    ", " 50", "John     ", 12));
    }

    public void menu() {
        while (true) {
            System.out.println("<<<<<<<WELL COME TO LIBRARY MANAGEMENT SYSTEM>>>>>>>");
            System.out.println("1- Add Book into Library");
            System.out.println("2- Issue Book to Student");
            System.out.println("3- Return Book from Student");
            System.out.println("4- Show all Books");
            System.out.println("5- Show all Students");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    issueBook();
                    break;
                case 3:
                    returnBook();
                    break;
                case 4:
                    showAllBooks();
                    break;
                case 5:
                    showAllStudents();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    public void addBook() {
        System.out.print("Enter book ID: ");
        int bookId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter name of book: ");
        String bookName = scanner.nextLine();
        System.out.print("Enter book ISBAN: ");
        String isban = scanner.nextLine();
        System.out.print("Enter author name: ");
        String author = scanner.nextLine();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        Book newBook = new Book(bookId, bookName, isban, author, quantity);
        books.add(newBook);
        System.out.println("Book added successfully!");
    }

    public void issueBook() {
        System.out.print("Enter student ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter student roll number: ");
        String rollNumber = scanner.nextLine();
        System.out.print("Enter book ISBAN you want to issue: ");
        String isban = scanner.nextLine();
        Book book = findBookByIban(isban);
        if (book == null) {
            System.out.println("Invalid ISBAN Number");
        } else {
            if (book.getQuantity() > 0) {
                students.add(new Student(studentId, studentName, rollNumber, isban));
                book.setQuantity(book.getQuantity() - 1);
                System.out.println("Book issued successfully");
            } else {
                System.out.println("Book not available");
            }
        }
    }

    public void returnBook() {
        System.out.print("Enter student ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter book ISBAN you want to return: ");
        String isban = scanner.nextLine();
        Book book = findBookByIban(isban);
        if (book == null) {
            System.out.println("Invalid ISBAN number Entered");
        } else {
            Student student = findStudentById(studentId);
            if (student != null) {
                students.remove(student);
                book.setQuantity(book.getQuantity() + 1);
                System.out.println("Book returned successfully!");
            } else {
                System.out.println("Student ID not found");
            }
        }
    }


    public void showAllBooks() {
        System.out.println("              <<<<<<<<<<Books in Library>>>>>>>>>>            ");
        System.out.println("Book Name        ISBAN           Author   Quantity Book ID");
        books.stream().filter(book -> book.getQuantity() > 0).forEach(book -> {
            String bookName = book.name + "            ";
            String iban     = book.iban  + "            ";
            String author   = book.author + "  ";
            String quantity = book.getQuantity()+"    ";
            String bookId   = book.getBookId()+"  ";
            System.out.println(bookName + iban + author + quantity + bookId);
        });
    }

    public void showAllStudents() {
        System.out.println("            <<<<<<<<<<Students with Issued Books>>>>>>>>>>            ");
        System.out.println("Student ID   Student Name   Roll Number   ISBAN");

        students.stream().forEach(student -> student.showStudentData());
    }

    public Book findBookByIban(String isban) {
        return books.stream().filter(book -> book.getIban().equals(isban))
                .findFirst().orElse(null);
    }

    public Student findStudentById(int studentId) {
        return students.stream().filter(student -> student.getStudentId() == studentId)
                .findFirst().orElse(null);
    }

    public static void main(String[] args) {
        LibararyManagementSystems libraryManagementSystem = new LibararyManagementSystems();
        libraryManagementSystem.menu();
    }
}



