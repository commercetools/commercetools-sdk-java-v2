
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TextLineItemBuilder implements Builder<TextLineItem> {

    private String addedAt;

    private com.commercetools.history.models.common.CustomFields custom;

    private com.commercetools.history.models.common.LocalizedString description;

    private String id;

    private com.commercetools.history.models.common.LocalizedString name;

    private Integer quantity;

    public TextLineItemBuilder addedAt(final String addedAt) {
        this.addedAt = addedAt;
        return this;
    }

    public TextLineItemBuilder custom(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    public TextLineItemBuilder custom(final com.commercetools.history.models.common.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    public TextLineItemBuilder description(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public TextLineItemBuilder description(final com.commercetools.history.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    public TextLineItemBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public TextLineItemBuilder name(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public TextLineItemBuilder name(final com.commercetools.history.models.common.LocalizedString name) {
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

    public com.commercetools.history.models.common.CustomFields getCustom() {
        return this.custom;
    }

    public com.commercetools.history.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public String getId() {
        return this.id;
    }

    public com.commercetools.history.models.common.LocalizedString getName() {
        return this.name;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public TextLineItem build() {
        Objects.requireNonNull(addedAt, TextLineItem.class + ": addedAt is missing");
        Objects.requireNonNull(custom, TextLineItem.class + ": custom is missing");
        Objects.requireNonNull(description, TextLineItem.class + ": description is missing");
        Objects.requireNonNull(id, TextLineItem.class + ": id is missing");
        Objects.requireNonNull(name, TextLineItem.class + ": name is missing");
        Objects.requireNonNull(quantity, TextLineItem.class + ": quantity is missing");
        return new TextLineItemImpl(addedAt, custom, description, id, name, quantity);
    }

    /**
     * builds TextLineItem without checking for non null required values
     */
    public TextLineItem buildUnchecked() {
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
