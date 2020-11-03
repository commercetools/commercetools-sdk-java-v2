package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderRemoveDeliveryActionImpl;

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
@JsonDeserialize(as = StagedOrderRemoveDeliveryActionImpl.class)
public interface StagedOrderRemoveDeliveryAction extends StagedOrderUpdateAction {

    
    @NotNull
    @JsonProperty("deliveryId")
    public String getDeliveryId();

    public void setDeliveryId(final String deliveryId);

    public static StagedOrderRemoveDeliveryActionImpl of(){
        return new StagedOrderRemoveDeliveryActionImpl();
    }
    

    public static StagedOrderRemoveDeliveryActionImpl of(final StagedOrderRemoveDeliveryAction template) {
        StagedOrderRemoveDeliveryActionImpl instance = new StagedOrderRemoveDeliveryActionImpl();
        instance.setDeliveryId(template.getDeliveryId());
        return instance;
    }

    default <T> T withStagedOrderRemoveDeliveryAction(Function<StagedOrderRemoveDeliveryAction, T> helper) {
        return helper.apply(this);
    }
}
