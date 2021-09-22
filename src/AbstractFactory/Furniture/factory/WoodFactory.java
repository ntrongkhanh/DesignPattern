package AbstractFactory.Furniture.factory;


import AbstractFactory.Furniture.Product.Chair;
import AbstractFactory.Furniture.Product.Table;
import AbstractFactory.Furniture.Product.WoodChair;
import AbstractFactory.Furniture.Product.WoodTable;

public class WoodFactory implements FurnitureAbstractFactory{
    @Override
    public Chair createChair() {
        return new WoodChair();
    }

    @Override
    public Table createTable() {
        return new WoodTable();
    }
}
