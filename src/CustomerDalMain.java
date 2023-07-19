public class CustomerDalMain {
    public static void main(String[] args) {


        ICustomerDal customerDal = new CustomerDalOracle();
        customerDal.add();

        CustomerDalManager customerDalManager = new CustomerDalManager(new CustomerDalMysql());

        customerDalManager.add();

    }
}
