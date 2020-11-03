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

    
    
    @JsonProperty("addressId")
    public String getAddressId();
    
    
    @JsonProperty("addressKey")
    public String getAddressKey();

    public void setAddressId(final String addressId);
    
    public void setAddressKey(final String addressKey);

    public static CustomerRemoveAddressActionImpl of(){
        return new CustomerRemoveAddressActionImpl();
    }
    

    public static CustomerRemoveAddressActionImpl of(final CustomerRemoveAddressAction template) {
        CustomerRemoveAddressActionImpl instance = new CustomerRemoveAddressActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    default <T> T withCustomerRemoveAddressAction(Function<CustomerRemoveAddressAction, T> helper) {
        return helper.apply(this);
    }
}
