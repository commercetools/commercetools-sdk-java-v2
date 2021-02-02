
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderUpdateSyncInfoActionImpl.class)
public interface StagedOrderUpdateSyncInfoAction extends StagedOrderUpdateAction {

    String UPDATE_SYNC_INFO = "updateSyncInfo";

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

    public static StagedOrderUpdateSyncInfoAction of() {
        return new StagedOrderUpdateSyncInfoActionImpl();
    }

    public static StagedOrderUpdateSyncInfoAction of(final StagedOrderUpdateSyncInfoAction template) {
        StagedOrderUpdateSyncInfoActionImpl instance = new StagedOrderUpdateSyncInfoActionImpl();
        instance.setChannel(template.getChannel());
        instance.setExternalId(template.getExternalId());
        instance.setSyncedAt(template.getSyncedAt());
        return instance;
    }

    public static StagedOrderUpdateSyncInfoActionBuilder builder() {
        return StagedOrderUpdateSyncInfoActionBuilder.of();
    }

    public static StagedOrderUpdateSyncInfoActionBuilder builder(final StagedOrderUpdateSyncInfoAction template) {
        return StagedOrderUpdateSyncInfoActionBuilder.of(template);
    }

    default <T> T withStagedOrderUpdateSyncInfoAction(Function<StagedOrderUpdateSyncInfoAction, T> helper) {
        return helper.apply(this);
    }
}
