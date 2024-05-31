
package com.commercetools.api.predicates.expansion.inventory;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class InventoryEntryReferenceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private InventoryEntryReferenceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static InventoryEntryReferenceExpansionBuilderDsl of() {
        return new InventoryEntryReferenceExpansionBuilderDsl(Collections.emptyList());
    }

    public static InventoryEntryReferenceExpansionBuilderDsl of(final List<String> path) {
        return new InventoryEntryReferenceExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.inventory.InventoryEntryExpansionBuilderDsl obj() {
        return com.commercetools.api.predicates.expansion.inventory.InventoryEntryExpansionBuilderDsl
                .of(appendOne(path, "obj"));
    }
}
