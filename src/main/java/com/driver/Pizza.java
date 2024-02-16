package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean cheeseAdded;

    private boolean toppingsAdded;

    private boolean takeAway;

    public Pizza(Boolean isVeg)
    {
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
            price+=300;
        else
            price+=400;
        bill="Base Price Of The Pizza: "+price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!cheeseAdded)
        {
            cheeseAdded=true;
            price+=80;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!toppingsAdded)
        {
            toppingsAdded=true;
            if(isVeg)
            {
                price+=70;
                return;
            }
            price+=120;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!takeAway)
        {
            takeAway=true;
            price+=20;
        }
    }

    public String getBill(){
        // your code goes here
        if(cheeseAdded)
            bill+="Extra Cheese Added: 80\n";
        if(toppingsAdded)
        {
            if(isVeg)
                bill+="Extra Toppings Added: 70\n";
            else
                bill+="Extra Toppings Added: 120\n";
        }
        if(takeAway)
            bill+="Paperbag Added: 20\n";
        bill+="Total Price: "+price+"\n";
        return this.bill;
    }
}
