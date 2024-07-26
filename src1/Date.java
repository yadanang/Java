public class Date {

    private  int year;
    private  int month;
    private  int day;

    public int getYear() {   //-----------------------------------
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {     //-------------------------------
        this.day = day;
    }

    public Date(int year, int month) {
        this.year = year;
        this.month = month;
        System.out.println("两个参数的构造方法");
    }

    public Date (){
        this( 6,6,6);
        year = 11;
        month = 11;
        day = 11;
        System.out.println("调用了无参数的构造方法");

    }

    public Date (int year, int month, int day){
        this.year = year;
         this.month = month;
          this.day = day;
        System.out.println("调用了三个参数的构造方法");
    }

    public void setDay(int year,int month,int day) {
       this.day = day; //d.day = day
         this.month = month;
         this.year = year;
    }


    public void setWeek() {
        System.out.println("星期的英语week");
    }

    public void printDate(){
        System.out.println(this.year+"/"+this.month+"/"+this.day);
        this.setWeek();
    }


    public static void main(String[] args) {
        Date d = new Date();
       // d.setDay( 3023,23,3);
        //d.printDate();
    }
}




class Test{
    public static void main(String[] args) {
        Date d = new Date();
        d.setDay(666);
        d.setMonth(777);
        d.setYear(888);
        System.out.println(d.getDay());
        System.out.println(d.getMonth());
        System.out.println(d.getYear());

    }
}