package com.example.demo.user;

import com.example.demo.Cart;
import com.example.demo.Item;
import com.example.demo.ItemType;
import com.example.demo.Product;
import discount.DiscountPolicy;
import discount.ThresholdDiscount;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService {

//    public List<User> getUser()  {
//        return List.of(
//                new User(
//                        1L,"yazan","hawamdy@gmail.com",1
//                ),
//                new User(
//                        2L,"omar","omar@gmail.com",2
//                )
//        );
//    }

    {
        User employee = new User(UserType.EMPLOYEE, "John");
        Item groceryItem = new Product("Rice", 20, ItemType.GROCERY);
        Item otherItem = new Product("TV", 222, ItemType.OTHER);
        DiscountPolicy discountPolicy = new ThresholdDiscount();

        Cart cart = new Cart(employee, discountPolicy);
        cart.add(groceryItem, 4);
        cart.add(otherItem, 4);
        /*
         *  Total (20 * 4) + (222 * 4) = 968
         *  No discount on grocery items = 968 still
         *  After 30% discount on 4 other items totalling 888 = 701.6
         *  After 35 dollars off due to price over $700 = 666.59999 or 666.6
         */
        System.out.println(cart.total());
    }


}
