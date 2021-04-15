
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartSetItemShippingAddressCustomFieldActionImpl.class)
public interface CartSetItemShippingAddressCustomFieldAction extends CartUpdateAction {

    String SET_ITEM_SHIPPING_ADDRESS_CUSTOM_FIELD = "setItemShippingAddressCustomField";

    @NotNull
    @JsonProperty("addressKey")
    public String getAddressKey();

    @NotNull
    @JsonProperty("name")
    public String getName();

    @JsonProperty("value")
    public Object getValue();

    public void setAddressKey(final String addressKey);

    public void setName(final String name);

    public void setValue(final Object value);

    public static CartSetItemShippingAddressCustomFieldAction of() {
        return new CartSetItemShippingAddressCustomFieldActionImpl();
    }

    public static CartSetItemShippingAddressCustomFieldAction of(
            final CartSetItemShippingAddressCustomFieldAction template) {
        CartSetItemShippingAddressCustomFieldActionImpl instance = new CartSetItemShippingAddressCustomFieldActionImpl();
        instance.setAddressKey(template.getAddressKey());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static CartSetItemShippingAddressCustomFieldActionBuilder builder() {
        return CartSetItemShippingAddressCustomFieldActionBuilder.of();
    }

    public static CartSetItemShippingAddressCustomFieldActionBuilder builder(
            final CartSetItemShippingAddressCustomFieldAction template) {
        return CartSetItemShippingAddressCustomFieldActionBuilder.of(template);
    }

    default <T> T withCartSetItemShippingAddressCustomFieldAction(
            Function<CartSetItemShippingAddressCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
