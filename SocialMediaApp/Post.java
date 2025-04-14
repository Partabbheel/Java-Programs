package com.SocialMediaApp;
import java.util.*;

public class Post {
    private String postId;
    private String postText;
    private List<Comment>comments;
    private List<String> liked;

    public Post(String postId,String postText){
        this.postId = postId;
        this.postText = postText;
        this.comments = new ArrayList<>();
        this.liked = new ArrayList<>();
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }
    public List<Comment>getComments(){
        return comments;
    }
    public boolean removeComment(String commentId){
        return comments.removeIf(comment ->comment.getCommentId().equals(commentId) );
    }
    public List<String>getLikedBy(){
        return liked;
    }

    public void addlike(String userId) {

    }
    public void removelike(String userId){
        liked.add(userId);
    }
    public int getLikeCount(){
        return  liked.size();
    }

    public void addComment(Comment newComment) {}
}
