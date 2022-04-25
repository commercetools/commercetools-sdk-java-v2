
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerSetCustomerNumberActionImpl.class)
public interface CustomerSetCustomerNumberAction extends CustomerUpdateAction {

    String SET_CUSTOMER_NUMBER = "setCustomerNumber";

    /**
    *  <p>It should be <strong>unique</strong> across a project.
    *  Once it's set, it cannot be changed.</p>
    */

    @JsonProperty("customerNumber")
    public String getCustomerNumber();

    public void setCustomerNumber(final String customerNumber);

    public static CustomerSetCustomerNumberAction of() {
        return new CustomerSetCustomerNumberActionImpl();
    }

    public static CustomerSetCustomerNumberAction of(final CustomerSetCustomerNumberAction template) {
        CustomerSetCustomerNumberActionImpl instance = new CustomerSetCustomerNumberActionImpl();
        instance.setCustomerNumber(template.getCustomerNumber());
        return instance;
    }

    public static CustomerSetCustomerNumberActionBuilder builder() {
        return CustomerSetCustomerNumberActionBuilder.of();
    }

    public static CustomerSetCustomerNumberActionBuilder builder(final CustomerSetCustomerNumberAction template) {
        return CustomerSetCustomerNumberActionBuilder.of(template);
    }

    default <T> T withCustomerSetCustomerNumberAction(Function<CustomerSetCustomerNumberAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerSetCustomerNumberAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerSetCustomerNumberAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerSetCustomerNumberAction>";
            }
        };
    }
}
