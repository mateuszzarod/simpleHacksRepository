package ForumUser;

import java.util.ArrayList;
import java.util.LinkedList;


//creating User object
//posts and comments are hidden in list

public class ForumUser {
    private String name;
    private String realName;
    private ArrayList<ForumPost> posts = new ArrayList<ForumPost>();
    private LinkedList<ForumComment> comments = new LinkedList<ForumComment>();

    public ForumUser(String name, String realName) {
        this.name = name;
        this.realName = realName;
    }

    //you add post
    //creates new ForumPost object and adds to list of posts
    public void addPost(String author, String postBody) {
        ForumPost thePost = new ForumPost(postBody, author);
        posts.add(thePost);
    }

    //same here but comment
    public void addComment(ForumPost thePost, String author, String commentBody) {
        ForumComment theComment = new ForumComment(thePost, author, commentBody);
        comments.add(theComment);
    }

    public int getPostsQuantity() {
        return posts.size();
    }

    public int getCommentsQuantity() {
        return comments.size();
    }

    //return null if is empty
    public ForumPost getPost(int postNumber) {
        ForumPost thePost = null;
        if (postNumber >= 0 && postNumber < posts.size()) {
            thePost = posts.get(postNumber);
        }
        return thePost;
    }

    public ForumComment getComment(int commentNumber) {
        ForumComment theComment = null;
        if(commentNumber >= 0 && commentNumber < comments.size()){
            theComment = comments.get(commentNumber);
        }
        return theComment;
        // returning null means that the operation was unsuccessful         return null;
    }

    public boolean removePost(ForumPost thePost) {
        boolean result = false;
        //contains -> remove
        //flaga true - usuwa i przy okazji oznacza true
        if (posts.contains(thePost)){
            posts.remove(thePost);
            result = true;
        }
        return result;
    }

    public boolean removeComment(ForumComment theComment) {
        boolean result = false;
        if (comments.contains(theComment)){
            comments.remove(theComment);
            result = true;
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }
}
