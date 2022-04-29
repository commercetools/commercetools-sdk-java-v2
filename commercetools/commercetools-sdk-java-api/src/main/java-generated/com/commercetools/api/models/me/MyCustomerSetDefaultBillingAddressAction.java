
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyCustomerSetDefaultBillingAddressActionImpl.class)
public interface MyCustomerSetDefaultBillingAddressAction extends MyCustomerUpdateAction {

    String SET_DEFAULT_BILLING_ADDRESS = "setDefaultBillingAddress";

    @JsonProperty("addressId")
    public String getAddressId();

    @JsonProperty("addressKey")
    public String getAddressKey();

    public void setAddressId(final String addressId);

    public void setAddressKey(final String addressKey);

    public static MyCustomerSetDefaultBillingAddressAction of() {
        return new MyCustomerSetDefaultBillingAddressActionImpl();
    }

    public static MyCustomerSetDefaultBillingAddressAction of(final MyCustomerSetDefaultBillingAddressAction template) {
        MyCustomerSetDefaultBillingAddressActionImpl instance = new MyCustomerSetDefaultBillingAddressActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public static MyCustomerSetDefaultBillingAddressActionBuilder builder() {
        return MyCustomerSetDefaultBillingAddressActionBuilder.of();
    }

    public static MyCustomerSetDefaultBillingAddressActionBuilder builder(
            final MyCustomerSetDefaultBillingAddressAction template) {
        return MyCustomerSetDefaultBillingAddressActionBuilder.of(template);
    }

    default <T> T withMyCustomerSetDefaultBillingAddressAction(
            Function<MyCustomerSetDefaultBillingAddressAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerSetDefaultBillingAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerSetDefaultBillingAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerSetDefaultBillingAddressAction>";
            }
        };
    }
}
