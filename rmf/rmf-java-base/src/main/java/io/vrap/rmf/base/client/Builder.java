
package io.vrap.rmf.base.client;

/**
 * interface to build instance of T
 * @param <T> type to be build
 */
public interface Builder<T> {
    /**
     * build an instance of the generic type
     * @return build instance
     */
    T build();
}
