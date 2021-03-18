
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SyncInfoBuilder {

    private com.commercetools.history.models.Reference channel;

    private String externalId;

    private String syncedAt;

    public SyncInfoBuilder channel(final com.commercetools.history.models.Reference channel) {
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

    public com.commercetools.history.models.Reference getChannel() {
        return this.channel;
    }

    public String getExternalId() {
        return this.externalId;
    }

    public String getSyncedAt() {
        return this.syncedAt;
    }

    public SyncInfo build() {
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
