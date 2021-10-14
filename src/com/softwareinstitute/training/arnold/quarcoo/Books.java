package com.softwareinstitute.training.arnold.quarcoo;

public class Books extends libraryContent {

    private int pageNum;

    public Books(String genre, String author, String title, String ISP, int pageNum){
        super(genre, author, title, ISP);
        this.pageNum= pageNum;
    }

    public void printNumPages() {
        System.out.println("The name of the books is " + getTitle() + " " + pageNum);
    }

}