package io.vrap.rmf.base.client.middlewares;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.vrap.rmf.base.client.utils.json.VrapJsonUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.CompletableFuture;

public final class LoggerMiddleware implements Middleware {

    private static final Logger LOGGER = LogManager.getLogger("VRAP_JSON_LOGGER");
    
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
            
            String loggerMessageString = VrapJsonUtils.toJsonString(loggerMessage);
            LOGGER.info(loggerMessageString);
        }catch (JsonProcessingException error){
            MiddlewareArg args = MiddlewareArg.from(arg.getRequest(), arg.getResponse(), error, arg.getNext());
            return arg.getNext().next(args);
        }
        return arg.getNext().next(arg);
    }
}
