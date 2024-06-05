
package com.commercetools.api.client;

import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.subscription.SubscriptionExpansionBuilderDsl;

public interface SubscriptionExpansionMixin<T extends ExpandableRequest<T, SubscriptionExpansionBuilderDsl>>
        extends ExpandableRequest<T, SubscriptionExpansionBuilderDsl> {
    @Override
    default SubscriptionExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.subscription();
    }
}
