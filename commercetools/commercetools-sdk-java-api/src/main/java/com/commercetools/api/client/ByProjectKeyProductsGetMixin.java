
package com.commercetools.api.client;

import com.commercetools.api.models.product.ProductPagedQueryResponse;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.product.ProductQueryBuilderDsl;

public interface ByProjectKeyProductsGetMixin
        extends PagedQueryResourceRequest<ByProjectKeyProductsGet, ProductPagedQueryResponse, ProductQueryBuilderDsl> {
    @Override
    default ProductQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.product();
    }

}
