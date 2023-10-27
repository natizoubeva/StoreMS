package bg.smg.service;

import bg.smg.model.Product;
import bg.smg.util.DBManager;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductService implements ProductServiceI{
    private DataSource dataSource;

    ProductService() throws SQLException {
        dataSource = DBManager.getInstance().getDataSource();
    }

    @Override
    public List<Product> getAll() {
        List<Product> products = new ArrayList<>();
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
            try (PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM product")) {
                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    Product product = new Product();
                    product.setName(resultSet.getString("name"));
                    products.add(product);
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return products;
    }

    @Override
    public Product getById() {
        return null;
    }

    @Override
    public List<Product> getAllFromCategory(int id) {
        return null;
    }
}
