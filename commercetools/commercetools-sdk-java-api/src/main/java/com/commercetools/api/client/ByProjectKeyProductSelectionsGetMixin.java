
package com.commercetools.api.client;

import com.commercetools.api.models.PagedQueryResourceRequest;
import com.commercetools.api.models.product_selection.ProductSelectionPagedQueryResponse;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.product_selection.ProductSelectionQueryBuilderDsl;

public interface ByProjectKeyProductSelectionsGetMixin extends
        PagedQueryResourceRequest<ByProjectKeyProductSelectionsGet, ProductSelectionPagedQueryResponse, ProductSelectionQueryBuilderDsl> {
    @Override
    default ProductSelectionQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.productSelection();
    }
}
