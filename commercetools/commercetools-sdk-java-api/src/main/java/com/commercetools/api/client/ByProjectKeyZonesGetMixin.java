
package com.commercetools.api.client;

import com.commercetools.api.models.zone.ZonePagedQueryResponse;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.zone.ZoneQueryBuilderDsl;

public interface ByProjectKeyZonesGetMixin
        extends PagedQueryResourceRequest<ByProjectKeyZonesGet, ZonePagedQueryResponse, ZoneQueryBuilderDsl> {

    @Override
    default ZoneQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.zone();
    }
}
