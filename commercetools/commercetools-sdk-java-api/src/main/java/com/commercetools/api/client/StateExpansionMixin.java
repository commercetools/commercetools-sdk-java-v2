
package com.commercetools.api.client;

import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.state.StateExpansionBuilderDsl;

public interface StateExpansionMixin<T extends ExpandableRequest<T, StateExpansionBuilderDsl>>
        extends ExpandableRequest<T, StateExpansionBuilderDsl> {
    @Override
    default StateExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.state();
    }
}
