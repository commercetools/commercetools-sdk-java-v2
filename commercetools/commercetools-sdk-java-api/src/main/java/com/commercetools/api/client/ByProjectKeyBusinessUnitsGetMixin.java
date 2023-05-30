
package com.commercetools.api.client;

import com.commercetools.api.models.business_unit.BusinessUnitPagedQueryResponse;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.business_unit.BusinessUnitQueryBuilderDsl;

public interface ByProjectKeyBusinessUnitsGetMixin extends
        PagedQueryResourceRequest<ByProjectKeyBusinessUnitsGet, BusinessUnitPagedQueryResponse, BusinessUnitQueryBuilderDsl> {
    @Override
    default BusinessUnitQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.businessUnit();
    }
}
