
package com.commercetools.api.client;

import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.customer_group.CustomerGroupExpansionBuilderDsl;

public interface CustomerGroupExpansionMixin<T extends ExpandableRequest<T, CustomerGroupExpansionBuilderDsl>>
        extends ExpandableRequest<T, CustomerGroupExpansionBuilderDsl> {

    @Override
    default CustomerGroupExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.customerGroup();
    }

}
