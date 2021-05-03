package datasources

class Car {
    String make
    String model

    static mapping = {
        datasource 'automobiles'
    }
}
