
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartSetItemShippingAddressCustomTypeActionImpl.class)
public interface CartSetItemShippingAddressCustomTypeAction extends CartUpdateAction {

    String SET_ITEM_SHIPPING_ADDRESS_CUSTOM_TYPE = "setItemShippingAddressCustomType";

    @NotNull
    @JsonProperty("addressKey")
    public String getAddressKey();

    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setAddressKey(final String addressKey);

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static CartSetItemShippingAddressCustomTypeAction of() {
        return new CartSetItemShippingAddressCustomTypeActionImpl();
    }

    public static CartSetItemShippingAddressCustomTypeAction of(
            final CartSetItemShippingAddressCustomTypeAction template) {
        CartSetItemShippingAddressCustomTypeActionImpl instance = new CartSetItemShippingAddressCustomTypeActionImpl();
        instance.setAddressKey(template.getAddressKey());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static CartSetItemShippingAddressCustomTypeActionBuilder builder() {
        return CartSetItemShippingAddressCustomTypeActionBuilder.of();
    }

    public static CartSetItemShippingAddressCustomTypeActionBuilder builder(
            final CartSetItemShippingAddressCustomTypeAction template) {
        return CartSetItemShippingAddressCustomTypeActionBuilder.of(template);
    }

    default <T> T withCartSetItemShippingAddressCustomTypeAction(
            Function<CartSetItemShippingAddressCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}
