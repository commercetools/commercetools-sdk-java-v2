package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.common.Reference;
import com.commercetools.history.models.change.SetTaxCategoryChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetTaxCategoryChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetTaxCategoryChange setTaxCategoryChange = SetTaxCategoryChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class SetTaxCategoryChangeBuilder implements Builder<SetTaxCategoryChange> {

    
    
    private String change;
    
    
    
    private com.commercetools.history.models.common.Reference previousValue;
    
    
    
    private com.commercetools.history.models.common.Reference nextValue;

    
    /**
     *  <p>Shape of the action for <code>setTaxCategory</code></p>
     * @param change value to be set
     * @return Builder
     */
    
    public SetTaxCategoryChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public SetTaxCategoryChangeBuilder previousValue(Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */
    
    public SetTaxCategoryChangeBuilder withPreviousValue(Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.Reference> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */
    
    public SetTaxCategoryChangeBuilder previousValue( final com.commercetools.history.models.common.Reference previousValue) {
        this.previousValue = previousValue;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public SetTaxCategoryChangeBuilder nextValue(Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public SetTaxCategoryChangeBuilder withNextValue(Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.Reference> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public SetTaxCategoryChangeBuilder nextValue( final com.commercetools.history.models.common.Reference nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    

    /**
     *  <p>Shape of the action for <code>setTaxCategory</code></p>
     * @return change
     */
    
    
    public String getChange(){
        return this.change;
    }
    
    /**
     * value of previousValue}
     * @return previousValue
     */
    
    
    public com.commercetools.history.models.common.Reference getPreviousValue(){
        return this.previousValue;
    }
    
    /**
     * value of nextValue}
     * @return nextValue
     */
    
    
    public com.commercetools.history.models.common.Reference getNextValue(){
        return this.nextValue;
    }

    /**
     * builds SetTaxCategoryChange with checking for non-null required values
     * @return SetTaxCategoryChange
     */
    public SetTaxCategoryChange build() {
        Objects.requireNonNull(change, SetTaxCategoryChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetTaxCategoryChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetTaxCategoryChange.class + ": nextValue is missing");
        return new SetTaxCategoryChangeImpl(change, previousValue, nextValue);
    }
    
    /**
     * builds SetTaxCategoryChange without checking for non-null required values
     * @return SetTaxCategoryChange
     */
    public SetTaxCategoryChange buildUnchecked() {
        return new SetTaxCategoryChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetTaxCategoryChangeBuilder
     * @return builder 
     */
    public static SetTaxCategoryChangeBuilder of() {
        return new SetTaxCategoryChangeBuilder();
    }

    /**
     * create builder for SetTaxCategoryChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetTaxCategoryChangeBuilder of(final SetTaxCategoryChange template) {
        SetTaxCategoryChangeBuilder builder = new SetTaxCategoryChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
