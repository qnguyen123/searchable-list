import java.util.Scanner;
import java.util.Collections;
import java.util.LinkedList;
public class MyCollection extends Shoes
{
    public static LinkedList<Shoes> shoes = new LinkedList<>();
    
    public static void main (String[] str) throws Exception
    {
     add5Objects(); // add 5 objects
     boolean run = false;
        System.out.println("Begin MyCollection program\n");
        do
        {
            System.out.println("Shoes collection\n");
             Scanner in = new Scanner(System.in);
          
            display();
           
            int option = menu(in); 
             
            in.nextLine();
            
            switch(option)
            {
                case 1: System.out.println("Add a shoes.");
                        display();
                        addShoes(); 
                        System.out.println("\nNew collection: ");
                        break;
                case 2: System.out.println("Change a shoes.");
                        display();
                        changeShoes();
                        System.out.println("\nNew collection:");
                        break;                        
                case 3: System.out.println("Remove a shoes.");
                        display();
                        removeShoes();  
                        System.out.println("\nNew collection:");
                        break;
                case 4: System.out.println("Find an item.");
                        display();
                        search();
                        break;

                case 5: System.out.println("Sort the list.");
                       
                        sortShoes();              
                        break;
                case 6: run = true;
            }
            
        
        } while(!run);
          display();
        System.out.println("My collection program ended");

    }
 // method to add 5 objects   
public static void add5Objects() 
{
    
        shoes.add(new Shoes (7, "Nike", "Nike air"));
        shoes.add(new Shoes (8, "Addidas", "super star"));
        shoes.add(new Shoes (9, "puma", "Basket heart"));
        shoes.add(new Shoes (10, "vans", "old skool"));
        shoes.add(new Shoes (11, "rebook", "walk ultra"));
}
// method to call menu
 public static int menu(Scanner in) 
{
        int choice = 0;
        
        do
        {
          System. out.print("\tSelection menu\n" +
                            "\t\tAdd an item    [1]\n" +
                            "\t\tChange an item [2]\n" +
                            "\t\tRemove an item [3]\n" +
                            "\t\tFind an item [4]\n" +
                            "\t\tSort the list  [5]\n" +
                            "\t\tQuit   [6]\n" +
                            "\tSelect a number in the []: ");
            choice = in.nextInt();
            System.out.println("\f");
        } while (choice < 1 || choice > 7);
        return choice; 
}
 // methode to research
 public static void search()
      {
        Shoes search = object();
        System.out.println(search.getName() + " has been found!\n");
       }
 // method for the user enter the item
  private static Shoes userInput () throws Exception
    { 
      Scanner in = new Scanner(System.in);
      Shoes input = new Shoes();
      int count = 0;
      
       switch(count)
         {
            case 0: System.out.print("\nEnter size shoes: ");
            input.setSize(in.nextInt());
            in.nextLine();
            count++;
                            
            case 1: System.out.print("Enter brand shoes: ");
            input.setBrand(in.nextLine());
            count++; 
                           
            case 2: System.out.print("Enter the shoes name: ");
            input.setName(in.nextLine());
            count++;
            break;
                           
         }
              return input;

          }
// add method
public static Shoes addShoes() throws Exception
{
    Shoes addShoes = new Shoes();
   
    shoes.add(userInput());
    return addShoes;
}
// change method
public static void changeShoes() throws Exception
{
    shoes.set(shoes.indexOf(object()), userInput());
 }

//remove method
public static void removeShoes() throws Exception

{
    Shoes removeShoes = object();
    shoes.remove(removeShoes);
}

public static void sortShoes()
{
    Collections.sort(shoes);
}
// display method
public static void display()
{
    for (Shoes object: shoes)
    {
        System.out.print(object.toString());
    }
}
 // for the user enter the object
public static Shoes object()
    {
       
       System.out.println("Enter a size: ");
       
        Scanner in = new Scanner(System.in);
        int size =in.nextInt();
        in.nextLine();
    
        for(Shoes object: shoes)
        { 
            if (object.getSize() == size)
            {
                return object;
            }
            
        }   
        return null;
    }

}

