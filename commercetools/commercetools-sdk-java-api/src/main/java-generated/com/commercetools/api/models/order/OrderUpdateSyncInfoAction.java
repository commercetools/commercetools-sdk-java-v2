
package com.commercetools.api.models.order;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderUpdateSyncInfoActionImpl.class)
public interface OrderUpdateSyncInfoAction extends OrderUpdateAction {

    String UPDATE_SYNC_INFO = "updateSyncInfo";

    /**
    *  <p><a href="/../api/types#resourceidentifier">ResourceIdentifier</a> to a <a href="ctp:api:type:Channel">Channel</a>.</p>
    */
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

    public static OrderUpdateSyncInfoAction of() {
        return new OrderUpdateSyncInfoActionImpl();
    }

    public static OrderUpdateSyncInfoAction of(final OrderUpdateSyncInfoAction template) {
        OrderUpdateSyncInfoActionImpl instance = new OrderUpdateSyncInfoActionImpl();
        instance.setChannel(template.getChannel());
        instance.setExternalId(template.getExternalId());
        instance.setSyncedAt(template.getSyncedAt());
        return instance;
    }

    public static OrderUpdateSyncInfoActionBuilder builder() {
        return OrderUpdateSyncInfoActionBuilder.of();
    }

    public static OrderUpdateSyncInfoActionBuilder builder(final OrderUpdateSyncInfoAction template) {
        return OrderUpdateSyncInfoActionBuilder.of(template);
    }

    default <T> T withOrderUpdateSyncInfoAction(Function<OrderUpdateSyncInfoAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderUpdateSyncInfoAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderUpdateSyncInfoAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderUpdateSyncInfoAction>";
            }
        };
    }
}
