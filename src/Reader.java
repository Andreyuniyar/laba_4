package src;

public class Reader {
    Book book;
    String name;

    public Reader(Book book, String name){
        this.book = new Book(book);
        this.name = name;
    }

    public String day_string(int day){
        switch (day){
            case (1):
                return "день";
            case (2):
                return "дня";
            case (3):
                return "дня";
            case (4):
                return "дня";
            default:
                return "дней";
        }
    }

    public String month_string(int month){
        switch (month){
            case (1):
                return "месяц";
            case (2):
                return "месяца";
            case (3):
                return "месяца";
            case (4):
                return "месяца";
            default:
                return "месяцев";
        }
    }

    public String in_time(int day, int month){
        if ((day <= this.book.getEndDay()) && (month <= this.book.getEndMonth())){
            return "Пользователь вовремя сдал книгу";
        }
        else{
            if (month == this.book.getEndMonth()){
                if (day > this.book.getEndDay()){
                    return "Пользователь просрочил на " + day + " " + day_string(day % 10);
                }
                else {
                    int new_day = (30 - this.book.getEndDay()) + day;
                    return "Пользователь просрочил на " + new_day + " " + day_string(day % 10);
                }
            }
            else {
                int new_month = month - this.book.getEndMonth();
                if (day > this.book.getEndDay()){
                    return "Пользователь просрочил на " 
                    + day + " " + day_string(day % 10) 
                    + " и " + new_month + " " + month_string(new_month % 10);
                }
                else {
                    int new_day = (30 - this.book.getEndDay()) + day;
                    return "Пользователь просрочил на " 
                    + new_day + " " + day_string(day % 10)
                    + " и " + new_month + " " + month_string(new_month % 10);
                }
            }
        }
    }
}