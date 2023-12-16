package dao.custom;

import dao.CrudDao;
import dto.CustomerDto;
import entity.Customer;

import java.sql.SQLException;
import java.util.List;

public interface CustomerDao extends CrudDao<Customer> {
//    public boolean saveCustomer(CustomerDto dto) throws SQLException, ClassNotFoundException;
//    public boolean updateCustomer(CustomerDto dto) throws SQLException, ClassNotFoundException;
//    public boolean deleteCustomer(String id) throws SQLException, ClassNotFoundException;
//    List<CustomerDto> allCustomers() throws SQLException, ClassNotFoundException;
   CustomerDto searchCustomer();


}
