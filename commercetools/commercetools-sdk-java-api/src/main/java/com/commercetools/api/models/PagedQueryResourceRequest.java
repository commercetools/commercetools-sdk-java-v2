
package com.commercetools.api.models;

import io.vrap.rmf.base.client.ClientRequestCommand;
import io.vrap.rmf.base.client.RequestCommand;

public interface PagedQueryResourceRequest<T extends PagedQueryResourceRequest<T, TResult>, TResult>
        extends RequestCommand<TResult>, ClientRequestCommand<TResult> {
    T withLimit(final int limit);

    T addLimit(final int limit);

    T withOffset(final int offset);

    T addOffset(final int offset);

    T withSort(final String sort);

    T addSort(final String sort);

    T withWhere(final String where);

    T addWhere(final String where);

    T withExpand(final String expand);

    T addExpand(final String expand);

    T withWithTotal(final boolean withTotal);

    T addWithTotal(final boolean withTotal);

    T withPredicateVar(final String varName, final String predicateVar);

    T addPredicateVar(final String varName, final String predicateVar);
}
