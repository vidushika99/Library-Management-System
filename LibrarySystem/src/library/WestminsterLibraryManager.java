package library;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class WestminsterLibraryManager implements LibraryManager {
    private int nDay;
    private int nMonth;
    private int nYear;

    public static List<Book> books = new ArrayList<Book>(); //create Arraylist for store book details
    public static ArrayList<DVD> dvds=new ArrayList<>(); //create Arraylist for store dvd details
    ArrayList<LibraryItem> borrow=new ArrayList<>();     //create Arraylist for store borrow item details
    ArrayList<LibraryItem> returnItem=new ArrayList<>(); //create Arraylist for store return item details

   public static ArrayList<LibraryItem> listOfItem=new ArrayList<LibraryItem>(); //create new array to add book and dvd both array is to use in library_gui class to show list of items

   public static WestminsterLibraryManager obj1=new WestminsterLibraryManager();
   DateTime obj2=new DateTime();
   static Scanner sc=new Scanner(System.in);
   public static void main(String [] args) {

       // create switch case for display menu for options

       System.out.println("");
       System.out.println("\n ------------ Library Management System ---------------");
       System.out.println("Enter 1 to add item");
       System.out.println("Enter 2 to delete item");
       System.out.println("Enter 3 to print the list of the items");
       System.out.println("Enter 4 to borrow items");
       System.out.println("Enter 5 to return items");
       System.out.println("Enter 6 to generate report");
       System.out.println("Enter 7 to open GUI");
       System.out.println("Enter x to  exit ");

       char choice = '0';

       try {
           do {

               choice = sc.next().charAt(0);
               switch (choice) {

                   case '1':
                       obj1.addItem();

                       System.out.println("");
                       System.out.println("\n ------------ Library Management System ---------------");
                       System.out.println("Enter 1 to add item");
                       System.out.println("Enter 2 to delete item");
                       System.out.println("Enter 3 to print the list of the items");
                       System.out.println("Enter 4 to borrow items");
                       System.out.println("Enter 5 to return items");
                       System.out.println("Enter 6 to generate report");
                       System.out.println("Enter 7 to open GUI");
                       System.out.println("Enter x to  exit ");
                       break;

                   case '2':
                       obj1.deleteItem();

                       System.out.println("");
                       System.out.println("\n ------------ Library Management System ---------------");
                       System.out.println("Enter 1 to add item");
                       System.out.println("Enter 2 to delete item");
                       System.out.println("Enter 3 to print the list of the items");
                       System.out.println("Enter 4 to borrow items");
                       System.out.println("Enter 5 to return items");
                       System.out.println("Enter 6 to generate report");
                       System.out.println("Enter 7 to open GUI");
                       System.out.println("Enter x to  exit ");
                       break;
                   case '3':
                       obj1.DisplayItems();

                       System.out.println("");
                       System.out.println("\n ------------ Library Management System ---------------");
                       System.out.println("Enter 1 to add item");
                       System.out.println("Enter 2 to delete item");
                       System.out.println("Enter 3 to print the list of the items");
                       System.out.println("Enter 4 to borrow items");
                       System.out.println("Enter 5 to return items");
                       System.out.println("Enter 6 to generate report");
                       System.out.println("Enter 7 to open GUI");
                       System.out.println("Enter x to  exit ");
                       break;

                   case '4':
                       obj1.borrowItem();

                       System.out.println("");
                       System.out.println("\n ------------ Library Management System ---------------");
                       System.out.println("Enter 1 to add item");
                       System.out.println("Enter 2 to delete item");
                       System.out.println("Enter 3 to print the list of the items");
                       System.out.println("Enter 4 to borrow items");
                       System.out.println("Enter 5 to return items");
                       System.out.println("Enter 6 to generate report");
                       System.out.println("Enter 7 to open GUI");
                       System.out.println("Enter x to  exit ");
                       break;

                   case '5':
                       obj1.returnItem();

                       System.out.println("\n ------------ Library Management System ---------------");
                       System.out.println("Enter 1 to add item");
                       System.out.println("Enter 2 to delete item");
                       System.out.println("Enter 3 to print the list of the items");
                       System.out.println("Enter 4 to borrow items");
                       System.out.println("Enter 5 to return items");
                       System.out.println("Enter 6 to generate report");
                       System.out.println("Enter 7 to open GUI");
                       System.out.println("Enter x to  exit ");
                       break;

                   case '6':
                       obj1.generateReport();

                       System.out.println("");
                       System.out.println("\n ------------ Library Management System ---------------");
                       System.out.println("Enter 1 to add item");
                       System.out.println("Enter 2 to delete item");
                       System.out.println("Enter 3 to print the list of the items");
                       System.out.println("Enter 4 to borrow items");
                       System.out.println("Enter 5 to return items");
                       System.out.println("Enter 6 to generate report");
                       System.out.println("Enter 7 to open GUI");
                       System.out.println("Enter x to  exit ");
                       break;

                   case '7':{
                       listOfItem.addAll(books);
                       listOfItem.addAll(dvds);

                       JFrame jf=new JFrame();
                       Library_gui obj=new Library_gui(listOfItem);
                       jf.setTitle("Library Management System");
                       jf.setSize(550,500);
                       jf.setVisible(true);
                       jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                       jf.add(obj);
                       jf.setVisible(true);
                       JPanel panel=new JPanel();

                       System.out.println("");
                       System.out.println("\n ------------ Library Management System ---------------");
                       System.out.println("Enter 1 to add item");
                       System.out.println("Enter 2 to delete item");
                       System.out.println("Enter 3 to print the list of the items");
                       System.out.println("Enter 4 to borrow items");
                       System.out.println("Enter 5 to return items");
                       System.out.println("Enter 6 to generate report");
                       System.out.println("Enter 7 to open GUI");
                       System.out.println("Enter x to  exit ");
                       break;
                   }
                   case 'x':

                       System.out.println("Exit");
                       System.exit('X');
                       System.exit('x');
                       break;
               }
           } while (choice != 'X' || choice != 'x');
       } catch (Exception e) {
           System.err.println("Please enter valid input");
           main(null);
       }

   }
   //methos for select which item that want to add.
   public void addItem(){
       System.out.println("Enter 1 to add book");
       System.out.println("Enter 2 to add dvd ");

       char select=sc.next().charAt(0);
       switch (select){
           case '1':
               obj1.addBook();
           break;
           case '2':
                obj1.addDvd();
               break;


       }
   }
   //method for add book details.here save enterd details to the books arraylist and
   //add to BOOK object
   public  void addBook(){
       String pd="";
       //check no of items in the array.only allow 100 items.if it exceed show message
      if(books.size() >100){
          System.out.println("no more space available ");
      }else {
          System.out.println((100 - books.size()) + " " + "spaces are available "); //show no of available space
          System.out.println("Enter ISBN number ");
          String ISBN = sc.next();
          System.out.println("Enter book title ");
          String title = sc.next();
          System.out.println("Enter the sector ");
          String sector = sc.next();
          int day = 0;
          int month = 0;
          boolean c = true;
          while (c) {
              System.out.println("Enter borrowed date. use [year/month/date] format ");
              pd = sc.next();                                                                    // validation for borrow date
              String array1[] = pd.split("/");
              month = Integer.parseInt(array1[1]);
              day = Integer.parseInt(array1[2]);
              if (!((month >= 1 && month <= 12)&&(day >= 1 && day <= 31))) {
                  System.out.println("Invalid entered.. please input value in valid range");
              } else {
                  c = false;
              }
          }
          String Publication_date=pd;
          List<String> authors = new ArrayList<>();
          System.out.println("Enter author's name ");
          String author = sc.next();
          authors.add(author);
          System.out.println("Enter  publisher's name ");
          String publisher = sc.next();
          System.out.println("Enter the number of pages of the book: ");
          int noOfPages = sc.nextInt();
          System.out.println("Successfully added... ");

          Book book = new Book(ISBN, title, sector, Publication_date, author, publisher, noOfPages);
          books.add(book); // add to books arraylist

      }
   }
    //method for add book details.here save enterd details to the books arraylist and
    //add to BOOK object
   public void addDvd(){
       String pd="";
       //check no of items in the array.only allow 50 items.if it exceed show message
       if(dvds.size() >50){
           System.out.println("no more space available ");
       }else{
           System.out.println((50 - dvds.size()) + " " + "spaces are available "); //display no of available space
           System.out.println("Enter ISBN number ");
           String ISBN = sc.next();
           System.out.println("Enter Dvd title ");
           String title = sc.next();
           System.out.println("Enter the sector ");
           String sector = sc.next();
           int day = 0;
           int month = 0;
           boolean c1 = true;
           while (c1) {
               System.out.println("Enter borrowed date.use [year/month/date] format ");
               pd = sc.next();
               String array1[] = pd.split("/");
               month = Integer.parseInt(array1[1]);
               day = Integer.parseInt(array1[2]);
               if (!((month >= 1 && month <= 12)&&(day >= 1 && day <= 31))) {             //validation for borrow date
                   System.out.println("Invalid entered.. please input value in valid range");
               } else {
                   c1 = false;
               }
           }
           String Publication_date=pd;
           System.out.println("Enter the languages ");
           String languages=sc.next();
           System.out.println("Enter the subtitles ");
           String subTitles=sc.next();
           System.out.println("Enter producer's name: ");
           String producer=sc.next();
           System.out.println("Enter the actors' name: ");
           String actors = sc.next();
           System.out.println("Successfully added... ");
           DVD dvd=new DVD(ISBN, title, sector, Publication_date, languages,subTitles, producer, actors);
           dvds.add(dvd); // add to dvd datails to dvd arraylist
       }
   }
  //this method for delete item.item can delete by giving isbn no of the item
   public void deleteItem(){
       System.out.println("Enter ISBN no");
       String isbn_no=sc.next();
       try{
       for(Book bk:books){        //check in book array for given isbn
           if(bk.getISBN().equals(isbn_no)){
               System.out.println("successfully deleted ");
               System.out.println(" deleted item type is : Book");
               books.remove(bk); // remove item from the arraylist
               System.out.println((100-books.size())+" "+"spaces are available"); //display no of available spaces after delete itam
           }else{
               System.out.println("not founded ");
           }
       }
       for(DVD dv:dvds){      //check in dvd array for given isbn
           if(dv.getISBN().equals(isbn_no)){
               System.out.println("successfully deleted ");
               System.out.println("Deleted item type is : DVD");
               dvds.remove(dv);     // remove item from the arraylist
               System.out.println((50-dvds.size())+" "+"spaces are available");    //display no of available spaces after delete itam
           }else{
              // System.out.println("not founded");
           }
       }
       }catch(ConcurrentModificationException ex){}


       }
       //this method is for display all items/here display isbn no,titile and type of the all items that added into system
   public void DisplayItems(){

             for(Book n:books){
                 System.out.println("ISBN no:"+" "+n.getISBN()+"  " +"Tittle:"+" "+n.getTitle()+"  "+"Type:"+" "+"Book");

             }
             for(DVD n:dvds){
                 System.out.println("ISBN no:"+" "+n.getISBN()+"  " +"Tittle:"+" "+n.getTitle()+"  "+"Type:"+" "+"DVD");

           }
       }

     //this method is for check the item availability.check whether item is aready in the borrow list or not.
    //this method is using in borrowItem method for check availabilty
    public boolean checkAvailablity(String ISBN){
        for (int j=0;j<borrow.size();j++) {

            if (borrow.get(j).getISBN().equals(ISBN)) {
                nDay=borrow.get(j).getNextAvailable_date().getDay();
                nMonth=borrow.get(j).getNextAvailable_date().getMonth();
                nYear=borrow.get(j).getNextAvailable_date().getYear();

                return false;

            }
        }
        return true;
    }

    // in this method get borrow item details and add it into borrow arraylist.
    //calculate naxt available date for items. book can borrow for 7 days and dvd can borrow for 3 days.
    public void borrowItem() {

        int i;
        System.out.println("Enter ISBN number ");
        String ISBN = sc.next();
        if (!checkAvailablity(ISBN)) {
            System.out.println("Item is currently not available");
            System.out.println("Item will be available on :"+" "+ nYear+"/"+nMonth+"/"+nDay);

        } else {
            int day = 0;
            int month = 0;
            int year = 0;
            boolean c = true;
            while (c) {
                System.out.println("Enter borrowed date. use [year/month/date] format ");
                String borrowed_date = sc.next();
                String array1[] = borrowed_date.split("/");
                year = Integer.parseInt(array1[0]);
                month = Integer.parseInt(array1[1]);
                day = Integer.parseInt(array1[2]);
                if (!((month >= 1 && month <= 12)&&(day >= 1 && day <= 31))) {          //validation for date
                    System.out.println("Invalid entered.. please input value in valid range");
                } else {
                    c = false;
                }
            }
            int hour=0;
            int min=0;
            boolean condition=true;
            while(condition) {
                System.out.println("Enter borrowed time. use [hour:min] 24 hours format ");
                String borrowed_time = sc.next();
                String array2[] = borrowed_time.split(":");
                 hour = Integer.parseInt(array2[0]);
                 min = Integer.parseInt(array2[1]);
                if(!((hour>=0 && hour<=24) && (min>=0 && min<=60))){             //validation for time
                    System.out.println("Invalid entered.. please input value in valid range");
                }else{
                    condition=false;
                }

            }
            System.out.println("Enter the  current reader ");
            String current_reader = sc.next();

            DateTime borrowed_date_time = new DateTime(day, month, year, hour, min);

            LibraryItem libraryItem = new LibraryItem(ISBN, borrowed_date_time, current_reader);
            borrow.add(libraryItem);       //add to borrow details into borrow arraylist
            System.out.println("Borrow item details are successfully added ");

            //borrow.forEach(book -> System.out.println(book));
            //calculate next Available date for books.add 7 days to borrowed date
            DateTime availableDate = new DateTime(day, month, year);
            for (Book bk : books) {
                if (bk.getISBN().equals(ISBN)) {
                    for (LibraryItem li : borrow) {

                        if (li.getISBN().equals( ISBN)) {
                            i = borrow.indexOf(li);
                            availableDate.setDay(borrow.get(i).getBorrowed_date_time().getDay());
                            availableDate.setMonth(borrow.get(i).getBorrowed_date_time().getMonth());
                            if (availableDate.getDay() > 30) {
                                if ((availableDate.getMonth() < 8 && ((availableDate.getMonth() % 2) == 1) || (availableDate.getMonth() == 8) || ((availableDate.getMonth() == 10)) || ((availableDate.getMonth() == 12)))) {
                                    availableDate.setDay(7);
                                    availableDate.setMonth(availableDate.getMonth() + 1);

                                    if (availableDate.getMonth() > 12) {
                                        availableDate.setMonth(1);
                                        availableDate.setYear((availableDate.getYear()) + 1);
                                    }
                                }
                            } else {
                                if (availableDate.getDay() > 24) {
                                    if ((availableDate.getMonth() < 8 && ((availableDate.getMonth() % 2) == 1) || (availableDate.getMonth() == 8) || ((availableDate.getMonth() == 10)) || ((availableDate.getMonth() == 12)))) {
                                        availableDate.setDay(31 - availableDate.getDay());
                                        availableDate.setDay(7 - availableDate.getDay());
                                        availableDate.setMonth(availableDate.getMonth() + 1);

                                        if (availableDate.getMonth() > 12) {
                                            availableDate.setMonth(1);
                                            availableDate.setYear((availableDate.getYear()) + 1);
                                        }
                                    } else {
                                        availableDate.setDay(30 - availableDate.getDay());
                                        availableDate.setDay(7 - availableDate.getDay());
                                        availableDate.setMonth(availableDate.getMonth() + 1);

                                        if (availableDate.getMonth() > 12) {
                                            availableDate.setMonth(1);
                                            availableDate.setYear((availableDate.getYear()) + 1);
                                        }
                                    }

                                } else {
                                    availableDate.setDay(availableDate.getDay() + 7);
                                }
                            }
                            li.setNextAvailable_date(availableDate);
                            //System.out.println("Next available date is : " + li.getNextAvailable_date());
                            System.out.println("Book Will Be Available On: " + availableDate.getYear() + "/" + availableDate.getMonth() + "/" + availableDate.getDay());

                        }
                    }
                }
            }
            //calculate next Available date for dvds.add 3 days to borrowed date
            for (DVD dv : dvds) {
                if (dv.getISBN().equals(ISBN)) {
                    for (LibraryItem li : borrow) {

                        if (li.getISBN() == ISBN) {
                            i = borrow.indexOf(li);
                            availableDate.setDay(borrow.get(i).getBorrowed_date_time().getDay());
                            availableDate.setMonth(borrow.get(i).getBorrowed_date_time().getMonth());
                            if (availableDate.getDay() > 30) {
                                if ((availableDate.getMonth() < 8 && ((availableDate.getMonth() % 2) == 1) || (availableDate.getMonth() == 8) || ((availableDate.getMonth() == 10)) || ((availableDate.getMonth() == 12)))) {
                                    availableDate.setDay(3);
                                    availableDate.setMonth(availableDate.getMonth() + 1);

                                    if (availableDate.getMonth() > 12) {
                                        availableDate.setMonth(1);
                                        availableDate.setYear((availableDate.getYear()) + 1);
                                    }
                                }
                            } else {
                                if (availableDate.getDay() > 28) {
                                    if ((availableDate.getMonth() < 8 && ((availableDate.getMonth() % 2) == 1) || (availableDate.getMonth() == 8) || ((availableDate.getMonth() == 10)) || ((availableDate.getMonth() == 12)))) {
                                        availableDate.setDay(31 - availableDate.getDay());
                                        availableDate.setDay(3 - availableDate.getDay());
                                        availableDate.setMonth(availableDate.getMonth() + 1);

                                        if (availableDate.getMonth() > 12) {
                                            availableDate.setMonth(1);
                                            availableDate.setYear((availableDate.getYear()) + 1);
                                        }
                                    } else {
                                        availableDate.setDay(30 - availableDate.getDay());
                                        availableDate.setDay(3 - availableDate.getDay());
                                        availableDate.setMonth(availableDate.getMonth() + 1);

                                        if (availableDate.getMonth() > 12) {
                                            availableDate.setMonth(1);
                                            availableDate.setYear((availableDate.getYear()) + 1);
                                        }
                                    }

                                } else {
                                    availableDate.setDay(availableDate.getDay() + 3);
                                }
                            }
                            li.setNextAvailable_date(availableDate);
                            //System.out.println("Next available date is : " + li.getNextAvailable_date());
                            System.out.println("Dvd Will Be Available On : " + availableDate.getYear() + "/" + availableDate.getMonth() + "/" + availableDate.getDay());

                        }
                    }

                }
            }
        }
    }
    //in this method get return item details and add in to return arraylist.
    // check the overdue days.  check extra no of daays frn next Available date
    //calculate fee for extra hours. $3 for extra hours in first 3 days and $5 for extra hours after 3 days
       public void returnItem(){

      System.out.println("Enter ISBN number ");
      String ISBN = sc.next();
      for(int i=0; i<borrow.size();i++){
          if((borrow.get(i).getISBN()).equals(ISBN)){
              int d2 = 0;
              int m2 = 0;
              int y2 = 0;
              boolean c = true;
              while (c) {
                  System.out.println("Enter Return date. use [year/month/date] format ");
                  String return_date = sc.next();
                  String array1[] = return_date.split("/");
                  y2 = Integer.parseInt(array1[0]);
                  m2 = Integer.parseInt(array1[1]);
                  d2 = Integer.parseInt(array1[2]);
                  if (!((m2 >= 1 && m2 <= 12)&&(d2 >= 1 && d2 <= 31))) {          //validation for date
                      System.out.println("Invalid entered.. please input value in valid range");
                  } else {
                      c = false;
                  }
              }
              int h2=0;
              int min2=0;
              boolean condition=true;
              while(condition) {
                  System.out.println("Enter Return time. use [hour:min] 24 hours format ");
                  String return_time = sc.next();
                  String array2[] = return_time.split(":");
                  h2 = Integer.parseInt(array2[0]);
                  min2 = Integer.parseInt(array2[1]);
                  if(!((h2>=0 && h2<=24) && (min2>=0 && min2<=60))){             //validation for time
                      System.out.println("Invalid entered.. please input value in valid range");
                  }else{
                      condition=false;
                  }

              }
              //System.out.println("Enter Return time.use[hour:min] 24 hours  format  ");
              //String return_time=sc.next();
              //String arraytime[] = return_time.split(":");
              System.out.println("Your Return is successful");

              //int h2 = Integer.parseInt(arraytime[0]);
              //int min2 = Integer.parseInt(arraytime[1]);
              DateTime return_date_time=new DateTime(d2, m2, y2, h2, min2);

              for(i=0;i<borrow.size();i++){
                  if(borrow.get(i).getISBN().equals(ISBN)){
                      //fine calculation
                      int d= borrow.get(i).getNextAvailable_date().getDay();
                      int m = borrow.get(i).getNextAvailable_date().getMonth();
                      int yr  = borrow.get(i).getNextAvailable_date().getYear();
                      int hr  = borrow.get(i).getBorrowed_date_time().getHour();
                      int day = 0, month=0,year=0;
                      double fine =0.0;
                      if (d2<d){
                          if(m2 >= m){
                              day=(d2+((m2-m)*30)-d);

                          }else {
                              day=0;

                          }
                      }else if(d2>d){
                          if(m2 >= m){
                              day=((d2-d)+((m2-m)*30));


                          }else {
                              day=d2-d;

                          }
                      }else if(d2==d){
                          if(m2>m){
                              day=((m2-m)*30);
                          }else{
                              day=0;
                          }

                      }
                      year= y2 - yr;
                      System.out.println("No Of Overdue days = "+day);
                      Integer overdueDays=day;
                      if(day>3) {                           //calculate fine.$3 for extra hours in first 3 days and $5 for extra hours after 3 days
                          fine=((3*24*0.2)+((day-3)*24*0.5)-((h2-hr)*0.5));
                      }else {
                          if((day<3) && (day>0)) {
                              fine=((day*24*0.2)-((h2-hr)*0.2));
                          }else{
                                  fine = 0.0;
                          }
                      }

                      borrow.get(i).setFine(fine);
                      System.out.println("Fine = $"+borrow.get(i).getFine());
                      borrow.get(i).setOverdueDays(day);

                      LibraryItem libraryItem=new LibraryItem(ISBN,return_date_time,fine,overdueDays);
                      returnItem.add(libraryItem);

                  }
                  borrow.remove(i);//remove from borrow list
      }
          }else{
              System.out.println("invalid Return item id ");
          }

      }

  }
  //generate report with all the items	overdue	and	the	corresponding fee.Order	the	list from the item	that has been borrowed	for	the	longest	period..
  public void generateReport(){
       Collections.sort(returnItem);
      for(LibraryItem n:returnItem){
          System.out.println("ISBN no:"+" "+n.getISBN()+"  " +"Return Date:"+" "+n.getReturn_date_time().getYear()+"/"+n.getReturn_date_time().getMonth()+"/"+n.getReturn_date_time().getDay()+"  "+
                  "Return time:"+" "+n.getReturn_date_time().getHour()+":"+n.getReturn_date_time().getMin()+"  "+"No of Overdue days:"+n.getOverdueDays()+" "+"fine:"+n.getFine()+"$");

      }


  }



}
















