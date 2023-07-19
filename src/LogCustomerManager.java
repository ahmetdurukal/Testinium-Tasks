public class LogCustomerManager {
    private LoggerBase logger;
    public LogCustomerManager(LoggerBase logger){
        this.logger=logger;
    }
    public void add(){
        this.logger.log("Log mesajı");
    }

}
