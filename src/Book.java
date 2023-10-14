package src;

public class Book{
    private String title, author;
    private int end_day, end_month;
    
    public Book(int end_day, int end_month, String author, String title){
        this.end_day = end_day;
        this.end_month = end_month;
        this.title = title;
        this.author = author;
    }

    public Book(){}

    public Book(Book book){
        this.author = book.author;
        this.title = book.title;
        this.end_day = book.end_day;
        this.end_month = book.end_month;
    }

    // @Override
    // public Object clone() throws CloneNotSupportedException{
    //     Book book = (Book) super.clone();
    //     return book;
    // }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setEndDay(int end_day){
        this.end_day = end_day;
    }

    public void setEndMonth(int end_month){
        this.end_month = end_month;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public Integer getEndDay(){
        return this.end_day;
    }

    public Integer getEndMonth(){
        return this.end_month;
    }

    private String end_date(){
        String output;
        if (this.end_day / 10 == 0)
            output = "0" + this.end_day + ".";
        else
            output = "" + this.end_day + ".";
        if (this.end_month / 10 == 0)
            output = output + "0" + this.end_month;
        else
            output = output + this.end_month;
        return output;
    }

    public String toString(){
        return new String("Название книги: " 
        + this.title + "\n" + "Автор: " 
        + this.author + "\n" + "Нужно сдать до: " + this.end_date());
    }
    
    
}
