
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartSetShippingAddressCustomTypeActionImpl.class)
public interface CartSetShippingAddressCustomTypeAction extends CartUpdateAction {

    String SET_SHIPPING_ADDRESS_CUSTOM_TYPE = "setShippingAddressCustomType";

    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static CartSetShippingAddressCustomTypeAction of() {
        return new CartSetShippingAddressCustomTypeActionImpl();
    }

    public static CartSetShippingAddressCustomTypeAction of(final CartSetShippingAddressCustomTypeAction template) {
        CartSetShippingAddressCustomTypeActionImpl instance = new CartSetShippingAddressCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static CartSetShippingAddressCustomTypeActionBuilder builder() {
        return CartSetShippingAddressCustomTypeActionBuilder.of();
    }

    public static CartSetShippingAddressCustomTypeActionBuilder builder(
            final CartSetShippingAddressCustomTypeAction template) {
        return CartSetShippingAddressCustomTypeActionBuilder.of(template);
    }

    default <T> T withCartSetShippingAddressCustomTypeAction(
            Function<CartSetShippingAddressCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}
