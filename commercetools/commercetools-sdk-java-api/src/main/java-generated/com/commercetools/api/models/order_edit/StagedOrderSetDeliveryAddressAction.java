package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderSetDeliveryAddressActionImpl;

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
@JsonDeserialize(as = StagedOrderSetDeliveryAddressActionImpl.class)
public interface StagedOrderSetDeliveryAddressAction extends StagedOrderUpdateAction {

    
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();
    
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    public void setDeliveryId(final String deliveryId);
    
    public void setAddress(final Address address);

    public static StagedOrderSetDeliveryAddressAction of(){
        return new StagedOrderSetDeliveryAddressActionImpl();
    }
    

    public static StagedOrderSetDeliveryAddressAction of(final StagedOrderSetDeliveryAddressAction template) {
        StagedOrderSetDeliveryAddressActionImpl instance = new StagedOrderSetDeliveryAddressActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static StagedOrderSetDeliveryAddressActionBuilder builder(){
        return StagedOrderSetDeliveryAddressActionBuilder.of();
    }
    
    public static StagedOrderSetDeliveryAddressActionBuilder builder(final StagedOrderSetDeliveryAddressAction template){
        return StagedOrderSetDeliveryAddressActionBuilder.of(template);
    }
    

    default <T> T withStagedOrderSetDeliveryAddressAction(Function<StagedOrderSetDeliveryAddressAction, T> helper) {
        return helper.apply(this);
    }
}
