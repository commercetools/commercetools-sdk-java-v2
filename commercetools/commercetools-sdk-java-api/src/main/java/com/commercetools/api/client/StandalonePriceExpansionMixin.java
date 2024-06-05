
package com.commercetools.api.client;

import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.standalone_price.StandalonePriceExpansionBuilderDsl;

public interface StandalonePriceExpansionMixin<T extends ExpandableRequest<T, StandalonePriceExpansionBuilderDsl>>
        extends ExpandableRequest<T, StandalonePriceExpansionBuilderDsl> {
    @Override
    default StandalonePriceExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.standalonePrice();
    }
}
