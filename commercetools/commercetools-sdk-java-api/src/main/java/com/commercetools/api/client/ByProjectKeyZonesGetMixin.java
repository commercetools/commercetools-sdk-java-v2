
package com.commercetools.api.client;

import com.commercetools.api.models.zone.ZonePagedQueryResponse;
import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.zone.ZoneExpansionBuilderDsl;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.zone.ZoneQueryBuilderDsl;

public interface ByProjectKeyZonesGetMixin
        extends PagedQueryResourceRequest<ByProjectKeyZonesGet, ZonePagedQueryResponse, ZoneQueryBuilderDsl>,
        ExpandableRequest<ByProjectKeyZonesGet, ZoneExpansionBuilderDsl> {

    @Override
    default ZoneExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.zone();
    }

    @Override
    default ZoneQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.zone();
    }
}
