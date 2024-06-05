
package com.commercetools.api.client;

import com.commercetools.api.predicates.expansion.ExpandPredicateDsl;
import com.commercetools.api.predicates.expansion.inventory.InventoryEntryExpansionBuilderDsl;

public interface InventoryEntryExpansionMixin<T extends ExpandableRequest<T, InventoryEntryExpansionBuilderDsl>>
        extends ExpandableRequest<T, InventoryEntryExpansionBuilderDsl> {

    @Override
    default InventoryEntryExpansionBuilderDsl expandDsl() {
        return ExpandPredicateDsl.inventory();
    }
}
