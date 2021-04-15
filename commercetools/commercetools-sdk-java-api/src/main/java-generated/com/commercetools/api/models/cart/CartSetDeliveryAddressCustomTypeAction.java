
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartSetDeliveryAddressCustomTypeActionImpl.class)
public interface CartSetDeliveryAddressCustomTypeAction extends CartUpdateAction {

    String SET_DELIVERY_ADDRESS_CUSTOM_TYPE = "setDeliveryAddressCustomType";

    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    @NotNull
    @JsonProperty("name")
    public String getName();

    @JsonProperty("value")
    public Object getValue();

    public void setDeliveryId(final String deliveryId);

    public void setName(final String name);

    public void setValue(final Object value);

    public static CartSetDeliveryAddressCustomTypeAction of() {
        return new CartSetDeliveryAddressCustomTypeActionImpl();
    }

    public static CartSetDeliveryAddressCustomTypeAction of(final CartSetDeliveryAddressCustomTypeAction template) {
        CartSetDeliveryAddressCustomTypeActionImpl instance = new CartSetDeliveryAddressCustomTypeActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static CartSetDeliveryAddressCustomTypeActionBuilder builder() {
        return CartSetDeliveryAddressCustomTypeActionBuilder.of();
    }

    public static CartSetDeliveryAddressCustomTypeActionBuilder builder(
            final CartSetDeliveryAddressCustomTypeAction template) {
        return CartSetDeliveryAddressCustomTypeActionBuilder.of(template);
    }

    default <T> T withCartSetDeliveryAddressCustomTypeAction(
            Function<CartSetDeliveryAddressCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}
