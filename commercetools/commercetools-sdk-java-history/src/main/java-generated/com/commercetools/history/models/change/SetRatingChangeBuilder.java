package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change.SetRatingChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetRatingChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetRatingChange setRatingChange = SetRatingChange.builder()
 *             .change("{change}")
 *             .previousValue(1)
 *             .nextValue(1)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class SetRatingChangeBuilder implements Builder<SetRatingChange> {

    
    
    private String change;
    
    
    
    private Integer previousValue;
    
    
    
    private Integer nextValue;

    
    /**
     *  <p>Shape of the action for <code>setRating</code></p>
     * @param change value to be set
     * @return Builder
     */
    
    public SetRatingChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public SetRatingChangeBuilder previousValue( final Integer previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public SetRatingChangeBuilder nextValue( final Integer nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    

    /**
     *  <p>Shape of the action for <code>setRating</code></p>
     * @return change
     */
    
    
    public String getChange(){
        return this.change;
    }
    
    /**
     * value of previousValue}
     * @return previousValue
     */
    
    
    public Integer getPreviousValue(){
        return this.previousValue;
    }
    
    /**
     * value of nextValue}
     * @return nextValue
     */
    
    
    public Integer getNextValue(){
        return this.nextValue;
    }

    /**
     * builds SetRatingChange with checking for non-null required values
     * @return SetRatingChange
     */
    public SetRatingChange build() {
        Objects.requireNonNull(change, SetRatingChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetRatingChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetRatingChange.class + ": nextValue is missing");
        return new SetRatingChangeImpl(change, previousValue, nextValue);
    }
    
    /**
     * builds SetRatingChange without checking for non-null required values
     * @return SetRatingChange
     */
    public SetRatingChange buildUnchecked() {
        return new SetRatingChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetRatingChangeBuilder
     * @return builder 
     */
    public static SetRatingChangeBuilder of() {
        return new SetRatingChangeBuilder();
    }

    /**
     * create builder for SetRatingChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetRatingChangeBuilder of(final SetRatingChange template) {
        SetRatingChangeBuilder builder = new SetRatingChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
