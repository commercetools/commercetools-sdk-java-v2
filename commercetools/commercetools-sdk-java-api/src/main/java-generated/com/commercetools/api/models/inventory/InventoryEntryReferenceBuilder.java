
package com.commercetools.api.models.inventory;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class InventoryEntryReferenceBuilder implements Builder<InventoryEntryReference> {

    private String id;

    @Nullable
    private com.commercetools.api.models.inventory.InventoryEntry obj;

    public InventoryEntryReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public InventoryEntryReferenceBuilder obj(
            Function<com.commercetools.api.models.inventory.InventoryEntryBuilder, com.commercetools.api.models.inventory.InventoryEntryBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.inventory.InventoryEntryBuilder.of()).build();
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
        Objects.requireNonNull(id, InventoryEntryReference.class + ": id is missing");
        return new InventoryEntryReferenceImpl(id, obj);
    }

    /**
     * builds InventoryEntryReference without checking for non null required values
     */
    public InventoryEntryReference buildUnchecked() {
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
