package com.example.project;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        //your code here
                       
        double tipAmount = cost*(0.01*percent);
        tipAmount = Math.round(tipAmount*100.0)/100.0;
        //I got the code from https://stackoverflow.com/questions/11832914/how-to-round-to-at-most-2-decimal-places-if-necessary/12830454#12830454//

       
        double totalTip = tipAmount + cost;
       
        double amountPerPerson = cost/people;
        amountPerPerson = Math.round(amountPerPerson*100.0)/100.0;
        
        double tipPerPerson = tipAmount/people;
        tipPerPerson = Math.round(tipPerPerson*100.0)/100.0;
      
        double totalCostPerPerson = (totalTip/people)-0.0000001;
        totalCostPerPerson = Math.round(totalCostPerPerson*100.0)/100.0;
         

      
       

        result.append("-------------------------------\n");
        result.append("Total bill before tip: " + "$" + cost); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("\n");
        result.append("Total percentage: "+ percent + "%");
        result.append("\n");
        result.append("Total tip: " + "$" + tipAmount);
        result.append("\n");
        result.append("Total Bill with tip: " + "$" + totalTip );
        result.append("\n");
        result.append("Per person cost before tip: "+ "$" + amountPerPerson);
        result.append("\n");
        result.append("Tip per person: "+ "$" + tipPerPerson);
        result.append("\n");
        result.append("Total cost per person: "+ "$" + totalCostPerPerson);
        result.append("\n");
        result.append("-------------------------------\n");

        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people ; 
        int percent ;
        double cost ;              
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
