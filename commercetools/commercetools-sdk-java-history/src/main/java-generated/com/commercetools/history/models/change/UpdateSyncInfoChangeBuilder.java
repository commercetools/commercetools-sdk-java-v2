
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * UpdateSyncInfoChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     UpdateSyncInfoChange updateSyncInfoChange = UpdateSyncInfoChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .channelId("{channelId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class UpdateSyncInfoChangeBuilder implements Builder<UpdateSyncInfoChange> {

    private String change;

    private com.commercetools.history.models.common.SyncInfo nextValue;

    private String channelId;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public UpdateSyncInfoChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public UpdateSyncInfoChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.SyncInfoBuilder, com.commercetools.history.models.common.SyncInfoBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.SyncInfoBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public UpdateSyncInfoChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.SyncInfoBuilder, com.commercetools.history.models.common.SyncInfo> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.SyncInfoBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public UpdateSyncInfoChangeBuilder nextValue(final com.commercetools.history.models.common.SyncInfo nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p><code>id</code> of the updated Channel.</p>
     * @param channelId value to be set
     * @return Builder
     */

    public UpdateSyncInfoChangeBuilder channelId(final String channelId) {
        this.channelId = channelId;
        return this;
    }

    /**
     * value of change}
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.SyncInfo getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p><code>id</code> of the updated Channel.</p>
     * @return channelId
     */

    public String getChannelId() {
        return this.channelId;
    }

    /**
     * builds UpdateSyncInfoChange with checking for non-null required values
     * @return UpdateSyncInfoChange
     */
    public UpdateSyncInfoChange build() {
        Objects.requireNonNull(change, UpdateSyncInfoChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, UpdateSyncInfoChange.class + ": nextValue is missing");
        Objects.requireNonNull(channelId, UpdateSyncInfoChange.class + ": channelId is missing");
        return new UpdateSyncInfoChangeImpl(change, nextValue, channelId);
    }

    /**
     * builds UpdateSyncInfoChange without checking for non-null required values
     * @return UpdateSyncInfoChange
     */
    public UpdateSyncInfoChange buildUnchecked() {
        return new UpdateSyncInfoChangeImpl(change, nextValue, channelId);
    }

    /**
     * factory method for an instance of UpdateSyncInfoChangeBuilder
     * @return builder
     */
    public static UpdateSyncInfoChangeBuilder of() {
        return new UpdateSyncInfoChangeBuilder();
    }

    /**
     * create builder for UpdateSyncInfoChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static UpdateSyncInfoChangeBuilder of(final UpdateSyncInfoChange template) {
        UpdateSyncInfoChangeBuilder builder = new UpdateSyncInfoChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.channelId = template.getChannelId();
        return builder;
    }

}
