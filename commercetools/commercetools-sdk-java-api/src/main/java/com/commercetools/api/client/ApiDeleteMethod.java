
package com.commercetools.api.client;

import java.util.List;

import io.vrap.rmf.base.client.RequestCommand;

public interface ApiDeleteMethod<T extends ApiDeleteMethod<T, TResult>, TResult> extends RequestCommand<TResult> {
    List<String> getVersion();

    /**
     * set version with the specificied value
     */
    <TValue> ApiDeleteMethod<T, TResult> withVersion(final TValue version);

    /**
     * add additional version query parameter
     */
    <TValue> ApiDeleteMethod<T, TResult> addVersion(final TValue version);

    @SuppressWarnings("unchecked")
    default T asBaseType() {
        return (T) this;
    }

}
