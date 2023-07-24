package nLayerdDemo.core;

import nLayerdDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService {


    @Override
    public void logTOSystem(String message) {
        JLoggerManager manager = new JLoggerManager();
        manager.log(message);
    }
}
