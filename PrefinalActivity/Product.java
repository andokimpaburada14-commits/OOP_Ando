/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrefinalActivity;

/**
 *
 * @author User
 */
public class Product {
    
    private String productld;
    private String productName;
    private String category;
    private double price;
    private int quantity;
    
    
    public Product(String productld,
    String productName,String category,
          double price,int quantity) {
        this.productld = productld;
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
        
    }
    
    public String getProduct(){
        return productld;
    }
    public void setProductld(String productld){
        this.productld = productld;
    }
    public String getProductName(){
        return productName;
    }
    public void setProductName(String productName){
        this.productName = productName;
    }
    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;    
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    //
    
    public double
   calculateInventoryValue(){
       return price * quantity;
   }
   //
   
   public String getStockStatus(){
       if(quantity == 0){
           return "Out of stock";
       } else if (quantity >=1&& quantity <=10){
           return "Low Stock";
       
       } else if (quantity >= 11 && quantity <=50){
           return "Normal stock";
       }else{
           return "High Stock";
       }
       
   }
   ///
  
   public void displayProductlnfo(){
       System.out.println("=======PRODUCT INFORMATION=====");
       System.out.println("Product ID: "+ productld);
       System.out.println("Product Name: " + productName);
       System.out.println("Category: "+category);
       System.out.printf("Price:$%,.2f%n",price);
       System.out.println("Quantity: "+ quantity);
       System.out.printf("Inventory Value: $%,.2f%n" , calculateInventoryValue());
       System.out.println("Stock Status: "+ getStockStatus());
   }
}
