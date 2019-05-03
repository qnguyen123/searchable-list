import java.io.PrintWriter;
import java.io.StringWriter;

public class Shoes implements Comparable<Shoes >
    
 { 
   // 3 variables for size, brand and name
     private int size;
    private String brand;
    private String name;
   

    public Shoes()
    {
        size= 0;
        brand = "";
        name = ""; 
    }
   
    public Shoes(int size, String brand,  String name)
    {
        this.size = size;
        this.brand = brand;
        this.name = name; 
    }    
        
    public Shoes(Shoes other)
    {
        size = other.size;
        brand = other.brand;
        name = other.name;

    }
  // for the item exist or no
     public void setBrand(String brand)throws Exception
    {
        if (brand.length() > 0 && brand.compareTo(" ") > 0)
            this.brand = brand;
        else
           throw new Exception("Brand cannot be empty!");
    }
    
 // make sure the size bigger than 0
      public void setSize(int size) throws Exception
    {
        
           if (size > 0)
               this.size = size;
           else
               throw new Exception("size can not be less than zero");
        
    }
   // get size, name and compare
    public int getSize()
    {
        return size;
    }
  
    public String getName()
    {
        return name;
    }
    
   
    public void setName(String name)throws Exception
    {
        if (name.length() > 0)
            this.name = name;
        else
           throw new Exception("Name cannot be empty!");
    }
    
   

   public int compareTo( Shoes other)
   {
       return Integer.compare( size, other.size);
    }
   
    
  public String toString ()
  {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        pw.printf("%-5d %-11s %-15s\n", size, brand, name );
        return sw.toString();
  }
    
 
   
    
}
