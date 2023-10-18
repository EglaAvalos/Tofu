/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.tofu.entities;

/**
 *
 * @author avalo
 */
public class Post {
    private String title;
    private String description;
    private Usser user;
    private int like;
    private int dislike;
    private String comments;
    private String date;
    private Category category;

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the user
     */
    public Usser getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(Usser user) {
        this.user = user;
    }

    /**
     * @return the like
     */
    public int getLike() {
        return like;
    }

    /**
     * @param like the like to set
     */
    public void setLike(int like) {
        this.like = like;
    }

    /**
     * @return the dislike
     */
    public int getDislike() {
        return dislike;
    }

    /**
     * @param dislike the dislike to set
     */
    public void setDislike(int dislike) {
        this.dislike = dislike;
    }

    /**
     * @return the comments
     */
    public String getComments() {
        return comments;
    }

    /**
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the category
     */
    public Category getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(Category category) {
        this.category = category;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param tittle the titulo to set
     */
    public void setTitle(String title) {
        this.title = title;
    }
    
    
}
