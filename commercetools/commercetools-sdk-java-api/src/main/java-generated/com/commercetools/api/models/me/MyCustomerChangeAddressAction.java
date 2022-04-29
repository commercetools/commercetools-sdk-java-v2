
package com.commercetools.api.models.me;

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
@JsonDeserialize(as = MyCustomerChangeAddressActionImpl.class)
public interface MyCustomerChangeAddressAction extends MyCustomerUpdateAction {

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

    public static MyCustomerChangeAddressAction of() {
        return new MyCustomerChangeAddressActionImpl();
    }

    public static MyCustomerChangeAddressAction of(final MyCustomerChangeAddressAction template) {
        MyCustomerChangeAddressActionImpl instance = new MyCustomerChangeAddressActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static MyCustomerChangeAddressActionBuilder builder() {
        return MyCustomerChangeAddressActionBuilder.of();
    }

    public static MyCustomerChangeAddressActionBuilder builder(final MyCustomerChangeAddressAction template) {
        return MyCustomerChangeAddressActionBuilder.of(template);
    }

    default <T> T withMyCustomerChangeAddressAction(Function<MyCustomerChangeAddressAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerChangeAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerChangeAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerChangeAddressAction>";
            }
        };
    }
}
