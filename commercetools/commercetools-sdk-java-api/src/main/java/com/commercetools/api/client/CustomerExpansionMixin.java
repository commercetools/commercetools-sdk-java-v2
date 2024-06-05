
package com.commercetools.api.client;

import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.customer.CustomerExpansionBuilderDsl;

public interface CustomerExpansionMixin<T extends ExpandableRequest<T, CustomerExpansionBuilderDsl>>
        extends ExpandableRequest<T, CustomerExpansionBuilderDsl> {

    @Override
    default CustomerExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.customer();
    }

}
