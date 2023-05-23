
package com.commercetools.api.client;

import com.commercetools.api.models.product_discount.ProductDiscountPagedQueryResponse;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.product_discount.ProductDiscountQueryBuilderDsl;

public interface ByProjectKeyProductDiscountsGetMixin extends
        PagedQueryResourceRequest<ByProjectKeyProductDiscountsGet, ProductDiscountPagedQueryResponse, ProductDiscountQueryBuilderDsl> {
    @Override
    default ProductDiscountQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.productDiscount();
    }
}
