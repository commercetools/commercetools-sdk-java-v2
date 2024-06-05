
package com.commercetools.api.client;

import com.commercetools.api.models.product.ProductProjectionPagedQueryResponse;
import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.product.ProductProjectionExpansionBuilderDsl;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.product.ProductProjectionQueryBuilderDsl;

public interface ByProjectKeyProductProjectionsGetMixin extends
        PagedQueryResourceRequest<ByProjectKeyProductProjectionsGet, ProductProjectionPagedQueryResponse, ProductProjectionQueryBuilderDsl>,
        ExpandableRequest<ByProjectKeyProductProjectionsGet, ProductProjectionExpansionBuilderDsl> {
    @Override
    default ProductProjectionQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.productProjection();
    }

    @Override
    default ProductProjectionExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.productProjection();
    }
}
