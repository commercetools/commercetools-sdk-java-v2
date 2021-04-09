
package com.commercetools.api.models;

import io.vrap.rmf.base.client.ClientRequestCommand;
import io.vrap.rmf.base.client.RequestCommand;

public interface PagedQueryResourceRequest<T extends PagedQueryResourceRequest<T, TResult>, TResult>
        extends RequestCommand<TResult>, ClientRequestCommand<TResult> {
    T withLimit(final Integer limit);

    T withOffset(final Integer offset);

    T withSort(final String sort);

    T withWhere(final String where);

    T withExpand(final String expand);

    T withWithTotal(final Boolean withTotal);
}
