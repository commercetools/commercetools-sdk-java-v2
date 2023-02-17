
package io.vrap.rmf.base.client.utils;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;

import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.ContextAware;
import io.vrap.rmf.base.client.MDCContext;

import org.slf4j.MDC;

public class ThreadUtils {

    public static <U, T> Function<ApiHttpResponse<T>, U> withMdc(Function<ApiHttpResponse<T>, U> fn) {
        return (response) -> {
            Optional.ofNullable(response)
                    .map(r -> r.getContext(MDCContext.class))
                    .ifPresent(c -> MDC.setContextMap(c.getValue()));
            return fn.apply(response);
        };
    }

    public static Runnable withMdc(ContextAware<?> request, Runnable runnable) {
        return () -> {
            Optional.ofNullable(request)
                    .map(r -> r.getContext(MDCContext.class))
                    .ifPresent(c -> MDC.setContextMap(c.getValue()));
            runnable.run();
        };
    }

    public static <U> Supplier<U> withMdc(ContextAware<?> request, Supplier<U> supplier) {
        return () -> {
            Optional.ofNullable(request)
                    .map(r -> r.getContext(MDCContext.class))
                    .ifPresent(c -> MDC.setContextMap(c.getValue()));
            return supplier.get();
        };
    }

    public static Runnable withMdc(Runnable runnable) {
        Map<String, String> mdc = MDC.getCopyOfContextMap();
        return () -> {
            MDC.setContextMap(mdc);
            runnable.run();
        };
    }

    public static <U> Supplier<U> withMdc(Supplier<U> supplier) {
        Map<String, String> mdc = MDC.getCopyOfContextMap();
        return () -> {
            MDC.setContextMap(mdc);
            return supplier.get();
        };
    }
}
