
package com.commercetools.api.client;

import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.product_discount.ProductDiscountExpansionBuilderDsl;

public interface ProductDiscountExpansionMixin<T extends ExpandableRequest<T, ProductDiscountExpansionBuilderDsl>>
        extends ExpandableRequest<T, ProductDiscountExpansionBuilderDsl> {
    @Override
    default ProductDiscountExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.productDiscount();
    }
}
