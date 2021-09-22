package AbstractFactory.Furniture.factory;


import AbstractFactory.Furniture.Product.Chair;
import AbstractFactory.Furniture.Product.PlasticChair;
import AbstractFactory.Furniture.Product.PlasticTable;
import AbstractFactory.Furniture.Product.Table;

public class PlasticFactory implements FurnitureAbstractFactory{
    @Override
    public Chair createChair() {
        return new PlasticChair();
    }

    @Override
    public Table createTable() {
        return new PlasticTable();
    }
}
