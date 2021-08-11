
package com.commercetools.api.models.inventory;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class InventoryEntrySetCustomFieldActionBuilder implements Builder<InventoryEntrySetCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    public InventoryEntrySetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public InventoryEntrySetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public InventoryEntrySetCustomFieldAction build() {
        Objects.requireNonNull(name, InventoryEntrySetCustomFieldAction.class + ": name is missing");
        return new InventoryEntrySetCustomFieldActionImpl(name, value);
    }

    /**
     * builds InventoryEntrySetCustomFieldAction without checking for non null required values
     */
    public InventoryEntrySetCustomFieldAction buildUnchecked() {
        return new InventoryEntrySetCustomFieldActionImpl(name, value);
    }

    public static InventoryEntrySetCustomFieldActionBuilder of() {
        return new InventoryEntrySetCustomFieldActionBuilder();
    }

    public static InventoryEntrySetCustomFieldActionBuilder of(final InventoryEntrySetCustomFieldAction template) {
        InventoryEntrySetCustomFieldActionBuilder builder = new InventoryEntrySetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
