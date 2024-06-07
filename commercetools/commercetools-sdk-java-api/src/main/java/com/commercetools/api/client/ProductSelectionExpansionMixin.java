
package com.commercetools.api.client;

import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.product_selection.ProductSelectionExpansionBuilderDsl;

public interface ProductSelectionExpansionMixin<T extends ExpandableRequest<T, ProductSelectionExpansionBuilderDsl>>
        extends ExpandableRequest<T, ProductSelectionExpansionBuilderDsl> {
    @Override
    default ProductSelectionExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.productSelection();
    }
}
