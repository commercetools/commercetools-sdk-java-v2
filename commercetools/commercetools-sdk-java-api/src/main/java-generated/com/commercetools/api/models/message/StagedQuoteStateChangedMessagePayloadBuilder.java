package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.staged_quote.StagedQuoteState;
import com.commercetools.api.models.message.StagedQuoteStateChangedMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedQuoteStateChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuoteStateChangedMessagePayload stagedQuoteStateChangedMessagePayload = StagedQuoteStateChangedMessagePayload.builder()
 *             .stagedQuoteState(StagedQuoteState.IN_PROGRESS)
 *             .oldStagedQuoteState(StagedQuoteState.IN_PROGRESS)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StagedQuoteStateChangedMessagePayloadBuilder implements Builder<StagedQuoteStateChangedMessagePayload> {

    
    
    private com.commercetools.api.models.staged_quote.StagedQuoteState stagedQuoteState;
    
    
    
    private com.commercetools.api.models.staged_quote.StagedQuoteState oldStagedQuoteState;

    
    /**
     *  <p>State of the Staged Quote after the Change Staged Quote State update action.</p>
     * @param stagedQuoteState value to be set
     * @return Builder
     */
    
    public StagedQuoteStateChangedMessagePayloadBuilder stagedQuoteState( final com.commercetools.api.models.staged_quote.StagedQuoteState stagedQuoteState) {
        this.stagedQuoteState = stagedQuoteState;
        return this;
    }
    
    
    
    
    /**
     *  <p>State of the Staged Quote before the Change Staged Quote State update action.</p>
     * @param oldStagedQuoteState value to be set
     * @return Builder
     */
    
    public StagedQuoteStateChangedMessagePayloadBuilder oldStagedQuoteState( final com.commercetools.api.models.staged_quote.StagedQuoteState oldStagedQuoteState) {
        this.oldStagedQuoteState = oldStagedQuoteState;
        return this;
    }
    
    

    /**
     *  <p>State of the Staged Quote after the Change Staged Quote State update action.</p>
     * @return stagedQuoteState
     */
    
    
    public com.commercetools.api.models.staged_quote.StagedQuoteState getStagedQuoteState(){
        return this.stagedQuoteState;
    }
    
    /**
     *  <p>State of the Staged Quote before the Change Staged Quote State update action.</p>
     * @return oldStagedQuoteState
     */
    
    
    public com.commercetools.api.models.staged_quote.StagedQuoteState getOldStagedQuoteState(){
        return this.oldStagedQuoteState;
    }

    /**
     * builds StagedQuoteStateChangedMessagePayload with checking for non-null required values
     * @return StagedQuoteStateChangedMessagePayload
     */
    public StagedQuoteStateChangedMessagePayload build() {
        Objects.requireNonNull(stagedQuoteState, StagedQuoteStateChangedMessagePayload.class + ": stagedQuoteState is missing");
        Objects.requireNonNull(oldStagedQuoteState, StagedQuoteStateChangedMessagePayload.class + ": oldStagedQuoteState is missing");
        return new StagedQuoteStateChangedMessagePayloadImpl(stagedQuoteState, oldStagedQuoteState);
    }
    
    /**
     * builds StagedQuoteStateChangedMessagePayload without checking for non-null required values
     * @return StagedQuoteStateChangedMessagePayload
     */
    public StagedQuoteStateChangedMessagePayload buildUnchecked() {
        return new StagedQuoteStateChangedMessagePayloadImpl(stagedQuoteState, oldStagedQuoteState);
    }

    /**
     * factory method for an instance of StagedQuoteStateChangedMessagePayloadBuilder
     * @return builder 
     */
    public static StagedQuoteStateChangedMessagePayloadBuilder of() {
        return new StagedQuoteStateChangedMessagePayloadBuilder();
    }

    /**
     * create builder for StagedQuoteStateChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedQuoteStateChangedMessagePayloadBuilder of(final StagedQuoteStateChangedMessagePayload template) {
        StagedQuoteStateChangedMessagePayloadBuilder builder = new StagedQuoteStateChangedMessagePayloadBuilder();
        builder.stagedQuoteState = template.getStagedQuoteState();
        builder.oldStagedQuoteState = template.getOldStagedQuoteState();
        return builder;
    }

}
