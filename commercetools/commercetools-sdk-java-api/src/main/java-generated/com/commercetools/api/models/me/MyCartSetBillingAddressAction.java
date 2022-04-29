
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.BaseAddress;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyCartSetBillingAddressActionImpl.class)
public interface MyCartSetBillingAddressAction extends MyCartUpdateAction {

    String SET_BILLING_ADDRESS = "setBillingAddress";

    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    public void setAddress(final BaseAddress address);

    public static MyCartSetBillingAddressAction of() {
        return new MyCartSetBillingAddressActionImpl();
    }

    public static MyCartSetBillingAddressAction of(final MyCartSetBillingAddressAction template) {
        MyCartSetBillingAddressActionImpl instance = new MyCartSetBillingAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static MyCartSetBillingAddressActionBuilder builder() {
        return MyCartSetBillingAddressActionBuilder.of();
    }

    public static MyCartSetBillingAddressActionBuilder builder(final MyCartSetBillingAddressAction template) {
        return MyCartSetBillingAddressActionBuilder.of(template);
    }

    default <T> T withMyCartSetBillingAddressAction(Function<MyCartSetBillingAddressAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyCartSetBillingAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartSetBillingAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartSetBillingAddressAction>";
            }
        };
    }
}
