package com.twu.biblioteca;

public class Books {
    private String title;
    private String author;
    private int publishDate;
    protected int quantity;

    Books(String title, String author, int date, int quantity){
        this.title = title;
        this.author = author;
        this.publishDate = date;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getPublishDate(){
        return publishDate;
    }
}
