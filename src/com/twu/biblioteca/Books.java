package com.twu.biblioteca;

public class Books {
    private String title;
    private String author;
    private int publishDate;

    Books(String title, String author, int date){
        this.title = title;
        this.author = author;
        this.publishDate = date;
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
