
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyCustomerSetDefaultShippingAddressActionImpl.class)
public interface MyCustomerSetDefaultShippingAddressAction extends MyCustomerUpdateAction {

    String SET_DEFAULT_SHIPPING_ADDRESS = "setDefaultShippingAddress";

    @JsonProperty("addressId")
    public String getAddressId();

    @JsonProperty("addressKey")
    public String getAddressKey();

    public void setAddressId(final String addressId);

    public void setAddressKey(final String addressKey);

    public static MyCustomerSetDefaultShippingAddressAction of() {
        return new MyCustomerSetDefaultShippingAddressActionImpl();
    }

    public static MyCustomerSetDefaultShippingAddressAction of(
            final MyCustomerSetDefaultShippingAddressAction template) {
        MyCustomerSetDefaultShippingAddressActionImpl instance = new MyCustomerSetDefaultShippingAddressActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public static MyCustomerSetDefaultShippingAddressActionBuilder builder() {
        return MyCustomerSetDefaultShippingAddressActionBuilder.of();
    }

    public static MyCustomerSetDefaultShippingAddressActionBuilder builder(
            final MyCustomerSetDefaultShippingAddressAction template) {
        return MyCustomerSetDefaultShippingAddressActionBuilder.of(template);
    }

    default <T> T withMyCustomerSetDefaultShippingAddressAction(
            Function<MyCustomerSetDefaultShippingAddressAction, T> helper) {
        return helper.apply(this);
    }
}
