package com.commercetools.history.models.change;

import com.commercetools.history.models.change.Change;
import com.commercetools.history.models.change_value.EnumValue;
import com.commercetools.history.models.change.AddPlainEnumValueChange;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddPlainEnumValueChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddPlainEnumValueChange addPlainEnumValueChange = AddPlainEnumValueChange.builder()
 *             .change("{change}")
 *             .attributeName("{attributeName}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AddPlainEnumValueChangeBuilder implements Builder<AddPlainEnumValueChange> {

    
    
    private String change;
    
    
    
    private String attributeName;
    
    
    
    private com.commercetools.history.models.change_value.EnumValue nextValue;

    
    /**
     *  <p>Update action for <code>addPlainEnumValue</code> on product types</p>
     * @param change value to be set
     * @return Builder
     */
    
    public AddPlainEnumValueChangeBuilder change( final String change) {
        this.change = change;
        return this;
    }
    
    
    
    
    /**
     *  <p>The name of the attribute updated.</p>
     * @param attributeName value to be set
     * @return Builder
     */
    
    public AddPlainEnumValueChangeBuilder attributeName( final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }
    
    
    
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public AddPlainEnumValueChangeBuilder nextValue(Function<com.commercetools.history.models.change_value.EnumValueBuilder, com.commercetools.history.models.change_value.EnumValueBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.change_value.EnumValueBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */
    
    public AddPlainEnumValueChangeBuilder withNextValue(Function<com.commercetools.history.models.change_value.EnumValueBuilder, com.commercetools.history.models.change_value.EnumValue> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.change_value.EnumValueBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */
    
    public AddPlainEnumValueChangeBuilder nextValue( final com.commercetools.history.models.change_value.EnumValue nextValue) {
        this.nextValue = nextValue;
        return this;
    }
    
    

    /**
     *  <p>Update action for <code>addPlainEnumValue</code> on product types</p>
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
     * value of nextValue}
     * @return nextValue
     */
    
    
    public com.commercetools.history.models.change_value.EnumValue getNextValue(){
        return this.nextValue;
    }

    /**
     * builds AddPlainEnumValueChange with checking for non-null required values
     * @return AddPlainEnumValueChange
     */
    public AddPlainEnumValueChange build() {
        Objects.requireNonNull(change, AddPlainEnumValueChange.class + ": change is missing");
        Objects.requireNonNull(attributeName, AddPlainEnumValueChange.class + ": attributeName is missing");
        Objects.requireNonNull(nextValue, AddPlainEnumValueChange.class + ": nextValue is missing");
        return new AddPlainEnumValueChangeImpl(change, attributeName, nextValue);
    }
    
    /**
     * builds AddPlainEnumValueChange without checking for non-null required values
     * @return AddPlainEnumValueChange
     */
    public AddPlainEnumValueChange buildUnchecked() {
        return new AddPlainEnumValueChangeImpl(change, attributeName, nextValue);
    }

    /**
     * factory method for an instance of AddPlainEnumValueChangeBuilder
     * @return builder 
     */
    public static AddPlainEnumValueChangeBuilder of() {
        return new AddPlainEnumValueChangeBuilder();
    }

    /**
     * create builder for AddPlainEnumValueChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddPlainEnumValueChangeBuilder of(final AddPlainEnumValueChange template) {
        AddPlainEnumValueChangeBuilder builder = new AddPlainEnumValueChangeBuilder();
        builder.change = template.getChange();
        builder.attributeName = template.getAttributeName();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
