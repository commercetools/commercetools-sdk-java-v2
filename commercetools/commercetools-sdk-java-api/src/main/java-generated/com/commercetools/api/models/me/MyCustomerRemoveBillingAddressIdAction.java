
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyCustomerRemoveBillingAddressIdActionImpl.class)
public interface MyCustomerRemoveBillingAddressIdAction extends MyCustomerUpdateAction {

    String REMOVE_BILLING_ADDRESS_ID = "removeBillingAddressId";

    @JsonProperty("addressId")
    public String getAddressId();

    @JsonProperty("addressKey")
    public String getAddressKey();

    public void setAddressId(final String addressId);

    public void setAddressKey(final String addressKey);

    public static MyCustomerRemoveBillingAddressIdAction of() {
        return new MyCustomerRemoveBillingAddressIdActionImpl();
    }

    public static MyCustomerRemoveBillingAddressIdAction of(final MyCustomerRemoveBillingAddressIdAction template) {
        MyCustomerRemoveBillingAddressIdActionImpl instance = new MyCustomerRemoveBillingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public static MyCustomerRemoveBillingAddressIdActionBuilder builder() {
        return MyCustomerRemoveBillingAddressIdActionBuilder.of();
    }

    public static MyCustomerRemoveBillingAddressIdActionBuilder builder(
            final MyCustomerRemoveBillingAddressIdAction template) {
        return MyCustomerRemoveBillingAddressIdActionBuilder.of(template);
    }

    default <T> T withMyCustomerRemoveBillingAddressIdAction(
            Function<MyCustomerRemoveBillingAddressIdAction, T> helper) {
        return helper.apply(this);
    }
}
