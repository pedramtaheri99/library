package library.personpack;

import java.util.Scanner;
import library.Thing;


/**
 * this class is writed for descript the persons
 * 
 * @author pedram taheri
 * @see java.util.Scanner
 * @see java.lang 
 */

 public class Person  implements Thing {

   
  private String name;
  private  int age ;
   private char  gender;

   Scanner inputname;
   Scanner inputlastname;
   Scanner inputage;
   Scanner inputgender ;
   Scanner inputnameu;
   Scanner inputlastnameu;
   Scanner inputageu;
   Scanner inputgenderu;


   @Override

   public String getName() {

    return name;
   }
   
   /**
 * this method writed for getting the information of persons
 * @author pedram taheri
 */ 



 @Override
 public void create(){

        System.out.println("\nenter the name & lastname: ");

        inputname = new Scanner(System.in) ;
        inputlastname = new Scanner(System.in);
       name = inputname.next() + " " + inputlastname.next();

      
     

       if (name.length() <= 3)

        throw new RuntimeException("error \nfill the name");

       
       
       

 System.out.println("enter the age : ");
 inputage = new Scanner(System.in);

 age = inputage.nextInt();

 

 if (100< age && age <1)
       throw new RuntimeException("error \nfill the age");

System.out.println("enter the gender :  f(female) or m(male)");

 String gender2;

 inputgender = new Scanner(System.in);


 gender2 = inputgender.next();
char [] gender3 = gender2.toCharArray();
gender = gender3[0];



 if (gender2.length() == 0)
 throw new RuntimeException("error \nfill the gender");

 



}

 /**
 * this method writed for showing the information of persons
 * @author pedram taheri
 */ 

 @Override
    public  void show(){

      System.out.println("\nthe name is : "+ name);
System.out.println("the age is : "+ age);
if (gender == 'f')
System.out.println("the gender is : female" );
else
System.out.println("the gender is : male" );
        }
    
 /**
 * this method writed for editing the information of persons
 * @author pedram taheri
 */ 

 @Override
    public  void update(){

        System.out.println("\nenter new value of name :" );

        inputnameu = new Scanner(System.in);
        inputlastnameu = new Scanner(System.in);
       name = inputname.next() + " " + inputlastname.next();

         

   
               
                if (name.length() == 0)
                throw new RuntimeException("error \nfill the name");
         
                System.out.println("enter new value of age :" );

                inputageu = new Scanner(System.in);

                  age = inputageu.nextInt();

               
                
                if (100< age && age <1 )
                throw new RuntimeException("error \nfill the age");
         
                System.out.println("enter new value of gender : f(female) or m(male):" );
                
                String gender2;

                inputgenderu = new Scanner(System.in);
                  gender2 = inputgenderu.next();
                char [] gender3 = gender2.toCharArray();
                gender = gender3[0];
              
              

                if (gender2.length() == 0)
                throw new RuntimeException("error \nfill the gender");
                
              }
    
 /**
 * this method writed for deleting the information of persons
 * @author pedram taheri
 */ 

 @Override
    public void delete(){

       System.out.println("\nthe "+ name + "  is deleted");

                    name = null;
               age = 0;
               gender = 0;
              }

      


      public void closeperson(){

        inputname.close();
        inputlastname.close(); 
        inputage.close();
        inputgender.close();
        inputnameu.close();
        inputlastnameu.close(); 
        inputageu.close();
        inputgenderu.close();


      }

    }