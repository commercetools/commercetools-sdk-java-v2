
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyCustomerRemoveAddressActionImpl.class)
public interface MyCustomerRemoveAddressAction extends MyCustomerUpdateAction {

    String REMOVE_ADDRESS = "removeAddress";

    @JsonProperty("addressId")
    public String getAddressId();

    @JsonProperty("addressKey")
    public String getAddressKey();

    public void setAddressId(final String addressId);

    public void setAddressKey(final String addressKey);

    public static MyCustomerRemoveAddressAction of() {
        return new MyCustomerRemoveAddressActionImpl();
    }

    public static MyCustomerRemoveAddressAction of(final MyCustomerRemoveAddressAction template) {
        MyCustomerRemoveAddressActionImpl instance = new MyCustomerRemoveAddressActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public static MyCustomerRemoveAddressActionBuilder builder() {
        return MyCustomerRemoveAddressActionBuilder.of();
    }

    public static MyCustomerRemoveAddressActionBuilder builder(final MyCustomerRemoveAddressAction template) {
        return MyCustomerRemoveAddressActionBuilder.of(template);
    }

    default <T> T withMyCustomerRemoveAddressAction(Function<MyCustomerRemoveAddressAction, T> helper) {
        return helper.apply(this);
    }
}
