
package com.commercetools.api.client;

import com.commercetools.api.models.PagedQueryResourceRequest;
import com.commercetools.api.models.extension.ExtensionPagedQueryResponse;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.extension.ExtensionQueryBuilderDsl;

public interface ByProjectKeyExtensionsGetMixin extends
        PagedQueryResourceRequest<ByProjectKeyExtensionsGet, ExtensionPagedQueryResponse, ExtensionQueryBuilderDsl> {
    @Override
    default ExtensionQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.extension();
    }
}
