package demo.user;

import demo.api.Order;



public class UserWithOrders {
    public User user;
    public Order[] orders;

    public UserWithOrders(User u, Order[] orders) {
        this.user = u;
        this.orders = orders;
    }
    public void setOrders(Order[] orders) {
        this.orders = orders;
    }
    public void setUser(User user) {
        this.user = user;
    }


}
