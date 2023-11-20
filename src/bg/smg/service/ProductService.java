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
    private Connection connection;
    private CategoryService categoryService;

    public ProductService() throws SQLException {
        dataSource = DBManager.getInstance().getDataSource();
        categoryService = new CategoryService();
    }

    @Override
    public List<Product> getAll() throws SQLException {
        try {
            List<Product> products = new ArrayList<>();
            this.connection = dataSource.getConnection();
            try (PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM product")) {
                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    Product product = new Product();
                    product.setName(resultSet.getString("name"));
                    products.add(product);
                }
                return products;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (connection != null) {
                connection.close();
            }
        }
        return null;
    }

    @Override
    public Product getById(int id) throws SQLException {
        try {
            this.connection = dataSource.getConnection();
            try (PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM product WHERE id=?")) {
                statement.setInt(1, id);
                ResultSet resultSet = statement.executeQuery();
                resultSet.first();
                Product product = new Product();
                product.setName(resultSet.getString("name"));
                product.setDescription(resultSet.getString("description"));
                int category_id = resultSet.getInt("category_id");
                product.setCategory(categoryService.getCategoryById(category_id));
                return product;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
        return null;
    }

    @Override
    public List<Product> getAllFromCategory(int id) throws SQLException {
        List<Product> products = new ArrayList<>();
        try{
            this.connection = dataSource.getConnection();
            try(PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM product WHERE category_id=?")){
                statement.setInt(1, id);
                ResultSet resultSet = statement.executeQuery();
                while(resultSet.next()){
                    Product product = new Product();
                    product.setName(resultSet.getString("name"));
                    products.add(product);
                }
                return products;
            }
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
           connection.close();
        }
        return null;
    }
}
