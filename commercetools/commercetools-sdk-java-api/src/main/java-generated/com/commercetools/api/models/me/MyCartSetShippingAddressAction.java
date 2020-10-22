package com.commercetools.api.models.me;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.me.MyCartUpdateAction;
import com.commercetools.api.models.me.MyCartSetShippingAddressActionImpl;

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
@JsonDeserialize(as = MyCartSetShippingAddressActionImpl.class)
public interface MyCartSetShippingAddressAction extends MyCartUpdateAction {

    
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    public void setAddress(final Address address);

    public static MyCartSetShippingAddressActionImpl of(){
        return new MyCartSetShippingAddressActionImpl();
    }
    

    public static MyCartSetShippingAddressActionImpl of(final MyCartSetShippingAddressAction template) {
        MyCartSetShippingAddressActionImpl instance = new MyCartSetShippingAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    default <T extends Accessor<MyCartSetShippingAddressAction>> T withMyCartSetShippingAddressAction(Function<MyCartSetShippingAddressAction, T> helper) {
        return helper.apply(this);
    }
}
