
package com.commercetools.sdk;

public interface KeyResolverService<T> {
    public String resolveKey(T identifiable);
}
