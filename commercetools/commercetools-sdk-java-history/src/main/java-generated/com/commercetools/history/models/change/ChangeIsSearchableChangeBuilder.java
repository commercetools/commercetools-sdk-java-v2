package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change.ChangeIsSearchableChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeIsSearchableChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeIsSearchableChange changeIsSearchableChange = ChangeIsSearchableChange.builder()
 *             .change("{change}")
 *             .attributeName("{attributeName}")
 *             .nextValue(true)
 *             .previousValue(true)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ChangeIsSearchableChangeBuilder implements Builder<ChangeIsSearchableChange> {

    
    
    private String change;
    
    
    
    private String attributeName;
    
    
    
    private Boolean nextValue;
    
    
    
    private Boolean previousValue;

    
    /**
     *  <p>Update action for <code>changeIsSearchable</code> on product types</p>
     * @param change value to be set
     * @return Builder
     */
    
    public ChangeIsSearchableChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     *  <p>The name of the updated attribute.</p>
     * @param attributeName value to be set
     * @return Builder
     */
    
    public ChangeIsSearchableChangeBuilder attributeName( final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public ChangeIsSearchableChangeBuilder nextValue( final Boolean nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public ChangeIsSearchableChangeBuilder previousValue( final Boolean previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    

    /**
     *  <p>Update action for <code>changeIsSearchable</code> on product types</p>
     * @return change
     */
    
    
    public String getChange(){
        return this.change;
    }
    
    /**
     *  <p>The name of the updated attribute.</p>
     * @return attributeName
     */
    
    
    public String getAttributeName(){
        return this.attributeName;
    }
    
    /**
     * value of nextValue}
     * @return nextValue
     */
    
    
    public Boolean getNextValue(){
        return this.nextValue;
    }
    
    /**
     * value of previousValue}
     * @return previousValue
     */
    
    
    public Boolean getPreviousValue(){
        return this.previousValue;
    }

    /**
     * builds ChangeIsSearchableChange with checking for non-null required values
     * @return ChangeIsSearchableChange
     */
    public ChangeIsSearchableChange build() {
        Objects.requireNonNull(change, ChangeIsSearchableChange.class + ": change is missing");
        Objects.requireNonNull(attributeName, ChangeIsSearchableChange.class + ": attributeName is missing");
        Objects.requireNonNull(nextValue, ChangeIsSearchableChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, ChangeIsSearchableChange.class + ": previousValue is missing");
        return new ChangeIsSearchableChangeImpl(change, attributeName, nextValue, previousValue);
    }
    
    /**
     * builds ChangeIsSearchableChange without checking for non-null required values
     * @return ChangeIsSearchableChange
     */
    public ChangeIsSearchableChange buildUnchecked() {
        return new ChangeIsSearchableChangeImpl(change, attributeName, nextValue, previousValue);
    }

    /**
     * factory method for an instance of ChangeIsSearchableChangeBuilder
     * @return builder 
     */
    public static ChangeIsSearchableChangeBuilder of() {
        return new ChangeIsSearchableChangeBuilder();
    }

    /**
     * create builder for ChangeIsSearchableChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeIsSearchableChangeBuilder of(final ChangeIsSearchableChange template) {
        ChangeIsSearchableChangeBuilder builder = new ChangeIsSearchableChangeBuilder();
        builder.change = template.getChange();
        builder.attributeName = template.getAttributeName();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
