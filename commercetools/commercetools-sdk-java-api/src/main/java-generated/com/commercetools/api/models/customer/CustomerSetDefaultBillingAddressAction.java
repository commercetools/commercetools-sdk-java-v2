
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerSetDefaultBillingAddressActionImpl.class)
public interface CustomerSetDefaultBillingAddressAction extends CustomerUpdateAction {

    String SET_DEFAULT_BILLING_ADDRESS = "setDefaultBillingAddress";

    /**
    *  <p>If not defined, the customer's <code>defaultBillingAddress</code> is unset.</p>
    */

    @JsonProperty("addressId")
    public String getAddressId();

    @JsonProperty("addressKey")
    public String getAddressKey();

    public void setAddressId(final String addressId);

    public void setAddressKey(final String addressKey);

    public static CustomerSetDefaultBillingAddressAction of() {
        return new CustomerSetDefaultBillingAddressActionImpl();
    }

    public static CustomerSetDefaultBillingAddressAction of(final CustomerSetDefaultBillingAddressAction template) {
        CustomerSetDefaultBillingAddressActionImpl instance = new CustomerSetDefaultBillingAddressActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public static CustomerSetDefaultBillingAddressActionBuilder builder() {
        return CustomerSetDefaultBillingAddressActionBuilder.of();
    }

    public static CustomerSetDefaultBillingAddressActionBuilder builder(
            final CustomerSetDefaultBillingAddressAction template) {
        return CustomerSetDefaultBillingAddressActionBuilder.of(template);
    }

    default <T> T withCustomerSetDefaultBillingAddressAction(
            Function<CustomerSetDefaultBillingAddressAction, T> helper) {
        return helper.apply(this);
    }
}
