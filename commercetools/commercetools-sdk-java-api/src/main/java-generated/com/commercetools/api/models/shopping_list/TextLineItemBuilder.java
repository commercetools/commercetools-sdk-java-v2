
package com.commercetools.api.models.shopping_list;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TextLineItemBuilder {

    private java.time.ZonedDateTime addedAt;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    private String id;

    private com.commercetools.api.models.common.LocalizedString name;

    private Integer quantity;

    public TextLineItemBuilder addedAt(final java.time.ZonedDateTime addedAt) {
        this.addedAt = addedAt;
        return this;
    }

    public TextLineItemBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    public TextLineItemBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    public TextLineItemBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public TextLineItemBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public TextLineItemBuilder quantity(final Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public java.time.ZonedDateTime getAddedAt() {
        return this.addedAt;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public String getId() {
        return this.id;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public TextLineItem build() {
        return new TextLineItemImpl(addedAt, custom, description, id, name, quantity);
    }

    public static TextLineItemBuilder of() {
        return new TextLineItemBuilder();
    }

    public static TextLineItemBuilder of(final TextLineItem template) {
        TextLineItemBuilder builder = new TextLineItemBuilder();
        builder.addedAt = template.getAddedAt();
        builder.custom = template.getCustom();
        builder.description = template.getDescription();
        builder.id = template.getId();
        builder.name = template.getName();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
