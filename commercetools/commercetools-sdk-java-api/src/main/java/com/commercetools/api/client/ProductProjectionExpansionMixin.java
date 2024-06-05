
package com.commercetools.api.client;

import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.product.ProductProjectionExpansionBuilderDsl;

public interface ProductProjectionExpansionMixin<T extends ExpandableRequest<T, ProductProjectionExpansionBuilderDsl>>
        extends ExpandableRequest<T, ProductProjectionExpansionBuilderDsl> {
    @Override
    default ProductProjectionExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.productProjection();
    }
}
