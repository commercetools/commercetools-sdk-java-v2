package io.vrap.rmf.base.client.middlewares;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.vrap.rmf.base.client.utils.json.VrapJsonUtils;

import java.util.concurrent.CompletableFuture;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class LoggerMiddleware {

    private final Logger logger;

    public LoggerMiddleware(final LogLevel logLevel) {
        logger = Logger.getLogger(LoggerMiddleware.class.getName());
        switch (logLevel){
            case NONE:{
                logger.setLevel(Level.OFF);
                break;
            }
            case INFO:{
                logger.setLevel(Level.INFO);
                break;
            }
        }
    }
//
//    @Override
//    public CompletableFuture<MiddlewareArg> next(MiddlewareArg arg) {
//        try{
//            if(arg.getError() != null){
//                arg.getError().printStackTrace();
//            }
//            LoggerMessage loggerMessage = new LoggerMessage();
//            loggerMessage.setUrl(arg.getRequest().getBaseUrl() + arg.getRequest().getRelativeUrl());
//            loggerMessage.setMethod(arg.getRequest().getMethod().name());
//            loggerMessage.setRequestHeaders(arg.getRequest().getHeaders());
//            if(arg.getRequest().getBody() != null){
//                loggerMessage.setRequestBody(new String(arg.getRequest().getBody()));
//            }
//            loggerMessage.setResponseStatusCode(arg.getResponse().getStatusCode());
//            loggerMessage.setResponseHeaders(arg.getResponse().getHeaders());
//            loggerMessage.setResponseBody(new String(arg.getResponse().getBody()));
//
//            String loggerMessageString = VrapJsonUtils.getConfiguredObjectMapper().writeValueAsString(loggerMessage);
//            logger.log(Level.INFO, loggerMessageString);
//
//        }catch (JsonProcessingException error){
//            MiddlewareArg args = MiddlewareArg.from(arg.getRequest(), arg.getResponse(), error, arg.getNext());
//            return arg.getNext().next(args);
//        }
//        return arg.getNext().next(arg);
//    }

    public enum LogLevel {
        NONE,
        INFO
    }
}
