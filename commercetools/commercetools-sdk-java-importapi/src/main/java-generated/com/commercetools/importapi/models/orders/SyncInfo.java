
package com.commercetools.importapi.models.orders;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.ChannelKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SyncInfoImpl.class)
public interface SyncInfo {

    /**
    *  <p>Maps to <code>SyncInfo.channel</code></p>
    */
    @NotNull
    @Valid
    @JsonProperty("channel")
    public ChannelKeyReference getChannel();

    /**
    *  <p>Maps to <code>SyncInfo.externalId</code></p>
    */

    @JsonProperty("externalId")
    public String getExternalId();

    /**
    *  <p>Maps to <code>SyncInfo.syncedAt</code></p>
    */
    @NotNull
    @JsonProperty("syncedAt")
    public ZonedDateTime getSyncedAt();

    public void setChannel(final ChannelKeyReference channel);

    public void setExternalId(final String externalId);

    public void setSyncedAt(final ZonedDateTime syncedAt);

    public static SyncInfo of() {
        return new SyncInfoImpl();
    }

    public static SyncInfo of(final SyncInfo template) {
        SyncInfoImpl instance = new SyncInfoImpl();
        instance.setChannel(template.getChannel());
        instance.setExternalId(template.getExternalId());
        instance.setSyncedAt(template.getSyncedAt());
        return instance;
    }

    public static SyncInfoBuilder builder() {
        return SyncInfoBuilder.of();
    }

    public static SyncInfoBuilder builder(final SyncInfo template) {
        return SyncInfoBuilder.of(template);
    }

    default <T> T withSyncInfo(Function<SyncInfo, T> helper) {
        return helper.apply(this);
    }
}
