package app18a;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.sql.DataSource;

public class ProductDAO {


    public List<Product> getAllProducts() {
        List<Product> productList = new LinkedList<Product>();
        for (int i = 0; i < 3; i++) {
            Product p = new Product();
            p.setName("Product_" + i);
            p.setPrice(i * 100);
            p.setProductId(i);
            p.setDescription("good product " + i);
            productList.add(p);
        }
        return productList;
    }
}
