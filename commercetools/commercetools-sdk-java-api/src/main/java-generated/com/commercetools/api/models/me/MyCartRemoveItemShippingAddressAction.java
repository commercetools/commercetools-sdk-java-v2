package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCartUpdateAction;
import com.commercetools.api.models.me.MyCartRemoveItemShippingAddressActionImpl;

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
@JsonDeserialize(as = MyCartRemoveItemShippingAddressActionImpl.class)
public interface MyCartRemoveItemShippingAddressAction extends MyCartUpdateAction {

    
    @NotNull
    @JsonProperty("addressKey")
    public String getAddressKey();

    public void setAddressKey(final String addressKey);

    public static MyCartRemoveItemShippingAddressActionImpl of(){
        return new MyCartRemoveItemShippingAddressActionImpl();
    }
    

    public static MyCartRemoveItemShippingAddressActionImpl of(final MyCartRemoveItemShippingAddressAction template) {
        MyCartRemoveItemShippingAddressActionImpl instance = new MyCartRemoveItemShippingAddressActionImpl();
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    default <T> T withMyCartRemoveItemShippingAddressAction(Function<MyCartRemoveItemShippingAddressAction, T> helper) {
        return helper.apply(this);
    }
}
