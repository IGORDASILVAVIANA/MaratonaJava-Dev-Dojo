package Minterfaces.test;

import Minterfaces.dominio.DataBaseLoader;
import Minterfaces.dominio.FileLoader;

public class DataBaseLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataBaseLoader.load();
        fileLoader.load();
    }
}
