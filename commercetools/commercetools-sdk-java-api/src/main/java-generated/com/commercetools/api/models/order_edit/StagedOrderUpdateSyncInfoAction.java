package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import java.time.ZonedDateTime;
import com.commercetools.api.models.order_edit.StagedOrderUpdateSyncInfoActionImpl;

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
@JsonDeserialize(as = StagedOrderUpdateSyncInfoActionImpl.class)
public interface StagedOrderUpdateSyncInfoAction extends StagedOrderUpdateAction {

    
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

    public static StagedOrderUpdateSyncInfoAction of(){
        return new StagedOrderUpdateSyncInfoActionImpl();
    }
    

    public static StagedOrderUpdateSyncInfoAction of(final StagedOrderUpdateSyncInfoAction template) {
        StagedOrderUpdateSyncInfoActionImpl instance = new StagedOrderUpdateSyncInfoActionImpl();
        instance.setChannel(template.getChannel());
        instance.setExternalId(template.getExternalId());
        instance.setSyncedAt(template.getSyncedAt());
        return instance;
    }

    public static StagedOrderUpdateSyncInfoActionBuilder builder(){
        return StagedOrderUpdateSyncInfoActionBuilder.of();
    }
    
    public static StagedOrderUpdateSyncInfoActionBuilder builder(final StagedOrderUpdateSyncInfoAction template){
        return StagedOrderUpdateSyncInfoActionBuilder.of(template);
    }
    

    default <T> T withStagedOrderUpdateSyncInfoAction(Function<StagedOrderUpdateSyncInfoAction, T> helper) {
        return helper.apply(this);
    }
}
