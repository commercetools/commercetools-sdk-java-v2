
package com.commercetools.api.client;

import com.commercetools.api.predicates.expansion.product.ProductExpansionBuilderDsl;

public interface ProductExpansionMixin<T extends ExpandableRequest<T, ProductExpansionBuilderDsl>>
        extends ExpandableRequest<T, ProductExpansionBuilderDsl> {
    @Override
    default ProductExpansionBuilderDsl expandDsl() {
        return ProductExpansionBuilderDsl.of();
    }
}
