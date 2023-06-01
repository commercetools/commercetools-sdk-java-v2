package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change_value.ChangeTargetChangeValue;
import com.commercetools.history.models.change.ChangeTargetChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeTargetChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeTargetChange changeTargetChange = ChangeTargetChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ChangeTargetChangeBuilder implements Builder<ChangeTargetChange> {

    
    
    private String change;
    
    
    
    private com.commercetools.history.models.change_value.ChangeTargetChangeValue nextValue;
    
    
    
    private com.commercetools.history.models.change_value.ChangeTargetChangeValue previousValue;

    
    /**
     *  <p>Update action for <code>changeTarget</code> on cart discounts</p>
     * @param change value to be set
     * @return Builder
     */
    
    public ChangeTargetChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public ChangeTargetChangeBuilder nextValue( final com.commercetools.history.models.change_value.ChangeTargetChangeValue nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public ChangeTargetChangeBuilder nextValue(Function<com.commercetools.history.models.change_value.ChangeTargetChangeValueBuilder, Builder<? extends com.commercetools.history.models.change_value.ChangeTargetChangeValue>> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.change_value.ChangeTargetChangeValueBuilder.of()).build();
        return this;
    }
                    
    
    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public ChangeTargetChangeBuilder previousValue( final com.commercetools.history.models.change_value.ChangeTargetChangeValue previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public ChangeTargetChangeBuilder previousValue(Function<com.commercetools.history.models.change_value.ChangeTargetChangeValueBuilder, Builder<? extends com.commercetools.history.models.change_value.ChangeTargetChangeValue>> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.change_value.ChangeTargetChangeValueBuilder.of()).build();
        return this;
    }
                    

    /**
     *  <p>Update action for <code>changeTarget</code> on cart discounts</p>
     * @return change
     */
    
    
    public String getChange(){
        return this.change;
    }
    
    /**
     * value of nextValue}
     * @return nextValue
     */
    
    
    public com.commercetools.history.models.change_value.ChangeTargetChangeValue getNextValue(){
        return this.nextValue;
    }
    
    /**
     * value of previousValue}
     * @return previousValue
     */
    
    
    public com.commercetools.history.models.change_value.ChangeTargetChangeValue getPreviousValue(){
        return this.previousValue;
    }

    /**
     * builds ChangeTargetChange with checking for non-null required values
     * @return ChangeTargetChange
     */
    public ChangeTargetChange build() {
        Objects.requireNonNull(change, ChangeTargetChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, ChangeTargetChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, ChangeTargetChange.class + ": previousValue is missing");
        return new ChangeTargetChangeImpl(change, nextValue, previousValue);
    }
    
    /**
     * builds ChangeTargetChange without checking for non-null required values
     * @return ChangeTargetChange
     */
    public ChangeTargetChange buildUnchecked() {
        return new ChangeTargetChangeImpl(change, nextValue, previousValue);
    }

    /**
     * factory method for an instance of ChangeTargetChangeBuilder
     * @return builder 
     */
    public static ChangeTargetChangeBuilder of() {
        return new ChangeTargetChangeBuilder();
    }

    /**
     * create builder for ChangeTargetChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeTargetChangeBuilder of(final ChangeTargetChange template) {
        ChangeTargetChangeBuilder builder = new ChangeTargetChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
