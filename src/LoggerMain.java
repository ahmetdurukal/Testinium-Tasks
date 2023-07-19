public class LoggerMain {
    public static void main(String[] args) {
        LogCustomerManager logCustomerManager= new LogCustomerManager(new LoggerDatabase());
        logCustomerManager.add();
    }
}
