package library.bookpack;

import java.util.Scanner;
import library.Thing;

/**
 * this class is writed for descript the books
 * 
 * @author pedram taheri
 * @see java.util.Scanner
 * @see java.lang
 */

public class Book implements Thing {

  private String name;
  private String author;
  private int page;
  private String subject;
  private double idLend = 0;

  Scanner inputname;
  Scanner inputAuthor;
  Scanner inputSubject;
  Scanner inputPage;
  Scanner inputnameu;
  Scanner inputAuthoru;
  Scanner inputSubjectu;
  Scanner inputPageu;
  Scanner inputidlend;

  @Override

  public String getName() {

    return name;
  }

  public void setIdLend(double idLendParametr) {

    idLend = idLendParametr;
  }

  public double getIdLend() {

    return idLend;
  }

  /**
   * this method writed for getting the information of books
   * 
   * @author pedram taheri
   */

  @Override
  public void create() {

    System.out.println("\nenter the name : ");

    inputname = new Scanner(System.in);

    name = inputname.next();

    if (name.length() == 0)
      throw new RuntimeException("error \nfill the name");

    System.out.println("enter the author : ");

    inputAuthor = new Scanner(System.in);

    author = inputAuthor.next();

    if (author.length() == 0)
      throw new RuntimeException("error \nfill the authors name");

    System.out.println("enter the subject : ");

    inputSubject = new Scanner(System.in);

    subject = inputSubject.next();

    if (subject.length() == 0)
      throw new RuntimeException("error \nfill the subject");

    System.out.println("enter the page : ");

    inputPage = new Scanner(System.in);

    page = inputPage.nextInt();

    if (page <= 0)
      throw new RuntimeException("error \nfill the page");

  }

  /**
   * this method writed for showing the information of books
   * 
   * @author pedram taheri
   */

  @Override
  public void show() {

    System.out.println("\nthe name is : " + name);
    System.out.println("the author is : " + author);
    System.out.println("the subject is : " + subject);
    System.out.println("the page number is : " + page);

  }

  /**
   * this method writed for editing the information of books
   * 
   * @author pedram taheri
   */

  @Override
  public void update() {

    System.out.println("\nenter new value of name :");

    inputnameu = new Scanner(System.in);

    name = inputnameu.next();

    if (name.length() == 0)
      throw new RuntimeException("error \nfill the name");

    System.out.println("enter new value of author :");

    inputAuthoru = new Scanner(System.in);

    author = inputAuthoru.next();

    if (author.length() == 0)
      throw new RuntimeException("error \nfill the authors name");

    System.out.println("enter new value of subject :");

    inputSubjectu = new Scanner(System.in);

    subject = inputSubjectu.next();

    if (subject.length() == 0)
      throw new RuntimeException("error \nfill the subject");

    System.out.println("enter new value of page number :");

    inputPageu = new Scanner(System.in);

    page = inputPageu.nextInt();

    if (page <= 0)
      throw new RuntimeException("error \nfill the page");

    System.out.println("enter new value of idlend :");

    double testidlend;

    inputidlend = new Scanner(System.in);

    setIdLend(inputidlend.nextDouble());

    testidlend = inputidlend.nextDouble();

    if (testidlend < 0)
      throw new RuntimeException("error \nfill the idlend");

  }

  /**
   * this method writed for deleting the information of books
   * 
   * @author pedram taheri
   */

  @Override
  public void delete() {

    System.out.println("\nthe " + name + "  is deleted");

    name = null;
    author = null;
    subject = null;
    page = 0;
    setIdLend(0);

  }

  public void closebook() {

    inputname.close();
    inputAuthor.close();
    inputSubject.close();
    inputPage.close();
    inputnameu.close();
    inputAuthoru.close();
    inputSubjectu.close();
    inputPageu.close();
    inputidlend.close();

  }

}