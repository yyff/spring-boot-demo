package demo.api;


import com.google.gson.annotations.SerializedName;

public class Order {
    public String id;
    @SerializedName("product_id")
    public String productID;
    @SerializedName("user_id")
    public String userID;
}
