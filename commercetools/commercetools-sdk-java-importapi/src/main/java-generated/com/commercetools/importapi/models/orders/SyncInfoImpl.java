
package com.commercetools.importapi.models.orders;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SyncInfoImpl implements SyncInfo {

    private com.commercetools.importapi.models.common.ChannelKeyReference channel;

    private String externalId;

    private java.time.ZonedDateTime syncedAt;

    @JsonCreator
    SyncInfoImpl(@JsonProperty("channel") final com.commercetools.importapi.models.common.ChannelKeyReference channel,
            @JsonProperty("externalId") final String externalId,
            @JsonProperty("syncedAt") final java.time.ZonedDateTime syncedAt) {
        this.channel = channel;
        this.externalId = externalId;
        this.syncedAt = syncedAt;
    }

    public SyncInfoImpl() {
    }

    /**
    *  <p>Maps to <code>SyncInfo.channel</code></p>
    */
    public com.commercetools.importapi.models.common.ChannelKeyReference getChannel() {
        return this.channel;
    }

    /**
    *  <p>Maps to <code>SyncInfo.externalId</code></p>
    */
    public String getExternalId() {
        return this.externalId;
    }

    /**
    *  <p>Maps to <code>SyncInfo.syncedAt</code></p>
    */
    public java.time.ZonedDateTime getSyncedAt() {
        return this.syncedAt;
    }

    public void setChannel(final com.commercetools.importapi.models.common.ChannelKeyReference channel) {
        this.channel = channel;
    }

    public void setExternalId(final String externalId) {
        this.externalId = externalId;
    }

    public void setSyncedAt(final java.time.ZonedDateTime syncedAt) {
        this.syncedAt = syncedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SyncInfoImpl that = (SyncInfoImpl) o;

        return new EqualsBuilder().append(channel, that.channel)
                .append(externalId, that.externalId)
                .append(syncedAt, that.syncedAt)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(channel).append(externalId).append(syncedAt).toHashCode();
    }

}
