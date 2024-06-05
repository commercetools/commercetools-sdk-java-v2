
package com.commercetools.api.client;

import com.commercetools.api.models.subscription.SubscriptionPagedQueryResponse;
import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.subscription.SubscriptionExpansionBuilderDsl;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.subscription.SubscriptionQueryBuilderDsl;

public interface ByProjectKeySubscriptionsGetMixin extends
        SimplePagedQueryResourceRequest<ByProjectKeySubscriptionsGet, SubscriptionPagedQueryResponse, SubscriptionQueryBuilderDsl>,
        ExpandableRequest<ByProjectKeySubscriptionsGet, SubscriptionExpansionBuilderDsl> {

    @Override
    default SubscriptionExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.subscription();
    }

    @Override
    default SubscriptionQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.subscription();
    }
}
