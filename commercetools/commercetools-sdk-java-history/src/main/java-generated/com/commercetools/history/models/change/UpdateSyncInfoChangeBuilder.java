
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class UpdateSyncInfoChangeBuilder implements Builder<UpdateSyncInfoChange> {

    private String change;

    private String channelId;

    private com.commercetools.history.models.common.SyncInfo nextValue;

    public UpdateSyncInfoChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public UpdateSyncInfoChangeBuilder channelId(final String channelId) {
        this.channelId = channelId;
        return this;
    }

    public UpdateSyncInfoChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.SyncInfoBuilder, com.commercetools.history.models.common.SyncInfoBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.SyncInfoBuilder.of()).build();
        return this;
    }

    public UpdateSyncInfoChangeBuilder nextValue(final com.commercetools.history.models.common.SyncInfo nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getChannelId() {
        return this.channelId;
    }

    public com.commercetools.history.models.common.SyncInfo getNextValue() {
        return this.nextValue;
    }

    public UpdateSyncInfoChange build() {
        Objects.requireNonNull(change, UpdateSyncInfoChange.class + ": change is missing");
        Objects.requireNonNull(channelId, UpdateSyncInfoChange.class + ": channelId is missing");
        Objects.requireNonNull(nextValue, UpdateSyncInfoChange.class + ": nextValue is missing");
        return new UpdateSyncInfoChangeImpl(change, channelId, nextValue);
    }

    /**
     * builds UpdateSyncInfoChange without checking for non null required values
     */
    public UpdateSyncInfoChange buildUnchecked() {
        return new UpdateSyncInfoChangeImpl(change, channelId, nextValue);
    }

    public static UpdateSyncInfoChangeBuilder of() {
        return new UpdateSyncInfoChangeBuilder();
    }

    public static UpdateSyncInfoChangeBuilder of(final UpdateSyncInfoChange template) {
        UpdateSyncInfoChangeBuilder builder = new UpdateSyncInfoChangeBuilder();
        builder.change = template.getChange();
        builder.channelId = template.getChannelId();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
