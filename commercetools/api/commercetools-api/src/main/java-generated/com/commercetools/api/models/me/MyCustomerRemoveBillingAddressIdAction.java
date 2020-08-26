package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCustomerUpdateAction;
import com.commercetools.api.models.me.MyCustomerRemoveBillingAddressIdActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = MyCustomerRemoveBillingAddressIdActionImpl.class)
public interface MyCustomerRemoveBillingAddressIdAction extends MyCustomerUpdateAction {

    
    @NotNull
    @JsonProperty("addressId")
    public String getAddressId();

    public void setAddressId(final String addressId);

    public static MyCustomerRemoveBillingAddressIdActionImpl of(){
        return new MyCustomerRemoveBillingAddressIdActionImpl();
    }
    

    public static MyCustomerRemoveBillingAddressIdActionImpl of(final MyCustomerRemoveBillingAddressIdAction template) {
        MyCustomerRemoveBillingAddressIdActionImpl instance = new MyCustomerRemoveBillingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        return instance;
    }

}
