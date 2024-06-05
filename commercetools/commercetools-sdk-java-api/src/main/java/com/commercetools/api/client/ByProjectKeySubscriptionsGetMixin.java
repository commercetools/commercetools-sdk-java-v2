
package com.commercetools.api.client;

import com.commercetools.api.models.subscription.SubscriptionPagedQueryResponse;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.subscription.SubscriptionQueryBuilderDsl;

public interface ByProjectKeySubscriptionsGetMixin extends
        SimplePagedQueryResourceRequest<ByProjectKeySubscriptionsGet, SubscriptionPagedQueryResponse, SubscriptionQueryBuilderDsl> {

    @Override
    default SubscriptionQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.subscription();
    }
}
