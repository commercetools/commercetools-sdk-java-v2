
package com.commercetools.api.client;

import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.store.StoreExpansionBuilderDsl;

public interface StoreExpansionMixin<T extends ExpandableRequest<T, StoreExpansionBuilderDsl>>
        extends ExpandableRequest<T, StoreExpansionBuilderDsl> {
    @Override
    default StoreExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.store();
    }
}
