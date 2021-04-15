
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartSetShippingAddressCustomFieldActionImpl.class)
public interface CartSetShippingAddressCustomFieldAction extends CartUpdateAction {

    String SET_SHIPPING_ADDRESS_CUSTOM_FIELD = "setShippingAddressCustomField";

    @NotNull
    @JsonProperty("name")
    public String getName();

    @JsonProperty("value")
    public Object getValue();

    public void setName(final String name);

    public void setValue(final Object value);

    public static CartSetShippingAddressCustomFieldAction of() {
        return new CartSetShippingAddressCustomFieldActionImpl();
    }

    public static CartSetShippingAddressCustomFieldAction of(final CartSetShippingAddressCustomFieldAction template) {
        CartSetShippingAddressCustomFieldActionImpl instance = new CartSetShippingAddressCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static CartSetShippingAddressCustomFieldActionBuilder builder() {
        return CartSetShippingAddressCustomFieldActionBuilder.of();
    }

    public static CartSetShippingAddressCustomFieldActionBuilder builder(
            final CartSetShippingAddressCustomFieldAction template) {
        return CartSetShippingAddressCustomFieldActionBuilder.of(template);
    }

    default <T> T withCartSetShippingAddressCustomFieldAction(
            Function<CartSetShippingAddressCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
