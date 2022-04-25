
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartSetCustomerEmailActionImpl.class)
public interface CartSetCustomerEmailAction extends CartUpdateAction {

    String SET_CUSTOMER_EMAIL = "setCustomerEmail";

    @NotNull
    @JsonProperty("email")
    public String getEmail();

    public void setEmail(final String email);

    public static CartSetCustomerEmailAction of() {
        return new CartSetCustomerEmailActionImpl();
    }

    public static CartSetCustomerEmailAction of(final CartSetCustomerEmailAction template) {
        CartSetCustomerEmailActionImpl instance = new CartSetCustomerEmailActionImpl();
        instance.setEmail(template.getEmail());
        return instance;
    }

    public static CartSetCustomerEmailActionBuilder builder() {
        return CartSetCustomerEmailActionBuilder.of();
    }

    public static CartSetCustomerEmailActionBuilder builder(final CartSetCustomerEmailAction template) {
        return CartSetCustomerEmailActionBuilder.of(template);
    }

    default <T> T withCartSetCustomerEmailAction(Function<CartSetCustomerEmailAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartSetCustomerEmailAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetCustomerEmailAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetCustomerEmailAction>";
            }
        };
    }
}
