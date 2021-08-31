
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderSetCustomFieldActionBuilder implements Builder<OrderSetCustomFieldAction> {

    private String name;

    @Nullable
    private java.lang.Object value;

    public OrderSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public OrderSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
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

    public OrderSetCustomFieldAction build() {
        Objects.requireNonNull(name, OrderSetCustomFieldAction.class + ": name is missing");
        return new OrderSetCustomFieldActionImpl(name, value);
    }

    /**
     * builds OrderSetCustomFieldAction without checking for non null required values
     */
    public OrderSetCustomFieldAction buildUnchecked() {
        return new OrderSetCustomFieldActionImpl(name, value);
    }

    public static OrderSetCustomFieldActionBuilder of() {
        return new OrderSetCustomFieldActionBuilder();
    }

    public static OrderSetCustomFieldActionBuilder of(final OrderSetCustomFieldAction template) {
        OrderSetCustomFieldActionBuilder builder = new OrderSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
