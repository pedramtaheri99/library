package library;

import java.util.Scanner;
import library.bookpack.Book;
import library.personpack.Person;

/**
 * this class is writed for descript the library
 * 
 * @author pedram taheri
 * 
 * @see java.util.Scanner
 * @see java.lang
 * 
 */
public class Library {

    /**
     * this two below varriables is for the default id for persons for books
     * 
     * @author pedram taheri
     */
    private static double idPerson = 10050D;
    private static double idBook = 86000D;

    private static double[] idPersons = new double[10000000];
    private static double[] idBooks = new double[10000000];

    private static Person[] subPerson = new Person[10000000];

    private static Book[] subBook = new Book[10000000];
    private static Person[] debtlist = new Person[10000000];

    private static int year;
    private static int month;
    private static int day;

    private static int a = 0;
    private static int b = 0;
    private static int c = 0;

    Scanner inputmainmenu;
    Scanner inputsecondmenu;
    Scanner inputthirdmenu;
    Scanner input1;
    Scanner input2;
    Scanner inputforthmenu;
    Scanner input3;
    Scanner input4;
    Scanner inputfifthmenu;
    Scanner input5;
    Scanner input6;
    Scanner inputidprson;
    Scanner inputidbook;
    Scanner inputyear;
    Scanner inputmonth;
    Scanner inputday;
    Scanner inputName;
    Scanner inputNamep;

    /**
     * this method for run the program and show and start the manual
     * 
     * @author pedram taheri
     * 
     */

