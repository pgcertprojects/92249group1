package Objects;

public class NonMemberCustomer extends Customer{

    //variables used within constructor methods
    private static double nonMemberDiscount = 0.10;

    //Counter for NonMemberCustomers
    public static int noOfNonMemberCustomers = 0;


    //Default constructor
    public NonMemberCustomer(){
        noOfNonMemberCustomers++;
    }//NonMemberCustomer

    //Full constructor
    public NonMemberCustomer(String name, String aPackage, double price){
        //inherits from Customer Class
        super(name, aPackage, price);

        //Apply a 10% discount if NonMemberCustomer chooses a Platinum package
        if(aPackage == "Platinum"){
            price = memberDiscountPrice(price);
        }

        //using noOfNonMemberCustomers variable to increment by 1 each time object is created, and is used for analytic purposes
        noOfNonMemberCustomers++;
    }//NonMemberCustomer


    //Method to calculate the NonMember discounted price if applicable
    public static double memberDiscountPrice(double price){
        double discountedPrice = price - (price * nonMemberDiscount);
        return discountedPrice;
    }


}
