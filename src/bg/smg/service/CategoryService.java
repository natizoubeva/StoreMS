package bg.smg.service;

import bg.smg.model.Category;
import bg.smg.util.DBManager;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoryService implements CategoryServiceI{
    private DataSource dataSource;
    private Connection connection;

    public CategoryService() throws SQLException {
        dataSource = DBManager.getInstance().getDataSource();
    }

    @Override
    public Category getCategoryById(int id) throws SQLException {
        try{
            this.connection = dataSource.getConnection();
            try(PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM category WHERE id=?")){
                statement.setInt(1, id);
                ResultSet resultSet = statement.executeQuery();
                resultSet.first();
                Category category = new Category();
                category.setName(resultSet.getString("name"));
                return category;
            }
        } catch(SQLException e){
            e.printStackTrace();
        } finally {
            if(connection != null){
                connection.close();
            }
        }
        return null;
    }
}
