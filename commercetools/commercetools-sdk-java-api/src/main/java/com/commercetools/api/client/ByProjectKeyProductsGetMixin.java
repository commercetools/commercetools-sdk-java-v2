
package com.commercetools.api.client;

import com.commercetools.api.models.product.ProductPagedQueryResponse;
import com.commercetools.api.predicates.expansion.product.ProductExpansionBuilderDsl;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.product.ProductQueryBuilderDsl;

public interface ByProjectKeyProductsGetMixin
        extends PagedQueryResourceRequest<ByProjectKeyProductsGet, ProductPagedQueryResponse, ProductQueryBuilderDsl>,
        ExpandableRequest<ByProjectKeyProductsGet, ProductExpansionBuilderDsl> {
    @Override
    default ProductQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.product();
    }

    @Override
    default ProductExpansionBuilderDsl expandDsl() {
        return ProductExpansionBuilderDsl.of();
    }
}
