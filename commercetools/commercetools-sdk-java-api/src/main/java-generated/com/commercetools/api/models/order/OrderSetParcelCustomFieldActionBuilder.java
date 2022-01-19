
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OrderSetParcelCustomFieldActionBuilder implements Builder<OrderSetParcelCustomFieldAction> {

    private String parcelId;

    private String name;

    @Nullable
    private java.lang.Object value;

    public OrderSetParcelCustomFieldActionBuilder parcelId(final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }

    public OrderSetParcelCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public OrderSetParcelCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getParcelId() {
        return this.parcelId;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public OrderSetParcelCustomFieldAction build() {
        Objects.requireNonNull(parcelId, OrderSetParcelCustomFieldAction.class + ": parcelId is missing");
        Objects.requireNonNull(name, OrderSetParcelCustomFieldAction.class + ": name is missing");
        return new OrderSetParcelCustomFieldActionImpl(parcelId, name, value);
    }

    /**
     * builds OrderSetParcelCustomFieldAction without checking for non null required values
     */
    public OrderSetParcelCustomFieldAction buildUnchecked() {
        return new OrderSetParcelCustomFieldActionImpl(parcelId, name, value);
    }

    public static OrderSetParcelCustomFieldActionBuilder of() {
        return new OrderSetParcelCustomFieldActionBuilder();
    }

    public static OrderSetParcelCustomFieldActionBuilder of(final OrderSetParcelCustomFieldAction template) {
        OrderSetParcelCustomFieldActionBuilder builder = new OrderSetParcelCustomFieldActionBuilder();
        builder.parcelId = template.getParcelId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
