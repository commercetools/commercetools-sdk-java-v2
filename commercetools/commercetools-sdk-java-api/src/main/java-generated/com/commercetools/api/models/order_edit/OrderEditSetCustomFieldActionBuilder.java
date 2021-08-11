
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderEditSetCustomFieldActionBuilder implements Builder<OrderEditSetCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    public OrderEditSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public OrderEditSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

    public OrderEditSetCustomFieldAction build() {
        Objects.requireNonNull(name, OrderEditSetCustomFieldAction.class + ": name is missing");
        return new OrderEditSetCustomFieldActionImpl(name, value);
    }

    /**
     * builds OrderEditSetCustomFieldAction without checking for non null required values
     */
    public OrderEditSetCustomFieldAction buildUnchecked() {
        return new OrderEditSetCustomFieldActionImpl(name, value);
    }

    public static OrderEditSetCustomFieldActionBuilder of() {
        return new OrderEditSetCustomFieldActionBuilder();
    }

    public static OrderEditSetCustomFieldActionBuilder of(final OrderEditSetCustomFieldAction template) {
        OrderEditSetCustomFieldActionBuilder builder = new OrderEditSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
