
package com.commercetools.api.models.inventory;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class InventoryEntryUpdateBuilder {

    private Long version;

    private java.util.List<com.commercetools.api.models.inventory.InventoryEntryUpdateAction> actions;

    public InventoryEntryUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public InventoryEntryUpdateBuilder actions(
            final com.commercetools.api.models.inventory.InventoryEntryUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    public InventoryEntryUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.inventory.InventoryEntryUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.inventory.InventoryEntryUpdateAction> getActions() {
        return this.actions;
    }

    public InventoryEntryUpdate build() {
        return new InventoryEntryUpdateImpl(version, actions);
    }

    public static InventoryEntryUpdateBuilder of() {
        return new InventoryEntryUpdateBuilder();
    }

    public static InventoryEntryUpdateBuilder of(final InventoryEntryUpdate template) {
        InventoryEntryUpdateBuilder builder = new InventoryEntryUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
