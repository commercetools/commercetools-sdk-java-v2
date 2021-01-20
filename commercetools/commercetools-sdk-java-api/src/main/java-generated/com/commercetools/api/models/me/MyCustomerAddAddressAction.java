
package com.commercetools.api.models.me;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.me.MyCustomerAddAddressActionImpl;
import com.commercetools.api.models.me.MyCustomerUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyCustomerAddAddressActionImpl.class)
public interface MyCustomerAddAddressAction extends MyCustomerUpdateAction {

    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    public void setAddress(final Address address);

    public static MyCustomerAddAddressAction of() {
        return new MyCustomerAddAddressActionImpl();
    }

    public static MyCustomerAddAddressAction of(final MyCustomerAddAddressAction template) {
        MyCustomerAddAddressActionImpl instance = new MyCustomerAddAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static MyCustomerAddAddressActionBuilder builder() {
        return MyCustomerAddAddressActionBuilder.of();
    }

    public static MyCustomerAddAddressActionBuilder builder(final MyCustomerAddAddressAction template) {
        return MyCustomerAddAddressActionBuilder.of(template);
    }

    default <T> T withMyCustomerAddAddressAction(Function<MyCustomerAddAddressAction, T> helper) {
        return helper.apply(this);
    }
}
