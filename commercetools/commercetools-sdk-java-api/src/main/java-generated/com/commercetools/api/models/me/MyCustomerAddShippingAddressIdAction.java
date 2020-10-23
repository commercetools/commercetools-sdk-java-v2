package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCustomerUpdateAction;
import com.commercetools.api.models.me.MyCustomerAddShippingAddressIdActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = MyCustomerAddShippingAddressIdActionImpl.class)
public interface MyCustomerAddShippingAddressIdAction extends MyCustomerUpdateAction {

    
    @NotNull
    @JsonProperty("addressId")
    public String getAddressId();

    public void setAddressId(final String addressId);

    public static MyCustomerAddShippingAddressIdActionImpl of(){
        return new MyCustomerAddShippingAddressIdActionImpl();
    }
    

    public static MyCustomerAddShippingAddressIdActionImpl of(final MyCustomerAddShippingAddressIdAction template) {
        MyCustomerAddShippingAddressIdActionImpl instance = new MyCustomerAddShippingAddressIdActionImpl();
        instance.setAddressId(template.getAddressId());
        return instance;
    }

    default <T> T withMyCustomerAddShippingAddressIdAction(Function<MyCustomerAddShippingAddressIdAction, T> helper) {
        return helper.apply(this);
    }
}
