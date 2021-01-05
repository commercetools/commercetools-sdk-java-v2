package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer.CustomerRemoveBillingAddressIdActionImpl;

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
@JsonDeserialize(as = CustomerRemoveBillingAddressIdActionImpl.class)
public interface CustomerRemoveBillingAddressIdAction extends CustomerUpdateAction {

    
    
    @JsonProperty("addressId")
    public String getAddressId();
    
    
    @JsonProperty("addressKey")
    public String getAddressKey();

    public void setAddressId(final String addressId);
    
    public void setAddressKey(final String addressKey);

    public static CustomerRemoveBillingAddressIdAction of(){
        return new CustomerRemoveBillingAddressIdActionImpl();
    }
    

    public static CustomerRemoveBillingAddressIdAction of(final CustomerRemoveBillingAddressIdAction template) {
        CustomerRemoveBillingAddressIdActionImpl instance = new CustomerRemoveBillingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public static CustomerRemoveBillingAddressIdActionBuilder builder(){
        return CustomerRemoveBillingAddressIdActionBuilder.of();
    }
    
    public static CustomerRemoveBillingAddressIdActionBuilder builder(final CustomerRemoveBillingAddressIdAction template){
        return CustomerRemoveBillingAddressIdActionBuilder.of(template);
    }
    

    default <T> T withCustomerRemoveBillingAddressIdAction(Function<CustomerRemoveBillingAddressIdAction, T> helper) {
        return helper.apply(this);
    }
}
