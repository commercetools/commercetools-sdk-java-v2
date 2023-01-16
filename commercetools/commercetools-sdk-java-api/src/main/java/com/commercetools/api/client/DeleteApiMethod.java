
package com.commercetools.api.client;

import java.util.List;

import io.vrap.rmf.base.client.RequestCommand;

public interface DeleteApiMethod<T extends DeleteApiMethod<T, TResult>, TResult> extends RequestCommand<TResult> {
    List<String> getVersion();

    /**
     * set version with the specificied value
     */
    <TValue> DeleteApiMethod<T, TResult> withVersion(final TValue version);

    /**
     * add additional version query parameter
     */
    <TValue> DeleteApiMethod<T, TResult> addVersion(final TValue version);

    @SuppressWarnings("unchecked")
    default T asBaseType() {
        return (T) this;
    }

}
