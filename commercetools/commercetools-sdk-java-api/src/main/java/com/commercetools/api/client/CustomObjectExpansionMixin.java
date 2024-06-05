
package com.commercetools.api.client;

import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.custom_object.CustomObjectExpansionBuilderDsl;

public interface CustomObjectExpansionMixin<T extends ExpandableRequest<T, CustomObjectExpansionBuilderDsl>>
        extends ExpandableRequest<T, CustomObjectExpansionBuilderDsl> {

    @Override
    default CustomObjectExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.customObject();
    }

}
