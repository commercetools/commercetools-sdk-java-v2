package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderUpdateItemShippingAddressActionImpl;

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
@JsonDeserialize(as = StagedOrderUpdateItemShippingAddressActionImpl.class)
public interface StagedOrderUpdateItemShippingAddressAction extends StagedOrderUpdateAction {

    String UPDATE_ITEM_SHIPPING_ADDRESS = "updateItemShippingAddress";

    
    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    
    public void setAddress(final Address address);
    

    public static StagedOrderUpdateItemShippingAddressAction of(){
        return new StagedOrderUpdateItemShippingAddressActionImpl();
    }
    

    public static StagedOrderUpdateItemShippingAddressAction of(final StagedOrderUpdateItemShippingAddressAction template) {
        StagedOrderUpdateItemShippingAddressActionImpl instance = new StagedOrderUpdateItemShippingAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static StagedOrderUpdateItemShippingAddressActionBuilder builder(){
        return StagedOrderUpdateItemShippingAddressActionBuilder.of();
    }
    
    public static StagedOrderUpdateItemShippingAddressActionBuilder builder(final StagedOrderUpdateItemShippingAddressAction template){
        return StagedOrderUpdateItemShippingAddressActionBuilder.of(template);
    }
    

    default <T> T withStagedOrderUpdateItemShippingAddressAction(Function<StagedOrderUpdateItemShippingAddressAction, T> helper) {
        return helper.apply(this);
    }
}
