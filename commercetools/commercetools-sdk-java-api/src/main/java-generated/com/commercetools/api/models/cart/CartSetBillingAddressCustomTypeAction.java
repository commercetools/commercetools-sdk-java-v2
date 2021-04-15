
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
@JsonDeserialize(as = CartSetBillingAddressCustomTypeActionImpl.class)
public interface CartSetBillingAddressCustomTypeAction extends CartUpdateAction {

    String SET_BILLING_ADDRESS_CUSTOM_TYPE = "setBillingAddressCustomType";

    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static CartSetBillingAddressCustomTypeAction of() {
        return new CartSetBillingAddressCustomTypeActionImpl();
    }

    public static CartSetBillingAddressCustomTypeAction of(final CartSetBillingAddressCustomTypeAction template) {
        CartSetBillingAddressCustomTypeActionImpl instance = new CartSetBillingAddressCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static CartSetBillingAddressCustomTypeActionBuilder builder() {
        return CartSetBillingAddressCustomTypeActionBuilder.of();
    }

    public static CartSetBillingAddressCustomTypeActionBuilder builder(
            final CartSetBillingAddressCustomTypeAction template) {
        return CartSetBillingAddressCustomTypeActionBuilder.of(template);
    }

    default <T> T withCartSetBillingAddressCustomTypeAction(Function<CartSetBillingAddressCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}
