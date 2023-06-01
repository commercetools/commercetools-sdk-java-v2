package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change.ChangeKeyChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeKeyChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeKeyChange changeKeyChange = ChangeKeyChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ChangeKeyChangeBuilder implements Builder<ChangeKeyChange> {

    
    
    private String change;
    
    
    
    private String previousValue;
    
    
    
    private String nextValue;

    
    /**
     *  <p>Shape of the action for <code>changeKey</code></p>
     * @param change value to be set
     * @return Builder
     */
    
    public ChangeKeyChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public ChangeKeyChangeBuilder previousValue( final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public ChangeKeyChangeBuilder nextValue( final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    

    /**
     *  <p>Shape of the action for <code>changeKey</code></p>
     * @return change
     */
    
    
    public String getChange(){
        return this.change;
    }
    
    /**
     * value of previousValue}
     * @return previousValue
     */
    
    
    public String getPreviousValue(){
        return this.previousValue;
    }
    
    /**
     * value of nextValue}
     * @return nextValue
     */
    
    
    public String getNextValue(){
        return this.nextValue;
    }

    /**
     * builds ChangeKeyChange with checking for non-null required values
     * @return ChangeKeyChange
     */
    public ChangeKeyChange build() {
        Objects.requireNonNull(change, ChangeKeyChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeKeyChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeKeyChange.class + ": nextValue is missing");
        return new ChangeKeyChangeImpl(change, previousValue, nextValue);
    }
    
    /**
     * builds ChangeKeyChange without checking for non-null required values
     * @return ChangeKeyChange
     */
    public ChangeKeyChange buildUnchecked() {
        return new ChangeKeyChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of ChangeKeyChangeBuilder
     * @return builder 
     */
    public static ChangeKeyChangeBuilder of() {
        return new ChangeKeyChangeBuilder();
    }

    /**
     * create builder for ChangeKeyChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeKeyChangeBuilder of(final ChangeKeyChange template) {
        ChangeKeyChangeBuilder builder = new ChangeKeyChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
