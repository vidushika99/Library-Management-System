package library;
// this class is foe store date time data.here we check validations for date and time
public class DateTime {
    private int day;
    private int month;
    private int year;
    private int hour;
    private int min;

    public DateTime(int day, int month, int year, int hour, int min) {
        super();
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.min = min;
    }

    public DateTime(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public DateTime() {
    }

    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public int getMin() {
        return min;
    }
    public void setMin(int min) {
        this.min = min;
    }

    public static int validationOfDay(int day) {
        if(!(day <= 1 && day <= 31)) {

            System.out.println("invalid entered.. please input value within 1 and 12");

        }
        return day;

    }

    public static int validationOfmonth(int month) {
        if(!(month >= 1 && month <= 12)) {

            System.out.println("invalid entered.. please input value within 1 and 12");

        }
        return month;

    }

    public static int validationOfhours(int hour) {
        if(!(hour >= 1 && hour <= 24)) {

            System.out.println("invalid entered.. please input value within 1 and 24");

        }
        return hour;

    }

    public static int validationOfmin(int min) {
        if(!(min >=0  && min <= 59)) {

            System.out.println("invalid entered.. please input value within 0 and 59");

        }
        return min;

    }




    public String getDate(){

        if((day>=1 && day<=9)&&(month>=1 && month<=9)) {

            return "0" + day + "/0" + month + "/" + year;

        }else if((day>=1 && day<=9)&&(month>10)) {



            return "0" + day + "/" + month + "/" + year;

        }else if((day>9)&&(month>=1 && month<=9)) {

            return day + "/0" + month + "/" + year;

        }

        else return  day + "/" + month + "/" + year;

    }

    @Override
    public String toString() {
        return "DateTime{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                ", hour=" + hour +
                ", min=" + min +
                '}';
    }


}
