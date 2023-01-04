package library;


public class MainRun {

/**
 * this method for running mainly for program and its maked for easier for classes
 * 
 * @author pedram taheri
 */
    public static void main(String[] args){

try{
  
  new Library().run();

}catch(RuntimeException e){

 System.out.println(e.getMessage());
}
   
    }
    
}