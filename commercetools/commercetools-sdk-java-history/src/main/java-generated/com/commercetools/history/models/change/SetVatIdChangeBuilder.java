package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change.SetVatIdChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetVatIdChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetVatIdChange setVatIdChange = SetVatIdChange.builder()
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
public class SetVatIdChangeBuilder implements Builder<SetVatIdChange> {

    
    
    private String change;
    
    
    
    private String previousValue;
    
    
    
    private String nextValue;

    
    /**
     *  <p>Shape of the action for <code>setVatId</code></p>
     * @param change value to be set
     * @return Builder
     */
    
    public SetVatIdChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public SetVatIdChangeBuilder previousValue( final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public SetVatIdChangeBuilder nextValue( final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    

    /**
     *  <p>Shape of the action for <code>setVatId</code></p>
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
     * builds SetVatIdChange with checking for non-null required values
     * @return SetVatIdChange
     */
    public SetVatIdChange build() {
        Objects.requireNonNull(change, SetVatIdChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetVatIdChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetVatIdChange.class + ": nextValue is missing");
        return new SetVatIdChangeImpl(change, previousValue, nextValue);
    }
    
    /**
     * builds SetVatIdChange without checking for non-null required values
     * @return SetVatIdChange
     */
    public SetVatIdChange buildUnchecked() {
        return new SetVatIdChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetVatIdChangeBuilder
     * @return builder 
     */
    public static SetVatIdChangeBuilder of() {
        return new SetVatIdChangeBuilder();
    }

    /**
     * create builder for SetVatIdChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetVatIdChangeBuilder of(final SetVatIdChange template) {
        SetVatIdChangeBuilder builder = new SetVatIdChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
