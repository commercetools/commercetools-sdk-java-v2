
package com.commercetools.api.models;

import io.vrap.rmf.base.client.ClientRequestCommand;
import io.vrap.rmf.base.client.RequestCommand;

public interface PagedQueryResourceRequest<T extends PagedQueryResourceRequest<T, TResult>, TResult>
        extends RequestCommand<TResult>, ClientRequestCommand<TResult> {
    PagedQueryResourceRequest<T, TResult> withLimit(final int limit);

    PagedQueryResourceRequest<T, TResult> addLimit(final int limit);

    PagedQueryResourceRequest<T, TResult> withOffset(final int offset);

    PagedQueryResourceRequest<T, TResult> addOffset(final int offset);

    PagedQueryResourceRequest<T, TResult> withSort(final String sort);

    PagedQueryResourceRequest<T, TResult> addSort(final String sort);

    PagedQueryResourceRequest<T, TResult> withWhere(final String where);

    PagedQueryResourceRequest<T, TResult> addWhere(final String where);

    PagedQueryResourceRequest<T, TResult> withExpand(final String expand);

    PagedQueryResourceRequest<T, TResult> addExpand(final String expand);

    PagedQueryResourceRequest<T, TResult> withWithTotal(final boolean withTotal);

    PagedQueryResourceRequest<T, TResult> addWithTotal(final boolean withTotal);

    PagedQueryResourceRequest<T, TResult> withPredicateVar(final String varName, final String predicateVar);

    PagedQueryResourceRequest<T, TResult> addPredicateVar(final String varName, final String predicateVar);

    default PagedQueryResourceRequest<T, TResult> asPagedQueryResourceRequest() {
        return this;
    }

    @SuppressWarnings("unchecked")
    default T asPagedQueryResourceRequestToBaseType() {
        return (T) this;
    }
}
