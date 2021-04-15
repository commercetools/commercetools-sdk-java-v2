
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartSetCustomerIdActionImpl.class)
public interface CartSetCustomerIdAction extends CartUpdateAction {

    String SET_CUSTOMER_ID = "setCustomerId";

    /**
    *  <p>If set, a customer with the given ID must exist in the project.</p>
    */

    @JsonProperty("customerId")
    public String getCustomerId();

    public void setCustomerId(final String customerId);

    public static CartSetCustomerIdAction of() {
        return new CartSetCustomerIdActionImpl();
    }

    public static CartSetCustomerIdAction of(final CartSetCustomerIdAction template) {
        CartSetCustomerIdActionImpl instance = new CartSetCustomerIdActionImpl();
        instance.setCustomerId(template.getCustomerId());
        return instance;
    }

    public static CartSetCustomerIdActionBuilder builder() {
        return CartSetCustomerIdActionBuilder.of();
    }

    public static CartSetCustomerIdActionBuilder builder(final CartSetCustomerIdAction template) {
        return CartSetCustomerIdActionBuilder.of(template);
    }

    default <T> T withCartSetCustomerIdAction(Function<CartSetCustomerIdAction, T> helper) {
        return helper.apply(this);
    }
}
