package com.commercetools.api.models.order;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.order.OrderUpdateAction;
import java.time.ZonedDateTime;
import com.commercetools.api.models.order.OrderUpdateSyncInfoActionImpl;

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
@JsonDeserialize(as = OrderUpdateSyncInfoActionImpl.class)
public interface OrderUpdateSyncInfoAction extends OrderUpdateAction {

    
    @NotNull
    @Valid
    @JsonProperty("channel")
    public ChannelResourceIdentifier getChannel();
    
    
    @JsonProperty("externalId")
    public String getExternalId();
    
    
    @JsonProperty("syncedAt")
    public ZonedDateTime getSyncedAt();

    public void setChannel(final ChannelResourceIdentifier channel);
    
    public void setExternalId(final String externalId);
    
    public void setSyncedAt(final ZonedDateTime syncedAt);

    public static OrderUpdateSyncInfoActionImpl of(){
        return new OrderUpdateSyncInfoActionImpl();
    }
    

    public static OrderUpdateSyncInfoActionImpl of(final OrderUpdateSyncInfoAction template) {
        OrderUpdateSyncInfoActionImpl instance = new OrderUpdateSyncInfoActionImpl();
        instance.setChannel(template.getChannel());
        instance.setExternalId(template.getExternalId());
        instance.setSyncedAt(template.getSyncedAt());
        return instance;
    }

    default <T extends Accessor<OrderUpdateSyncInfoAction>> T withOrderUpdateSyncInfoAction(Function<OrderUpdateSyncInfoAction, T> helper) {
        return helper.apply(this);
    }
}
