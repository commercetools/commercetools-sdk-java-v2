
package com.commercetools.api.client;

import com.commercetools.api.models.standalone_price.StandalonePricePagedQueryResponse;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.standalone_price.StandalonePriceQueryBuilderDsl;

public interface ByProjectKeyStandalonePricesGetMixin extends
        PagedQueryResourceRequest<ByProjectKeyStandalonePricesGet, StandalonePricePagedQueryResponse, StandalonePriceQueryBuilderDsl> {

    @Override
    default StandalonePriceQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.standalonePrice();
    }
}
