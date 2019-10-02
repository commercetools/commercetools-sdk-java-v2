package io.vrap.rmf.base.client.middlewares;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.vrap.rmf.base.client.utils.json.VrapJsonUtils;

import java.util.concurrent.CompletableFuture;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class LoggerMiddleware implements Middleware {

    private final static Logger LOGGER = Logger.getLogger(LoggerMiddleware.class.getName());

    @Override
    public CompletableFuture<MiddlewareArg> next(MiddlewareArg arg) {
        try{
            LoggerMessage loggerMessage = new LoggerMessage();
            loggerMessage.setUrl(arg.getRequest().getBaseUrl() + arg.getRequest().getRelativeUrl());
            loggerMessage.setMethod(arg.getRequest().getMethod().name());
            loggerMessage.setRequestHeaders(arg.getRequest().getHeaders());
            loggerMessage.setResponseStatusCode(arg.getResponse().getStatusCode());
            loggerMessage.setResponseHeaders(arg.getResponse().getHeaders());
            loggerMessage.setResponseBody(new String(arg.getResponse().getBody()));
            
            String loggerMessageString = VrapJsonUtils.getConfiguredObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(loggerMessage);
            LOGGER.info(loggerMessageString);
        }catch (JsonProcessingException error){
            MiddlewareArg args = MiddlewareArg.from(arg.getRequest(), arg.getResponse(), error, arg.getNext());
            return arg.getNext().next(args);
        }
        return arg.getNext().next(arg);
    }
}
