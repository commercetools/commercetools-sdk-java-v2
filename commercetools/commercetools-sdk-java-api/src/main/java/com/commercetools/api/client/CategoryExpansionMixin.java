
package com.commercetools.api.client;

import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.category.CategoryExpansionBuilderDsl;

public interface CategoryExpansionMixin<T extends ExpandableRequest<T, CategoryExpansionBuilderDsl>>
        extends ExpandableRequest<T, CategoryExpansionBuilderDsl> {

    @Override
    default CategoryExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.category();
    }

}
