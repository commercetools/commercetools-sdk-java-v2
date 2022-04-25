
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyCustomerAddShippingAddressIdActionImpl.class)
public interface MyCustomerAddShippingAddressIdAction extends MyCustomerUpdateAction {

    String ADD_SHIPPING_ADDRESS_ID = "addShippingAddressId";

    @JsonProperty("addressId")
    public String getAddressId();

    @JsonProperty("addressKey")
    public String getAddressKey();

    public void setAddressId(final String addressId);

    public void setAddressKey(final String addressKey);

    public static MyCustomerAddShippingAddressIdAction of() {
        return new MyCustomerAddShippingAddressIdActionImpl();
    }

    public static MyCustomerAddShippingAddressIdAction of(final MyCustomerAddShippingAddressIdAction template) {
        MyCustomerAddShippingAddressIdActionImpl instance = new MyCustomerAddShippingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public static MyCustomerAddShippingAddressIdActionBuilder builder() {
        return MyCustomerAddShippingAddressIdActionBuilder.of();
    }

    public static MyCustomerAddShippingAddressIdActionBuilder builder(
            final MyCustomerAddShippingAddressIdAction template) {
        return MyCustomerAddShippingAddressIdActionBuilder.of(template);
    }

    default <T> T withMyCustomerAddShippingAddressIdAction(Function<MyCustomerAddShippingAddressIdAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerAddShippingAddressIdAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerAddShippingAddressIdAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerAddShippingAddressIdAction>";
            }
        };
    }
}
