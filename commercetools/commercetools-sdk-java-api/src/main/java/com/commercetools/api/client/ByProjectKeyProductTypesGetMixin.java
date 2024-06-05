
package com.commercetools.api.client;

import com.commercetools.api.models.product_type.ProductTypePagedQueryResponse;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.product_type.ProductTypeQueryBuilderDsl;

public interface ByProjectKeyProductTypesGetMixin extends
        PagedQueryResourceRequest<ByProjectKeyProductTypesGet, ProductTypePagedQueryResponse, ProductTypeQueryBuilderDsl> {

    @Override
    default ProductTypeQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.productType();
    }
}