    public void run() {

        System.out.println("hi \nwelcome \n\nthere is a library \n");
        System.out.println("if you want to exit press 0 please ");

        while (true) {

            System.out.println(
                    "\ntype the item of below : \ncreate  \nshow  \nupdate  \ndelete  \nlend   \ndebtors list   \nsearch book   \nsearch person \n");

            String inputMainMenu;
            inputmainmenu = new Scanner(System.in);

            inputMainMenu = inputmainmenu.next();

            if (inputMainMenu.equals("0")) {

                System.out.println("\nend\nbye");
                closing();
                break;
            }

            else if (inputMainMenu.equals("create")) {

                System.out.println("\ntype the item of below : \n1 person  \n 2book ");

                String inputSecondMenu;

                inputsecondmenu = new Scanner(System.in);

                inputSecondMenu = inputsecondmenu.next();

                if (inputSecondMenu.equals("0")) {

                    System.out.println("\nend\nbye");
                    closing();

                    break;
                }

                else if (inputSecondMenu.equals("person")) {

                    subPerson[a] = new Person();

                    try {

                        subPerson[a].create();
                        idPersons[a] = idPerson;

                        System.out.println("\nthe id for " + subPerson[a].getName() + " is :   " + idPersons[a]);

                        idPerson++;
                        a++;

                    }

                    catch (RuntimeException e) {

                        System.out.println(e.getMessage());
                    }
                }

                else if (inputSecondMenu.equals("book")) {

                    subBook[b] = new Book();

                    try {
                        subBook[b].create();
                        idBooks[b] = idBook;

                        System.out.println("\nthe id for " + subBook[b].getName() + " is :   " + idBooks[b]);

                        idBook++;

                        b++;

                    } catch (RuntimeException e) {

                        System.out.println(e.getMessage());
                    }
                }

            }

            else if (inputMainMenu.equals("show")) {

                System.out.println("\ntype the item of below : \n1 person  \n2 book ");

                String inputThirdMenu;

                inputthirdmenu = new Scanner(System.in);

                inputThirdMenu = inputthirdmenu.next();

                if (inputThirdMenu.equals("0")) {

                    System.out.println("\nend\nbye");
                    closing();

                    break;
                }

                else if (inputThirdMenu.equals("person")) {

                    System.out.println("enter the id: ");

                    double checkshow;

                    input1 = new Scanner(System.in);

                    checkshow = input1.nextDouble();

                    if (checkIdPerson(checkshow) == false) {

                        System.out.println("\nnot found \ntry again");

                    }

                    else {

                        subPerson[(int) checkshow - 10050].show();

                    }

                }

                else if (inputThirdMenu.equals("book")) {

                    System.out.println("enter the id: ");

                    double checkshowbook;

                    input2 = new Scanner(System.in);

                    checkshowbook = input2.nextDouble();

                    if (checkIdBook(checkshowbook) == true) {

                        subBook[(int) checkshowbook - 86000].show();
                        if (subBook[(int) checkshowbook - 86000].getIdLend() != 0) {

                            System.out.println("\nthis book lended to user below : \n");
                            subPerson[(int) (subBook[(int) checkshowbook - 86000].getIdLend() - 10050)].show();

                            try {
                                System.out.println("date of return : " + timing(year, month, day));

                            } catch (RuntimeException e) {

                                System.out.println(e.getMessage());
                            }

                        }

                    }

                    else {

                        System.out.println("\nnot found \ntry again");

                    }
                }
            }

            else if (inputMainMenu.equals("update")) {

                System.out.println("\ntype the item of below : \n1 person  \n2 book ");

                String inputForthMenu;

                inputforthmenu = new Scanner(System.in);

                inputForthMenu = inputforthmenu.next();

                if (inputForthMenu.equals("0")) {

                    System.out.println("\nend\nbye");
                    closing();

                    break;
                }

                else if (inputForthMenu.equals("person")) {

                    System.out.println("enter the id: ");

                    double checkupdate;

                    input3 = new Scanner(System.in);

                    checkupdate = input3.nextLong();

                    if (checkIdPerson(checkupdate) == true) {

                        try {

                            subPerson[(int) checkupdate - 10050].update();
                        } catch (RuntimeException e) {

                            System.out.println(e.getMessage());
                        }

                    }

                    else {

                        System.out.println("\nnot found \ntry again");
                        ;
                    }
                }

                else if (inputForthMenu.equals("book")) {

                    System.out.println("enter the id: ");

                    double checkupdatebook;

                    input4 = new Scanner(System.in);

                    checkupdatebook = input4.nextDouble();

                    if (checkIdBook(checkupdatebook) == true) {

                        try {
                            subBook[(int) checkupdatebook - 86000].update();

                        } catch (RuntimeException e) {

                            System.out.println(e.getMessage());
                        }
                    }

                    else {

                        System.out.println("\nnot found \ntry again");
                        ;

                    }
                }
            }

            else if (inputMainMenu.equals("delete")) {

                System.out.println("\ntype the item of below : \n1 person  \n2 book ");

                String inputFifthMenu;

                inputfifthmenu = new Scanner(System.in);

                inputFifthMenu = inputfifthmenu.next();

                if (inputFifthMenu.equals("0")) {

                    System.out.println("\nend\nbye");
                    closing();

                    break;
                }

                else if (inputFifthMenu.equals("person")) {

                    System.out.println("enter the id: ");

                    double checkdelete;

                    input5 = new Scanner(System.in);

                    checkdelete = input5.nextLong();

                    if (checkIdPerson(checkdelete) == true) {

                        subPerson[(int) checkdelete - 10050].delete();

                        idPersons[(int) checkdelete - 10050] = 0;
                    }

                    else {

                        System.out.println("\nnot found \ntry again");
                    }

                }

                else if (inputFifthMenu.equals("book")) {

                    System.out.println("enter the id: ");

                    double checkdeletebook;

                    input6 = new Scanner(System.in);

                    checkdeletebook = input6.nextDouble();

                    if (checkIdBook(checkdeletebook) == true) {

                        subBook[(int) checkdeletebook - 86000].delete();

                        idBooks[(int) checkdeletebook - 86000] = 0;
                    }

                    else {

                        System.out.println("\nnot found \ntry again");
                    }
                }

            }

            else if (inputMainMenu.equals("lend")) {

                try {
                    lend();

                } catch (RuntimeException e) {

                    System.out.println(e.getMessage());
                }

            }

            else if (inputMainMenu.equals("search_book")) {

                bookSearch();
            }

            else if (inputMainMenu.equals("search_person")) {

                personSearch();
            }

            else if (inputMainMenu.equals("debtors_list")) {

                System.out.println("the debtors list: \n");

                for (int d = 0; d < c; d++) {

                    debtlist[d].show();

                }
            }

            else {

                System.out.println("\nerror \ntry again");
            }

        }

    }

    /**
     * this method for checking the id of persons. if the check varriable is false
     * mean that the id is not in the program and maybe it deleted or not define
     * 
     * @author pedram taherical
     * @param id of goal person
     * @return be true or false for check boolean varriable
     */
    private boolean checkIdPerson(double idPersonParametr) {

        boolean check = true;

        if (idPersonParametr == 0) {

            check = false;

        }

        for (int e = 0; e < idPersons.length; e++) {

            if (idPersonParametr == idPersons[e]) {

                check = true;
                break;
            }

            else {
                check = false;
            }

        }

        return check;
    }

