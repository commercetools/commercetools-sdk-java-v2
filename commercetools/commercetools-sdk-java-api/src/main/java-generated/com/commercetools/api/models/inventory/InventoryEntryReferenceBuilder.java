
package com.commercetools.api.models.inventory;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class InventoryEntryReferenceBuilder {

    private String id;

    @Nullable
    private com.commercetools.api.models.inventory.InventoryEntry obj;

    public InventoryEntryReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public InventoryEntryReferenceBuilder obj(
            @Nullable final com.commercetools.api.models.inventory.InventoryEntry obj) {
        this.obj = obj;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Nullable
    public com.commercetools.api.models.inventory.InventoryEntry getObj() {
        return this.obj;
    }

    public InventoryEntryReference build() {
        return new InventoryEntryReferenceImpl(id, obj);
    }

    public static InventoryEntryReferenceBuilder of() {
        return new InventoryEntryReferenceBuilder();
    }

    public static InventoryEntryReferenceBuilder of(final InventoryEntryReference template) {
        InventoryEntryReferenceBuilder builder = new InventoryEntryReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
