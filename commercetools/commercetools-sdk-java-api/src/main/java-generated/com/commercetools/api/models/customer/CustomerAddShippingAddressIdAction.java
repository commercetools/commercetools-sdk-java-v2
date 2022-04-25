
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerAddShippingAddressIdActionImpl.class)
public interface CustomerAddShippingAddressIdAction extends CustomerUpdateAction {

    String ADD_SHIPPING_ADDRESS_ID = "addShippingAddressId";

    @JsonProperty("addressId")
    public String getAddressId();

    @JsonProperty("addressKey")
    public String getAddressKey();

    public void setAddressId(final String addressId);

    public void setAddressKey(final String addressKey);

    public static CustomerAddShippingAddressIdAction of() {
        return new CustomerAddShippingAddressIdActionImpl();
    }

    public static CustomerAddShippingAddressIdAction of(final CustomerAddShippingAddressIdAction template) {
        CustomerAddShippingAddressIdActionImpl instance = new CustomerAddShippingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public static CustomerAddShippingAddressIdActionBuilder builder() {
        return CustomerAddShippingAddressIdActionBuilder.of();
    }

    public static CustomerAddShippingAddressIdActionBuilder builder(final CustomerAddShippingAddressIdAction template) {
        return CustomerAddShippingAddressIdActionBuilder.of(template);
    }

    default <T> T withCustomerAddShippingAddressIdAction(Function<CustomerAddShippingAddressIdAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerAddShippingAddressIdAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerAddShippingAddressIdAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerAddShippingAddressIdAction>";
            }
        };
    }
}
