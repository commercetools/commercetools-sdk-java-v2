package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.LocalizedString;
import com.commercetools.history.models.change.ChangeLabelChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeLabelChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeLabelChange changeLabelChange = ChangeLabelChange.builder()
 *             .change("{change}")
 *             .fieldName("{fieldName}")
 *             .attributeName("{attributeName}")
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
public class ChangeLabelChangeBuilder implements Builder<ChangeLabelChange> {

    
    
    private String change;
    
    
    
    private String fieldName;
    
    
    
    private String attributeName;
    
    
    
    private com.commercetools.history.models.common.LocalizedString nextValue;
    
    
    
    private com.commercetools.history.models.common.LocalizedString previousValue;

    
    /**
     *  <p>Update action for <code>changeLabel</code> on product types and types</p>
     * @param change value to be set
     * @return Builder
     */
    
    public ChangeLabelChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     *  <p>The name of the field definition to update (types).</p>
     * @param fieldName value to be set
     * @return Builder
     */
    
    public ChangeLabelChangeBuilder fieldName( final String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
    
    
    
    
    /**
     *  <p>The name of the attribute definition to update (product-type).</p>
     * @param attributeName value to be set
     * @return Builder
     */
    
    public ChangeLabelChangeBuilder attributeName( final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public ChangeLabelChangeBuilder nextValue(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public ChangeLabelChangeBuilder withNextValue(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public ChangeLabelChangeBuilder nextValue( final com.commercetools.history.models.common.LocalizedString nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public ChangeLabelChangeBuilder previousValue(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public ChangeLabelChangeBuilder withPreviousValue(Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public ChangeLabelChangeBuilder previousValue( final com.commercetools.history.models.common.LocalizedString previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    

    /**
     *  <p>Update action for <code>changeLabel</code> on product types and types</p>
     * @return change
     */
    
    
    public String getChange(){
        return this.change;
    }
    
    /**
     *  <p>The name of the field definition to update (types).</p>
     * @return fieldName
     */
    
    
    public String getFieldName(){
        return this.fieldName;
    }
    
    /**
     *  <p>The name of the attribute definition to update (product-type).</p>
     * @return attributeName
     */
    
    
    public String getAttributeName(){
        return this.attributeName;
    }
    
    /**
     * value of nextValue}
     * @return nextValue
     */
    
    
    public com.commercetools.history.models.common.LocalizedString getNextValue(){
        return this.nextValue;
    }
    
    /**
     * value of previousValue}
     * @return previousValue
     */
    
    
    public com.commercetools.history.models.common.LocalizedString getPreviousValue(){
        return this.previousValue;
    }

    /**
     * builds ChangeLabelChange with checking for non-null required values
     * @return ChangeLabelChange
     */
    public ChangeLabelChange build() {
        Objects.requireNonNull(change, ChangeLabelChange.class + ": change is missing");
        Objects.requireNonNull(fieldName, ChangeLabelChange.class + ": fieldName is missing");
        Objects.requireNonNull(attributeName, ChangeLabelChange.class + ": attributeName is missing");
        Objects.requireNonNull(nextValue, ChangeLabelChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, ChangeLabelChange.class + ": previousValue is missing");
        return new ChangeLabelChangeImpl(change, fieldName, attributeName, nextValue, previousValue);
    }
    
    /**
     * builds ChangeLabelChange without checking for non-null required values
     * @return ChangeLabelChange
     */
    public ChangeLabelChange buildUnchecked() {
        return new ChangeLabelChangeImpl(change, fieldName, attributeName, nextValue, previousValue);
    }

    /**
     * factory method for an instance of ChangeLabelChangeBuilder
     * @return builder 
     */
    public static ChangeLabelChangeBuilder of() {
        return new ChangeLabelChangeBuilder();
    }

    /**
     * create builder for ChangeLabelChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeLabelChangeBuilder of(final ChangeLabelChange template) {
        ChangeLabelChangeBuilder builder = new ChangeLabelChangeBuilder();
        builder.change = template.getChange();
        builder.fieldName = template.getFieldName();
        builder.attributeName = template.getAttributeName();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
