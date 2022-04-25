
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
@JsonDeserialize(as = CustomerChangeAddressActionImpl.class)
public interface CustomerChangeAddressAction extends CustomerUpdateAction {

    String CHANGE_ADDRESS = "changeAddress";

    @JsonProperty("addressId")
    public String getAddressId();

    @JsonProperty("addressKey")
    public String getAddressKey();

    @NotNull
    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    public void setAddressId(final String addressId);

    public void setAddressKey(final String addressKey);

    public void setAddress(final BaseAddress address);

    public static CustomerChangeAddressAction of() {
        return new CustomerChangeAddressActionImpl();
    }

    public static CustomerChangeAddressAction of(final CustomerChangeAddressAction template) {
        CustomerChangeAddressActionImpl instance = new CustomerChangeAddressActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static CustomerChangeAddressActionBuilder builder() {
        return CustomerChangeAddressActionBuilder.of();
    }

    public static CustomerChangeAddressActionBuilder builder(final CustomerChangeAddressAction template) {
        return CustomerChangeAddressActionBuilder.of(template);
    }

    default <T> T withCustomerChangeAddressAction(Function<CustomerChangeAddressAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerChangeAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerChangeAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerChangeAddressAction>";
            }
        };
    }
}
