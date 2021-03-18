
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TextLineItemBuilder {

    private String addedAt;

    private com.commercetools.history.models.CustomFields custom;

    private com.commercetools.history.models.LocalizedString description;

    private String id;

    private com.commercetools.history.models.LocalizedString name;

    private Integer quantity;

    public TextLineItemBuilder addedAt(final String addedAt) {
        this.addedAt = addedAt;
        return this;
    }

    public TextLineItemBuilder custom(final com.commercetools.history.models.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    public TextLineItemBuilder description(final com.commercetools.history.models.LocalizedString description) {
        this.description = description;
        return this;
    }

    public TextLineItemBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public TextLineItemBuilder name(final com.commercetools.history.models.LocalizedString name) {
        this.name = name;
        return this;
    }

    public TextLineItemBuilder quantity(final Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public String getAddedAt() {
        return this.addedAt;
    }

    public com.commercetools.history.models.CustomFields getCustom() {
        return this.custom;
    }

    public com.commercetools.history.models.LocalizedString getDescription() {
        return this.description;
    }

    public String getId() {
        return this.id;
    }

    public com.commercetools.history.models.LocalizedString getName() {
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
