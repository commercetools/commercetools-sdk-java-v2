
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * SyncInfo
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SyncInfoImpl implements SyncInfo, ModelBase {

    private com.commercetools.history.models.common.Reference channel;

    private String externalId;

    private String syncedAt;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SyncInfoImpl(@JsonProperty("channel") final com.commercetools.history.models.common.Reference channel,
            @JsonProperty("externalId") final String externalId, @JsonProperty("syncedAt") final String syncedAt) {
        this.channel = channel;
        this.externalId = externalId;
        this.syncedAt = syncedAt;
    }

    /**
     * create empty instance
     */
    public SyncInfoImpl() {
    }

    /**
     *
     */

    public com.commercetools.history.models.common.Reference getChannel() {
        return this.channel;
    }

    /**
     *  <p>Can be used to reference an external order instance, file etc.</p>
     */

    public String getExternalId() {
        return this.externalId;
    }

    /**
     *
     */

    public String getSyncedAt() {
        return this.syncedAt;
    }

    public void setChannel(final com.commercetools.history.models.common.Reference channel) {
        this.channel = channel;
    }

    public void setExternalId(final String externalId) {
        this.externalId = externalId;
    }

    public void setSyncedAt(final String syncedAt) {
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
                .append(channel, that.channel)
                .append(externalId, that.externalId)
                .append(syncedAt, that.syncedAt)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(channel).append(externalId).append(syncedAt).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("channel", channel)
                .append("externalId", externalId)
                .append("syncedAt", syncedAt)
                .build();
    }

    @Override
    public SyncInfo copyDeep() {
        return SyncInfo.deepCopy(this);
    }
}
