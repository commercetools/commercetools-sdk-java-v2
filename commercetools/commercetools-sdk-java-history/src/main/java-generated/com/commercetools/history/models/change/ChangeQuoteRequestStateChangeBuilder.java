package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.QuoteRequestState;
import com.commercetools.history.models.change.ChangeQuoteRequestStateChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeQuoteRequestStateChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeQuoteRequestStateChange changeQuoteRequestStateChange = ChangeQuoteRequestStateChange.builder()
 *             .change("{change}")
 *             .nextValue(QuoteRequestState.SUBMITTED)
 *             .previousValue(QuoteRequestState.SUBMITTED)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ChangeQuoteRequestStateChangeBuilder implements Builder<ChangeQuoteRequestStateChange> {

    
    
    private String change;
    
    
    
    private com.commercetools.history.models.common.QuoteRequestState nextValue;
    
    
    
    private com.commercetools.history.models.common.QuoteRequestState previousValue;

    
    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */
    
    public ChangeQuoteRequestStateChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public ChangeQuoteRequestStateChangeBuilder nextValue( final com.commercetools.history.models.common.QuoteRequestState nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public ChangeQuoteRequestStateChangeBuilder previousValue( final com.commercetools.history.models.common.QuoteRequestState previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    

    /**
     * value of change}
     * @return change
     */
    
    
    public String getChange(){
        return this.change;
    }
    
    /**
     * value of nextValue}
     * @return nextValue
     */
    
    
    public com.commercetools.history.models.common.QuoteRequestState getNextValue(){
        return this.nextValue;
    }
    
    /**
     * value of previousValue}
     * @return previousValue
     */
    
    
    public com.commercetools.history.models.common.QuoteRequestState getPreviousValue(){
        return this.previousValue;
    }

    /**
     * builds ChangeQuoteRequestStateChange with checking for non-null required values
     * @return ChangeQuoteRequestStateChange
     */
    public ChangeQuoteRequestStateChange build() {
        Objects.requireNonNull(change, ChangeQuoteRequestStateChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, ChangeQuoteRequestStateChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, ChangeQuoteRequestStateChange.class + ": previousValue is missing");
        return new ChangeQuoteRequestStateChangeImpl(change, nextValue, previousValue);
    }
    
    /**
     * builds ChangeQuoteRequestStateChange without checking for non-null required values
     * @return ChangeQuoteRequestStateChange
     */
    public ChangeQuoteRequestStateChange buildUnchecked() {
        return new ChangeQuoteRequestStateChangeImpl(change, nextValue, previousValue);
    }

    /**
     * factory method for an instance of ChangeQuoteRequestStateChangeBuilder
     * @return builder 
     */
    public static ChangeQuoteRequestStateChangeBuilder of() {
        return new ChangeQuoteRequestStateChangeBuilder();
    }

    /**
     * create builder for ChangeQuoteRequestStateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeQuoteRequestStateChangeBuilder of(final ChangeQuoteRequestStateChange template) {
        ChangeQuoteRequestStateChangeBuilder builder = new ChangeQuoteRequestStateChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
