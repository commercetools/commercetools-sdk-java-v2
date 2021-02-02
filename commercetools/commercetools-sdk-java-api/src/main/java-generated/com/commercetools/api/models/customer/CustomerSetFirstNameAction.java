
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerSetFirstNameActionImpl.class)
public interface CustomerSetFirstNameAction extends CustomerUpdateAction {

    String SET_FIRST_NAME = "setFirstName";

    @JsonProperty("firstName")
    public String getFirstName();

    public void setFirstName(final String firstName);

    public static CustomerSetFirstNameAction of() {
        return new CustomerSetFirstNameActionImpl();
    }

    public static CustomerSetFirstNameAction of(final CustomerSetFirstNameAction template) {
        CustomerSetFirstNameActionImpl instance = new CustomerSetFirstNameActionImpl();
        instance.setFirstName(template.getFirstName());
        return instance;
    }

    public static CustomerSetFirstNameActionBuilder builder() {
        return CustomerSetFirstNameActionBuilder.of();
    }

    public static CustomerSetFirstNameActionBuilder builder(final CustomerSetFirstNameAction template) {
        return CustomerSetFirstNameActionBuilder.of(template);
    }

    default <T> T withCustomerSetFirstNameAction(Function<CustomerSetFirstNameAction, T> helper) {
        return helper.apply(this);
    }
}
