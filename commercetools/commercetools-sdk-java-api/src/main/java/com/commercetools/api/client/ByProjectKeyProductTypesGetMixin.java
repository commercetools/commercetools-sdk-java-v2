
package com.commercetools.api.client;

import com.commercetools.api.models.product_type.ProductTypePagedQueryResponse;
import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.product_type.ProductTypeExpansionBuilderDsl;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.product_type.ProductTypeQueryBuilderDsl;

public interface ByProjectKeyProductTypesGetMixin extends
        PagedQueryResourceRequest<ByProjectKeyProductTypesGet, ProductTypePagedQueryResponse, ProductTypeQueryBuilderDsl>,
        ExpandableRequest<ByProjectKeyProductTypesGet, ProductTypeExpansionBuilderDsl> {

    @Override
    default ProductTypeExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.productType();
    }

    @Override
    default ProductTypeQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.productType();
    }
}
