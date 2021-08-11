
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartSetDeliveryAddressCustomFieldActionBuilder
        implements Builder<CartSetDeliveryAddressCustomFieldAction> {

    private String deliveryId;

    private String name;

    @Nullable
    private java.lang.Object value;

    public CartSetDeliveryAddressCustomFieldActionBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    public CartSetDeliveryAddressCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public CartSetDeliveryAddressCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getDeliveryId() {
        return this.deliveryId;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public CartSetDeliveryAddressCustomFieldAction build() {
        Objects.requireNonNull(deliveryId, CartSetDeliveryAddressCustomFieldAction.class + ": deliveryId is missing");
        Objects.requireNonNull(name, CartSetDeliveryAddressCustomFieldAction.class + ": name is missing");
        return new CartSetDeliveryAddressCustomFieldActionImpl(deliveryId, name, value);
    }

    /**
     * builds CartSetDeliveryAddressCustomFieldAction without checking for non null required values
     */
    public CartSetDeliveryAddressCustomFieldAction buildUnchecked() {
        return new CartSetDeliveryAddressCustomFieldActionImpl(deliveryId, name, value);
    }

    public static CartSetDeliveryAddressCustomFieldActionBuilder of() {
        return new CartSetDeliveryAddressCustomFieldActionBuilder();
    }

    public static CartSetDeliveryAddressCustomFieldActionBuilder of(
            final CartSetDeliveryAddressCustomFieldAction template) {
        CartSetDeliveryAddressCustomFieldActionBuilder builder = new CartSetDeliveryAddressCustomFieldActionBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
