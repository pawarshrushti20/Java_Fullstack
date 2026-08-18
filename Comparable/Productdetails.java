package Comparable;

import java.util.ArrayList;
import java.util.List;

class Products{
   int id;
    String name;
    int price;
    int stock;
    int rating;

    public Products(int id, String name, int price, int rating, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.stock = stock;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Products{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", price=").append(price);
        sb.append(", stock=").append(stock);
        sb.append(", rating=").append(rating);
        sb.append('}');
        return sb.toString();
    }
  
}

public class Productdetails {
    public static void main(String[] args) {
        List<Products> items=new ArrayList<>();
        items.add(new Products(2, "Bag", 600, 7, 10));
        items.add(new Products(1, "Bottle", 200, 9, 2));
        items.add(new Products(4, "Watch", 2000, 8, 15));
        items.add(new Products(3, "Mobile", 30000, 9, 20));
        items.add(new Products(6, "Pen", 60, 7, 30));
        items.add(new Products(5, "Umbrella", 200, 6, 1));
        items.add(new Products(8, "Toy-car", 10000, 3, 5));
        items.add(new Products(7, "Smart TV", 12000,4 , 20));
        
    }

}