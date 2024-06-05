
package com.commercetools.api.client;

import com.commercetools.api.models.standalone_price.StandalonePricePagedQueryResponse;
import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.standalone_price.StandalonePriceExpansionBuilderDsl;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.standalone_price.StandalonePriceQueryBuilderDsl;

public interface ByProjectKeyStandalonePricesGetMixin extends
        PagedQueryResourceRequest<ByProjectKeyStandalonePricesGet, StandalonePricePagedQueryResponse, StandalonePriceQueryBuilderDsl>,
        ExpandableRequest<ByProjectKeyStandalonePricesGet, StandalonePriceExpansionBuilderDsl> {

    @Override
    default StandalonePriceExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.standalonePrice();
    }

    @Override
    default StandalonePriceQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.standalonePrice();
    }
}
