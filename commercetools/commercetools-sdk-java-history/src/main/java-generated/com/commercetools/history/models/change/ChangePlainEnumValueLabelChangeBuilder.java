package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change.ChangePlainEnumValueLabelChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangePlainEnumValueLabelChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangePlainEnumValueLabelChange changePlainEnumValueLabelChange = ChangePlainEnumValueLabelChange.builder()
 *             .change("{change}")
 *             .attributeName("{attributeName}")
 *             .valueKey("{valueKey}")
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
public class ChangePlainEnumValueLabelChangeBuilder implements Builder<ChangePlainEnumValueLabelChange> {

    
    
    private String change;
    
    
    
    private String attributeName;
    
    
    
    private String valueKey;
    
    
    
    private String previousValue;
    
    
    
    private String nextValue;

    
    /**
     *  <p>Update action for <code>changePlainEnumValueLabel</code> on types</p>
     * @param change value to be set
     * @return Builder
     */
    
    public ChangePlainEnumValueLabelChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     *  <p>The name of the attribute updated.</p>
     * @param attributeName value to be set
     * @return Builder
     */
    
    public ChangePlainEnumValueLabelChangeBuilder attributeName( final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }
    
    
    
    
    /**
     *  <p>Key of the values that was updated</p>
     * @param valueKey value to be set
     * @return Builder
     */
    
    public ChangePlainEnumValueLabelChangeBuilder valueKey( final String valueKey) {
        this.valueKey = valueKey;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public ChangePlainEnumValueLabelChangeBuilder previousValue( final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public ChangePlainEnumValueLabelChangeBuilder nextValue( final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    

    /**
     *  <p>Update action for <code>changePlainEnumValueLabel</code> on types</p>
     * @return change
     */
    
    
    public String getChange(){
        return this.change;
    }
    
    /**
     *  <p>The name of the attribute updated.</p>
     * @return attributeName
     */
    
    
    public String getAttributeName(){
        return this.attributeName;
    }
    
    /**
     *  <p>Key of the values that was updated</p>
     * @return valueKey
     */
    
    
    public String getValueKey(){
        return this.valueKey;
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
     * builds ChangePlainEnumValueLabelChange with checking for non-null required values
     * @return ChangePlainEnumValueLabelChange
     */
    public ChangePlainEnumValueLabelChange build() {
        Objects.requireNonNull(change, ChangePlainEnumValueLabelChange.class + ": change is missing");
        Objects.requireNonNull(attributeName, ChangePlainEnumValueLabelChange.class + ": attributeName is missing");
        Objects.requireNonNull(valueKey, ChangePlainEnumValueLabelChange.class + ": valueKey is missing");
        Objects.requireNonNull(previousValue, ChangePlainEnumValueLabelChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangePlainEnumValueLabelChange.class + ": nextValue is missing");
        return new ChangePlainEnumValueLabelChangeImpl(change, attributeName, valueKey, previousValue, nextValue);
    }
    
    /**
     * builds ChangePlainEnumValueLabelChange without checking for non-null required values
     * @return ChangePlainEnumValueLabelChange
     */
    public ChangePlainEnumValueLabelChange buildUnchecked() {
        return new ChangePlainEnumValueLabelChangeImpl(change, attributeName, valueKey, previousValue, nextValue);
    }

    /**
     * factory method for an instance of ChangePlainEnumValueLabelChangeBuilder
     * @return builder 
     */
    public static ChangePlainEnumValueLabelChangeBuilder of() {
        return new ChangePlainEnumValueLabelChangeBuilder();
    }

    /**
     * create builder for ChangePlainEnumValueLabelChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangePlainEnumValueLabelChangeBuilder of(final ChangePlainEnumValueLabelChange template) {
        ChangePlainEnumValueLabelChangeBuilder builder = new ChangePlainEnumValueLabelChangeBuilder();
        builder.change = template.getChange();
        builder.attributeName = template.getAttributeName();
        builder.valueKey = template.getValueKey();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
