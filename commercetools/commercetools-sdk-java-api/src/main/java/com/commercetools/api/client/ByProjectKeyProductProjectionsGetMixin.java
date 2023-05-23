
package com.commercetools.api.client;

import com.commercetools.api.models.PagedQueryResourceRequest;
import com.commercetools.api.models.product.ProductProjectionPagedQueryResponse;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.product.ProductProjectionQueryBuilderDsl;

public interface ByProjectKeyProductProjectionsGetMixin extends
        PagedQueryResourceRequest<ByProjectKeyProductProjectionsGet, ProductProjectionPagedQueryResponse, ProductProjectionQueryBuilderDsl> {
    @Override
    default ProductProjectionQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.productProjection();
    }
}
