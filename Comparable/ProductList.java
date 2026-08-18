package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product {
    int id;
    String name;
    int price;
    int rating;
    int stock;

    Product(int id, String name, int rating, int stock, int price) {
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.stock = stock;
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Product{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", rating=").append(rating);
        sb.append(", stock=").append(stock);
        sb.append(", price=").append(price);
        sb.append("}");

        return sb.toString();
    }
}

public class ProductList {
    public static void main(String[] args) {

        List<Product> items = new ArrayList<>();

        items.add(new Product(5, "bag", 4, 5, 2000));
        items.add(new Product(2, "watch", 4, 4, 200));
        items.add(new Product(3, "handbag", 5, 7, 2014));
        items.add(new Product(4, "bag", 4, 5, 1000));
        System.out.println("using laymbda expretion ");

        Collections.sort(items, (a, b) -> Integer.compare(a.id, b.id));

        System.out.println("Sorting by ID asending order:");

        for (Product p : items) {
            System.out.println(p);
        }

        System.out.println("anonymous class,");
        Collections.sort(items, new Comparator<Product>() {

            @Override
            public int compare(Product a, Product b) {
                return Integer.compare(a.id, b.id);
            }

        });

        System.out.println("Sorting by ID:");

        for (Product p : items) {
            System.out.println(p);
        }

        System.out.println("Sorting by ID in Descending Order:");

        Collections.sort(items, new Comparator<Product>() {

            @Override
            public int compare(Product a, Product b) {
                return Integer.compare(b.id, a.id);
            }

        });

        for (Product p : items) {
            System.out.println(p);
        }

        // using name length

        Collections.sort(items, (a, b) -> Integer.compare(a.name.length(), b.name.length()));

        Collections.sort(items, (a, b) -> Integer.compare(b.name.length(), a.name.length()));

        System.out.println("\nSorting by Name Length in Ascending Order:");

        Collections.sort(items, new Comparator<Product>() {

            @Override
            public int compare(Product a, Product b) {
                return Integer.compare(a.name.length(), b.name.length());
            }

        });

        for (Product p : items) {
            System.out.println(p);
        }

        System.out.println("\nSorting by Price in Ascending Order:");

        Collections.sort(items, new Comparator<Product>() {

            @Override
            public int compare(Product a, Product b) {
                return Integer.compare(a.price, b.price);
            }

        });

        for (Product p : items) {
            System.out.println(p);
        }

        System.out.println("\nSorting by Rating in Ascending Order:");

        Collections.sort(items, new Comparator<Product>() {

            @Override
            public int compare(Product a, Product b) {
                return Integer.compare(a.rating, b.rating);
            }

        });

        for (Product p : items) {
            System.out.println(p);
        }
        System.out.println("\nSorting by Rating in Ascending Order:");

        Collections.sort(items, (a, b) -> Integer.compare(a.rating, b.rating));

        for (Product p : items) {
            System.out.println(p);
        }

        Collections.sort(items,(a,b)->Integer.compare(a.rating,b.rating));
        for(Product p:items)
        {
            System.out.println(p);
        }
        Comparator<Product> com5=new Comparator<>() {
            public int compare(Product a, Product b )
    
            {
                {
                    if(a.rating>b.rating)
                    {
                        return 1;
                    }
                    else
                    {
                        return -1;
                    }
                }

            }
        };
        Collections.sort(items,com5);
        for(Product p:items)
        {
            System.out.println(p);
        }

       



    }
}