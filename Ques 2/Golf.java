package org.oct3;

import java.util.*;
class RegularMemeber {
    int membership_fee=0;
    int enrollment_fee=0;
    
    int charges_per_month=20000;
    
    int months;
    
    public RegularMemeber(int months) {
        super();
        this.months=months;
    }

  public void show_bill() {
        System.out.println("Hello, : ");
        System.out.println("Bill for regular member : ");
        System.out.println("Membership Fee : "+this.membership_fee);
        System.out.println("Enrollment Fee : "+this.enrollment_fee);
        System.out.println("Charges Per Month : Rs 20,000");
        System.out.println("--------------------------------");
        int charges = this.months*this.charges_per_month+this.membership_fee+this.enrollment_fee;
        System.out.println("Total amount : "+charges);
    }
    
    
}

class GoldMemeber extends RegularMemeber{
    
    int membership_fee=90000;
    int enrollment_fee=10000;
    
    int charges_per_month=10000;
    
    public GoldMemeber(int months) {
        super(months);
    }
    
    @Override
    public void show_bill() {
        System.out.println("Hello, : ");
        System.out.println("Bill for Gold member : ");
        System.out.println("Membership Fee : "+this.membership_fee);
        System.out.println("Enrollment Fee : "+this.enrollment_fee);
        System.out.println("Charges for 6 Month : Free");
        System.out.println("after 6 months charges per month : 10000");
        System.out.println();
        System.out.println("--------------------------------");
        
        if(months<=6) {
        int charges = this.membership_fee+this.enrollment_fee;
        System.out.println("Total amount : "+charges);
        }
        
        if(months>6)
        {    
            int charges= this.membership_fee+this.enrollment_fee+((this.months-6)*this.charges_per_month);
            System.out.println("Total amount : "+charges);
        }
    }
    
}


class SilverMemeber extends RegularMemeber{
    
    
    int membership_fee=15000;
    int enrollment_fee=5000;
    int charges_per_month=20000;

  public SilverMemeber(int months) {
        super(months);
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void show_bill() {
        System.out.println("Hello, : ");
        System.out.println("Bill for Silver member : ");
        System.out.println("Membership Fee : "+this.membership_fee);
        System.out.println("Enrollment Fee : "+this.enrollment_fee);
        System.out.println("Charges for 6 Month : Free");
        System.out.println("after 6 months charges per month : 20000");
        System.out.println();
        System.out.println("--------------------------------");
        
        if(months<=6) {
            int charges=+this.membership_fee+this.enrollment_fee;
            System.out.println("Total amount : "+charges);
        }
        
        
        if(months>6)
        {
            int charges=this.membership_fee+this.enrollment_fee+((this.months-6)*this.charges_per_month);
            System.out.println("Total amount : "+charges);
        }
    }
    
    
    
}

public class Golf {

  public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the membership you want regular/gold/silver : ");
        String memebership_type=sc.nextLine();
        System.out.println("enter the number of months you want to enroll yourself : ");
        int months=sc.nextInt();
        
        RegularMemeber mb ;
        
        switch (memebership_type) {
        
        case "regular":
            mb= new RegularMemeber(months);
            mb.show_bill();
            break;
        
        case "gold":
            mb = new GoldMemeber(months);
            mb.show_bill();
            break;
            
        case "silver":
            mb = new SilverMemeber(months);
            mb.show_bill();
            break;





      default:
            System.out.println("choose one out of regular/gold/silver");
            break;
        }
        
        
//        mb.show_bill();
        
    

  }
}