
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SyncInfoBuilder implements Builder<SyncInfo> {

    private com.commercetools.history.models.common.Reference channel;

    private String externalId;

    private String syncedAt;

    public SyncInfoBuilder channel(final com.commercetools.history.models.common.Reference channel) {
        this.channel = channel;
        return this;
    }

    public SyncInfoBuilder externalId(final String externalId) {
        this.externalId = externalId;
        return this;
    }

    public SyncInfoBuilder syncedAt(final String syncedAt) {
        this.syncedAt = syncedAt;
        return this;
    }

    public com.commercetools.history.models.common.Reference getChannel() {
        return this.channel;
    }

    public String getExternalId() {
        return this.externalId;
    }

    public String getSyncedAt() {
        return this.syncedAt;
    }

    public SyncInfo build() {
        Objects.requireNonNull(channel);
        Objects.requireNonNull(externalId);
        Objects.requireNonNull(syncedAt);
        return new SyncInfoImpl(channel, externalId, syncedAt);
    }

    /**
     * builds SyncInfo without checking for non null required values
     */
    public SyncInfo buildUnchecked() {
        return new SyncInfoImpl(channel, externalId, syncedAt);
    }

    public static SyncInfoBuilder of() {
        return new SyncInfoBuilder();
    }

    public static SyncInfoBuilder of(final SyncInfo template) {
        SyncInfoBuilder builder = new SyncInfoBuilder();
        builder.channel = template.getChannel();
        builder.externalId = template.getExternalId();
        builder.syncedAt = template.getSyncedAt();
        return builder;
    }

}
