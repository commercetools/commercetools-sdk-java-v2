
package com.commercetools.api.client;

import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.product_type.ProductTypeExpansionBuilderDsl;

public interface ProductTypeExpansionMixin<T extends ExpandableRequest<T, ProductTypeExpansionBuilderDsl>>
        extends ExpandableRequest<T, ProductTypeExpansionBuilderDsl> {
    @Override
    default ProductTypeExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.productType();
    }
}
