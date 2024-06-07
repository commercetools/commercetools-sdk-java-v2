
package com.commercetools.api.client;

import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.type.TypeExpansionBuilderDsl;

public interface TypeExpansionMixin<T extends ExpandableRequest<T, TypeExpansionBuilderDsl>>
        extends ExpandableRequest<T, TypeExpansionBuilderDsl> {
    @Override
    default TypeExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.type();
    }
}
