
package io.vrap.rmf.base.client.utils;

/**
 * A function like {@link java.util.function.Function} but allows you to throw exception
 * @param <T> the input type
 * @param <R> the output type
 */
@FunctionalInterface
public interface ExceptionalFunction<T, R> {
    R apply(final T t) throws Exception;
}
