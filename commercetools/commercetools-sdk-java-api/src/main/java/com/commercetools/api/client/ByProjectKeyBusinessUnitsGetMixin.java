
package com.commercetools.api.client;

import com.commercetools.api.models.business_unit.BusinessUnitPagedQueryResponse;
import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.business_unit.BusinessUnitExpansionBuilderDsl;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.business_unit.BusinessUnitQueryBuilderDsl;

public interface ByProjectKeyBusinessUnitsGetMixin extends
        PagedQueryResourceRequest<ByProjectKeyBusinessUnitsGet, BusinessUnitPagedQueryResponse, BusinessUnitQueryBuilderDsl>,
        ExpandableRequest<ByProjectKeyBusinessUnitsGet, BusinessUnitExpansionBuilderDsl> {
    @Override
    default BusinessUnitQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.businessUnit();
    }

    @Override
    default BusinessUnitExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.businessUnit();
    }

}
