package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.TrackingData;
import com.commercetools.api.models.order.OrderSetParcelTrackingDataActionImpl;

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
@JsonDeserialize(as = OrderSetParcelTrackingDataActionImpl.class)
public interface OrderSetParcelTrackingDataAction extends OrderUpdateAction {

    
    @NotNull
    @JsonProperty("parcelId")
    public String getParcelId();
    
    @Valid
    @JsonProperty("trackingData")
    public TrackingData getTrackingData();

    public void setParcelId(final String parcelId);
    
    public void setTrackingData(final TrackingData trackingData);

    public static OrderSetParcelTrackingDataActionImpl of(){
        return new OrderSetParcelTrackingDataActionImpl();
    }
    

    public static OrderSetParcelTrackingDataActionImpl of(final OrderSetParcelTrackingDataAction template) {
        OrderSetParcelTrackingDataActionImpl instance = new OrderSetParcelTrackingDataActionImpl();
        instance.setParcelId(template.getParcelId());
        instance.setTrackingData(template.getTrackingData());
        return instance;
    }

    default <T> T withOrderSetParcelTrackingDataAction(Function<OrderSetParcelTrackingDataAction, T> helper) {
        return helper.apply(this);
    }
}
