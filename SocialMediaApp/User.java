package com.SocialMediaApp;
import java.util.*;
public class User {
    private String userId;
    private String username;
    private String email;
    private String contact;
    private String password;
    private List<Post> posts;


    public User(String userId, String username, String email, String contact, String password){
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.contact = contact;
        this.password= password;
        this.posts = new ArrayList<>();

    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Post>getPosts(){
        return posts;
    }
    public void addPost(Post post){
        posts.add(post);
    }
    public boolean removePost(String postId){
        return posts.removeIf(post ->post.getPostId().equals(postId));
    }
    public Post getPostById(String postId){
        for(Post post:posts){
            if(post.getPostId().equals(postId)){
                return post;
            }
        }
        return null;
    }


}
