
package com.commercetools.api.client;

import java.util.Collection;
import java.util.List;

import io.vrap.rmf.base.client.ApiMethod;
import io.vrap.rmf.base.client.ClientRequestCommand;
import io.vrap.rmf.base.client.RequestCommand;

/**
 * Interface with common methods for query endpoints
 * @param <T> the type of the underlying request
 * @param <TResult> the type of the underlying result model, like category or product.
 */
public interface PagedQueryResourceRequest<T extends PagedQueryResourceRequest<T, TResult, TQuery>, TResult, TQuery>
        extends RequestCommand<TResult>, ClientRequestCommand<TResult>,
        SimplePagedQueryResourceRequest<T, TResult, TQuery> {
    <TValue> PagedQueryResourceRequest<T, TResult, TQuery> withLimit(final TValue limit);

    <TValue> PagedQueryResourceRequest<T, TResult, TQuery> addLimit(final TValue limit);

    <TValue> PagedQueryResourceRequest<T, TResult, TQuery> withOffset(final TValue offset);

    <TValue> PagedQueryResourceRequest<T, TResult, TQuery> addOffset(final TValue offset);

    <TValue> PagedQueryResourceRequest<T, TResult, TQuery> withSort(final TValue sort);

    <TValue> PagedQueryResourceRequest<T, TResult, TQuery> addSort(final TValue sort);

    <TValue> PagedQueryResourceRequest<T, TResult, TQuery> withWhere(final TValue where);

    <TValue> PagedQueryResourceRequest<T, TResult, TQuery> addWhere(final TValue where);

    <TValue> PagedQueryResourceRequest<T, TResult, TQuery> withExpand(final TValue expand);

    <TValue> PagedQueryResourceRequest<T, TResult, TQuery> addExpand(final TValue expand);

    <TValue> PagedQueryResourceRequest<T, TResult, TQuery> withWithTotal(final TValue withTotal);

    <TValue> PagedQueryResourceRequest<T, TResult, TQuery> addWithTotal(final TValue withTotal);

    <TValue> PagedQueryResourceRequest<T, TResult, TQuery> withPredicateVar(final String varName,
            final TValue predicateVar);

    <TValue> PagedQueryResourceRequest<T, TResult, TQuery> addPredicateVar(final String varName,
            final TValue predicateVar);

    <TValue> PagedQueryResourceRequest<T, TResult, TQuery> withPredicateVar(final String varName,
            final Collection<TValue> predicateVar);

    <TValue> PagedQueryResourceRequest<T, TResult, TQuery> addPredicateVar(final String varName,
            final Collection<TValue> predicateVar);

    List<ApiMethod.ParamEntry<String, String>> getQueryParams();

    List<String> getQueryParam(final String key);

    String getFirstQueryParam(final String key);

    default PagedQueryResourceRequest<T, TResult, TQuery> asPagedQueryResourceRequest() {
        return this;
    }
}
