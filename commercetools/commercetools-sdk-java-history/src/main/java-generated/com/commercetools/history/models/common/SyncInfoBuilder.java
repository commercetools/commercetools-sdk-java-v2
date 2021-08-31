
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SyncInfoBuilder implements Builder<SyncInfo> {

    private com.commercetools.history.models.common.Reference channel;

    private String externalId;

    private String syncedAt;

    public SyncInfoBuilder channel(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.channel = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

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
        Objects.requireNonNull(channel, SyncInfo.class + ": channel is missing");
        Objects.requireNonNull(externalId, SyncInfo.class + ": externalId is missing");
        Objects.requireNonNull(syncedAt, SyncInfo.class + ": syncedAt is missing");
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
