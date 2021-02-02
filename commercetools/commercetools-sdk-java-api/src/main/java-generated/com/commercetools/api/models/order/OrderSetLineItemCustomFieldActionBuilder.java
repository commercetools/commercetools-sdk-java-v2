
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderSetLineItemCustomFieldActionBuilder {

    private String lineItemId;

    private String name;

    @Nullable
    private java.lang.Object value;

    public OrderSetLineItemCustomFieldActionBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    public OrderSetLineItemCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public OrderSetLineItemCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public OrderSetLineItemCustomFieldAction build() {
        return new OrderSetLineItemCustomFieldActionImpl(lineItemId, name, value);
    }

    public static OrderSetLineItemCustomFieldActionBuilder of() {
        return new OrderSetLineItemCustomFieldActionBuilder();
    }

    public static OrderSetLineItemCustomFieldActionBuilder of(final OrderSetLineItemCustomFieldAction template) {
        OrderSetLineItemCustomFieldActionBuilder builder = new OrderSetLineItemCustomFieldActionBuilder();
        builder.lineItemId = template.getLineItemId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
