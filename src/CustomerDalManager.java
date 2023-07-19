public class CustomerDalManager {
    private ICustomerDal customerDal;
    public CustomerDalManager(ICustomerDal customerDal){
        this.customerDal = customerDal;
    }


    public void add(){
        //iş kodları
        customerDal.add();
    }
}
