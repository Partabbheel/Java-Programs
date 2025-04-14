package com.SocialMediaApp;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class SocialMediaApp{
    private static List<User> users = new ArrayList<>();
    private static User currentUser = null;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        SocialMediaApp app = new SocialMediaApp();
       app.showMainMenu();
    }

    public void showMainMenu() {
        while (true) {
            System.out.println("<<<<<<Welcome to Social Media>>>>>>");
            System.out.println("1- Create Account");
            System.out.println("2- Login");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    System.out.println("Thank you for using Social Media App. Goodbye!");
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

     void createAccount() {
        System.out.println("\nCreate Account");
        System.out.print("Enter User ID: ");
        String userId = sc.nextLine();

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Contact: ");
        String contact = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        User newUser = new User(userId, username, email, contact, password);
        users.add(newUser);

        System.out.println("Account created successfully!");
    }

     void login() {
        System.out.println("\nLogin");
        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

       for (User user:users) {
           if (user.getUsername().equals(username)&& user.getPassword().equals(password)) {
                   currentUser = user;
                   System.out.println("Login successful!");
                   showUserMenu();
                   return;
               }
        }

        System.out.println("Invalid username or password. Please try again.");
    }

     void showUserMenu() {
        while (currentUser != null) {
            System.out.println("\nUser Menu");
            System.out.println("1- Update account");
            System.out.println("2- Add new post");
            System.out.println("3- Update post");
            System.out.println("4- Delete Post");
            System.out.println("5- Comment on post");
            System.out.println("6- Like a post");
            System.out.println("7- Delete comment from post");
            System.out.println("8- Show all feed");
            System.out.println("9- Logout");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    updateAccount();
                    break;
                case 2:
                    addNewPost();
                    break;
                case 3:
                    updatePost();
                    break;
                case 4:
                    deletePost();
                    break;
                case 5:
                    commentOnPost();
                    break;
                case 6:
                    likePost();
                    break;
                case 7:
                    deleteComment();
                    break;
                case 8:
                    showAllFeed();
                    break;
                case 9:
                    logout();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

     void updateAccount() {
        System.out.println("\nUpdate Account");
        System.out.println("Current Details:");
        System.out.println("Username: " + currentUser.getUsername());
        System.out.println("Email: " + currentUser.getEmail());
        System.out.println("Contact: " + currentUser.getContact());

        System.out.print("Account updated.");
        String username = sc.nextLine();
        if (!username.isEmpty()) {
            currentUser.setUsername(username);
        }

        System.out.print("Enter new Email (leave blank to keep current): ");
        String email = sc.nextLine();
        if (!email.isEmpty()) {
            currentUser.setEmail(email);
        }

        System.out.print("Enter new Contact (leave blank to keep current): ");
        String contact = sc.nextLine();
        if (!contact.isEmpty()) {
            currentUser.setContact(contact);
        }

        System.out.print("Enter new Password (leave blank to keep current): ");
        String password = sc.nextLine();
        if (!password.isEmpty()) {
            currentUser.setPassword(password);
        }

        System.out.println("Account updated successfully!");
    }

     void addNewPost() {
        System.out.println("\n<<<Add New Post>>>>");
        System.out.print("Enter post ID: ");
        String postId = sc.nextLine();

        System.out.print("Enter post text: ");
        String postText = sc.nextLine();

        Post newPost = new Post(postId, postText);
        currentUser.addPost(newPost);

        System.out.println("Posted successfully!");
    }

     void updatePost() {
        System.out.println("\nUpdate Post");
        System.out.print("Enter post ID to update: ");
        String postId = sc.nextLine();

        Post post = currentUser.getPostById(postId);
        if (post == null) {
            System.out.println("Post not found.");
            return;
        }

        System.out.println("Current post text: " + post.getPostText());
        System.out.print("Enter new post text: ");
        String newText = sc.nextLine();

        post.setPostText(newText);
        System.out.println("Post updated successfully!");
    }

     void deletePost() {
        System.out.println("\nDelete Post");
        System.out.print("Enter post ID to delete: ");
        String postId = sc.nextLine();

        if (currentUser.removePost(postId)) {
            System.out.println("Post deleted successfully!");
        } else {
            System.out.println("Post not found.");
        }
    }

      void commentOnPost() {
        System.out.println("\nComment on Post");
        System.out.print("Enter post ID: ");
        String postId = sc.nextLine();

        System.out.print("Enter your user ID: ");
        String userId = sc.nextLine();

        System.out.print("Enter comment ID: ");
        String commentId = sc.nextLine();

        System.out.print("Enter comment: ");
        String commentText = sc.nextLine();

        Post post = currentUser.getPostById(postId);
        if (post == null) {
            System.out.println("Post not found.");
            return;
        }

        Comment newComment = new Comment(commentId, userId, commentText);
        post.addComment(newComment);

        System.out.println("Comment added successfully!");
    }

     void likePost() {
        System.out.println("\nLike a Post");
        System.out.print("Enter post ID: ");
        String postId = sc.nextLine();

        System.out.print("Enter your user ID: ");
        String userId = sc.nextLine();

        Post post = currentUser.getPostById(postId);
        if (post == null) {
            System.out.println("Post not found.");
            return;
        }

        System.out.print("Do you like this post? (yes/no): ");
        String likeChoice = sc.nextLine().toLowerCase();

        if (likeChoice.equals("yes")) {
            post.addlike(userId);
            System.out.println("Post liked successfully!");
        } else if (likeChoice.equals("no")) {
            post.removelike(userId);
            System.out.println("Post unliked successfully!");
        } else {
            System.out.println("Invalid choice. Please enter 'yes' or 'no'.");
        }
    }

    private static void deleteComment() {
        System.out.println("\nDelete Comment");
        System.out.print("Enter post ID: ");
        String postId = sc.nextLine();

        System.out.print("Enter your user ID: ");
        String userId = sc.nextLine();

        System.out.print("Enter comment ID to delete: ");
        String commentId = sc.nextLine();

        Post post = currentUser.getPostById(postId);
        if (post == null) {
            System.out.println("Post not found.");
            return;
        }

        if (post.removeComment(commentId)) {
            System.out.println("Comment deleted successfully!");
        } else {
            System.out.println("Comment not found.");
        }
    }

     void showAllFeed() {
        System.out.println("\nYour Feed");
        List<Post>posts = currentUser.getPosts();
        if (posts.isEmpty()) {
            System.out.println("No posts to display.");
            return;
        }

         for(Post post:posts){
            System.out.println("\nPost ID: " + post.getPostId());
            System.out.println("Post: " + post.getPostText());
            System.out.println("Likes: " + post.getLikeCount());

            System.out.println("Comments:");
            List<Comment> comments = post.getComments();
            if (comments.isEmpty()) {
                System.out.println("  No comments yet.");
            } else {
                for (Comment comment:comments) {
                    System.out.println("  Comment ID: " + comment.getCommentId());
                    System.out.println("  User ID: " + comment.getUserId());
                    System.out.println("  Comment: " + comment.getCommentText());
                    System.out.println();
                }
                }
            }
        }

    void logout(){
      currentUser = null;
       System.out.println("Logged out successfully.");
}
}
