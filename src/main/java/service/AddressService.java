package service;

import bl.Util;
import dao.AddressDAO;
import entity.Address;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class AddressService extends Util implements AddressDAO {
    Connection connection = getConnection();


    @Override
    public void add(Address address) throws SQLException {
        PreparedStatement preparedStatement = null;
        String sql = "INSERT INTO ADDRESS(ID, COUNRY, CITY, STREET, POST_CODE) VALUES (?,?,?,?,?)";

        try {
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setLong(1, address.getId());
            preparedStatement.setString(2, address.getCountry());
            preparedStatement.setString(3, address.getCity());
            preparedStatement.setString(4, address.getStreet());
            preparedStatement.setString(5, address.getPostCode());
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null)
                preparedStatement.close();

            if (connection != null)
                connection.close();

        }
    }

    @Override
    public List<Address> getAll() {
        return null;
    }

    @Override
    public Address getById(long id) {
        return null;
    }

    @Override
    public void update(Address address) {

    }

    @Override
    public void remove(Address address) {

    }
}
