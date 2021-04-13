package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer.CustomerRemoveAddressActionImpl;

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
@JsonDeserialize(as = CustomerRemoveAddressActionImpl.class)
public interface CustomerRemoveAddressAction extends CustomerUpdateAction {

    String REMOVE_ADDRESS = "removeAddress";

    
    
    @JsonProperty("addressId")
    public String getAddressId();
    
    
    @JsonProperty("addressKey")
    public String getAddressKey();

    
    public void setAddressId(final String addressId);
    
    
    
    public void setAddressKey(final String addressKey);
    

    public static CustomerRemoveAddressAction of(){
        return new CustomerRemoveAddressActionImpl();
    }
    

    public static CustomerRemoveAddressAction of(final CustomerRemoveAddressAction template) {
        CustomerRemoveAddressActionImpl instance = new CustomerRemoveAddressActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public static CustomerRemoveAddressActionBuilder builder(){
        return CustomerRemoveAddressActionBuilder.of();
    }
    
    public static CustomerRemoveAddressActionBuilder builder(final CustomerRemoveAddressAction template){
        return CustomerRemoveAddressActionBuilder.of(template);
    }
    

    default <T> T withCustomerRemoveAddressAction(Function<CustomerRemoveAddressAction, T> helper) {
        return helper.apply(this);
    }
}
