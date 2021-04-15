
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerSetLastNameActionImpl.class)
public interface CustomerSetLastNameAction extends CustomerUpdateAction {

    String SET_LAST_NAME = "setLastName";

    @JsonProperty("lastName")
    public String getLastName();

    public void setLastName(final String lastName);

    public static CustomerSetLastNameAction of() {
        return new CustomerSetLastNameActionImpl();
    }

    public static CustomerSetLastNameAction of(final CustomerSetLastNameAction template) {
        CustomerSetLastNameActionImpl instance = new CustomerSetLastNameActionImpl();
        instance.setLastName(template.getLastName());
        return instance;
    }

    public static CustomerSetLastNameActionBuilder builder() {
        return CustomerSetLastNameActionBuilder.of();
    }

    public static CustomerSetLastNameActionBuilder builder(final CustomerSetLastNameAction template) {
        return CustomerSetLastNameActionBuilder.of(template);
    }

    default <T> T withCustomerSetLastNameAction(Function<CustomerSetLastNameAction, T> helper) {
        return helper.apply(this);
    }
}
