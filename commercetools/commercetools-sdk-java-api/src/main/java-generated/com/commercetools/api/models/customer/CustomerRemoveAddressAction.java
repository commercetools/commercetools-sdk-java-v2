
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerRemoveAddressActionImpl.class)
public interface CustomerRemoveAddressAction extends CustomerUpdateAction {

    String REMOVE_ADDRESS = "removeAddress";

    @JsonProperty("addressId")
    public String getAddressId();

    @JsonProperty("addressKey")
    public String getAddressKey();

    public void setAddressId(final String addressId);

    public void setAddressKey(final String addressKey);

    public static CustomerRemoveAddressAction of() {
        return new CustomerRemoveAddressActionImpl();
    }

    public static CustomerRemoveAddressAction of(final CustomerRemoveAddressAction template) {
        CustomerRemoveAddressActionImpl instance = new CustomerRemoveAddressActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public static CustomerRemoveAddressActionBuilder builder() {
        return CustomerRemoveAddressActionBuilder.of();
    }

    public static CustomerRemoveAddressActionBuilder builder(final CustomerRemoveAddressAction template) {
        return CustomerRemoveAddressActionBuilder.of(template);
    }

    default <T> T withCustomerRemoveAddressAction(Function<CustomerRemoveAddressAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerRemoveAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerRemoveAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerRemoveAddressAction>";
            }
        };
    }
}
