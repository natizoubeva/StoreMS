package bg.smg.service;

import bg.smg.model.Category;

import java.sql.SQLException;

public interface CategoryServiceI {
    Category getCategoryById(int id) throws SQLException;
}
