package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change.ChangeIsActiveChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeIsActiveChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeIsActiveChange changeIsActiveChange = ChangeIsActiveChange.builder()
 *             .change("{change}")
 *             .previousValue(true)
 *             .nextValue(true)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ChangeIsActiveChangeBuilder implements Builder<ChangeIsActiveChange> {

    
    
    private String change;
    
    
    
    private Boolean previousValue;
    
    
    
    private Boolean nextValue;

    
    /**
     *  <p>Shape of the action for <code>changeIsActive</code></p>
     * @param change value to be set
     * @return Builder
     */
    
    public ChangeIsActiveChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public ChangeIsActiveChangeBuilder previousValue( final Boolean previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public ChangeIsActiveChangeBuilder nextValue( final Boolean nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    

    /**
     *  <p>Shape of the action for <code>changeIsActive</code></p>
     * @return change
     */
    
    
    public String getChange(){
        return this.change;
    }
    
    /**
     * value of previousValue}
     * @return previousValue
     */
    
    
    public Boolean getPreviousValue(){
        return this.previousValue;
    }
    
    /**
     * value of nextValue}
     * @return nextValue
     */
    
    
    public Boolean getNextValue(){
        return this.nextValue;
    }

    /**
     * builds ChangeIsActiveChange with checking for non-null required values
     * @return ChangeIsActiveChange
     */
    public ChangeIsActiveChange build() {
        Objects.requireNonNull(change, ChangeIsActiveChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeIsActiveChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeIsActiveChange.class + ": nextValue is missing");
        return new ChangeIsActiveChangeImpl(change, previousValue, nextValue);
    }
    
    /**
     * builds ChangeIsActiveChange without checking for non-null required values
     * @return ChangeIsActiveChange
     */
    public ChangeIsActiveChange buildUnchecked() {
        return new ChangeIsActiveChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of ChangeIsActiveChangeBuilder
     * @return builder 
     */
    public static ChangeIsActiveChangeBuilder of() {
        return new ChangeIsActiveChangeBuilder();
    }

    /**
     * create builder for ChangeIsActiveChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeIsActiveChangeBuilder of(final ChangeIsActiveChange template) {
        ChangeIsActiveChangeBuilder builder = new ChangeIsActiveChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
