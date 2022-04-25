
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerSetMiddleNameActionImpl.class)
public interface CustomerSetMiddleNameAction extends CustomerUpdateAction {

    String SET_MIDDLE_NAME = "setMiddleName";

    @JsonProperty("middleName")
    public String getMiddleName();

    public void setMiddleName(final String middleName);

    public static CustomerSetMiddleNameAction of() {
        return new CustomerSetMiddleNameActionImpl();
    }

    public static CustomerSetMiddleNameAction of(final CustomerSetMiddleNameAction template) {
        CustomerSetMiddleNameActionImpl instance = new CustomerSetMiddleNameActionImpl();
        instance.setMiddleName(template.getMiddleName());
        return instance;
    }

    public static CustomerSetMiddleNameActionBuilder builder() {
        return CustomerSetMiddleNameActionBuilder.of();
    }

    public static CustomerSetMiddleNameActionBuilder builder(final CustomerSetMiddleNameAction template) {
        return CustomerSetMiddleNameActionBuilder.of(template);
    }

    default <T> T withCustomerSetMiddleNameAction(Function<CustomerSetMiddleNameAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerSetMiddleNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerSetMiddleNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerSetMiddleNameAction>";
            }
        };
    }
}
