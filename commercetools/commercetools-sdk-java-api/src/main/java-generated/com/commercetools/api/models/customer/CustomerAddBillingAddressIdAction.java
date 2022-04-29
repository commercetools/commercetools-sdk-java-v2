
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerAddBillingAddressIdActionImpl.class)
public interface CustomerAddBillingAddressIdAction extends CustomerUpdateAction {

    String ADD_BILLING_ADDRESS_ID = "addBillingAddressId";

    @JsonProperty("addressId")
    public String getAddressId();

    @JsonProperty("addressKey")
    public String getAddressKey();

    public void setAddressId(final String addressId);

    public void setAddressKey(final String addressKey);

    public static CustomerAddBillingAddressIdAction of() {
        return new CustomerAddBillingAddressIdActionImpl();
    }

    public static CustomerAddBillingAddressIdAction of(final CustomerAddBillingAddressIdAction template) {
        CustomerAddBillingAddressIdActionImpl instance = new CustomerAddBillingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public static CustomerAddBillingAddressIdActionBuilder builder() {
        return CustomerAddBillingAddressIdActionBuilder.of();
    }

    public static CustomerAddBillingAddressIdActionBuilder builder(final CustomerAddBillingAddressIdAction template) {
        return CustomerAddBillingAddressIdActionBuilder.of(template);
    }

    default <T> T withCustomerAddBillingAddressIdAction(Function<CustomerAddBillingAddressIdAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerAddBillingAddressIdAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerAddBillingAddressIdAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerAddBillingAddressIdAction>";
            }
        };
    }
}
