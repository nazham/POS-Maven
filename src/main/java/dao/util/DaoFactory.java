package dao.util;

import bo.SuperBo;
import bo.custom.impl.CustomerBoImpl;
import dao.SuperDao;
import dao.custom.impl.CustomerDaoImpl;
import dao.custom.impl.ItemDaoImpl;
import dao.custom.impl.OrderDaoImpl;
import dao.custom.impl.OrderDetailsDaoImpl;

public class DaoFactory {
    private static DaoFactory daoFactory;
    private DaoFactory(){

    }
    public static DaoFactory getInstance(){
        return daoFactory!=null? daoFactory:(daoFactory = new DaoFactory());
    }

    public <T extends SuperDao> T getDao(DaoType type){
        switch (type){
            case CUSTOMER: return (T) new CustomerDaoImpl();
            case ITEM: return (T) new ItemDaoImpl();
            case ORDER: return (T) new OrderDaoImpl();
            case ORDER_DETAIL: return (T) new OrderDetailsDaoImpl();
        }
        return null;
    }
}