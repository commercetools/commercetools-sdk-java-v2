package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import java.lang.Object;
import com.commercetools.history.models.change.UnknownChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * UnknownChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     UnknownChange unknownChange = UnknownChange.builder()
 *             .change("{change}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class UnknownChangeBuilder implements Builder<UnknownChange> {

    
    
    private String change;
    
    
    
    private java.lang.Object previousValue;
    
    
    
    private java.lang.Object nextValue;

    
    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */
    
    public UnknownChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public UnknownChangeBuilder previousValue( final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public UnknownChangeBuilder nextValue( final java.lang.Object nextValue) {
        this.nextValue = nextValue;
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
     * value of previousValue}
     * @return previousValue
     */
    
    
    public java.lang.Object getPreviousValue(){
        return this.previousValue;
    }
    
    /**
     * value of nextValue}
     * @return nextValue
     */
    
    
    public java.lang.Object getNextValue(){
        return this.nextValue;
    }

    /**
     * builds UnknownChange with checking for non-null required values
     * @return UnknownChange
     */
    public UnknownChange build() {
        Objects.requireNonNull(change, UnknownChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, UnknownChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, UnknownChange.class + ": nextValue is missing");
        return new UnknownChangeImpl(change, previousValue, nextValue);
    }
    
    /**
     * builds UnknownChange without checking for non-null required values
     * @return UnknownChange
     */
    public UnknownChange buildUnchecked() {
        return new UnknownChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of UnknownChangeBuilder
     * @return builder 
     */
    public static UnknownChangeBuilder of() {
        return new UnknownChangeBuilder();
    }

    /**
     * create builder for UnknownChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static UnknownChangeBuilder of(final UnknownChange template) {
        UnknownChangeBuilder builder = new UnknownChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
