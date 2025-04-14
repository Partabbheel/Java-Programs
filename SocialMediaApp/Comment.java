package com.SocialMediaApp;

public class Comment {
    private String commentId;
    private String userId;
    private String  commentText;

    public Comment(String commentId,String userId,String commentText){
        this.commentId = commentId;
        this.userId = userId;
        this.commentText = commentText;
    }

    public String getCommentId() {
        return commentId;
    }

    public String getUserId() {
        return userId;
    }

    public String getCommentText() {
        return commentText;
    }
}
