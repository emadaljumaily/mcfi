package proj;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emad mohamed
 */
public class product1 {
    
   
    private String name;
 
    private String address;
    private String phone;
  
   
    
    public product1(){}
    public product1(String Name,String phone ){
        
       
        this.name=Name;
    
        this.address=address;
        this.phone=phone;
     
    }

    

   
  
  
    public String getName(){
        return name;
        
    }
    public void setName(String Name){
        this.name=Name;
    }

  
    public String getaddress(){
        return address;
    }
    
     public void setaddress(String address){
        this.address=address;
    }
     
     
     public String getphone(){
        return phone;
    }
  public void setphone(String phone){
         this.phone=phone;
     }
}
