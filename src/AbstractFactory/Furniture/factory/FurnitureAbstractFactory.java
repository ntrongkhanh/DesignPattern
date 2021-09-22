package AbstractFactory.Furniture.factory;


import AbstractFactory.Furniture.Product.Chair;
import AbstractFactory.Furniture.Product.Table;

public interface FurnitureAbstractFactory {
    public Chair createChair();
    public Table createTable();
}
