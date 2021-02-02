
package com.commercetools.api.models.inventory;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class InventoryEntryResourceIdentifierBuilder {

    @Nullable
    private String id;

    @Nullable
    private String key;

    public InventoryEntryResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    public InventoryEntryResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getId() {
        return this.id;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public InventoryEntryResourceIdentifier build() {
        return new InventoryEntryResourceIdentifierImpl(id, key);
    }

    public static InventoryEntryResourceIdentifierBuilder of() {
        return new InventoryEntryResourceIdentifierBuilder();
    }

    public static InventoryEntryResourceIdentifierBuilder of(final InventoryEntryResourceIdentifier template) {
        InventoryEntryResourceIdentifierBuilder builder = new InventoryEntryResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
