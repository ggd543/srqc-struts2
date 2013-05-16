package app02a;

import java.io.Serializable;
import java.util.List;

public class Product implements Serializable {
    private String productName;

    private String description;

    private String price;

    private String comment;

    private List<String> props;

    public List<String> getProps() {
        return props;
    }

    public void setProps(List<String> props) {
        this.props = props;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

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
        System.out.println(getComment());
        for (String s : getProps()) {
            System.out.println(s);
        }
        return "success";
    }
}
