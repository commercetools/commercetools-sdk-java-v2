package com.commercetools.api.models.me;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.me.MyCustomerUpdateAction;
import com.commercetools.api.models.me.MyCustomerAddAddressActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = MyCustomerAddAddressActionImpl.class)
public interface MyCustomerAddAddressAction extends MyCustomerUpdateAction {

    String ADD_ADDRESS = "addAddress";

    
    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    
    public void setAddress(final Address address);
    

    public static MyCustomerAddAddressAction of(){
        return new MyCustomerAddAddressActionImpl();
    }
    

    public static MyCustomerAddAddressAction of(final MyCustomerAddAddressAction template) {
        MyCustomerAddAddressActionImpl instance = new MyCustomerAddAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static MyCustomerAddAddressActionBuilder builder(){
        return MyCustomerAddAddressActionBuilder.of();
    }
    
    public static MyCustomerAddAddressActionBuilder builder(final MyCustomerAddAddressAction template){
        return MyCustomerAddAddressActionBuilder.of(template);
    }
    

    default <T> T withMyCustomerAddAddressAction(Function<MyCustomerAddAddressAction, T> helper) {
        return helper.apply(this);
    }
}
