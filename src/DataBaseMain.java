public class DataBaseMain {
    public static void main(String[] args) {
        DataBaseCustomer dataBaseCustomer = new DataBaseCustomer();
        dataBaseCustomer.dataBaseManager = new DataBaseOracle();
        dataBaseCustomer.getCostumers();
        dataBaseCustomer.dataBaseManager = new DataBaseSql();
        dataBaseCustomer.getCostumers();
    }
}
