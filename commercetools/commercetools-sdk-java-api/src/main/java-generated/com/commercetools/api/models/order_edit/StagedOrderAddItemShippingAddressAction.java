package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderAddItemShippingAddressActionImpl;

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
@JsonDeserialize(as = StagedOrderAddItemShippingAddressActionImpl.class)
public interface StagedOrderAddItemShippingAddressAction extends StagedOrderUpdateAction {

    String ADD_ITEM_SHIPPING_ADDRESS = "addItemShippingAddress";

    
    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    
    public void setAddress(final Address address);
    

    public static StagedOrderAddItemShippingAddressAction of(){
        return new StagedOrderAddItemShippingAddressActionImpl();
    }
    

    public static StagedOrderAddItemShippingAddressAction of(final StagedOrderAddItemShippingAddressAction template) {
        StagedOrderAddItemShippingAddressActionImpl instance = new StagedOrderAddItemShippingAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static StagedOrderAddItemShippingAddressActionBuilder builder(){
        return StagedOrderAddItemShippingAddressActionBuilder.of();
    }
    
    public static StagedOrderAddItemShippingAddressActionBuilder builder(final StagedOrderAddItemShippingAddressAction template){
        return StagedOrderAddItemShippingAddressActionBuilder.of(template);
    }
    

    default <T> T withStagedOrderAddItemShippingAddressAction(Function<StagedOrderAddItemShippingAddressAction, T> helper) {
        return helper.apply(this);
    }
}
