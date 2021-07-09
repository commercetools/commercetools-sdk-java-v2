
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartSetDeliveryAddressCustomFieldActionImpl.class)
public interface CartSetDeliveryAddressCustomFieldAction extends CartUpdateAction {

    String SET_DELIVERY_ADDRESS_CUSTOM_FIELD = "setDeliveryAddressCustomField";

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

    public static CartSetDeliveryAddressCustomFieldAction of() {
        return new CartSetDeliveryAddressCustomFieldActionImpl();
    }

    public static CartSetDeliveryAddressCustomFieldAction of(final CartSetDeliveryAddressCustomFieldAction template) {
        CartSetDeliveryAddressCustomFieldActionImpl instance = new CartSetDeliveryAddressCustomFieldActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static CartSetDeliveryAddressCustomFieldActionBuilder builder() {
        return CartSetDeliveryAddressCustomFieldActionBuilder.of();
    }

    public static CartSetDeliveryAddressCustomFieldActionBuilder builder(
            final CartSetDeliveryAddressCustomFieldAction template) {
        return CartSetDeliveryAddressCustomFieldActionBuilder.of(template);
    }

    default <T> T withCartSetDeliveryAddressCustomFieldAction(
            Function<CartSetDeliveryAddressCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
