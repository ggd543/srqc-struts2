package app18a;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class ListProductAction extends ActionSupport   {
    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public String execute() {
        ProductDAO productDAO = new ProductDAO();

        products = productDAO.getAllProducts();
        return SUCCESS;
    }
}
