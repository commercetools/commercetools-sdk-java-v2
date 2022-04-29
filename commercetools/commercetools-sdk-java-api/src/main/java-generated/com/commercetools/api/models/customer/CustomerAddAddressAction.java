
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.BaseAddress;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerAddAddressActionImpl.class)
public interface CustomerAddAddressAction extends CustomerUpdateAction {

    String ADD_ADDRESS = "addAddress";

    @NotNull
    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    public void setAddress(final BaseAddress address);

    public static CustomerAddAddressAction of() {
        return new CustomerAddAddressActionImpl();
    }

    public static CustomerAddAddressAction of(final CustomerAddAddressAction template) {
        CustomerAddAddressActionImpl instance = new CustomerAddAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static CustomerAddAddressActionBuilder builder() {
        return CustomerAddAddressActionBuilder.of();
    }

    public static CustomerAddAddressActionBuilder builder(final CustomerAddAddressAction template) {
        return CustomerAddAddressActionBuilder.of(template);
    }

    default <T> T withCustomerAddAddressAction(Function<CustomerAddAddressAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerAddAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerAddAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerAddAddressAction>";
            }
        };
    }
}
