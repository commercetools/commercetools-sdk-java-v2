
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartSetBillingAddressCustomFieldActionImpl.class)
public interface CartSetBillingAddressCustomFieldAction extends CartUpdateAction {

    String SET_BILLING_ADDRESS_CUSTOM_FIELD = "setBillingAddressCustomField";

    @NotNull
    @JsonProperty("name")
    public String getName();

    @JsonProperty("value")
    public Object getValue();

    public void setName(final String name);

    public void setValue(final Object value);

    public static CartSetBillingAddressCustomFieldAction of() {
        return new CartSetBillingAddressCustomFieldActionImpl();
    }

    public static CartSetBillingAddressCustomFieldAction of(final CartSetBillingAddressCustomFieldAction template) {
        CartSetBillingAddressCustomFieldActionImpl instance = new CartSetBillingAddressCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static CartSetBillingAddressCustomFieldActionBuilder builder() {
        return CartSetBillingAddressCustomFieldActionBuilder.of();
    }

    public static CartSetBillingAddressCustomFieldActionBuilder builder(
            final CartSetBillingAddressCustomFieldAction template) {
        return CartSetBillingAddressCustomFieldActionBuilder.of(template);
    }

    default <T> T withCartSetBillingAddressCustomFieldAction(
            Function<CartSetBillingAddressCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
