package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCustomerUpdateAction;
import com.commercetools.api.models.me.MyCustomerAddBillingAddressIdActionImpl;

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
@JsonDeserialize(as = MyCustomerAddBillingAddressIdActionImpl.class)
public interface MyCustomerAddBillingAddressIdAction extends MyCustomerUpdateAction {

    
    
    @JsonProperty("addressId")
    public String getAddressId();
    
    
    @JsonProperty("addressKey")
    public String getAddressKey();

    public void setAddressId(final String addressId);
    
    public void setAddressKey(final String addressKey);

    public static MyCustomerAddBillingAddressIdActionImpl of(){
        return new MyCustomerAddBillingAddressIdActionImpl();
    }
    

    public static MyCustomerAddBillingAddressIdActionImpl of(final MyCustomerAddBillingAddressIdAction template) {
        MyCustomerAddBillingAddressIdActionImpl instance = new MyCustomerAddBillingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    default <T> T withMyCustomerAddBillingAddressIdAction(Function<MyCustomerAddBillingAddressIdAction, T> helper) {
        return helper.apply(this);
    }
}
