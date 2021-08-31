
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderSetCustomLineItemCustomFieldActionBuilder
        implements Builder<OrderSetCustomLineItemCustomFieldAction> {

    private String customLineItemId;

    private String name;

    @Nullable
    private java.lang.Object value;

    public OrderSetCustomLineItemCustomFieldActionBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    public OrderSetCustomLineItemCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public OrderSetCustomLineItemCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public OrderSetCustomLineItemCustomFieldAction build() {
        Objects.requireNonNull(customLineItemId,
            OrderSetCustomLineItemCustomFieldAction.class + ": customLineItemId is missing");
        Objects.requireNonNull(name, OrderSetCustomLineItemCustomFieldAction.class + ": name is missing");
        return new OrderSetCustomLineItemCustomFieldActionImpl(customLineItemId, name, value);
    }

    /**
     * builds OrderSetCustomLineItemCustomFieldAction without checking for non null required values
     */
    public OrderSetCustomLineItemCustomFieldAction buildUnchecked() {
        return new OrderSetCustomLineItemCustomFieldActionImpl(customLineItemId, name, value);
    }

    public static OrderSetCustomLineItemCustomFieldActionBuilder of() {
        return new OrderSetCustomLineItemCustomFieldActionBuilder();
    }

    public static OrderSetCustomLineItemCustomFieldActionBuilder of(
            final OrderSetCustomLineItemCustomFieldAction template) {
        OrderSetCustomLineItemCustomFieldActionBuilder builder = new OrderSetCustomLineItemCustomFieldActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
