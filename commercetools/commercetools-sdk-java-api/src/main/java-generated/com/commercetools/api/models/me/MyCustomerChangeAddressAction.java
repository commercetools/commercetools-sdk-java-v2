package com.commercetools.api.models.me;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.me.MyCustomerUpdateAction;
import com.commercetools.api.models.me.MyCustomerChangeAddressActionImpl;

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
@JsonDeserialize(as = MyCustomerChangeAddressActionImpl.class)
public interface MyCustomerChangeAddressAction extends MyCustomerUpdateAction {

    
    @NotNull
    @JsonProperty("addressId")
    public String getAddressId();
    
    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    public void setAddressId(final String addressId);
    
    public void setAddress(final Address address);

    public static MyCustomerChangeAddressActionImpl of(){
        return new MyCustomerChangeAddressActionImpl();
    }
    

    public static MyCustomerChangeAddressActionImpl of(final MyCustomerChangeAddressAction template) {
        MyCustomerChangeAddressActionImpl instance = new MyCustomerChangeAddressActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddress(template.getAddress());
        return instance;
    }

    default <T extends Accessor<MyCustomerChangeAddressAction>> T withMyCustomerChangeAddressAction(Function<MyCustomerChangeAddressAction, T> helper) {
        return helper.apply(this);
    }
}
