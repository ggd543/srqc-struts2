package app02a;

import java.io.Serializable;
import java.util.List;

public class Product implements Serializable {
    private String productName;

    private String description;

    private String price;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String execute() {
        System.out.println(this.hashCode());
        return "success";
    }
}
