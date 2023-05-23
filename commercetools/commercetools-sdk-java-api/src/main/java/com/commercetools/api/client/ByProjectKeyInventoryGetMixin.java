
package com.commercetools.api.client;

import com.commercetools.api.models.inventory.InventoryPagedQueryResponse;
import com.commercetools.api.predicates.query.QueryPredicateDsl;
import com.commercetools.api.predicates.query.inventory.InventoryEntryQueryBuilderDsl;

public interface ByProjectKeyInventoryGetMixin extends
        PagedQueryResourceRequest<ByProjectKeyInventoryGet, InventoryPagedQueryResponse, InventoryEntryQueryBuilderDsl> {
    @Override
    default InventoryEntryQueryBuilderDsl queryDsl() {
        return QueryPredicateDsl.inventory();
    }
}
