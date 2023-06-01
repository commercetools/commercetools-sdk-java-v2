package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.SyncInfo;
import com.commercetools.history.models.change.UpdateSyncInfoChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
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
 *             .channelId("{channelId}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class UpdateSyncInfoChangeBuilder implements Builder<UpdateSyncInfoChange> {

    
    
    private String change;
    
    
    
    private String channelId;
    
    
    
    private com.commercetools.history.models.common.SyncInfo nextValue;

    
    /**
     *  <p>Update action for <code>updateSyncInfo</code></p>
     * @param change value to be set
     * @return Builder
     */
    
    public UpdateSyncInfoChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the channelId
     * @param channelId value to be set
     * @return Builder
     */
    
    public UpdateSyncInfoChangeBuilder channelId( final String channelId) {
        this.channelId = channelId;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public UpdateSyncInfoChangeBuilder nextValue(Function<com.commercetools.history.models.common.SyncInfoBuilder, com.commercetools.history.models.common.SyncInfoBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.SyncInfoBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public UpdateSyncInfoChangeBuilder withNextValue(Function<com.commercetools.history.models.common.SyncInfoBuilder, com.commercetools.history.models.common.SyncInfo> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.SyncInfoBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public UpdateSyncInfoChangeBuilder nextValue( final com.commercetools.history.models.common.SyncInfo nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    

    /**
     *  <p>Update action for <code>updateSyncInfo</code></p>
     * @return change
     */
    
    
    public String getChange(){
        return this.change;
    }
    
    /**
     * value of channelId}
     * @return channelId
     */
    
    
    public String getChannelId(){
        return this.channelId;
    }
    
    /**
     * value of nextValue}
     * @return nextValue
     */
    
    
    public com.commercetools.history.models.common.SyncInfo getNextValue(){
        return this.nextValue;
    }

    /**
     * builds UpdateSyncInfoChange with checking for non-null required values
     * @return UpdateSyncInfoChange
     */
    public UpdateSyncInfoChange build() {
        Objects.requireNonNull(change, UpdateSyncInfoChange.class + ": change is missing");
        Objects.requireNonNull(channelId, UpdateSyncInfoChange.class + ": channelId is missing");
        Objects.requireNonNull(nextValue, UpdateSyncInfoChange.class + ": nextValue is missing");
        return new UpdateSyncInfoChangeImpl(change, channelId, nextValue);
    }
    
    /**
     * builds UpdateSyncInfoChange without checking for non-null required values
     * @return UpdateSyncInfoChange
     */
    public UpdateSyncInfoChange buildUnchecked() {
        return new UpdateSyncInfoChangeImpl(change, channelId, nextValue);
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
        builder.channelId = template.getChannelId();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
