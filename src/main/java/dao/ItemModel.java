package dao;

import dto.ItemDto;

import java.sql.SQLException;
import java.util.List;

public interface ItemModel {
    boolean saveItem(ItemDto itemDto);
    boolean updateItem(ItemDto itemDto);
    boolean deleteItem(String code);
    ItemDto getItem(String code) throws SQLException, ClassNotFoundException;
    List<ItemDto> allItems() throws SQLException, ClassNotFoundException;
}
