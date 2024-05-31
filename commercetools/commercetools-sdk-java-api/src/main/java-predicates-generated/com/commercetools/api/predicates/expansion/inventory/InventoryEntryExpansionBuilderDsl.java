
package com.commercetools.api.predicates.expansion.inventory;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class InventoryEntryExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private InventoryEntryExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static InventoryEntryExpansionBuilderDsl of() {
        return new InventoryEntryExpansionBuilderDsl(Collections.emptyList());
    }

    public static InventoryEntryExpansionBuilderDsl of(final List<String> path) {
        return new InventoryEntryExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.common.LastModifiedByExpansionBuilderDsl lastModifiedBy() {
        return com.commercetools.api.predicates.expansion.common.LastModifiedByExpansionBuilderDsl
                .of(appendOne(path, "lastModifiedBy"));
    }

    public com.commercetools.api.predicates.expansion.common.CreatedByExpansionBuilderDsl createdBy() {
        return com.commercetools.api.predicates.expansion.common.CreatedByExpansionBuilderDsl
                .of(appendOne(path, "createdBy"));
    }

    public com.commercetools.api.predicates.expansion.channel.ChannelReferenceExpansionBuilderDsl supplyChannel() {
        return com.commercetools.api.predicates.expansion.channel.ChannelReferenceExpansionBuilderDsl
                .of(appendOne(path, "supplyChannel"));
    }

    public com.commercetools.api.predicates.expansion.type.CustomFieldsExpansionBuilderDsl custom() {
        return com.commercetools.api.predicates.expansion.type.CustomFieldsExpansionBuilderDsl
                .of(appendOne(path, "custom"));
    }
}
