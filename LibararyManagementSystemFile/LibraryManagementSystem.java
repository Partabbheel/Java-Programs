package com.LibararyManagementSystem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagementSystem {
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        public void LibraryManagementSystem() {
            loadBooksFromFile();
            loadBooksFromFile();
            books.add(new Book(10, "Java  ",  " 97", "Herbert ",  20));
            books.add(new Book(2 , "python",  " 88", "Eric    ",  10));
            books.add(new Book( 7,  "C++   ",  " 42", "Bjarne  ",  5));
            books.add(new Book(8,  "DSA   ",  " 58", "Michael  ", 15));
            books.add(new Book(12, "AI    ",  " 50", "John     ", 12));
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
            SaveBookToFile(newBook);
            System.out.println("Book added successfully!");
        }

    private void SaveBookToFile(Book newBook) {
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
                    SaveStudentToFile();
                    updateBookFile();
                    System.out.println("Book issued successfully");
                } else {
                    System.out.println("Book not available");
                }
            }
        }

    private void SaveStudentToFile() {
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
                    updateStudentFile();
                    updateBookFile();
                    System.out.println("Book returned successfully!");
                } else {
                    System.out.println("Student ID not found");
                }
            }
        }
        
    public void showAllBooks() {
            System.out.println("              <<<<<<<<<<Books in Library>>>>>>>>>>            ");
            System.out.println("Book Name        ISBAN           Author   Quantity Book ID");
            for (int i = 0; i < books.size(); i++) {
                Book book = books.get(i);
                String bookName = book.name +                    "            ";
                String iban = book.iban +                        "            ";
                String author = book.author +"  ";
                String quantity = String.valueOf(book.quantity) +"       ";
                String bookId = String.valueOf(book.bookId) +    "       ";
                System.out.println(bookName + iban + author + quantity + bookId);
            }
        }


        public void showAllStudents() {
            System.out.println("            <<<<<<<<<<Students with Issued Books>>>>>>>>>>            ");
            System.out.println("Student ID   Student Name   Roll Number   ISBAN");
            for (int i = 0; i < students.size(); i++) {
                students.get(i).showStudentData();
            }
        }

        public Book findBookByIban(String isban) {
            for (int i = 0; i < books.size(); i++) {
                if (books.get(i).iban.equals(isban)) {
                    return books.get(i);
                }
            }

            return null;
        }

        public Student findStudentById(int studentId) {
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).studentId == studentId) {
                    return students.get(i);
                }
            }
            return null;
        }
    public void saveBookToFile(Book book) {
        try {
            FileWriter fw = new FileWriter("books.txt", true);
            fw.write(book.bookId + "," + book.name + "," + book.iban + "," + book.author + "," + book.quantity + "\n");
            fw.close();
        } catch (IOException e) {
            System.out.println("Error writing book to file.");
        }
    }

    public void saveStudentToFile(Student s) {
        try {
            FileWriter fw = new FileWriter("students.txt", true);
            fw.write(s.studentId + "," + s.studentName + "," + s.rollNumber + "," + s.issuedBookIban + "\n");
            fw.close();
        } catch (IOException e) {
            System.out.println("Error saving student.");
        }
    }

    public void updateBookFile() {
        try {
            FileWriter fw = new FileWriter("books.txt");
            for (Book b : books) {
                fw.write(b.bookId + "," + b.name + "," + b.iban + "," + b.author + "," + b.quantity + "\n");
            }
            fw.close();
        } catch (IOException e) {
            System.out.println("Error updating book file.");
        }
    }

    public void updateStudentFile() {
        try {
            FileWriter fw = new FileWriter("students.txt");
            for (Student s : students) {
                fw.write(s.studentId + "," + s.studentName + "," + s.rollNumber + "," + s.issuedBookIban + "\n");
            }
            fw.close();
        } catch (IOException e) {
            System.out.println("Error updating student file.");
        }
    }

    public void loadBooksFromFile() {
        try {
            File file = new File("books.txt");
            if (!file.exists()) return;
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String[] parts = reader.nextLine().split(",");
                if (parts.length == 5) {
                    int id = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    String isban = parts[2];
                    String author = parts[3];
                    int quantity = Integer.parseInt(parts[4]);
                    books.add(new Book(id, name, isban, author, quantity));
                }
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Error loading books.");
        }
    }

    public void loadStudentsFromFile() {
        try {
            File file = new File("students.txt");
            if (!file.exists()) return;
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String[] parts = reader.nextLine().split(",");
                if (parts.length == 4) {
                    int id = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    String roll = parts[2];
                    String isban = parts[3];
                    students.add(new Student(id, name, roll, isban));
                }
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Error loading students.");
        }
    }


    public static void main(String[] args) {
            LibraryManagementSystem libraryManagementSystem = new LibraryManagementSystem();
            libraryManagementSystem.menu();
        }
    }