    /**
     * this method for checking the id of books. if the check varriable is false
     * mean that the id is not in the program and maybe it deleted or not define
     * 
     * @author pedram taherical
     * @param id of goal book
     * @return be true or false for check boolean varriable
     */

    private boolean checkIdBook(double idBookParametr) {

        boolean check = true;

        if (idBookParametr == 0) {

            check = false;
        }

        for (int f = 0; f < idBooks.length; f++) {

            if (idBookParametr == idBooks[f]) {

                check = true;

                break;

            }

            else {

                check = false;
            }
        }

        return check;

    }

    /**
     * this method for lend action .this method get the numbers of day month and
     * year of lending
     * 
     * @author pedram taheri
     * 
     */

    private void lend() {

        System.out.println("\nenter the person id  and  book id : ");

        double inputIdPrson;

        inputidprson = new Scanner(System.in);

        inputIdPrson = inputidprson.nextDouble();

        if (checkIdPerson(inputIdPrson) != true) {

            System.out.println("\nnot found \ntry again");
        }

        double inputIdBook;

        inputidbook = new Scanner(System.in);

        inputIdBook = inputidbook.nextDouble();

        if (checkIdBook(inputIdBook) != true) {

            System.out.println("\nnot found \ntry again");

        }

        subBook[(int) inputIdBook - 86000].setIdLend(inputIdPrson);

        System.out.println("\nenter the date: ");
        System.out.println("year: ");

        inputyear = new Scanner(System.in);

        year = inputyear.nextInt();

        System.out.println("month: ");

        inputmonth = new Scanner(System.in);

        month = inputmonth.nextInt();

        System.out.println("day: ");

        inputday = new Scanner(System.in);

        day = inputday.nextInt();

        debtlist[c] = new Person();
        debtlist[c] = subPerson[(int) (subBook[(int) inputIdBook - 86000].getIdLend() - 10050)];
        c++;
    }

    /**
     * this method for calculating the time for getting back the lended books for
     * persons
     * 
     * @author pedram taheri
     * @param year  for years number
     * @param month for months number
     * @param day   for days number
     * @return the date for getting back the book
     */

    private String timing(int yearParametr, int monthParametr, int dayParametr) {

        if (yearParametr < 2022) {

            System.out.println("\nnot found \ntry again");

        }

        if (monthParametr <= 0 && monthParametr > 12) {

            System.out.println("\nnot found \ntry again");

        }

        if (dayParametr <= 0 && monthParametr > 30) {

            System.out.println("\nnot found \ntry again");

        }

        return yearParametr + "/" + (monthParametr + 1) + "/" + dayParametr;

    }

    /**
     * this method for the action which in its the client enter the intended book
     * name and the method show him the intended books information
     * 
     * @author pedram taheri
     */
    private void bookSearch() {

        System.out.println("\nenter the name : ");

        String bookgoal;

        inputName = new Scanner(System.in);

        bookgoal = inputName.next();

        int o = 0;

        System.out.println("the list is: \n");

        for (int g = 0; g < b; g++) {

            if (bookgoal.equals(subBook[g].getName())) {

                subBook[g].show();

                o++;
            }

            if (o == 0) {

                System.out.println("empty");
            }

        }

    }

    /**
     * this method for the action which in its the client enter the intended person
     * name and the method show him the intended persons information
     * 
     * @author pedram taheri
     */

    private void personSearch() {

        System.out.println("\nenter the name : ");

        String persongoal;

        inputNamep = new Scanner(System.in);

        persongoal = inputName.next();

        int v = 0;

        System.out.println("the list is: \n");

        for (int h = 0; h < a; h++) {

            if (persongoal.equals(subPerson[h].getName())) {

                subPerson[h].show();

                v++;

            }

            if (v == 0) {

                System.out.println("empty");
            }

        }

    }

    private void closing() {

        inputmainmenu.close();
        inputsecondmenu.close();
        inputthirdmenu.close();
        input1.close();
        input2.close();
        inputforthmenu.close();
        input3.close();
        input4.close();
        inputfifthmenu.close();
        input5.close();
        input6.close();
        inputidprson.close();
        inputidbook.close();
        inputyear.close();
        inputmonth.close();
        inputday.close();
        inputName.close();
        inputNamep.close();

        for (int t = 0; t <= a; t++) {

            subPerson[a].closeperson();

        }

        for (int z = 0; z <= b; z++) {

            subBook[b].closebook();

        }
    }
}