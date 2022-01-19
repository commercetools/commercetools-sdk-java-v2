
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OrderSetReturnItemCustomFieldActionBuilder implements Builder<OrderSetReturnItemCustomFieldAction> {

    private String returnItemId;

    private String name;

    @Nullable
    private java.lang.Object value;

    public OrderSetReturnItemCustomFieldActionBuilder returnItemId(final String returnItemId) {
        this.returnItemId = returnItemId;
        return this;
    }

    public OrderSetReturnItemCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public OrderSetReturnItemCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getReturnItemId() {
        return this.returnItemId;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public OrderSetReturnItemCustomFieldAction build() {
        Objects.requireNonNull(returnItemId, OrderSetReturnItemCustomFieldAction.class + ": returnItemId is missing");
        Objects.requireNonNull(name, OrderSetReturnItemCustomFieldAction.class + ": name is missing");
        return new OrderSetReturnItemCustomFieldActionImpl(returnItemId, name, value);
    }

    /**
     * builds OrderSetReturnItemCustomFieldAction without checking for non null required values
     */
    public OrderSetReturnItemCustomFieldAction buildUnchecked() {
        return new OrderSetReturnItemCustomFieldActionImpl(returnItemId, name, value);
    }

    public static OrderSetReturnItemCustomFieldActionBuilder of() {
        return new OrderSetReturnItemCustomFieldActionBuilder();
    }

    public static OrderSetReturnItemCustomFieldActionBuilder of(final OrderSetReturnItemCustomFieldAction template) {
        OrderSetReturnItemCustomFieldActionBuilder builder = new OrderSetReturnItemCustomFieldActionBuilder();
        builder.returnItemId = template.getReturnItemId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
