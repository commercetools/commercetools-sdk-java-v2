
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyCartSetCustomerEmailActionImpl.class)
public interface MyCartSetCustomerEmailAction extends MyCartUpdateAction {

    String SET_CUSTOMER_EMAIL = "setCustomerEmail";

    @JsonProperty("email")
    public String getEmail();

    public void setEmail(final String email);

    public static MyCartSetCustomerEmailAction of() {
        return new MyCartSetCustomerEmailActionImpl();
    }

    public static MyCartSetCustomerEmailAction of(final MyCartSetCustomerEmailAction template) {
        MyCartSetCustomerEmailActionImpl instance = new MyCartSetCustomerEmailActionImpl();
        instance.setEmail(template.getEmail());
        return instance;
    }

    public static MyCartSetCustomerEmailActionBuilder builder() {
        return MyCartSetCustomerEmailActionBuilder.of();
    }

    public static MyCartSetCustomerEmailActionBuilder builder(final MyCartSetCustomerEmailAction template) {
        return MyCartSetCustomerEmailActionBuilder.of(template);
    }

    default <T> T withMyCartSetCustomerEmailAction(Function<MyCartSetCustomerEmailAction, T> helper) {
        return helper.apply(this);
    }
}
